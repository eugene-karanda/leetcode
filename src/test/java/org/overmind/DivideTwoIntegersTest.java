package org.overmind;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/divide-two-integers/">29. Divide Two Integers</a> (Medium)
 * <p>
 * Divide two integers without using multiplication, division or the mod operator.
 */
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

  @Test
  void example3() {
    // when
    var result = solution.divide(-2147483648, -1);

    // then
    assertThat(result)
      .isEqualTo(2147483647);
  }

  class Solution {
    public int divide(int dividend, int divisor) {
      long result = 0;
      boolean negative = (dividend < 0) ^ (divisor < 0);

      long a = Math.abs((long) dividend);
      long b = Math.abs((long) divisor);

      int bitsA = 64 - Long.numberOfLeadingZeros(a);
      int bitsB = 64 - Long.numberOfLeadingZeros(b);

      for (int k = bitsA - bitsB; k >= 0; k--) {
        long product = b << k;

        if (product <= a) {
          a = a - product;
          result += 1L << k;
        }
      }

      if (negative) {
        result = -result;
      }

      if (result > Integer.MAX_VALUE) {
        return Integer.MAX_VALUE;
      }

      if (result < Integer.MIN_VALUE) {
        return Integer.MIN_VALUE;
      }

      return ((int) result);
    }
  }
}
