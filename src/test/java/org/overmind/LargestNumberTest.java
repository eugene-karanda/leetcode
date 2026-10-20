package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/largest-number/">179. Largest Number</a> (Medium)
 * <p>
 * Arrange non-negative integers so that they form the largest number.
 */
@Disabled
public class LargestNumberTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.largestNumber(new int[]{10, 2});

    // then
    assertThat(result)
      .isEqualTo("210");
  }

  @Test
  void example2() {
    // when
    var result = solution.largestNumber(new int[]{3, 30, 34, 5, 9});

    // then
    assertThat(result)
      .isEqualTo("9534330");
  }

  class Solution {
    public String largestNumber(int[] nums) {
      throw new UnsupportedOperationException();
    }
  }
}
