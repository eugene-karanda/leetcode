package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/path-sum/">112. Path Sum</a> (Easy)
 * <p>
 * Check whether a root-to-leaf path sums up to {@code targetSum}.
 */
@Disabled
public class PathSumTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.hasPathSum(TreeNode.of(5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, 1), 22);

    // then
    assertThat(result)
      .isTrue();
  }

  @Test
  void example2() {
    // when
    var result = solution.hasPathSum(TreeNode.of(1, 2, 3), 5);

    // then
    assertThat(result)
      .isFalse();
  }

  @Test
  void example3() {
    // when
    var result = solution.hasPathSum(TreeNode.of(), 0);

    // then
    assertThat(result)
      .isFalse();
  }

  class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
      throw new UnsupportedOperationException();
    }
  }
}
