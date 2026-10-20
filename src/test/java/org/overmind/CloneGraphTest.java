package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/clone-graph/">133. Clone Graph</a> (Medium)
 * <p>
 * Return a deep copy of a connected undirected graph.
 */
@Disabled
public class CloneGraphTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // given
    var node = graph(new int[][]{{2, 4}, {1, 3}, {2, 4}, {1, 3}});

    // when
    var result = solution.cloneGraph(node);

    // then
    assertThat(adjacency(result))
      .isEqualTo(List.of(List.of(2, 4), List.of(1, 3), List.of(2, 4), List.of(1, 3)));
    assertThat(nodes(result))
      .doesNotContainAnyElementsOf(nodes(node));
  }

  @Test
  void example2() {
    // given
    var node = graph(new int[][]{{}});

    // when
    var result = solution.cloneGraph(node);

    // then
    assertThat(adjacency(result))
      .isEqualTo(List.of(List.of()));
    assertThat(result)
      .isNotSameAs(node);
  }

  @Test
  void example3() {
    // when
    var result = solution.cloneGraph(null);

    // then
    assertThat(result)
      .isNull();
  }

  private Node graph(int[][] adjacency) {
    var nodes = new ArrayList<Node>();

    for (int i = 1; i <= adjacency.length; i++) {
      nodes.add(new Node(i));
    }

    for (int i = 0; i < adjacency.length; i++) {
      for (int neighbor : adjacency[i]) {
        nodes.get(i).neighbors.add(nodes.get(neighbor - 1));
      }
    }

    return nodes.isEmpty() ? null : nodes.get(0);
  }

  private List<Node> nodes(Node start) {
    var visited = new LinkedHashMap<Integer, Node>();
    var queue = new ArrayDeque<Node>();
    queue.add(start);

    while (!queue.isEmpty()) {
      var node = queue.poll();

      if (visited.putIfAbsent(node.val, node) == null) {
        queue.addAll(node.neighbors);
      }
    }

    return visited.values().stream()
      .sorted(Comparator.comparingInt(node -> node.val))
      .toList();
  }

  private List<List<Integer>> adjacency(Node start) {
    return nodes(start).stream()
      .map(node -> node.neighbors.stream().map(neighbor -> neighbor.val).toList())
      .toList();
  }

  class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
      val = 0;
      neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
      val = _val;
      neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
      val = _val;
      neighbors = _neighbors;
    }
  }

  class Solution {
    public Node cloneGraph(Node node) {
      throw new UnsupportedOperationException();
    }
  }
}
