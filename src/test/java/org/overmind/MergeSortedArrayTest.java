package org.overmind;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/merge-sorted-array/">88. Merge Sorted Array</a> (Easy)
 * <p>
 * Merge two sorted arrays into {@code nums1} in place.
 */
public class MergeSortedArrayTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // given
    var nums1 = new int[]{1, 2, 3, 0, 0, 0};

    // when
    solution.merge(nums1, 3, new int[]{2, 5, 6}, 3);

    // then
    assertThat(nums1)
      .containsExactly(1, 2, 2, 3, 5, 6);
  }

  @Test
  void example2() {
    // given
    var nums1 = new int[]{1};

    // when
    solution.merge(nums1, 1, new int[]{}, 0);

    // then
    assertThat(nums1)
      .containsExactly(1);
  }

  @Test
  void example3() {
    // given
    var nums1 = new int[]{0};

    // when
    solution.merge(nums1, 0, new int[]{1}, 1);

    // then
    assertThat(nums1)
      .containsExactly(1);
  }

  class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
      while(m > 0 && n > 0) {
        if(nums1[m - 1] > nums2[n - 1]) {
          nums1[m + n - 1] = nums1[m-1];
          m--;
        } else {
          nums1[m + n - 1] = nums2[n-1];
          n--;
        }
      }

      while(n > 0) {
        nums1[n - 1] = nums2[n - 1];
        n--;
      }
    }
  }
}
