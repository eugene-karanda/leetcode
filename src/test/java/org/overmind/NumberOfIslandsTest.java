package org.overmind;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/number-of-islands/">200. Number of Islands</a> (Medium)
 * <p>
 * Count the number of islands in a grid of '1's (land) and '0's (water).
 */
public class NumberOfIslandsTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.numIslands(new char[][]{{'1', '1', '1', '1', '0'}, {'1', '1', '0', '1', '0'}, {'1', '1', '0', '0', '0'}, {'0', '0', '0', '0', '0'}});

    // then
    assertThat(result)
      .isEqualTo(1);
  }

  @Test
  void example2() {
    // when
    var result = solution.numIslands(new char[][]{{'1', '1', '0', '0', '0'}, {'1', '1', '0', '0', '0'}, {'0', '0', '1', '0', '0'}, {'0', '0', '0', '1', '1'}});

    // then
    assertThat(result)
      .isEqualTo(3);
  }

  class Solution {
    public int numIslands(char[][] grid) {
      int islands = 0;

      for (int i = 0; i < grid.length; i++) {
        for (int j = 0; j < grid[i].length; j++) {
          if (grid[i][j] == '1') {
            islands++;
            floodIsland(grid, i, j);
          }
        }
      }

      return islands;
    }

    private void floodIsland(char[][] grid, int i, int j) {
      if (i < 0 || j < 0 || i >= grid.length || j >= grid[i].length || grid[i][j] == '0') {
        return;
      }

      grid[i][j] = '0';

      floodIsland(grid, i + 1, j);
      floodIsland(grid, i - 1, j);
      floodIsland(grid, i, j + 1);
      floodIsland(grid, i, j - 1);
    }
  }
}
