package org.overmind;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/merge-intervals/">56. Merge Intervals</a> (Medium)
 * <p>
 * Merge all overlapping intervals.
 */
public class MergeIntervalsTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.merge(new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}});

    // then
    assertThat(result)
      .isEqualTo(new int[][]{{1, 6}, {8, 10}, {15, 18}});
  }

  @Test
  void example2() {
    // when
    var result = solution.merge(new int[][]{{1, 4}, {5, 6}});

    // then
    assertThat(result)
      .isEqualTo(new int[][]{{1, 4}, {5, 6}});
  }

  @Test
  void example3() {
    // when
    var result = solution.merge(new int[][]{{1, 4}, {0, 4}});

    // then
    assertThat(result)
      .isEqualTo(new int[][]{{0, 4}});
  }

  @Test
  void example4() {
    // when
    var result = solution.merge(new int[][]{{1, 4}, {0, 1}});

    // then
    assertThat(result)
      .isEqualTo(new int[][]{{0, 4}});
  }

  @Test
  void example5() {
    // when
    var result = solution.merge(new int[][]{{1, 4}, {1, 5}});

    // then
    assertThat(result)
      .isEqualTo(new int[][]{{1, 5}});
  }

  @Test
  void example6() {
    // when
    var result = solution.merge(new int[][]{{1, 4}, {2, 3}});

    // then
    assertThat(result)
      .isEqualTo(new int[][]{{1, 4}});
  }

  @Test
  void example7() {
    // when
    var result = solution.merge(new int[][]{{2, 3}, {4, 5}, {6, 7}, {8, 9}, {1, 10}});

    // then
    assertThat(result)
      .isEqualTo(new int[][]{{1, 10}});
  }

  @Test
  void example8() {
    // when
    var result = solution.merge(new int[][]{{0, 2}, {2, 3}, {4, 4}, {0, 1}, {5, 7}, {4, 5}, {0, 0}});

    // then
    assertThat(result)
      .isEqualTo(new int[][]{{0, 3}, {4, 7}});
  }

  class Solution {

    private static final int START = 0;
    private static final int END = 1;

    public int[][] merge(int[][] intervals) {
      Arrays.sort(intervals, Comparator.comparingInt(a -> a[START]));

      List<int[]> merged = new ArrayList<>();

      for (int[] interval : intervals) {
        if (merged.isEmpty() || merged.get(merged.size() - 1)[END] < interval[START]) {
          merged.add(interval);
        } else {
          merged.get(merged.size() - 1)[END] = Math.max(merged.get(merged.size() - 1)[END], interval[END]);
        }
      }

      return merged.toArray(new int[merged.size()][]);
    }
  }
}
