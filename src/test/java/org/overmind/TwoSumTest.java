package org.overmind;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/two-sum/">1. Two Sum</a> (Easy)
 * <p>
 * Find the indices of two numbers in the array that add up to {@code target}.
 */
public class TwoSumTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.twoSum(new int[]{2, 7, 11, 15}, 9);

    // then
    assertThat(result)
      .containsExactly(0, 1);
  }

  @Test
  void example2() {
    // when
    var result = solution.twoSum(new int[]{3, 2, 4}, 6);

    // then
    assertThat(result)
      .containsExactly(1, 2);
  }

  @Test
  void example3() {
    // when
    var result = solution.twoSum(new int[]{3, 3}, 6);

    // then
    assertThat(result)
      .containsExactly(0, 1);
  }

  class Solution {
    public int[] twoSum(int[] nums, int target) {
      var hashMap = new HashMap<Integer, Integer>();

      for (int i = 0; i < nums.length; i++) {
        Integer existing = hashMap.get(target - nums[i]);

        if (existing != null) {
          return new int[]{existing, i};
        }

        hashMap.put(nums[i], i);
      }

      throw new IllegalArgumentException();
    }
  }
}
