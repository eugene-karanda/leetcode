package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/recover-binary-search-tree/">99. Recover Binary Search Tree</a> (Medium)
 * <p>
 * Recover a binary search tree in which exactly two nodes were swapped, without changing its structure.
 */
@Disabled
public class RecoverBinarySearchTreeTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // given
    var root = TreeNode.of(1, 3, null, null, 2);

    // when
    solution.recoverTree(root);

    // then
    assertThat(root)
      .isEqualTo(TreeNode.of(3, 1, null, null, 2));
  }

  @Test
  void example2() {
    // given
    var root = TreeNode.of(3, 1, 4, null, null, 2);

    // when
    solution.recoverTree(root);

    // then
    assertThat(root)
      .isEqualTo(TreeNode.of(2, 1, 4, null, null, 3));
  }

  class Solution {
    public void recoverTree(TreeNode root) {
      throw new UnsupportedOperationException();
    }
  }
}
