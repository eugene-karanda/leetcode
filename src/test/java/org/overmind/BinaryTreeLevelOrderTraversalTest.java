package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/binary-tree-level-order-traversal/">102. Binary Tree Level Order Traversal</a> (Medium)
 * <p>
 * Return the values of a binary tree level by level, from left to right.
 */
@Disabled
public class BinaryTreeLevelOrderTraversalTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.levelOrder(TreeNode.of(3, 9, 20, null, null, 15, 7));

    // then
    assertThat(result)
      .containsExactly(List.of(3), List.of(9, 20), List.of(15, 7));
  }

  @Test
  void example2() {
    // when
    var result = solution.levelOrder(TreeNode.of(1));

    // then
    assertThat(result)
      .containsExactly(List.of(1));
  }

  @Test
  void example3() {
    // when
    var result = solution.levelOrder(TreeNode.of());

    // then
    assertThat(result)
      .isEmpty();
  }

  class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
      throw new UnsupportedOperationException();
    }
  }
}
