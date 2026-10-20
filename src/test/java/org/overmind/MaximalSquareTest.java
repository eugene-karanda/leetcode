package org.overmind;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/maximal-square/">221. Maximal Square</a> (Medium)
 * <p>
 * Find the largest square containing only 1's in a binary matrix and return its area.
 */
public class MaximalSquareTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.maximalSquare(new char[][]{{'1', '0', '1', '0', '0'}, {'1', '0', '1', '1', '1'}, {'1', '1', '1', '1', '1'}, {'1', '0', '0', '1', '0'}});

    // then
    assertThat(result)
      .isEqualTo(4);
  }

  @Test
  void example2() {
    // when
    var result = solution.maximalSquare(new char[][]{{'0', '1'}, {'1', '0'}});

    // then
    assertThat(result)
      .isEqualTo(1);
  }

  @Test
  void example3() {
    // when
    var result = solution.maximalSquare(new char[][]{{'0'}});

    // then
    assertThat(result)
      .isEqualTo(0);
  }

  class Solution {
    public int maximalSquare(char[][] matrix) {
      var m = matrix.length;
      var n = matrix[0].length;
      var dp = new int[m][n];
      var max = 0;

      for (var i = 0; i < m; i++) {
        for (var j = 0; j < n; j++) {
          if (matrix[i][j] == '0') {
            dp[i][j] = 0;
          } else {
            dp[i][j] = Math.min(
              i > 0 ? dp[i - 1][j] : 0,
              Math.min(
                j > 0 ? dp[i][j - 1] : 0,
                (i > 0 && j > 0) ? dp[i - 1][j - 1] : 0
              )
            ) + 1;

            max = Math.max(max, dp[i][j]);
          }
        }
      }

      return max * max;
    }
  }
}
