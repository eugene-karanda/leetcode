package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/sqrtx/">69. Sqrt(x)</a> (Easy)
 * <p>
 * Compute the square root of {@code x} rounded down, without built-in functions.
 */
@Disabled
public class SqrtXTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.mySqrt(0);

    // then
    assertThat(result)
      .isEqualTo(0);
  }

  @Test
  void example2() {
    // when
    var result = solution.mySqrt(4);

    // then
    assertThat(result)
      .isEqualTo(2);
  }

  @Test
  void example3() {
    // when
    var result = solution.mySqrt(8);

    // then
    assertThat(result)
      .isEqualTo(2);
  }

  @Test
  void example4() {
    // when
    var result = solution.mySqrt(16);

    // then
    assertThat(result)
      .isEqualTo(4);
  }

  @Test
  void example5() {
    // when
    var result = solution.mySqrt(24);

    // then
    assertThat(result)
      .isEqualTo(4);
  }

  @Test
  void example6() {
    // when
    var result = solution.mySqrt(1);

    // then
    assertThat(result)
      .isEqualTo(1);
  }

  class Solution {
    public int mySqrt(int x) {
      throw new UnsupportedOperationException();
    }
  }
}
