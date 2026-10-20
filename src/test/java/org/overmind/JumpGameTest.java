package org.overmind;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/jump-game/">55. Jump Game</a> (Medium)
 * <p>
 * Determine whether the last index is reachable; {@code nums[i]} is the maximum jump length from index {@code i}.
 */
public class JumpGameTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.canJump(new int[]{2, 3, 1, 1, 4});

    // then
    assertThat(result)
      .isTrue();
  }

  class Solution {
    public boolean canJump(int[] nums) {
      boolean[] statuses = new boolean[nums.length];
      statuses[nums.length - 1] = true;

      for (int i = nums.length - 2; i >= 0; i--) {
        for (int j = 1; j <= nums[i] && i + j < nums.length; j++) {
          if (statuses[i + j]) {
            statuses[i] = true;
            break;
          }
        }
      }

      return statuses[0];
    }
  }
}
