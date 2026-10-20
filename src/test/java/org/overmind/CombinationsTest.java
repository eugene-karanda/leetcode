package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/combinations/">77. Combinations</a> (Medium)
 * <p>
 * Return all combinations of {@code k} numbers chosen from 1 to {@code n}.
 */
@Disabled
public class CombinationsTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.combine(4, 2);

    // then
    assertThat(result)
      .containsExactlyInAnyOrder(List.of(1, 2), List.of(1, 3), List.of(1, 4), List.of(2, 3), List.of(2, 4), List.of(3, 4));
  }

  @Test
  void example2() {
    // when
    var result = solution.combine(1, 1);

    // then
    assertThat(result)
      .containsExactlyInAnyOrder(List.of(1));
  }

  class Solution {
    public List<List<Integer>> combine(int n, int k) {
      throw new UnsupportedOperationException();
    }
  }
}
