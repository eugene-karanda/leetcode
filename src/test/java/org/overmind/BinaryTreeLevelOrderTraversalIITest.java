package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/binary-tree-level-order-traversal-ii/">107. Binary Tree Level Order Traversal II</a> (Medium)
 * <p>
 * Return the values of a binary tree level by level, from the bottom level up.
 */
@Disabled
public class BinaryTreeLevelOrderTraversalIITest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.levelOrderBottom(TreeNode.of(3, 9, 20, null, null, 15, 7));

    // then
    assertThat(result)
      .containsExactly(List.of(15, 7), List.of(9, 20), List.of(3));
  }

  @Test
  void example2() {
    // when
    var result = solution.levelOrderBottom(TreeNode.of(1));

    // then
    assertThat(result)
      .containsExactly(List.of(1));
  }

  @Test
  void example3() {
    // when
    var result = solution.levelOrderBottom(TreeNode.of());

    // then
    assertThat(result)
      .isEmpty();
  }

  class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
      throw new UnsupportedOperationException();
    }
  }
}
