package org.overmind;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/binary-tree-inorder-traversal/">94. Binary Tree Inorder Traversal</a> (Easy)
 * <p>
 * Return the inorder traversal (left → root → right) of a binary tree's node values.
 */
public class BinaryTreeInorderTraversalTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.inorderTraversal(new TreeNode(1,
      null,
      new TreeNode(2,
        new TreeNode(3),
        null
      )
    ));

    // then
    assertThat(result)
      .containsExactly(1, 3, 2);
  }

  @Test
  void example2() {
    // when
    var result = solution.inorderTraversal(new TreeNode(1,
      new TreeNode(2,
        new TreeNode(4),
        new TreeNode(5,
          new TreeNode(6),
          new TreeNode(7)
        )
      ),
      new TreeNode(3,
        null,
        new TreeNode(8,
          new TreeNode(9),
          null
        )
      )
    ));

    // then
    assertThat(result)
      .containsExactly(4, 2, 6, 5, 7, 1, 3, 9, 8);
  }

  @Test
  void example3() {
    // when
    var result = solution.inorderTraversal(null);

    // then
    assertThat(result)
      .isEmpty();
  }

  @Test
  void example4() {
    // when
    var result = solution.inorderTraversal(new TreeNode(1));

    // then
    assertThat(result)
      .containsExactly(1);
  }

  class Solution {
    
    public List<Integer> inorderTraversal(TreeNode root) {
      var result = new ArrayList<Integer>();

      Stack<TreeNode> stack = new Stack<>();
      TreeNode current = root;

      while (current != null || !stack.isEmpty()) {
        while (current != null) {
          stack.push(current);
          current = current.left;
        }

        current = stack.pop();
        result.add(current.val);

        current = current.right;
      }

      return result;
    }
  }
}
