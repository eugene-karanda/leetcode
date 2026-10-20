package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/">106. Construct Binary Tree from Inorder and Postorder Traversal</a> (Medium)
 * <p>
 * Build a binary tree from its inorder and postorder traversals.
 */
@Disabled
public class ConstructBinaryTreeFromInorderAndPostorderTraversalTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.buildTree(new int[]{9, 3, 15, 20, 7}, new int[]{9, 15, 7, 20, 3});

    // then
    assertThat(result)
      .isEqualTo(TreeNode.of(3, 9, 20, null, null, 15, 7));
  }

  @Test
  void example2() {
    // when
    var result = solution.buildTree(new int[]{-1}, new int[]{-1});

    // then
    assertThat(result)
      .isEqualTo(TreeNode.of(-1));
  }

  class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
      throw new UnsupportedOperationException();
    }
  }
}
