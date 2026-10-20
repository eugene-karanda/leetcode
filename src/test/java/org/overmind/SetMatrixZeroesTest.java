package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/set-matrix-zeroes/">73. Set Matrix Zeroes</a> (Medium)
 * <p>
 * Set the entire row and column to 0 for every 0 in the matrix, in place.
 */
@Disabled
public class SetMatrixZeroesTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // given
    var matrix = new int[][]{{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};

    // when
    solution.setZeroes(matrix);

    // then
    assertThat(matrix)
      .isDeepEqualTo(new int[][]{{1, 0, 1}, {0, 0, 0}, {1, 0, 1}});
  }

  @Test
  void example2() {
    // given
    var matrix = new int[][]{{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};

    // when
    solution.setZeroes(matrix);

    // then
    assertThat(matrix)
      .isDeepEqualTo(new int[][]{{0, 0, 0, 0}, {0, 4, 5, 0}, {0, 3, 1, 0}});
  }

  class Solution {
    public void setZeroes(int[][] matrix) {
      throw new UnsupportedOperationException();
    }
  }
}
