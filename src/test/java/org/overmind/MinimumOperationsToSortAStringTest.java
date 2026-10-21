package org.overmind;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/minimum-operations-to-sort-a-string/">3863. Minimum Operations to Sort a String</a> (Medium)
 * <p>
 * Return the minimum number of operations to sort the string, where one operation sorts any substring
 * that is not the entire string, or -1 if it is impossible.
 */
public class MinimumOperationsToSortAStringTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.minOperations("dog");

    // then
    assertThat(result)
      .isEqualTo(1);
  }

  @Test
  void example2() {
    // when
    var result = solution.minOperations("card");

    // then
    assertThat(result)
      .isEqualTo(2);
  }

  @Test
  void example3() {
    // when
    var result = solution.minOperations("gf");

    // then
    assertThat(result)
      .isEqualTo(-1);
  }

  @Test
  void example4() {
    // when
    var result = solution.minOperations("cab");

    // then
    assertThat(result)
      .isEqualTo(2);
  }

  @Test
  void example5() {
    // when
    var result = solution.minOperations("jgg");

    // then
    assertThat(result)
      .isEqualTo(2);
  }

  class Solution {
    public int minOperations(String s) {
      boolean sorted = true;
      char min = s.charAt(0);
      char max = s.charAt(0);

      for (var i = 1; i < s.length(); i++) {
        var ch = s.charAt(i);

        if (ch < s.charAt(i - 1)) {
          sorted = false;
        }

        min = (ch < min) ? ch : min;
        max = (ch > max) ? ch : max;
      }

      if (sorted) {
        return 0;
      }

      boolean minExistsBeforeEnd = false;
      boolean maxExistsAfterBeginning = false;

      for (int i = 0; i < s.length(); i++) {
        if (i < s.length() - 1 && s.charAt(i) == min) {
          minExistsBeforeEnd = true;
        }

        if (i > 0 && s.charAt(i) == max) {
          maxExistsAfterBeginning = true;
        }
      }

      boolean minAtBeginning = s.charAt(0) == min;
      boolean maxAtEnd = s.charAt(s.length() - 1) == max;
      boolean maxAtBeginning = s.charAt(0) == max;
      boolean minAtEnd = s.charAt(s.length() - 1) == min;


      if (minAtBeginning || maxAtEnd) {
        return 1;
      }

      if (maxAtBeginning && minAtEnd && s.length() == 2) {
        return -1;
      }

      if (maxAtBeginning && minAtEnd && !minExistsBeforeEnd && !maxExistsAfterBeginning) {
        return 3;
      }

      return 2;
    }
  }
}
