package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/search-a-2d-matrix/">74. Search a 2D Matrix</a> (Medium)
 * <p>
 * Search for {@code target} in a matrix whose rows are sorted and follow each other in order.
 */
@Disabled
public class SearchA2DMatrixTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.searchMatrix(new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}}, 3);

    // then
    assertThat(result)
      .isTrue();
  }

  @Test
  void example2() {
    // when
    var result = solution.searchMatrix(new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}}, 13);

    // then
    assertThat(result)
      .isFalse();
  }

  class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
      throw new UnsupportedOperationException();
    }
  }
}
