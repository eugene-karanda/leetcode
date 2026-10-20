package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/same-tree/">100. Same Tree</a> (Easy)
 * <p>
 * Check whether two binary trees are the same.
 */
@Disabled
public class SameTreeTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.isSameTree(TreeNode.of(1, 2, 3), TreeNode.of(1, 2, 3));

    // then
    assertThat(result)
      .isTrue();
  }

  @Test
  void example2() {
    // when
    var result = solution.isSameTree(TreeNode.of(1, 2), TreeNode.of(1, null, 2));

    // then
    assertThat(result)
      .isFalse();
  }

  @Test
  void example3() {
    // when
    var result = solution.isSameTree(TreeNode.of(1, 2, 1), TreeNode.of(1, 1, 2));

    // then
    assertThat(result)
      .isFalse();
  }

  class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
      throw new UnsupportedOperationException();
    }
  }
}
