package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/unique-binary-search-trees-ii/">95. Unique Binary Search Trees II</a> (Medium)
 * <p>
 * Generate all structurally unique BSTs that store the values 1 to n.
 */
@Disabled
public class UniqueBinarySearchTreesIITest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.generateTrees(3);

    // then
    assertThat(result)
      .containsExactlyInAnyOrder(TreeNode.of(1, null, 2, null, 3), TreeNode.of(1, null, 3, 2), TreeNode.of(2, 1, 3), TreeNode.of(3, 1, null, null, 2), TreeNode.of(3, 2, null, 1));
  }

  @Test
  void example2() {
    // when
    var result = solution.generateTrees(1);

    // then
    assertThat(result)
      .containsExactlyInAnyOrder(TreeNode.of(1));
  }

  class Solution {
    public List<TreeNode> generateTrees(int n) {
      throw new UnsupportedOperationException();
    }
  }
}
