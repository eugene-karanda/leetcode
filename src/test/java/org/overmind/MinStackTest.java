package org.overmind;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/min-stack/">155. Min Stack</a> (Medium)
 * <p>
 * Design a stack that supports push, pop, top and retrieving the minimum element in constant time.
 */
public class MinStackTest {

  @Test
  void example1() {
    // given
    var minStack = new MinStack();

    // when
    minStack.push(-2);
    minStack.push(0);
    minStack.push(-3);

    // then
    assertThat(minStack.getMin())
      .isEqualTo(-3);

    // when
    minStack.pop();

    // then
    assertThat(minStack.top())
      .isEqualTo(0);
    assertThat(minStack.getMin())
      .isEqualTo(-2);
  }

  class MinStack {

    private static final int INITIAL_SIZE = 16;
    private static final double EXTEND_SCORE = 4;

    private Node[] nodes;
    int size = 0;

    public MinStack() {
      nodes = new Node[INITIAL_SIZE];
    }

    public void push(int x) {
      if(size == nodes.length) {
        Node[] newNodes = new Node[((int) (size * EXTEND_SCORE))];
        System.arraycopy(nodes, 0, newNodes, 0, size);
        nodes = newNodes;
      }

      int min;

      if(size == 0) {
        min = x;
      } else {
        min = Math.min(x, nodes[size - 1].min);
      }

      nodes[size] = new Node(x, min);
      size++;
    }

    public void pop() {
      size--;
    }

    public int top() {
      return nodes[size - 1].value;
    }

    public int getMin() {
      return nodes[size - 1].min;
    }
  }

  class Node {
    int value;
    int min;

    public Node(int value, int min) {
      this.value = value;
      this.min = min  ;
    }
  }
}
