package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/find-peak-element/">162. Find Peak Element</a> (Medium)
 * <p>
 * Find the index of any peak element in O(log n).
 */
@Disabled
public class FindPeakElementTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.findPeakElement(new int[]{1, 2, 3, 1});

    // then
    assertThat(result)
      .isEqualTo(2);
  }

  @Test
  void example2() {
    // when
    var result = solution.findPeakElement(new int[]{1, 2, 1, 3, 5, 6, 4});

    // then
    assertThat(result)
      .isIn(1, 5);
  }

  class Solution {
    public int findPeakElement(int[] nums) {
      throw new UnsupportedOperationException();
    }
  }
}
