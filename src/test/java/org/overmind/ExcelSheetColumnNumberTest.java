package org.overmind;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/excel-sheet-column-number/">171. Excel Sheet Column Number</a> (Easy)
 * <p>
 * Convert an Excel column title to its column number.
 */
public class ExcelSheetColumnNumberTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.titleToNumber("A");

    // then
    assertThat(result)
      .isEqualTo(1);
  }

  @Test
  void example2() {
    // when
    var result = solution.titleToNumber("AB");

    // then
    assertThat(result)
      .isEqualTo(28);
  }

  @Test
  void example3() {
    // when
    var result = solution.titleToNumber("ZY");

    // then
    assertThat(result)
      .isEqualTo(701);
  }

  class Solution {
    public int titleToNumber(String s) {
      int sum = 0;

      for (char c : s.toCharArray()) {
        sum *= 26;
        sum += (c - 'A') + 1;
      }

      return sum;
    }
  }
}
