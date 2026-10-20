package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/wildcard-matching/">44. Wildcard Matching</a> (Hard)
 * <p>
 * Check whether the whole string matches a pattern with {@code '?'} (any character) and {@code '*'} (any sequence).
 */
@Disabled
public class WildcardMatchingTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.isMatch("aa", "a");

    // then
    assertThat(result)
      .isFalse();
  }

  @Test
  void example2() {
    // when
    var result = solution.isMatch("aa", "*");

    // then
    assertThat(result)
      .isTrue();
  }

  @Test
  void example3() {
    // when
    var result = solution.isMatch("cb", "?a");

    // then
    assertThat(result)
      .isFalse();
  }

  class Solution {
    public boolean isMatch(String s, String p) {
      throw new UnsupportedOperationException();
    }
  }
}
