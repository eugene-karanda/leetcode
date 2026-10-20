package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/combination-sum-ii/">40. Combination Sum II</a> (Medium)
 * <p>
 * Find all unique combinations of candidates that sum up to {@code target}; each number may be used once.
 */
@Disabled
public class CombinationSumIITest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5}, 8);

    // then
    assertThat(result)
      .containsExactlyInAnyOrder(List.of(1, 1, 6), List.of(1, 2, 5), List.of(1, 7), List.of(2, 6));
  }

  @Test
  void example2() {
    // when
    var result = solution.combinationSum2(new int[]{2, 5, 2, 1, 2}, 5);

    // then
    assertThat(result)
      .containsExactlyInAnyOrder(List.of(1, 2, 2), List.of(5));
  }

  class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
      throw new UnsupportedOperationException();
    }
  }
}
