package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/subsets-ii/">90. Subsets II</a> (Medium)
 * <p>
 * Return all possible subsets of an array that may contain duplicates, without duplicate subsets.
 */
@Disabled
public class SubsetsIITest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.subsetsWithDup(new int[]{1, 2, 2});

    // then
    assertThat(result)
      .containsExactlyInAnyOrder(List.of(), List.of(1), List.of(1, 2), List.of(1, 2, 2), List.of(2), List.of(2, 2));
  }

  @Test
  void example2() {
    // when
    var result = solution.subsetsWithDup(new int[]{0});

    // then
    assertThat(result)
      .containsExactlyInAnyOrder(List.of(), List.of(0));
  }

  class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
      throw new UnsupportedOperationException();
    }
  }
}
