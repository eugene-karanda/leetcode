package org.overmind;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/fibonacci-number/">509. Fibonacci Number</a> (Easy)
 * <p>
 * Compute the n-th Fibonacci number.
 */
public class FibonacciNumberTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.fib(2);

    // then
    assertThat(result)
      .isEqualTo(1);
  }

  @Test
  void example2() {
    // when
    var result = solution.fib(3);

    // then
    assertThat(result)
      .isEqualTo(2);
  }

  @Test
  void example3() {
    // when
    var result = solution.fib(4);

    // then
    assertThat(result)
      .isEqualTo(3);
  }

  class Solution {
    public int fib(int n) {
      if(n==0) {
        return 0;
      }

      if(n==1) {
        return 1;
      }

      int[] dp = new int[n+1];

      dp[1] = 1;

      for(int i=2;i<=n;i++) {
        dp[i] = dp[i-2] + dp[i-1];
      }

      return dp[n];
    }
  }
}
