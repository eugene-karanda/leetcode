package org.overmind;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/majority-element/">169. Majority Element</a> (Easy)
 * <p>
 * Find the element that appears more than n / 2 times.
 */
public class MajorityElementTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.majorityElement(new int[]{3, 2, 3});

    // then
    assertThat(result)
      .isEqualTo(3);
  }

  @Test
  void example2() {
    // when
    var result = solution.majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2});

    // then
    assertThat(result)
      .isEqualTo(2);
  }

  class Solution {
    public int majorityElement(int[] nums) {
      int res = nums[0];
      int majority = 1;

      for (int i = 1; i< nums.length; i++) {
        if ( nums[i] == res) {
          majority++;
        } else {
          majority--;
        }

        if (majority < 0) {
          res = nums[i];
          majority = 1;
        }
      }

      return res;
    }
  }
}
