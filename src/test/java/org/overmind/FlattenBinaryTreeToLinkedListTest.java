package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/flatten-binary-tree-to-linked-list/">114. Flatten Binary Tree to Linked List</a> (Medium)
 * <p>
 * Flatten a binary tree into a linked list in preorder, using the right pointers, in place.
 */
@Disabled
public class FlattenBinaryTreeToLinkedListTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // given
    var root = TreeNode.of(1, 2, 5, 3, 4, null, 6);

    // when
    solution.flatten(root);

    // then
    assertThat(root)
      .isEqualTo(TreeNode.of(1, null, 2, null, 3, null, 4, null, 5, null, 6));
  }

  @Test
  void example2() {
    // given
    var root = TreeNode.of();

    // when
    solution.flatten(root);

    // then
    assertThat(root)
      .isNull();
  }

  @Test
  void example3() {
    // given
    var root = TreeNode.of(0);

    // when
    solution.flatten(root);

    // then
    assertThat(root)
      .isEqualTo(TreeNode.of(0));
  }

  class Solution {
    public void flatten(TreeNode root) {
      throw new UnsupportedOperationException();
    }
  }
}
