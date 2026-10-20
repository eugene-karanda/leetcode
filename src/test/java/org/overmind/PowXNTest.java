package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;

/**
 * <a href="https://leetcode.com/problems/powx-n/">50. Pow(x, n)</a> (Medium)
 * <p>
 * Compute {@code x} raised to the power {@code n}.
 */
@Disabled
public class PowXNTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.myPow(2.0, 10);

    // then
    assertThat(result)
      .isCloseTo(1024.0, within(1e-5));
  }

  @Test
  void example2() {
    // when
    var result = solution.myPow(2.1, 3);

    // then
    assertThat(result)
      .isCloseTo(9.261, within(1e-5));
  }

  @Test
  void example3() {
    // when
    var result = solution.myPow(2.0, -2);

    // then
    assertThat(result)
      .isCloseTo(0.25, within(1e-5));
  }

  class Solution {
    public double myPow(double x, int n) {
      throw new UnsupportedOperationException();
    }
  }
}
