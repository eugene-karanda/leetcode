package org.overmind;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/max-consecutive-ones/">485. Max Consecutive Ones</a> (Easy)
 * <p>
 * Find the maximum number of consecutive 1's in a binary array.
 */
public class MaxConsecutiveOnesTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.findMaxConsecutiveOnes(new int[]{1, 1, 0, 1, 1, 1});

    // then
    assertThat(result)
      .isEqualTo(3);
  }

  @Test
  void example2() {
    // when
    var result = solution.findMaxConsecutiveOnes(new int[]{1, 0, 1, 1, 0, 1});

    // then
    assertThat(result)
      .isEqualTo(2);
  }

  class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
      int max = 0;
      int count = 0;

      for (var num : nums) {
        if (num == 1) {
          count++;
        } else {
          max = Math.max(max, count);
          count = 0;
        }
      }

      return Math.max(max, count);
    }
  }
}
