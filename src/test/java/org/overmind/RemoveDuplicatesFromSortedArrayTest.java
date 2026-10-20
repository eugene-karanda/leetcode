package org.overmind;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/remove-duplicates-from-sorted-array/">26. Remove Duplicates from Sorted Array</a> (Easy)
 * <p>
 * Remove duplicates from a sorted array in place; return the number of unique elements.
 */
public class RemoveDuplicatesFromSortedArrayTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // given
    var nums = new int[]{1, 1, 2};

    // when
    var result = solution.removeDuplicates(nums);

    // then
    assertThat(result)
      .isEqualTo(2);
    assertThat(nums)
      .startsWith(1, 2);
  }

  @Test
  void example2() {
    // given
    var nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

    // when
    var result = solution.removeDuplicates(nums);

    // then
    assertThat(result)
      .isEqualTo(5);
    assertThat(nums)
      .startsWith(0, 1, 2, 3, 4);
  }

  class Solution {
    public int removeDuplicates(int[] nums) {
      int j = 0;
      for (int i = 1; i < nums.length ; i++) {
        if (nums[i] != nums[j]) {
          nums[j + 1] = nums[i];
          j++;
        }
      }

      return j + 1;
    }
  }
}
