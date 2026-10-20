package org.overmind;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/jump-game-ii/">45. Jump Game II</a> (Medium)
 * <p>
 * Find the minimum number of jumps to reach the last index; {@code nums[i]} is the maximum jump length from index {@code i}.
 */
public class JumpGameIITest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.jump(new int[]{2, 3, 1, 1, 4});

    // then
    assertThat(result)
      .isEqualTo(2);
  }

  @Test
  void example2() {
    // when
    var result = solution.jump(new int[]{2, 3, 0, 1, 4});

    // then
    assertThat(result)
      .isEqualTo(2);
  }

  class Solution {
    public int jump(int[] nums) {
      int[] counts = new int[nums.length];

      for (int i = nums.length - 2; i >= 0; i--) {
        int min = Integer.MAX_VALUE - 1;
        for (int j = 1; j <= nums[i] && i + j < nums.length; j++) {
          if (counts[i + j] < min) {
            min = counts[i + j];
          }
        }
        counts[i] = min + 1;
      }

      return counts[0];
    }
  }
}
