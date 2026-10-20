package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/divide-two-integers/">29. Divide Two Integers</a> (Medium)
 * <p>
 * Divide two integers without using multiplication, division or the mod operator.
 */
@Disabled
public class DivideTwoIntegersTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.divide(10, 3);

    // then
    assertThat(result)
      .isEqualTo(3);
  }

  @Test
  void example2() {
    // when
    var result = solution.divide(7, -3);

    // then
    assertThat(result)
      .isEqualTo(-2);
  }

  class Solution {
    public int divide(int dividend, int divisor) {
      throw new UnsupportedOperationException();
    }
  }
}
