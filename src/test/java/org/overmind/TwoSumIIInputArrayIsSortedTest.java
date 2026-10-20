package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/">167. Two Sum II - Input Array Is Sorted</a> (Medium)
 * <p>
 * Find two numbers in a sorted array that add up to {@code target}; return their 1-based indices.
 */
@Disabled
public class TwoSumIIInputArrayIsSortedTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.twoSum(new int[]{2, 7, 11, 15}, 9);

    // then
    assertThat(result)
      .containsExactly(1, 2);
  }

  @Test
  void example2() {
    // when
    var result = solution.twoSum(new int[]{2, 3, 4}, 6);

    // then
    assertThat(result)
      .containsExactly(1, 3);
  }

  @Test
  void example3() {
    // when
    var result = solution.twoSum(new int[]{-1, 0}, -1);

    // then
    assertThat(result)
      .containsExactly(1, 2);
  }

  class Solution {
    public int[] twoSum(int[] numbers, int target) {
      throw new UnsupportedOperationException();
    }
  }
}
