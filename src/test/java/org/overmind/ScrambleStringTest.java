package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/scramble-string/">87. Scramble String</a> (Hard)
 * <p>
 * Check whether one string is a scrambled version of another.
 */
@Disabled
public class ScrambleStringTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.isScramble("great", "rgeat");

    // then
    assertThat(result)
      .isTrue();
  }

  @Test
  void example2() {
    // when
    var result = solution.isScramble("abcde", "caebd");

    // then
    assertThat(result)
      .isFalse();
  }

  @Test
  void example3() {
    // when
    var result = solution.isScramble("a", "a");

    // then
    assertThat(result)
      .isTrue();
  }

  class Solution {
    public boolean isScramble(String s1, String s2) {
      throw new UnsupportedOperationException();
    }
  }
}
