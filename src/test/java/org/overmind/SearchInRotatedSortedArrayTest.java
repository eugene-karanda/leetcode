package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/search-in-rotated-sorted-array/">33. Search in Rotated Sorted Array</a> (Medium)
 * <p>
 * Search for {@code target} in a rotated sorted array in O(log n).
 */
@Disabled
public class SearchInRotatedSortedArrayTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0);

    // then
    assertThat(result)
      .isEqualTo(4);
  }

  @Test
  void example2() {
    // when
    var result = solution.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 3);

    // then
    assertThat(result)
      .isEqualTo(-1);
  }

  @Test
  void example3() {
    // when
    var result = solution.search(new int[]{1}, 0);

    // then
    assertThat(result)
      .isEqualTo(-1);
  }

  class Solution {
    public int search(int[] nums, int target) {
      throw new UnsupportedOperationException();
    }
  }
}
