package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/longest-consecutive-sequence/">128. Longest Consecutive Sequence</a> (Medium)
 * <p>
 * Find the length of the longest consecutive elements sequence in O(n).
 */
@Disabled
public class LongestConsecutiveSequenceTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.longestConsecutive(new int[]{100, 4, 200, 1, 3, 2});

    // then
    assertThat(result)
      .isEqualTo(4);
  }

  @Test
  void example2() {
    // when
    var result = solution.longestConsecutive(new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1});

    // then
    assertThat(result)
      .isEqualTo(9);
  }

  @Test
  void example3() {
    // when
    var result = solution.longestConsecutive(new int[]{1, 0, 1, 2});

    // then
    assertThat(result)
      .isEqualTo(3);
  }

  class Solution {
    public int longestConsecutive(int[] nums) {
      throw new UnsupportedOperationException();
    }
  }
}
