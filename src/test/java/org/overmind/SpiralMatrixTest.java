package org.overmind;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/spiral-matrix/">54. Spiral Matrix</a> (Medium)
 * <p>
 * Return all elements of the matrix in spiral order.
 */
public class SpiralMatrixTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.spiralOrder(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});

    // then
    assertThat(result)
      .containsExactly(1, 2, 3, 6, 9, 8, 7, 4, 5);
  }

  @Test
  void example2() {
    // when
    var result = solution.spiralOrder(new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}});

    // then
    assertThat(result)
      .containsExactly(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7);
  }

  class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
      List<Integer> result = new ArrayList<>();

      int m = matrix.length;
      int n = (matrix.length == 0) ? 0 : matrix[0].length;

      int i = 0;
      int j = -1;

      for (int direction = 0; m > 0 && n > 0; direction = (direction + 1) % 4){

        int count = (direction % 2 == 0) ? n : m;

        for (int k = 0; k < count; k++) {
          switch (direction) {
            case 0:
              j++;
              break;
            case 1:
              i++;
              break;
            case 2:
              j--;
              break;
            case 3:
              i--;
              break;
          }

          result.add(matrix[i][j]);
        }

        if (direction % 2 == 0) {
          m--;
        } else {
          n--;
        }
      }

      return result;
    }
  }
}
