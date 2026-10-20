package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/binary-tree-preorder-traversal/">144. Binary Tree Preorder Traversal</a> (Easy)
 * <p>
 * Return the preorder traversal of a binary tree's node values.
 */
@Disabled
public class BinaryTreePreorderTraversalTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.preorderTraversal(TreeNode.of(1, null, 2, 3));

    // then
    assertThat(result)
      .containsExactly(1, 2, 3);
  }

  @Test
  void example2() {
    // when
    var result = solution.preorderTraversal(TreeNode.of(1, 2, 3, 4, 5, null, 8, null, null, 6, 7, 9));

    // then
    assertThat(result)
      .containsExactly(1, 2, 4, 5, 6, 7, 3, 8, 9);
  }

  @Test
  void example3() {
    // when
    var result = solution.preorderTraversal(TreeNode.of());

    // then
    assertThat(result)
      .isEmpty();
  }

  @Test
  void example4() {
    // when
    var result = solution.preorderTraversal(TreeNode.of(1));

    // then
    assertThat(result)
      .containsExactly(1);
  }

  class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
      throw new UnsupportedOperationException();
    }
  }
}
