package org.overmind;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/merge-two-binary-trees/">617. Merge Two Binary Trees</a> (Easy)
 * <p>
 * Merge two binary trees by summing the values of overlapping nodes.
 */
public class MergeTwoBinaryTreesTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.mergeTrees(TreeNode.of(1, 3, 2, 5), TreeNode.of(2, 1, 3, null, 4, null, 7));

    // then
    assertThat(result)
      .isEqualTo(TreeNode.of(3, 4, 5, 5, 4, null, 7));
  }

  @Test
  void example2() {
    // when
    var result = solution.mergeTrees(TreeNode.of(1), TreeNode.of(1, 2));

    // then
    assertThat(result)
      .isEqualTo(TreeNode.of(2, 2));
  }

  class Solution {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
      if(t1 == null) {
        return t2;
      }

      if(t2 == null) {
        return t1;
      }

      TreeNode result = new TreeNode(t1.val + t2.val);
      result.left = mergeTrees(t1.left, t2.left);
      result.right = mergeTrees(t1.right, t2.right);
      return result;
    }
  }
}
