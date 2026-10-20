package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/n-queens/">51. N-Queens</a> (Hard)
 * <p>
 * Return all distinct solutions of placing n queens on an n x n board so that no two attack each other.
 */
@Disabled
public class NQueensTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.solveNQueens(4);

    // then
    assertThat(result)
      .containsExactlyInAnyOrder(List.of(".Q..", "...Q", "Q...", "..Q."), List.of("..Q.", "Q...", "...Q", ".Q.."));
  }

  @Test
  void example2() {
    // when
    var result = solution.solveNQueens(1);

    // then
    assertThat(result)
      .containsExactlyInAnyOrder(List.of("Q"));
  }

  class Solution {
    public List<List<String>> solveNQueens(int n) {
      throw new UnsupportedOperationException();
    }
  }
}
