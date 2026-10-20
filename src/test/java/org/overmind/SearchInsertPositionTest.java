package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/search-insert-position/">35. Search Insert Position</a> (Easy)
 * <p>
 * Return the index of {@code target}, or the index where it would be inserted to keep the array sorted.
 */
@Disabled
public class SearchInsertPositionTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.searchInsert(new int[]{1, 3, 5, 6}, 5);

    // then
    assertThat(result)
      .isEqualTo(2);
  }

  @Test
  void example2() {
    // when
    var result = solution.searchInsert(new int[]{1, 3, 5, 6}, 2);

    // then
    assertThat(result)
      .isEqualTo(1);
  }

  @Test
  void example3() {
    // when
    var result = solution.searchInsert(new int[]{1, 3, 5, 6}, 7);

    // then
    assertThat(result)
      .isEqualTo(4);
  }

  class Solution {
    public int searchInsert(int[] nums, int target) {
      throw new UnsupportedOperationException();
    }
  }
}
