package org.overmind;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/">103. Binary Tree Zigzag Level Order Traversal</a> (Medium)
 * <p>
 * Return the zigzag level order traversal of a binary tree: left to right, then right to left for the next level, and so on.
 */
public class BinaryTreeZigzagLevelOrderTraversalTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.zigzagLevelOrder(new TreeNode(3,
      new TreeNode(9),
      new TreeNode(20,
        new TreeNode(15),
        new TreeNode(7)
      )
    ));

    // then
    assertThat(result)
      .isEqualTo(List.of(List.of(3), List.of(20, 9), List.of(15, 7)));
  }

  @Test
  void example2() {
    // when
    var result = solution.zigzagLevelOrder(new TreeNode(1));

    // then
    assertThat(result)
      .isEqualTo(List.of(List.of(1)));
  }

  @Test
  void example3() {
    // when
    var result = solution.zigzagLevelOrder(null);

    // then
    assertThat(result)
      .isEmpty();
  }

  class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
      boolean toRight = true;
      Stack<TreeNode> currentRow;
      Stack<TreeNode> nextRow = new Stack<>();
      List<List<Integer>> result = new ArrayList<>();

      if (root != null) nextRow.push(root);

      while (!nextRow.isEmpty()) {
        currentRow = nextRow;
        List<Integer> resultRow = new ArrayList<>();
        nextRow = new Stack<>();
        while (!currentRow.isEmpty()) {
          TreeNode current = currentRow.pop();
          resultRow.add(current.val);

          if (toRight) {
            if (current.left != null) nextRow.push(current.left);
            if (current.right != null) nextRow.push(current.right);
          } else {
            if (current.right != null) nextRow.push(current.right);
            if (current.left != null) nextRow.push(current.left);
          }
        }

        result.add(resultRow);
        toRight = !toRight;
      }

      return result;
    }
  }
}
