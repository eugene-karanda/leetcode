package org.overmind;

import org.junit.jupiter.api.Test;

import java.util.Scanner;
import java.util.Stack;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/serialize-and-deserialize-binary-tree/">297. Serialize and Deserialize Binary Tree</a> (Hard)
 * <p>
 * Design an algorithm to serialize a binary tree to a string and deserialize the string back to the tree.
 */
public class SerializeAndDeserializeBinaryTreeTest {

  private final Codec codec = new Codec();

  @Test
  void example1() {
    // given
    var root = new TreeNode(1,
      new TreeNode(2),
      new TreeNode(3,
        new TreeNode(4),
        new TreeNode(5)
      )
    );

    // when
    var result = codec.deserialize(codec.serialize(root));

    // then
    assertThat(result)
      .isEqualTo(root);
  }

  @Test
  void example2() {
    // given
    var root = new TreeNode(1,
      new TreeNode(2),
      new TreeNode(3,
        new TreeNode(4,
          new TreeNode(6),
          new TreeNode(7)
        ),
        new TreeNode(5)
      )
    );

    // when
    var result = codec.deserialize(codec.serialize(root));

    // then
    assertThat(result)
      .isEqualTo(root);
  }

  class Codec {

    public String serialize(TreeNode root) {
      StringBuilder builder = new StringBuilder();

      Stack<TreeNode> stack = new Stack<>();
      TreeNode current = root;

      while (true) {
        if (current == null) {
          builder.append("#");
          builder.append(",");

          if (stack.isEmpty()) break;
          current = stack.pop();
        } else {
          builder.append(current.val);
          builder.append(",");

          stack.push(current.right);
          current = current.left;
        }
      }

      builder.deleteCharAt(builder.length() - 1);
      return builder.toString();
    }

    public TreeNode deserialize(String data) {
      if (data == null || data.isEmpty()) return null;

      Scanner scanner = new Scanner(data);
      scanner.useDelimiter(",");

      if (!scanner.hasNext()) return null;
      String rootValue = scanner.next();
      if (rootValue.equals("#")) return null;

      TreeNode root = new TreeNode(Integer.parseInt(rootValue));
      Stack<TreeNode> leftStack = new Stack<>();
      Stack<TreeNode> rightStack = new Stack<>();

      leftStack.push(root);
      rightStack.push(root);

      while(scanner.hasNext()) {
        String token = scanner.next();

        if(!leftStack.isEmpty()) {
          TreeNode node = leftStack.pop();

          if(!token.equals("#")) {
            node.left = new TreeNode(Integer.parseInt(token));
            leftStack.push(node.left);
            rightStack.push(node.left);
          }
        } else if(!rightStack.isEmpty()) {
          TreeNode node = rightStack.pop();

          if(!token.equals("#")) {
            node.right = new TreeNode(Integer.parseInt(token));
            leftStack.push(node.right);
            rightStack.push(node.right);
          }
        } else {
          break;
        }
      }

      return root;
    }
  }
}
