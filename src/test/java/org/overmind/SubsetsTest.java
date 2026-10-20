package org.overmind;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/subsets/">78. Subsets</a> (Medium)
 * <p>
 * Return all possible subsets of an array of unique elements.
 */
public class SubsetsTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.subsets(new int[]{1, 2, 3});

    // then
    assertThat(result)
      .containsExactlyInAnyOrder(List.of(), List.of(1), List.of(2), List.of(1, 2), List.of(3), List.of(1, 3), List.of(2, 3), List.of(1, 2, 3));
  }

  @Test
  void example2() {
    // when
    var result = solution.subsets(new int[]{0});

    // then
    assertThat(result)
      .containsExactlyInAnyOrder(List.of(), List.of(0));
  }

  class Solution {
    public List<List<Integer>> subsets(int[] nums) {
      int n, i, j, l = nums.length;
      int max = 1 << l;
      final Integer[] boxed = new Integer[l];
      for (i = 0; i < l; i++) boxed[i] = nums[i];
      List<List<Integer>> result = new ArrayList<>(max);

      for (i = 0; i < max; i++) {
        n = i;
        List<Integer> row = new ArrayList<>();
        for (j = 0; n > 0; j++) {
          if ((n & 1) == 1) {
            row.add(boxed[j]);
          }

          n = n >> 1;
        }

        result.add(row);
      }

      return result;
    }
  }
}
