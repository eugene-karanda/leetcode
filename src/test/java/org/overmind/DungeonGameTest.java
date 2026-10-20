package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/dungeon-game/">174. Dungeon Game</a> (Hard)
 * <p>
 * Find the minimum initial health the knight needs to rescue the princess.
 */
@Disabled
public class DungeonGameTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.calculateMinimumHP(new int[][]{{-2, -3, 3}, {-5, -10, 1}, {10, 30, -5}});

    // then
    assertThat(result)
      .isEqualTo(7);
  }

  @Test
  void example2() {
    // when
    var result = solution.calculateMinimumHP(new int[][]{{0}});

    // then
    assertThat(result)
      .isEqualTo(1);
  }

  class Solution {
    public int calculateMinimumHP(int[][] dungeon) {
      throw new UnsupportedOperationException();
    }
  }
}
