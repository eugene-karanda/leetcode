package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/">154. Find Minimum in Rotated Sorted Array II</a> (Hard)
 * <p>
 * Find the minimum of a rotated sorted array that may contain duplicates.
 */
@Disabled
public class FindMinimumInRotatedSortedArrayIITest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.findMin(new int[]{1, 3, 5});

    // then
    assertThat(result)
      .isEqualTo(1);
  }

  @Test
  void example2() {
    // when
    var result = solution.findMin(new int[]{2, 2, 2, 0, 1});

    // then
    assertThat(result)
      .isEqualTo(0);
  }

  class Solution {
    public int findMin(int[] nums) {
      throw new UnsupportedOperationException();
    }
  }
}
