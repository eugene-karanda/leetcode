package org.overmind;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/excel-sheet-column-title/">168. Excel Sheet Column Title</a> (Easy)
 * <p>
 * Convert a column number to its Excel column title.
 */
public class ExcelSheetColumnTitleTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.convertToTitle(1);

    // then
    assertThat(result)
      .isEqualTo("A");
  }

  @Test
  void example2() {
    // when
    var result = solution.convertToTitle(28);

    // then
    assertThat(result)
      .isEqualTo("AB");
  }

  @Test
  void example3() {
    // when
    var result = solution.convertToTitle(701);

    // then
    assertThat(result)
      .isEqualTo("ZY");
  }

  class Solution {
    public String convertToTitle(int n) {
      StringBuilder builder = new StringBuilder();

      do {
        int digit = (n - 1) % 26;
        builder.append((char)(digit + 'A'));
        n = (n - digit) / 26;
      } while (n > 0);

      return builder.reverse()
        .toString();
    }
  }
}
