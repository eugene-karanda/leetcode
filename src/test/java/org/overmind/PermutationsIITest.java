package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/permutations-ii/">47. Permutations II</a> (Medium)
 * <p>
 * Return all unique permutations of an array that may contain duplicates.
 */
@Disabled
public class PermutationsIITest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.permuteUnique(new int[]{1, 1, 2});

    // then
    assertThat(result)
      .containsExactlyInAnyOrder(List.of(1, 1, 2), List.of(1, 2, 1), List.of(2, 1, 1));
  }

  @Test
  void example2() {
    // when
    var result = solution.permuteUnique(new int[]{1, 2, 3});

    // then
    assertThat(result)
      .containsExactlyInAnyOrder(List.of(1, 2, 3), List.of(1, 3, 2), List.of(2, 1, 3), List.of(2, 3, 1), List.of(3, 1, 2), List.of(3, 2, 1));
  }

  class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
      throw new UnsupportedOperationException();
    }
  }
}
