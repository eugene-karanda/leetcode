package org.overmind;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/">105. Construct Binary Tree from Preorder and Inorder Traversal</a> (Medium)
 * <p>
 * Build a binary tree from its preorder and inorder traversals.
 */
public class ConstructBinaryTreeFromPreorderAndInorderTraversalTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.buildTree(new int[]{3, 9, 20, 15, 7}, new int[]{9, 3, 15, 20, 7});

    // then
    assertThat(result)
      .isEqualTo(new TreeNode(3,
        new TreeNode(9),
        new TreeNode(20,
          new TreeNode(15),
          new TreeNode(7)
        )
      ));
  }

  class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
      Map<Integer, Integer> inorderMap = new HashMap<>();
      for (int i = 0; i < inorder.length; i++) {
        inorderMap.put(inorder[i], i);
      }

      Stack<TreeNode> stack = new Stack<>();
      TreeNode root = new TreeNode(preorder[0]);
      stack.push(root);
      TreeNode current = root;

      for (int i = 1; i < preorder.length; i++) {
        int preorderVal = preorder[i];
        TreeNode node = new TreeNode(preorderVal);
        int inorderIndex = inorderMap.get(preorderVal);

        if (inorderIndex < inorderMap.get(stack.peek().val)) {
          current.left = node;
        } else {
          while (!stack.isEmpty() && inorderIndex > inorderMap.get(stack.peek().val)) {
            current = stack.pop();
          }
          current.right = node;
        }

        stack.push(node);
        current = node;
      }

      return root;
    }
  }
}
