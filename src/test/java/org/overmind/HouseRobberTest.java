package org.overmind;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/house-robber/">198. House Robber</a> (Medium)
 * <p>
 * Find the maximum amount of money that can be robbed from houses in a row without robbing two adjacent ones.
 */
public class HouseRobberTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.rob(new int[]{1, 2, 3, 1});

    // then
    assertThat(result)
      .isEqualTo(4);
  }

  @Test
  void example2() {
    // when
    var result = solution.rob(new int[]{2, 7, 9, 3, 1});

    // then
    assertThat(result)
      .isEqualTo(12);
  }

  class Solution {

    public int rob(int[] nums) {
      if (nums.length == 1) {
        return nums[0];
      }

      nums[1] = Math.max(nums[0], nums[1]);

      for (int i = 2; i < nums.length; i++) {
        nums[i] = Math.max(nums[i - 1], nums[i - 2] + nums[i]);
      }

      return nums[nums.length - 1];
    }
  }
}
