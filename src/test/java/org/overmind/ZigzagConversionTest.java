package org.overmind;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/zigzag-conversion/">6. Zigzag Conversion</a> (Medium)
 * <p>
 * Write the string in a zigzag pattern on {@code numRows} rows and read it line by line.
 */
public class ZigzagConversionTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.convert("PAYPALISHIRING", 3);

    // then
    assertThat(result)
      .isEqualTo("PAHNAPLSIIGYIR");
  }

  @Test
  void example2() {
    // when
    var result = solution.convert("PAYPALISHIRING", 4);

    // then
    assertThat(result)
      .isEqualTo("PINALSIGYAHRPI");
  }

  @Test
  void example3() {
    // when
    var result = solution.convert("A", 1);

    // then
    assertThat(result)
      .isEqualTo("A");
  }

  class Solution {
    public String convert(String s, int numRows) {
      if (numRows == 1) {
        return s;
      }

      int cycleSize = numRows + numRows - 2;
      var sb = new StringBuilder();

      for (int columnIndex = 0; columnIndex < s.length(); columnIndex += cycleSize) {
        sb.append(s.charAt(columnIndex));
      }

      for (int rowIndex = 1; rowIndex < numRows - 1; rowIndex++) {
        int smallerCycleSize = 2 * (numRows - rowIndex - 1) ;

        for (int columnIndex = rowIndex; columnIndex < s.length(); columnIndex += cycleSize) {
          sb.append(s.charAt(columnIndex));
          if (columnIndex + smallerCycleSize < s.length()) {
            sb.append(s.charAt(columnIndex + smallerCycleSize));
          }
        }
      }

      for (int columnIndex = numRows - 1; columnIndex < s.length(); columnIndex += cycleSize) {
        sb.append(s.charAt(columnIndex));
      }

      return sb.toString();
    }
  }
}
