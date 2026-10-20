package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/spiral-matrix-ii/">59. Spiral Matrix II</a> (Medium)
 * <p>
 * Generate an n x n matrix filled with 1 to n^2 in spiral order.
 */
@Disabled
public class SpiralMatrixIITest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.generateMatrix(3);

    // then
    assertThat(result)
      .isDeepEqualTo(new int[][]{{1, 2, 3}, {8, 9, 4}, {7, 6, 5}});
  }

  @Test
  void example2() {
    // when
    var result = solution.generateMatrix(1);

    // then
    assertThat(result)
      .isDeepEqualTo(new int[][]{{1}});
  }

  class Solution {
    public int[][] generateMatrix(int n) {
      throw new UnsupportedOperationException();
    }
  }
}
