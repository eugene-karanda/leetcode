package org.overmind;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/">80. Remove Duplicates from Sorted Array II</a> (Medium)
 * <p>
 * Remove duplicates from a sorted array in place so that each value appears at most twice; return the new length.
 */
public class RemoveDuplicatesFromSortedArrayIITest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // given
    var nums = new int[]{1, 1, 1, 2, 2, 3};

    // when
    var result = solution.removeDuplicates(nums);

    // then
    assertThat(result)
      .isEqualTo(5);
    assertThat(nums)
      .startsWith(1, 1, 2, 2, 3);
  }

  @Test
  void example2() {
    // given
    var nums = new int[]{0, 0, 1, 1, 1, 1, 2, 3, 3};

    // when
    var result = solution.removeDuplicates(nums);

    // then
    assertThat(result)
      .isEqualTo(7);
    assertThat(nums)
      .startsWith(0, 0, 1, 1, 2, 3, 3);
  }

  class Solution {
    public int removeDuplicates(int[] nums) {
      var length = 0;
      var prev = Integer.MIN_VALUE;
      var prevCount = 0;

      for (int i = 0; i < nums.length; i++) {
        var num = nums[i];

        if (prev == num) {
          prevCount++;
        } else {
          prev = num;
          prevCount = 1;
        }

        if (prevCount < 3) {
          nums[length] = nums[i];
          length++;
        }
      }

      return length;
    }
  }
}
