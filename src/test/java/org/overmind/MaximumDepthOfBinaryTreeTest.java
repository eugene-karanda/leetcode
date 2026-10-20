package org.overmind;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/maximum-depth-of-binary-tree/">104. Maximum Depth of Binary Tree</a> (Easy)
 * <p>
 * Find the maximum depth of a binary tree.
 */
public class MaximumDepthOfBinaryTreeTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.maxDepth(TreeNode.of(3, 9, 20, null, null, 15, 7));

    // then
    assertThat(result)
      .isEqualTo(3);
  }

  @Test
  void example2() {
    // when
    var result = solution.maxDepth(TreeNode.of(1, null, 2));

    // then
    assertThat(result)
      .isEqualTo(2);
  }

  class Solution {
    public int maxDepth(TreeNode root) {
      if (root == null) {
        return 0;
      }

      int leftDepth = maxDepth(root.left);
      int rightDepth = maxDepth(root.right);

      return Math.max(leftDepth, rightDepth) + 1;
    }
  }
}
