package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/unique-paths-ii/">63. Unique Paths II</a> (Medium)
 * <p>
 * Unique Paths, but some cells of the grid are obstacles.
 */
@Disabled
public class UniquePathsIITest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.uniquePathsWithObstacles(new int[][]{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}});

    // then
    assertThat(result)
      .isEqualTo(2);
  }

  @Test
  void example2() {
    // when
    var result = solution.uniquePathsWithObstacles(new int[][]{{0, 1}, {0, 0}});

    // then
    assertThat(result)
      .isEqualTo(1);
  }

  class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
      throw new UnsupportedOperationException();
    }
  }
}
