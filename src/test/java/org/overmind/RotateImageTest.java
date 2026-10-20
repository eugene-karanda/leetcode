package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/rotate-image/">48. Rotate Image</a> (Medium)
 * <p>
 * Rotate an n x n matrix 90 degrees clockwise in place.
 */
@Disabled
public class RotateImageTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // given
    var matrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

    // when
    solution.rotate(matrix);

    // then
    assertThat(matrix)
      .isDeepEqualTo(new int[][]{{7, 4, 1}, {8, 5, 2}, {9, 6, 3}});
  }

  @Test
  void example2() {
    // given
    var matrix = new int[][]{{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}};

    // when
    solution.rotate(matrix);

    // then
    assertThat(matrix)
      .isDeepEqualTo(new int[][]{{15, 13, 2, 5}, {14, 3, 4, 1}, {12, 6, 8, 9}, {16, 7, 10, 11}});
  }

  class Solution {
    public void rotate(int[][] matrix) {
      throw new UnsupportedOperationException();
    }
  }
}
