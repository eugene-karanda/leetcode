package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/insert-interval/">57. Insert Interval</a> (Medium)
 * <p>
 * Insert a new interval into sorted non-overlapping intervals, merging where needed.
 */
@Disabled
public class InsertIntervalTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.insert(new int[][]{{1, 3}, {6, 9}}, new int[]{2, 5});

    // then
    assertThat(result)
      .isDeepEqualTo(new int[][]{{1, 5}, {6, 9}});
  }

  @Test
  void example2() {
    // when
    var result = solution.insert(new int[][]{{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}}, new int[]{4, 8});

    // then
    assertThat(result)
      .isDeepEqualTo(new int[][]{{1, 2}, {3, 10}, {12, 16}});
  }

  class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
      throw new UnsupportedOperationException();
    }
  }
}
