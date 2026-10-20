package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/minimum-path-sum/">64. Minimum Path Sum</a> (Medium)
 * <p>
 * Find a path from the top-left to the bottom-right corner of a grid with the minimum sum, moving only right or down.
 */
@Disabled
public class MinimumPathSumTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.minPathSum(new int[][]{{1, 3, 1}, {1, 5, 1}, {4, 2, 1}});

    // then
    assertThat(result)
      .isEqualTo(7);
  }

  @Test
  void example2() {
    // when
    var result = solution.minPathSum(new int[][]{{1, 2, 3}, {4, 5, 6}});

    // then
    assertThat(result)
      .isEqualTo(12);
  }

  class Solution {
    public int minPathSum(int[][] grid) {
      throw new UnsupportedOperationException();
    }
  }
}
