package org.overmind;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/container-with-most-water/">11. Container With Most Water</a> (Medium)
 * <p>
 * Find two lines that together with the x-axis form a container holding the most water.
 */
public class ContainerWithMostWaterTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7});

    // then
    assertThat(result)
      .isEqualTo(49);
  }

  @Test
  void example2() {
    // when
    var result = solution.maxArea(new int[]{1, 1});

    // then
    assertThat(result)
      .isEqualTo(1);
  }

  class Solution {
    public int maxArea(int[] height) {
      int maxArea = 0;
      int left = 0;
      int right = height.length - 1;

      while(left < right) {
        maxArea = Math.max(maxArea, (right - left) * Math.min(height[left], height[right]));

        if (height[left] < height[right]) {
          left++;
        } else if (height[left] > height[right])  {
          right--;
        } else {
          left++;
          right--;
        }

      }

      return maxArea;
    }
  }
}
