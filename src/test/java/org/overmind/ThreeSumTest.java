package org.overmind;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/3sum/">15. 3Sum</a> (Medium)
 * <p>
 * Find all unique triplets that sum up to zero.
 */
public class ThreeSumTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.threeSum(new int[]{-1, 0, 1, 2, -1, -4});

    // then
    assertThat(result)
      .containsExactlyInAnyOrder(List.of(-1, -1, 2), List.of(-1, 0, 1));
  }

  @Test
  void example2() {
    // when
    var result = solution.threeSum(new int[]{0, 1, 1});

    // then
    assertThat(result)
      .isEmpty();
  }

  @Test
  void example3() {
    // when
    var result = solution.threeSum(new int[]{0, 0, 0});

    // then
    assertThat(result)
      .containsExactlyInAnyOrder(List.of(0, 0, 0));
  }

  class Solution {

    public List<List<Integer>> threeSum(int[] nums) {
      Arrays.sort(nums);

      var result = new ArrayList<List<Integer>>();

      for (int i = 0; i < nums.length - 2;) {
        int left = i + 1;
        int right = nums.length - 1;
        int target = -nums[i];

        while (left < right) {
          if (nums[left] + nums[right] == target) {
            result.add(List.of(nums[i], nums[left], nums[right]));
            left++;
            right--;
            while (left < right && nums[left] == nums[left - 1]) {
              left++;
            }
            while (left < right && nums[right] == nums[right + 1]) {
              right--;
            }
          } else if (nums[left] + nums[right] < target) {
            left++;
          } else {
            right--;
          }
        }

        do {
          i++;
        } while (i < nums.length - 2 && nums[i] == nums[i - 1]);
      }

      return result;
    }
  }
}
