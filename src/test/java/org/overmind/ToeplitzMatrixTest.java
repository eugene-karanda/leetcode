package org.overmind;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/toeplitz-matrix/">766. Toeplitz Matrix</a> (Easy)
 * <p>
 * Check whether every diagonal from top-left to bottom-right has the same elements.
 */
public class ToeplitzMatrixTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.isToeplitzMatrix(new int[][]{{1, 2, 3, 4}, {5, 1, 2, 3}, {9, 5, 1, 2}});

    // then
    assertThat(result)
      .isTrue();
  }

  @Test
  void example2() {
    // when
    var result = solution.isToeplitzMatrix(new int[][]{{1, 2}, {2, 2}});

    // then
    assertThat(result)
      .isFalse();
  }

  class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
      for(int rowIndex = 1 ; rowIndex < matrix.length ; rowIndex++) {
        for(int columnIndex = 1 ; columnIndex < matrix[rowIndex].length ; columnIndex++) {
          if(matrix[rowIndex][columnIndex] != matrix[rowIndex - 1][columnIndex - 1]) {
            return false;
          }
        }
      }

      return true;
    }
  }
}
