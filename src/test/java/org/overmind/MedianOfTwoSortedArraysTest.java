package org.overmind;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/median-of-two-sorted-arrays/">4. Median of Two Sorted Arrays</a> (Hard)
 * <p>
 * Find the median of two sorted arrays in O(log(m + n)).
 */
public class MedianOfTwoSortedArraysTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.findMedianSortedArrays(new int[]{1, 3}, new int[]{2});

    // then
    assertThat(result)
      .isEqualTo(2.0);
  }

  @Test
  void example2() {
    // when
    var result = solution.findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4});

    // then
    assertThat(result)
      .isEqualTo(2.5);
  }

  @Test
  void example3() {
    // when
    var result = solution.findMedianSortedArrays(
      new int[]{1, 2, 3, 4, 5},
      new int[]{6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17}
    );

    // then
    assertThat(result)
      .isEqualTo(9.0);
  }

  @Test
  void example4() {
    // when
    var result = solution.findMedianSortedArrays(new int[]{1, 1, 1}, new int[]{1, 1, 1});

    // then
    assertThat(result)
      .isEqualTo(1.0);
  }

  class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
      int nums1Begin = 0;
      int nums2Begin = 0;
      int nums1End = nums1.length;
      int nums2End = nums2.length;

      while ((nums1End - nums1Begin + nums2End - nums2Begin) > 2 && nums1Begin != nums1End && nums2Begin != nums2End) {
        if (nums1[nums1Begin] < nums2[nums2Begin]) {
          nums1Begin++;
        } else {
          nums2Begin++;
        }

        if (nums1[nums1End - 1] < nums2[nums2End - 1]) {
          nums2End--;
        } else {
          nums1End--;
        }
      }

      if (nums1Begin == nums1End) {
        if ((nums2End - nums2Begin) % 2 == 0) {
          return ((double) nums2[nums2Begin + (nums2End - nums2Begin) / 2 - 1] +
            (double) nums2[nums2Begin + (nums2End - nums2Begin) / 2]) / 2.0;
        } else {
          return nums2[nums2Begin + (nums2End - nums2Begin) / 2];
        }
      }

      if (nums2Begin == nums2End) {
        if ((nums1End - nums1Begin) % 2 == 0) {
          return ((double) nums1[nums1Begin + (nums1End - nums1Begin) / 2 - 1] +
            (double) nums1[nums1Begin + (nums1End - nums1Begin) / 2]) / 2.0;
        } else {
          return nums1[nums1Begin + (nums1End - nums1Begin) / 2];
        }
      }

      double result = 0;

      for (int i = nums1Begin; i < nums1End; i++) {
        result += nums1[i];
      }

      for (int i = nums2Begin; i < nums2End; i++) {
        result += nums2[i];
      }

      return result / (nums1End - nums1Begin + nums2End - nums2Begin);
    }
  }
}
