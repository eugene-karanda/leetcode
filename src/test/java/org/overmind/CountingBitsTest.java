package org.overmind;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/counting-bits/">338. Counting Bits</a> (Easy)
 * <p>
 * Return the number of 1 bits for every number from 0 to {@code n}.
 */
public class CountingBitsTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.countBits(2);

    // then
    assertThat(result)
      .containsExactly(0, 1, 1);
  }

  @Test
  void example2() {
    // when
    var result = solution.countBits(5);

    // then
    assertThat(result)
      .containsExactly(0, 1, 1, 2, 1, 2);
  }

  class Solution {
    public int[] countBits(int n) {
      int[] dp = new int[n +1];

      for (int i = 1 ; i <= n ; i++) {
        dp[i] = dp[i / 2] + (i % 2);
      }

      return dp;
    }
  }
}
