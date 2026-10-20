package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/decode-ways/">91. Decode Ways</a> (Medium)
 * <p>
 * Count the ways to decode a string of digits where 'A' is 1, 'B' is 2, ..., 'Z' is 26.
 */
@Disabled
public class DecodeWaysTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.numDecodings("12");

    // then
    assertThat(result)
      .isEqualTo(2);
  }

  @Test
  void example2() {
    // when
    var result = solution.numDecodings("226");

    // then
    assertThat(result)
      .isEqualTo(3);
  }

  @Test
  void example3() {
    // when
    var result = solution.numDecodings("06");

    // then
    assertThat(result)
      .isEqualTo(0);
  }

  class Solution {
    public int numDecodings(String s) {
      throw new UnsupportedOperationException();
    }
  }
}
