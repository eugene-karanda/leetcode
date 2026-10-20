package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/minimum-window-substring/">76. Minimum Window Substring</a> (Hard)
 * <p>
 * Find the minimum window substring of {@code s} that contains all characters of {@code t}.
 */
@Disabled
public class MinimumWindowSubstringTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.minWindow("ADOBECODEBANC", "ABC");

    // then
    assertThat(result)
      .isEqualTo("BANC");
  }

  @Test
  void example2() {
    // when
    var result = solution.minWindow("a", "a");

    // then
    assertThat(result)
      .isEqualTo("a");
  }

  @Test
  void example3() {
    // when
    var result = solution.minWindow("a", "aa");

    // then
    assertThat(result)
      .isEqualTo("");
  }

  class Solution {
    public String minWindow(String s, String t) {
      throw new UnsupportedOperationException();
    }
  }
}
