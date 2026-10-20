package org.overmind;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/divisor-game/">1025. Divisor Game</a> (Easy)
 * <p>
 * Determine whether the first player wins the divisor game.
 */
public class DivisorGameTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.divisorGame(2);

    // then
    assertThat(result)
      .isTrue();
  }

  @Test
  void example2() {
    // when
    var result = solution.divisorGame(3);

    // then
    assertThat(result)
      .isFalse();
  }

  class Solution {
    public boolean divisorGame(int n) {
      return (n % 2) == 0;
    }
  }
}
