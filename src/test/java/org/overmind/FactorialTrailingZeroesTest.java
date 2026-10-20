package org.overmind;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/factorial-trailing-zeroes/">172. Factorial Trailing Zeroes</a> (Medium)
 * <p>
 * Count the trailing zeroes in {@code n!}.
 */
public class FactorialTrailingZeroesTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.trailingZeroes(3);

    // then
    assertThat(result)
      .isEqualTo(0);
  }

  @Test
  void example2() {
    // when
    var result = solution.trailingZeroes(5);

    // then
    assertThat(result)
      .isEqualTo(1);
  }

  @Test
  void example3() {
    // when
    var result = solution.trailingZeroes(0);

    // then
    assertThat(result)
      .isEqualTo(0);
  }

  class Solution {
    public int trailingZeroes(int n) {
      int count = 0;

      for(long five = 5 ; five <= n ; five *= 5) {
        count += n / five;
      }

      return count;
    }
  }
}
