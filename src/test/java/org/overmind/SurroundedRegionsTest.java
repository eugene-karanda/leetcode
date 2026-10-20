package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/surrounded-regions/">130. Surrounded Regions</a> (Medium)
 * <p>
 * Capture all regions of 'O' that are surrounded by 'X', in place.
 */
@Disabled
public class SurroundedRegionsTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // given
    var board = new char[][]{{'X', 'X', 'X', 'X'}, {'X', 'O', 'O', 'X'}, {'X', 'X', 'O', 'X'}, {'X', 'O', 'X', 'X'}};

    // when
    solution.solve(board);

    // then
    assertThat(board)
      .isDeepEqualTo(new char[][]{{'X', 'X', 'X', 'X'}, {'X', 'X', 'X', 'X'}, {'X', 'X', 'X', 'X'}, {'X', 'O', 'X', 'X'}});
  }

  @Test
  void example2() {
    // given
    var board = new char[][]{{'X'}};

    // when
    solution.solve(board);

    // then
    assertThat(board)
      .isDeepEqualTo(new char[][]{{'X'}});
  }

  class Solution {
    public void solve(char[][] board) {
      throw new UnsupportedOperationException();
    }
  }
}
