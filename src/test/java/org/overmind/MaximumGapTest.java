package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/maximum-gap/">164. Maximum Gap</a> (Medium)
 * <p>
 * Find the maximum difference between successive elements in sorted order, in linear time.
 */
@Disabled
public class MaximumGapTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.maximumGap(new int[]{3, 6, 9, 1});

    // then
    assertThat(result)
      .isEqualTo(3);
  }

  @Test
  void example2() {
    // when
    var result = solution.maximumGap(new int[]{10});

    // then
    assertThat(result)
      .isEqualTo(0);
  }

  class Solution {
    public int maximumGap(int[] nums) {
      throw new UnsupportedOperationException();
    }
  }
}
