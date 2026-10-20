package org.overmind;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/reverse-nodes-in-k-group/">25. Reverse Nodes in k-Group</a> (Hard)
 * <p>
 * Reverse the nodes of a linked list {@code k} at a time; an incomplete last group stays as is.
 */
public class ReverseKGroupTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.reverseKGroup(ListNode.of(1, 2, 3, 4, 5), 2);

    // then
    assertThat(result)
      .isEqualTo(ListNode.of(2, 1, 4, 3, 5));
  }

  @Test
  void example2() {
    // when
    var result = solution.reverseKGroup(ListNode.of(1, 2, 3, 4, 5), 3);

    // then
    assertThat(result)
      .isEqualTo(ListNode.of(3, 2, 1, 4, 5));
  }

  class Solution {

    // before: 1, 2, 3, 4, 5
    // after: 3, 2, 1, 4, 5
    public ListNode reverseKGroup(ListNode head, int k) {
      var dummy = new ListNode(-1);
      dummy.next = head;
      var current = dummy;

      while(current.next != null) {
        var first = current.next;
        var last = first;
        var i = 0;

        for (; i < k && last != null; i++) {
          last = last.next;
        }

        if (i != k) {
          break;
        }

        current.next = reverseList(first, k);
        first.next = last;
        current = first;
      }

      return dummy.next;
    }

    public ListNode reverseList(ListNode head, int k) {
      ListNode prev = null;
      ListNode current = head;
      for (int i = 0 ; current != null && i < k; i++) {
        ListNode next = current.next;
        current.next = prev;
        prev = current;
        current = next;
      }

      return prev;
    }
  }
}
