package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/permutations/">46. Permutations</a> (Medium)
 * <p>
 * Return all permutations of an array of distinct integers.
 */
@Disabled
public class PermutationsTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.permute(new int[]{1, 2, 3});

    // then
    assertThat(result)
      .containsExactlyInAnyOrder(List.of(1, 2, 3), List.of(1, 3, 2), List.of(2, 1, 3), List.of(2, 3, 1), List.of(3, 1, 2), List.of(3, 2, 1));
  }

  @Test
  void example2() {
    // when
    var result = solution.permute(new int[]{0, 1});

    // then
    assertThat(result)
      .containsExactlyInAnyOrder(List.of(0, 1), List.of(1, 0));
  }

  @Test
  void example3() {
    // when
    var result = solution.permute(new int[]{1});

    // then
    assertThat(result)
      .containsExactlyInAnyOrder(List.of(1));
  }

  class Solution {
    public List<List<Integer>> permute(int[] nums) {
      throw new UnsupportedOperationException();
    }
  }
}
