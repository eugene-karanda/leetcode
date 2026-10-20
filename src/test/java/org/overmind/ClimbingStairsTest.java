package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/climbing-stairs/">70. Climbing Stairs</a> (Easy)
 * <p>
 * Count the distinct ways to climb n stairs taking 1 or 2 steps at a time.
 */
@Disabled
public class ClimbingStairsTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.climbStairs(2);

    // then
    assertThat(result)
      .isEqualTo(2);
  }

  @Test
  void example2() {
    // when
    var result = solution.climbStairs(3);

    // then
    assertThat(result)
      .isEqualTo(3);
  }

  class Solution {
    public int climbStairs(int n) {
      throw new UnsupportedOperationException();
    }
  }
}
