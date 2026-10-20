package org.overmind;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/4sum/">18. 4Sum</a> (Medium)
 * <p>
 * Find all unique quadruplets that sum up to {@code target}.
 */
public class FourSumTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.fourSum(new int[]{1, 0, -1, 0, -2, 2}, 0);

    // then
    assertThat(result)
      .containsExactlyInAnyOrder(List.of(-2, -1, 1, 2), List.of(-2, 0, 0, 2), List.of(-1, 0, 0, 1));
  }

  @Test
  void example2() {
    // when
    var result = solution.fourSum(new int[]{2, 2, 2, 2, 2}, 8);

    // then
    assertThat(result)
      .containsExactlyInAnyOrder(List.of(2, 2, 2, 2));
  }

  class Solution {

    public List<List<Integer>> fourSum(int[] nums, int target) {
      var result = new ArrayList<List<Integer>>();

      Arrays.sort(nums);

      for (int i = 0; i < nums.length - 3; ) {
        for (int j = i + 1; j < nums.length - 2; ) {
          int left = j + 1;
          int right = nums.length - 1;

          while (left < right) {
            long sum = ((long) nums[i]) + nums[j] + nums[left] + nums[right];

            if (sum < target) {
              left++;
            } else if (sum > target) {
              right--;
            } else {
              result.add(List.of(nums[i], nums[j], nums[left], nums[right]));

              do {
                left++;
              } while (left < right && nums[left] == nums[left - 1]);

              do {
                right--;
              } while (left < right && nums[right] == nums[right + 1]);
            }
          }

          do {
            j++;
          } while (j < nums.length - 2 && nums[j] == nums[j - 1]);
        }

        do {
          i++;
        } while (i < nums.length - 3 && nums[i] == nums[i - 1]);
      }

      return result;
    }
  }
}
