package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/trapping-rain-water/">42. Trapping Rain Water</a> (Hard)
 * <p>
 * Compute how much rain water an elevation map can trap.
 */
@Disabled
public class TrappingRainWaterTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1});

    // then
    assertThat(result)
      .isEqualTo(6);
  }

  @Test
  void example2() {
    // when
    var result = solution.trap(new int[]{4, 2, 0, 3, 2, 5});

    // then
    assertThat(result)
      .isEqualTo(9);
  }

  class Solution {
    public int trap(int[] height) {
      throw new UnsupportedOperationException();
    }
  }
}
