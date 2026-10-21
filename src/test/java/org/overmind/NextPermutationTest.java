package org.overmind;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/next-permutation/">31. Next Permutation</a> (Medium)
 * <p>
 * Rearrange the array into the next lexicographically greater permutation in place.
 */
public class NextPermutationTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // given
    var nums = new int[]{1, 2, 3};

    // when
    solution.nextPermutation(nums);

    // then
    assertThat(nums)
      .containsExactly(1, 3, 2);
  }

  @Test
  void example2() {
    // given
    var nums = new int[]{3, 2, 1};

    // when
    solution.nextPermutation(nums);

    // then
    assertThat(nums)
      .containsExactly(1, 2, 3);
  }

  @Test
  void example3() {
    // given
    var nums = new int[]{1, 1, 5};

    // when
    solution.nextPermutation(nums);

    // then
    assertThat(nums)
      .containsExactly(1, 5, 1);
  }

  class Solution {
    public void nextPermutation(int[] nums) {
      int pivot = -1;

      for (int left = nums.length - 1; left > 0 ; left--) {
        if (nums[left - 1] < nums[left]) {
          pivot = left - 1;
          break;
        }
      }

      if (pivot != -1) {
        int right = nums.length - 1;
        while (nums[right] <= nums[pivot]) {
          right--;
        }

        int tmp = nums[pivot];
        nums[pivot] = nums[right];
        nums[right] = tmp;
      }

      for (int i = 0; i < (nums.length - pivot - 1) / 2 ; i++) {
        int tmp = nums[pivot + 1 + i];
        nums[pivot + 1 + i] = nums[nums.length - 1 - i];
        nums[nums.length - 1 - i] = tmp;
      }
    }
  }
}
