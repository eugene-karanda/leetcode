package org.overmind;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/maximum-length-of-repeated-subarray/">718. Maximum Length of Repeated Subarray</a> (Medium)
 * <p>
 * Find the maximum length of a subarray that appears in both arrays.
 */
public class MaximumLengthOfRepeatedSubarrayTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.findLength(new int[]{1, 2, 3, 2, 1}, new int[]{3, 2, 1, 4, 7});

    // then
    assertThat(result)
      .isEqualTo(3);
  }

  @Test
  void example2() {
    // when
    var result = solution.findLength(new int[]{0, 0, 0, 0, 0}, new int[]{0, 0, 0, 0, 0});

    // then
    assertThat(result)
      .isEqualTo(5);
  }

  class Solution {
    public int findLength(int[] nums1, int[] nums2) {
      int max = 0;

      for (int i = 0; i < nums1.length; i++) {
        for (int j = 0; j < nums2.length; j++) {
          int k = 0;

          for (; i + k < nums1.length && j + k < nums2.length; k++) {
            if (nums1[i + k] != nums2[j + k]) {
              break;
            }
          }

          if (k > max) {
            max = k;
          }
        }
      }

      return max;
    }
  }
}
