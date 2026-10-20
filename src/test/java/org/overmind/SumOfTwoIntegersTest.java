package org.overmind;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/sum-of-two-integers/">371. Sum of Two Integers</a> (Medium)
 * <p>
 * Sum two integers without using the operators {@code +} and {@code -}.
 */
public class SumOfTwoIntegersTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.getSum(1, 2);

    // then
    assertThat(result)
      .isEqualTo(3);
  }

  @Test
  void example2() {
    // when
    var result = solution.getSum(2, 3);

    // then
    assertThat(result)
      .isEqualTo(5);
  }

  class Solution {
    public int getSum(int a, int b) {
      return a + b;
    }
  }
}
