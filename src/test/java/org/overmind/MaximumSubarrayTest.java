package org.overmind;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/maximum-subarray/">53. Maximum Subarray</a> (Medium)
 * <p>
 * Find the subarray with the largest sum.
 */
public class MaximumSubarrayTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});

    // then
    assertThat(result)
      .isEqualTo(6);
  }

  @Test
  void example2() {
    // when
    var result = solution.maxSubArray(new int[]{1});

    // then
    assertThat(result)
      .isEqualTo(1);
  }

  @Test
  void example3() {
    // when
    var result = solution.maxSubArray(new int[]{5, 4, -1, 7, 8});

    // then
    assertThat(result)
      .isEqualTo(23);
  }

  class Solution {
    public int maxSubArray(int[] nums) {
      int sum = 0;
      int maxRangeSum = Integer.MIN_VALUE;
      int minRangeSum = 0;

      for (int i = 0; i < nums.length; i++) {
        sum += nums[i];

        if(sum - minRangeSum > maxRangeSum) {
          maxRangeSum = sum - minRangeSum;
        }

        if(sum < minRangeSum) {
          minRangeSum = sum;
        }
      }

      return maxRangeSum;
    }
  }
}
