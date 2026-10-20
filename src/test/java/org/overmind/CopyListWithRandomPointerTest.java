package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/copy-list-with-random-pointer/">138. Copy List with Random Pointer</a> (Medium)
 * <p>
 * Return a deep copy of a linked list where each node also has a random pointer.
 */
@Disabled
public class CopyListWithRandomPointerTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // given
    var head = randomList(new Integer[][]{{7, null}, {13, 0}, {11, 4}, {10, 2}, {1, 0}});

    // when
    var result = solution.copyRandomList(head);

    // then
    assertThat(serialize(result))
      .isEqualTo(serialize(head));
    assertThat(nodes(result))
      .doesNotContainAnyElementsOf(nodes(head));
  }

  @Test
  void example2() {
    // given
    var head = randomList(new Integer[][]{{1, 1}, {2, 1}});

    // when
    var result = solution.copyRandomList(head);

    // then
    assertThat(serialize(result))
      .isEqualTo(serialize(head));
    assertThat(nodes(result))
      .doesNotContainAnyElementsOf(nodes(head));
  }

  @Test
  void example3() {
    // given
    var head = randomList(new Integer[][]{{3, null}, {3, 0}, {3, null}});

    // when
    var result = solution.copyRandomList(head);

    // then
    assertThat(serialize(result))
      .isEqualTo(serialize(head));
    assertThat(nodes(result))
      .doesNotContainAnyElementsOf(nodes(head));
  }

  private Node randomList(Integer[][] nodes) {
    var list = new ArrayList<Node>();

    for (var node : nodes) {
      list.add(new Node(node[0]));
    }

    for (int i = 0; i < nodes.length; i++) {
      if (i + 1 < nodes.length) {
        list.get(i).next = list.get(i + 1);
      }
      if (nodes[i][1] != null) {
        list.get(i).random = list.get(nodes[i][1]);
      }
    }

    return list.isEmpty() ? null : list.get(0);
  }

  private List<Node> nodes(Node head) {
    var nodes = new ArrayList<Node>();
    for (var node = head; node != null; node = node.next) {
      nodes.add(node);
    }
    return nodes;
  }

  /**
   * Serializes the list as [value, index of the random node] pairs.
   */
  private List<List<Integer>> serialize(Node head) {
    var nodes = nodes(head);
    return nodes.stream()
      .map(node -> Arrays.asList(node.val, node.random == null ? null : nodes.indexOf(node.random)))
      .toList();
  }

  class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
      this.val = val;
      this.next = null;
      this.random = null;
    }
  }

  class Solution {
    public Node copyRandomList(Node head) {
      throw new UnsupportedOperationException();
    }
  }
}
