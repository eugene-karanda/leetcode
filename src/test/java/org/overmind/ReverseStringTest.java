package org.overmind;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/reverse-string/">344. Reverse String</a> (Easy)
 * <p>
 * Reverse a string.
 */
public class ReverseStringTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.reverseString("hello");

    // then
    assertThat(result)
      .isEqualTo("olleh");
  }

  @Test
  void example2() {
    // when
    var result = solution.reverseString("Hannah");

    // then
    assertThat(result)
      .isEqualTo("hannaH");
  }

  class Solution {
    public String reverseString(String s) {
      return new StringBuilder(s)
        .reverse()
        .toString();
    }
  }
}
