package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/symmetric-tree/">101. Symmetric Tree</a> (Easy)
 * <p>
 * Check whether a binary tree is a mirror of itself.
 */
@Disabled
public class SymmetricTreeTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.isSymmetric(TreeNode.of(1, 2, 2, 3, 4, 4, 3));

    // then
    assertThat(result)
      .isTrue();
  }

  @Test
  void example2() {
    // when
    var result = solution.isSymmetric(TreeNode.of(1, 2, 2, null, 3, null, 3));

    // then
    assertThat(result)
      .isFalse();
  }

  class Solution {
    public boolean isSymmetric(TreeNode root) {
      throw new UnsupportedOperationException();
    }
  }
}
