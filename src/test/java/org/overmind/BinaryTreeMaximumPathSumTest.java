package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/binary-tree-maximum-path-sum/">124. Binary Tree Maximum Path Sum</a> (Hard)
 * <p>
 * Find the maximum sum of any non-empty path in a binary tree.
 */
@Disabled
public class BinaryTreeMaximumPathSumTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.maxPathSum(TreeNode.of(1, 2, 3));

    // then
    assertThat(result)
      .isEqualTo(6);
  }

  @Test
  void example2() {
    // when
    var result = solution.maxPathSum(TreeNode.of(-10, 9, 20, null, null, 15, 7));

    // then
    assertThat(result)
      .isEqualTo(42);
  }

  class Solution {
    public int maxPathSum(TreeNode root) {
      throw new UnsupportedOperationException();
    }
  }
}
