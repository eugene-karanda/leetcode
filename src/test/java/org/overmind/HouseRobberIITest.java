package org.overmind;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/house-robber-ii/">213. House Robber II</a> (Medium)
 * <p>
 * House Robber, but the houses are arranged in a circle.
 */
public class HouseRobberIITest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.rob(new int[]{2, 3, 2});

    // then
    assertThat(result)
      .isEqualTo(3);
  }

  @Test
  void example2() {
    // when
    var result = solution.rob(new int[]{1, 2, 3, 1});

    // then
    assertThat(result)
      .isEqualTo(4);
  }

  @Test
  void example3() {
    // when
    var result = solution.rob(new int[]{1, 2, 3});

    // then
    assertThat(result)
      .isEqualTo(3);
  }

  class Solution {
    public int rob(int[] nums) {
      if(nums.length == 1) {
        return nums[0];
      }

      if(nums.length == 2) {
        return Math.max(nums[0], nums[1]);
      }

      int[] maxF = new int[nums.length];
      int[] maxS = new int[nums.length];

      maxF[0] = nums[0];
      maxF[1] = Math.max(nums[0], nums[1]);

      maxS[0] = 0;
      maxS[1] = nums[1];

      for(int i=2; i < nums.length;i++) {
        maxF[i] = Math.max(maxF[i-1], maxF[i-2] + nums[i]);
        maxS[i] = Math.max(maxS[i-1], maxS[i-2] + nums[i]);
      }

      return Math.max(maxF[nums.length-2], maxS[nums.length-1]);
    }
  }
}
