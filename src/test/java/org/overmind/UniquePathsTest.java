package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/unique-paths/">62. Unique Paths</a> (Medium)
 * <p>
 * Count the unique paths from the top-left to the bottom-right corner of an m x n grid moving only right or down.
 */
@Disabled
public class UniquePathsTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.uniquePaths(3, 7);

    // then
    assertThat(result)
      .isEqualTo(28);
  }

  @Test
  void example2() {
    // when
    var result = solution.uniquePaths(3, 2);

    // then
    assertThat(result)
      .isEqualTo(3);
  }

  class Solution {
    public int uniquePaths(int m, int n) {
      throw new UnsupportedOperationException();
    }
  }
}
