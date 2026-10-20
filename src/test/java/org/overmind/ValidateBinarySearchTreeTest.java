package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/validate-binary-search-tree/">98. Validate Binary Search Tree</a> (Medium)
 * <p>
 * Check whether a binary tree is a valid binary search tree.
 */
@Disabled
public class ValidateBinarySearchTreeTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.isValidBST(TreeNode.of(2, 1, 3));

    // then
    assertThat(result)
      .isTrue();
  }

  @Test
  void example2() {
    // when
    var result = solution.isValidBST(TreeNode.of(5, 1, 4, null, null, 3, 6));

    // then
    assertThat(result)
      .isFalse();
  }

  class Solution {
    public boolean isValidBST(TreeNode root) {
      throw new UnsupportedOperationException();
    }
  }
}
