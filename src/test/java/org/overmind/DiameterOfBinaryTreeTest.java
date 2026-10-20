package org.overmind;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/diameter-of-binary-tree/">543. Diameter of Binary Tree</a> (Easy)
 * <p>
 * Find the length of the longest path between any two nodes of a binary tree.
 */
public class DiameterOfBinaryTreeTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.diameterOfBinaryTree(TreeNode.of(1, 2, 3, 4, 5));

    // then
    assertThat(result)
      .isEqualTo(3);
  }

  @Test
  void example2() {
    // when
    var result = solution.diameterOfBinaryTree(TreeNode.of(1, 2));

    // then
    assertThat(result)
      .isEqualTo(1);
  }

  class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
      MetaNode metaNode = buildMetaTree(root);
      return maxLength(metaNode);
    }

    private int maxLength(MetaNode root) {
      if (root == null) {
        return 0;
      }

      int max = root.leftLength + root.rightLength;
      max = Math.max(max, maxLength(root.left));
      max = Math.max(max, maxLength(root.right));

      return max;
    }

    private MetaNode buildMetaTree(TreeNode root) {
      if (root == null) {
        return null;
      }

      MetaNode metaNode = new MetaNode();

      if (root.left != null) {
        metaNode.left = buildMetaTree(root.left);
        metaNode.leftLength = Math.max(metaNode.left.leftLength, metaNode.left.rightLength) + 1;
      } else {
        metaNode.leftLength = 0;
      }

      if (root.right != null) {
        metaNode.right = buildMetaTree(root.right);
        metaNode.rightLength = Math.max(metaNode.right.leftLength, metaNode.right.rightLength) + 1;
      } else {
        metaNode.rightLength = 0;
      }

      return metaNode;
    }
  }

  class MetaNode {
    int leftLength;
    int rightLength;
    MetaNode left;
    MetaNode right;
  }
}
