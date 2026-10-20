package org.overmind;

import org.junit.jupiter.api.Test;

import java.util.ArrayDeque;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/largest-rectangle-in-histogram/">84. Largest Rectangle in Histogram</a> (Hard)
 * <p>
 * Find the area of the largest rectangle in a histogram.
 */
public class LargestRectangleInHistogramTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.largestRectangleArea(new int[]{2, 1, 5, 6, 2, 3});

    // then
    assertThat(result)
      .isEqualTo(10);
  }

  @Test
  void example2() {
    // when
    var result = solution.largestRectangleArea(new int[]{2, 4});

    // then
    assertThat(result)
      .isEqualTo(4);
  }

  class Solution {

    public int largestRectangleArea(int[] heights) {
      var stack = new ArrayDeque<Integer>();
      var maxArea = 0;

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

      return maxArea;
    }
  }
}
