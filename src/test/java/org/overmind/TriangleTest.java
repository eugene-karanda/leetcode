package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/triangle/">120. Triangle</a> (Medium)
 * <p>
 * Find the minimum path sum from the top to the bottom of a triangle, moving to adjacent numbers.
 */
@Disabled
public class TriangleTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.minimumTotal(List.of(List.of(2), List.of(3, 4), List.of(6, 5, 7), List.of(4, 1, 8, 3)));

    // then
    assertThat(result)
      .isEqualTo(11);
  }

  @Test
  void example2() {
    // when
    var result = solution.minimumTotal(List.of(List.of(-10)));

    // then
    assertThat(result)
      .isEqualTo(-10);
  }

  class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
      throw new UnsupportedOperationException();
    }
  }
}
