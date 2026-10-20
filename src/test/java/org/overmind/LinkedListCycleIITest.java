package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/linked-list-cycle-ii/">142. Linked List Cycle II</a> (Medium)
 * <p>
 * Return the node where the cycle of a linked list begins, or null.
 */
@Disabled
public class LinkedListCycleIITest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // given
    var head = cyclic(1, 3, 2, 0, -4);

    // when
    var result = solution.detectCycle(head);

    // then
    assertThat(result)
      .isSameAs(nodeAt(head, 1));
  }

  @Test
  void example2() {
    // given
    var head = cyclic(0, 1, 2);

    // when
    var result = solution.detectCycle(head);

    // then
    assertThat(result)
      .isSameAs(nodeAt(head, 0));
  }

  @Test
  void example3() {
    // when
    var result = solution.detectCycle(cyclic(-1, 1));

    // then
    assertThat(result)
      .isNull();
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
    public ListNode detectCycle(ListNode head) {
      throw new UnsupportedOperationException();
    }
  }
}
