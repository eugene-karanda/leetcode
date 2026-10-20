package org.overmind;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/">1365. How Many Numbers Are Smaller Than the Current Number</a> (Easy)
 * <p>
 * For every element, count how many numbers in the array are smaller than it.
 */
public class HowManyNumbersAreSmallerThanTheCurrentNumberTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.smallerNumbersThanCurrent(new int[]{8, 1, 2, 2, 3});

    // then
    assertThat(result)
      .containsExactly(4, 0, 1, 1, 3);
  }

  @Test
  void example2() {
    // when
    var result = solution.smallerNumbersThanCurrent(new int[]{6, 5, 4, 8});

    // then
    assertThat(result)
      .containsExactly(2, 1, 0, 3);
  }

  @Test
  void example3() {
    // when
    var result = solution.smallerNumbersThanCurrent(new int[]{7, 7, 7, 7});

    // then
    assertThat(result)
      .containsExactly(0, 0, 0, 0);
  }

  class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
      int n = nums.length;

      var frequency = new int[101];
      for (var num : nums) frequency[num]++;

      var prefix = new int[101];

      for (var i = 1; i <= 100; i++)
        prefix[i] = prefix[i - 1] + frequency[i - 1];

      var result = new int[n];

      for (var i = 0; i < n; i++) result[i] = prefix[nums[i]];

      return result;
    }
  }
}
