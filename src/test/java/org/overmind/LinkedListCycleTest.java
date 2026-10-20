package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/linked-list-cycle/">141. Linked List Cycle</a> (Easy)
 * <p>
 * Check whether a linked list has a cycle.
 */
@Disabled
public class LinkedListCycleTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.hasCycle(cyclic(1, 3, 2, 0, -4));

    // then
    assertThat(result)
      .isTrue();
  }

  @Test
  void example2() {
    // when
    var result = solution.hasCycle(cyclic(0, 1, 2));

    // then
    assertThat(result)
      .isTrue();
  }

  @Test
  void example3() {
    // when
    var result = solution.hasCycle(cyclic(-1, 1));

    // then
    assertThat(result)
      .isFalse();
  }

  private ListNode cyclic(int pos, int... values) {
    var head = ListNode.of(values);

    if (pos >= 0) {
      var tail = head;
      while (tail.next != null) {
        tail = tail.next;
      }
      tail.next = nodeAt(head, pos);
    }

    return head;
  }

  private ListNode nodeAt(ListNode head, int index) {
    var node = head;
    for (int i = 0; i < index; i++) {
      node = node.next;
    }
    return node;
  }

  class Solution {
    public boolean hasCycle(ListNode head) {
      throw new UnsupportedOperationException();
    }
  }
}
