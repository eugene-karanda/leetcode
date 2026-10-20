package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/binary-tree-right-side-view/">199. Binary Tree Right Side View</a> (Medium)
 * <p>
 * Return the values of the nodes visible from the right side of a binary tree.
 */
@Disabled
public class BinaryTreeRightSideViewTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.rightSideView(TreeNode.of(1, 2, 3, null, 5, null, 4));

    // then
    assertThat(result)
      .containsExactly(1, 3, 4);
  }

  @Test
  void example2() {
    // when
    var result = solution.rightSideView(TreeNode.of(1, 2, 3, 4, null, null, null, 5));

    // then
    assertThat(result)
      .containsExactly(1, 3, 4, 5);
  }

  @Test
  void example3() {
    // when
    var result = solution.rightSideView(TreeNode.of(1, null, 3));

    // then
    assertThat(result)
      .containsExactly(1, 3);
  }

  @Test
  void example4() {
    // when
    var result = solution.rightSideView(TreeNode.of());

    // then
    assertThat(result)
      .isEmpty();
  }

  class Solution {
    public List<Integer> rightSideView(TreeNode root) {
      throw new UnsupportedOperationException();
    }
  }
}
