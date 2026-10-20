package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/search-in-rotated-sorted-array-ii/">81. Search in Rotated Sorted Array II</a> (Medium)
 * <p>
 * Search for {@code target} in a rotated sorted array that may contain duplicates.
 */
@Disabled
public class SearchInRotatedSortedArrayIITest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.search(new int[]{2, 5, 6, 0, 0, 1, 2}, 0);

    // then
    assertThat(result)
      .isTrue();
  }

  @Test
  void example2() {
    // when
    var result = solution.search(new int[]{2, 5, 6, 0, 0, 1, 2}, 3);

    // then
    assertThat(result)
      .isFalse();
  }

  class Solution {
    public boolean search(int[] nums, int target) {
      throw new UnsupportedOperationException();
    }
  }
}
