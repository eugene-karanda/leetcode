package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/combination-sum/">39. Combination Sum</a> (Medium)
 * <p>
 * Find all unique combinations of candidates that sum up to {@code target}; a number may be used many times.
 */
@Disabled
public class CombinationSumTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.combinationSum(new int[]{2, 3, 6, 7}, 7);

    // then
    assertThat(result)
      .containsExactlyInAnyOrder(List.of(2, 2, 3), List.of(7));
  }

  @Test
  void example2() {
    // when
    var result = solution.combinationSum(new int[]{2, 3, 5}, 8);

    // then
    assertThat(result)
      .containsExactlyInAnyOrder(List.of(2, 2, 2, 2), List.of(2, 3, 3), List.of(3, 5));
  }

  @Test
  void example3() {
    // when
    var result = solution.combinationSum(new int[]{2}, 1);

    // then
    assertThat(result)
      .isEmpty();
  }

  class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
      throw new UnsupportedOperationException();
    }
  }
}
