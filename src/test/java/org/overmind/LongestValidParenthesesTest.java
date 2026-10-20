package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/longest-valid-parentheses/">32. Longest Valid Parentheses</a> (Hard)
 * <p>
 * Find the length of the longest valid (well-formed) parentheses substring.
 */
@Disabled
public class LongestValidParenthesesTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.longestValidParentheses("(()");

    // then
    assertThat(result)
      .isEqualTo(2);
  }

  @Test
  void example2() {
    // when
    var result = solution.longestValidParentheses(")()())");

    // then
    assertThat(result)
      .isEqualTo(4);
  }

  @Test
  void example3() {
    // when
    var result = solution.longestValidParentheses("");

    // then
    assertThat(result)
      .isEqualTo(0);
  }

  class Solution {
    public int longestValidParentheses(String s) {
      throw new UnsupportedOperationException();
    }
  }
}
