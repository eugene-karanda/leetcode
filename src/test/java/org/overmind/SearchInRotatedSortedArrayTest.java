package org.overmind;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/search-in-rotated-sorted-array/">33. Search in Rotated Sorted Array</a> (Medium)
 * <p>
 * Search for {@code target} in a rotated sorted array in O(log n).
 */
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

  @Test
  void example4() {
    // when
    var result = solution.search(new int[]{6, 0, 1, 2, 3, 4, 5}, 6);

    // then
    assertThat(result)
      .isEqualTo(0);
  }

  @Test
  void example5() {
    // when
    var result = solution.search(new int[]{5}, 5);

    // then
    assertThat(result)
      .isEqualTo(0);
  }

  class Solution {
    public int search(int[] nums, int target) {
      int n = nums.length, a = 0, b = n - 1, c, k;

      while (a < b) {
        int mid = a + (b - a) / 2;

        if (nums[mid] > nums[b]) {
          a = mid + 1;
        } else {
          b = mid;
        }
      }

      k = a;
      a = 0;
      b = n - 1;

      while (a < b) {
        c = (a + b) / 2;

        if (nums[(c + k) % n] >= target) {
          b = c;
        } else {
          a = c + 1;
        }
      }

      if (nums[(a + k) % n] == target) {
        return (a + k) % n;
      } else {
        return -1;
      }
    }
  }
}
