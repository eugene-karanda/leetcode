package org.overmind;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/single-number/">136. Single Number</a> (Easy)
 * <p>
 * Find the element that appears once while every other element appears twice.
 */
public class SingleNumberTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.singleNumber(new int[]{2, 2, 1});

    // then
    assertThat(result)
      .isEqualTo(1);
  }

  @Test
  void example2() {
    // when
    var result = solution.singleNumber(new int[]{4, 1, 2, 1, 2});

    // then
    assertThat(result)
      .isEqualTo(4);
  }

  @Test
  void example3() {
    // when
    var result = solution.singleNumber(new int[]{1});

    // then
    assertThat(result)
      .isEqualTo(1);
  }

  class Solution {
    public int singleNumber(int[] nums) {
      int result = 0;

      for(int num : nums) {
        result ^= num;
      }

      return result;
    }
  }
}
