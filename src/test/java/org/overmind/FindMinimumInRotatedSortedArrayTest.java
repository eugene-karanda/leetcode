package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/">153. Find Minimum in Rotated Sorted Array</a> (Medium)
 * <p>
 * Find the minimum of a rotated sorted array of unique elements in O(log n).
 */
@Disabled
public class FindMinimumInRotatedSortedArrayTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.findMin(new int[]{3, 4, 5, 1, 2});

    // then
    assertThat(result)
      .isEqualTo(1);
  }

  @Test
  void example2() {
    // when
    var result = solution.findMin(new int[]{4, 5, 6, 7, 0, 1, 2});

    // then
    assertThat(result)
      .isEqualTo(0);
  }

  @Test
  void example3() {
    // when
    var result = solution.findMin(new int[]{11, 13, 15, 17});

    // then
    assertThat(result)
      .isEqualTo(11);
  }

  class Solution {
    public int findMin(int[] nums) {
      throw new UnsupportedOperationException();
    }
  }
}
