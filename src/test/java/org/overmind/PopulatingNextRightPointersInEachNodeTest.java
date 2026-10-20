package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayDeque;
import java.util.StringJoiner;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/populating-next-right-pointers-in-each-node/">116. Populating Next Right Pointers in Each Node</a> (Medium)
 * <p>
 * Point every node of a perfect binary tree to its next right node.
 */
@Disabled
public class PopulatingNextRightPointersInEachNodeTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.connect(tree(1, 2, 3, 4, 5, 6, 7));

    // then
    assertThat(serialize(result))
      .isEqualTo("[1,#,2,3,#,4,5,6,7,#]");
  }

  @Test
  void example2() {
    // when
    var result = solution.connect(tree());

    // then
    assertThat(result)
      .isNull();
  }

  private Node tree(Integer... values) {
    if (values.length == 0) {
      return null;
    }

    var root = new Node(values[0]);
    var queue = new ArrayDeque<Node>();
    queue.add(root);

    for (int i = 1; i < values.length; i += 2) {
      var node = queue.poll();

      if (values[i] != null) {
        node.left = new Node(values[i]);
        queue.add(node.left);
      }

      if (i + 1 < values.length && values[i + 1] != null) {
        node.right = new Node(values[i + 1]);
        queue.add(node.right);
      }
    }

    return root;
  }

  /**
   * Serializes the tree level by level following the next pointers, '#' marks the end of a level.
   */
  private String serialize(Node root) {
    var result = new StringJoiner(",", "[", "]");

    for (var level = root; level != null; ) {
      Node nextLevel = null;

      for (var node = level; node != null; node = node.next) {
        result.add(String.valueOf(node.val));

        if (nextLevel == null) {
          nextLevel = node.left != null ? node.left : node.right;
        }
      }

      result.add("#");
      level = nextLevel;
    }

    return result.toString();
  }

  class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
      val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
      val = _val;
      left = _left;
      right = _right;
      next = _next;
    }
  }

  class Solution {
    public Node connect(Node root) {
      throw new UnsupportedOperationException();
    }
  }
}
