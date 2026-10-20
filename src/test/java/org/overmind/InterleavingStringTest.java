package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/interleaving-string/">97. Interleaving String</a> (Medium)
 * <p>
 * Check whether {@code s3} is formed by interleaving {@code s1} and {@code s2}.
 */
@Disabled
public class InterleavingStringTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.isInterleave("aabcc", "dbbca", "aadbbcbcac");

    // then
    assertThat(result)
      .isTrue();
  }

  @Test
  void example2() {
    // when
    var result = solution.isInterleave("aabcc", "dbbca", "aadbbbaccc");

    // then
    assertThat(result)
      .isFalse();
  }

  @Test
  void example3() {
    // when
    var result = solution.isInterleave("", "", "");

    // then
    assertThat(result)
      .isTrue();
  }

  class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
      throw new UnsupportedOperationException();
    }
  }
}
