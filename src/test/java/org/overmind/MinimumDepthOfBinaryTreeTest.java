package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/minimum-depth-of-binary-tree/">111. Minimum Depth of Binary Tree</a> (Easy)
 * <p>
 * Find the number of nodes on the shortest path from the root down to a leaf.
 */
@Disabled
public class MinimumDepthOfBinaryTreeTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.minDepth(TreeNode.of(3, 9, 20, null, null, 15, 7));

    // then
    assertThat(result)
      .isEqualTo(2);
  }

  @Test
  void example2() {
    // when
    var result = solution.minDepth(TreeNode.of(2, null, 3, null, 4, null, 5, null, 6));

    // then
    assertThat(result)
      .isEqualTo(5);
  }

  class Solution {
    public int minDepth(TreeNode root) {
      throw new UnsupportedOperationException();
    }
  }
}
