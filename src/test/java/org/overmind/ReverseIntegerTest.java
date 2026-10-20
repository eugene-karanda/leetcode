package org.overmind;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/reverse-integer/">7. Reverse Integer</a> (Medium)
 * <p>
 * Reverse the digits of a 32-bit signed integer; return 0 on overflow.
 */
public class ReverseIntegerTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.reverse(123);

    // then
    assertThat(result)
      .isEqualTo(321);
  }

  @Test
  void example2() {
    // when
    var result = solution.reverse(-123);

    // then
    assertThat(result)
      .isEqualTo(-321);
  }

  @Test
  void example3() {
    // when
    var result = solution.reverse(120);

    // then
    assertThat(result)
      .isEqualTo(21);
  }

  class Solution {
    public int reverse(int x) {
      int result = 0;
      boolean negative = x < 0;
      x = Math.abs(x);

      while(x != 0) {
        if (result > Integer.MAX_VALUE / 10) {
          return 0;
        }

        result *=  10;

        if (result > Integer.MAX_VALUE - (x % 10)) {
          return 0;
        }

        result += x % 10;
        x /= 10;
      }

      return negative ? -result : result;
    }
  }
}
