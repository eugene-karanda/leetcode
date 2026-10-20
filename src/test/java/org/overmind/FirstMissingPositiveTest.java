package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/first-missing-positive/">41. First Missing Positive</a> (Hard)
 * <p>
 * Find the smallest missing positive integer in O(n) time and O(1) extra space.
 */
@Disabled
public class FirstMissingPositiveTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.firstMissingPositive(new int[]{1, 2, 0});

    // then
    assertThat(result)
      .isEqualTo(3);
  }

  @Test
  void example2() {
    // when
    var result = solution.firstMissingPositive(new int[]{3, 4, -1, 1});

    // then
    assertThat(result)
      .isEqualTo(2);
  }

  @Test
  void example3() {
    // when
    var result = solution.firstMissingPositive(new int[]{7, 8, 9, 11, 12});

    // then
    assertThat(result)
      .isEqualTo(1);
  }

  class Solution {
    public int firstMissingPositive(int[] nums) {
      throw new UnsupportedOperationException();
    }
  }
}
