package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/">34. Find First and Last Position of Element in Sorted Array</a> (Medium)
 * <p>
 * Find the first and last position of {@code target} in a sorted array in O(log n).
 */
@Disabled
public class FindFirstAndLastPositionOfElementInSortedArrayTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8);

    // then
    assertThat(result)
      .containsExactly(3, 4);
  }

  @Test
  void example2() {
    // when
    var result = solution.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 6);

    // then
    assertThat(result)
      .containsExactly(-1, -1);
  }

  @Test
  void example3() {
    // when
    var result = solution.searchRange(new int[]{}, 0);

    // then
    assertThat(result)
      .containsExactly(-1, -1);
  }

  class Solution {
    public int[] searchRange(int[] nums, int target) {
      throw new UnsupportedOperationException();
    }
  }
}
