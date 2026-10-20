package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/n-queens-ii/">52. N-Queens II</a> (Hard)
 * <p>
 * Count the distinct solutions of the n-queens puzzle.
 */
@Disabled
public class NQueensIITest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.totalNQueens(4);

    // then
    assertThat(result)
      .isEqualTo(2);
  }

  @Test
  void example2() {
    // when
    var result = solution.totalNQueens(1);

    // then
    assertThat(result)
      .isEqualTo(1);
  }

  class Solution {
    public int totalNQueens(int n) {
      throw new UnsupportedOperationException();
    }
  }
}
