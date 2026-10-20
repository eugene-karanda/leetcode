package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/single-number-ii/">137. Single Number II</a> (Medium)
 * <p>
 * Find the element that appears once while every other element appears three times.
 */
@Disabled
public class SingleNumberIITest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.singleNumber(new int[]{2, 2, 3, 2});

    // then
    assertThat(result)
      .isEqualTo(3);
  }

  @Test
  void example2() {
    // when
    var result = solution.singleNumber(new int[]{0, 1, 0, 1, 0, 1, 99});

    // then
    assertThat(result)
      .isEqualTo(99);
  }

  class Solution {
    public int singleNumber(int[] nums) {
      throw new UnsupportedOperationException();
    }
  }
}
