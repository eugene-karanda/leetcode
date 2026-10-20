package org.overmind;

import org.junit.jupiter.api.Test;

import java.util.ArrayDeque;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/maximal-rectangle/">85. Maximal Rectangle</a> (Hard)
 * <p>
 * Find the largest rectangle containing only 1's in a binary matrix.
 */
public class MaximalRectangleTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.maximalRectangle(new char[][]{{'1', '0', '1', '0', '0'}, {'1', '0', '1', '1', '1'}, {'1', '1', '1', '1', '1'}, {'1', '0', '0', '1', '0'}});

    // then
    assertThat(result)
      .isEqualTo(6);
  }

  @Test
  void example2() {
    // when
    var result = solution.maximalRectangle(new char[][]{{'0'}});

    // then
    assertThat(result)
      .isEqualTo(0);
  }

  @Test
  void example3() {
    // when
    var result = solution.maximalRectangle(new char[][]{{'1'}});

    // then
    assertThat(result)
      .isEqualTo(1);
  }

  class Solution {
    public int maximalRectangle(char[][] matrix) {
      var rows = matrix.length;
      var cols = matrix[0].length;

      var maxArea = 0;
      var stack = new ArrayDeque<Integer>();
      var heights = new int[cols];

      for (var row = 0; row < rows; row++) {
        for (var col = 0; col < cols; col++) {
          heights[col] = matrix[row][col] == '1'
            ? heights[col] + 1
            : 0;
        }

        for (var i = 0; i < heights.length; i++) {
          while (!stack.isEmpty() && heights[stack.peek()] > heights[i]) {
            var h = heights[stack.pop()];
            var w = stack.isEmpty() ? i : i - stack.peek() - 1;

            if (w * h > maxArea) maxArea = w * h;
          }

          stack.push(i);
        }

        while (!stack.isEmpty()) {
          var h = heights[stack.pop()];
          var w = stack.isEmpty() ? heights.length : heights.length - stack.peek() - 1;

          if (w * h > maxArea) maxArea = w * h;
        }
      }

      return maxArea;
    }
  }
}
