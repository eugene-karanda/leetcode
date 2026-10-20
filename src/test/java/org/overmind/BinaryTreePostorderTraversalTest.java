package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/binary-tree-postorder-traversal/">145. Binary Tree Postorder Traversal</a> (Easy)
 * <p>
 * Return the postorder traversal of a binary tree's node values.
 */
@Disabled
public class BinaryTreePostorderTraversalTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.postorderTraversal(TreeNode.of(1, null, 2, 3));

    // then
    assertThat(result)
      .containsExactly(3, 2, 1);
  }

  @Test
  void example2() {
    // when
    var result = solution.postorderTraversal(TreeNode.of(1, 2, 3, 4, 5, null, 8, null, null, 6, 7, 9));

    // then
    assertThat(result)
      .containsExactly(4, 6, 7, 5, 2, 9, 8, 3, 1);
  }

  @Test
  void example3() {
    // when
    var result = solution.postorderTraversal(TreeNode.of());

    // then
    assertThat(result)
      .isEmpty();
  }

  @Test
  void example4() {
    // when
    var result = solution.postorderTraversal(TreeNode.of(1));

    // then
    assertThat(result)
      .containsExactly(1);
  }

  class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
      throw new UnsupportedOperationException();
    }
  }
}
