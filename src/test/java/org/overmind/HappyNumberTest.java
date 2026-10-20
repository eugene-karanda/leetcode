package org.overmind;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/happy-number/">202. Happy Number</a> (Easy)
 * <p>
 * Check whether repeatedly replacing a number by the sum of the squares of its digits ends in 1.
 */
public class HappyNumberTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.isHappy(19);

    // then
    assertThat(result)
      .isTrue();
  }

  @Test
  void example2() {
    // when
    var result = solution.isHappy(2);

    // then
    assertThat(result)
      .isFalse();
  }

  class Solution {

    private long[] happy = new long[] {
      290274429637185L,
      17906324881448L
    };

    public boolean isHappy(int number) {
      while (true) {
        if (number <= 128) {
          int wordIndex = (number - 1) >> 6;
          return (happy[wordIndex] & (1L << (number - 1))) != 0;
        }

        number = sumDigitSquares(number);
      }
    }

    public int sumDigitSquares(int number) {
      int result = 0;

      while (number > 0) {
        result = result + (number % 10) * (number % 10);
        number = number / 10;
      }

      return result;
    }
  }
}
