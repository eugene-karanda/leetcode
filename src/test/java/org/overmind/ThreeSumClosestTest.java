package org.overmind;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/3sum-closest/">16. 3Sum Closest</a> (Medium)
 * <p>
 * Find the sum of three integers closest to {@code target}.
 */
public class ThreeSumClosestTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.threeSumClosest(new int[]{-1, 2, 1, -4}, 1);

    // then
    assertThat(result)
      .isEqualTo(2);
  }

  @Test
  void example2() {
    // when
    var result = solution.threeSumClosest(new int[]{0, 0, 0}, 1);

    // then
    assertThat(result)
      .isEqualTo(0);
  }

  class Solution {
    public int threeSumClosest(int[] nums, int target) {
      Arrays.sort(nums);

      int closest = nums[0] + nums[1] + nums[2];

      for (int i = 0; i < nums.length - 2; i++) {
        int left = i + 1;
        int right = nums.length - 1;

        while (left < right) {
          int sum = nums[i] + nums[left] + nums[right];
          closest = Math.abs(sum - target) < Math.abs(closest - target) ? sum : closest;

          if (sum < target) {
            left++;
          } else if (sum > target) {
            right--;
          } else {
            // exact match
            return sum;
          }
        }
      }

      return closest;
    }
  }
}
