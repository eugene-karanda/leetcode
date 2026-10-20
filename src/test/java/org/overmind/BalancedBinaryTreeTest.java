package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/balanced-binary-tree/">110. Balanced Binary Tree</a> (Easy)
 * <p>
 * Check whether a binary tree is height-balanced.
 */
@Disabled
public class BalancedBinaryTreeTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.isBalanced(TreeNode.of(3, 9, 20, null, null, 15, 7));

    // then
    assertThat(result)
      .isTrue();
  }

  @Test
  void example2() {
    // when
    var result = solution.isBalanced(TreeNode.of(1, 2, 2, 3, 3, null, null, 4, 4));

    // then
    assertThat(result)
      .isFalse();
  }

  @Test
  void example3() {
    // when
    var result = solution.isBalanced(TreeNode.of());

    // then
    assertThat(result)
      .isTrue();
  }

  class Solution {
    public boolean isBalanced(TreeNode root) {
      throw new UnsupportedOperationException();
    }
  }
}
