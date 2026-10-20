package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/word-search/">79. Word Search</a> (Medium)
 * <p>
 * Check whether a word exists in a grid of letters, built from sequentially adjacent cells.
 */
@Disabled
public class WordSearchTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.exist(new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}}, "ABCCED");

    // then
    assertThat(result)
      .isTrue();
  }

  @Test
  void example2() {
    // when
    var result = solution.exist(new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}}, "SEE");

    // then
    assertThat(result)
      .isTrue();
  }

  @Test
  void example3() {
    // when
    var result = solution.exist(new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}}, "ABCB");

    // then
    assertThat(result)
      .isFalse();
  }

  class Solution {
    public boolean exist(char[][] board, String word) {
      throw new UnsupportedOperationException();
    }
  }
}
