package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/convert-sorted-list-to-binary-search-tree/">109. Convert Sorted List to Binary Search Tree</a> (Medium)
 * <p>
 * Convert a sorted linked list into a height-balanced binary search tree.
 */
@Disabled
public class ConvertSortedListToBinarySearchTreeTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.sortedListToBST(ListNode.of(-10, -3, 0, 5, 9));

    // then
    assertHeightBalancedBst(result, -10, -3, 0, 5, 9);
  }

  @Test
  void example2() {
    // when
    var result = solution.sortedListToBST(ListNode.of());

    // then
    assertThat(result)
      .isNull();
  }

  private void assertHeightBalancedBst(TreeNode root, Integer... values) {
    var inorder = new ArrayList<Integer>();

    assertThat(heightIfBalanced(root, inorder))
      .isNotNegative();
    assertThat(inorder)
      .containsExactly(values);
  }

  private int heightIfBalanced(TreeNode node, List<Integer> inorder) {
    if (node == null) {
      return 0;
    }

    int left = heightIfBalanced(node.left, inorder);
    inorder.add(node.val);
    int right = heightIfBalanced(node.right, inorder);

    if (left < 0 || right < 0 || Math.abs(left - right) > 1) {
      return -1;
    }

    return Math.max(left, right) + 1;
  }

  class Solution {
    public TreeNode sortedListToBST(ListNode head) {
      throw new UnsupportedOperationException();
    }
  }
}
