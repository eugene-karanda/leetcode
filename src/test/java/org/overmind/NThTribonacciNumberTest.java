package org.overmind;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/n-th-tribonacci-number/">1137. N-th Tribonacci Number</a> (Easy)
 * <p>
 * Compute the n-th Tribonacci number.
 */
public class NThTribonacciNumberTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.tribonacci(4);

    // then
    assertThat(result)
      .isEqualTo(4);
  }

  @Test
  void example2() {
    // when
    var result = solution.tribonacci(25);

    // then
    assertThat(result)
      .isEqualTo(1389537);
  }

  class Solution {
    public int tribonacci(int n) {
      int[] dp = new int[Math.max(n+1,3)];

      dp[0] = 0;
      dp[1] = 1;
      dp[2] = 1;

      for(int i=3;i<=n;i++) {
        dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
      }

      return dp[n];
    }
  }
}
