package org.overmind;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/remove-nth-node-from-end-of-list/">19. Remove Nth Node From End of List</a> (Medium)
 * <p>
 * Remove the n-th node from the end of a linked list.
 */
public class RemoveNthNodeFromEndOfListTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.removeNthFromEnd(ListNode.of(1, 2, 3, 4, 5), 2);

    // then
    assertThat(result)
      .isEqualTo(ListNode.of(1, 2, 3, 5));
  }

  @Test
  void example2() {
    // when
    var result = solution.removeNthFromEnd(ListNode.of(1), 1);

    // then
    assertThat(result)
      .isNull();
  }

  @Test
  void example3() {
    // when
    var result = solution.removeNthFromEnd(ListNode.of(1, 2), 1);

    // then
    assertThat(result)
      .isEqualTo(ListNode.of(1));
  }

  class Solution {

    public ListNode removeNthFromEnd(ListNode head, int n) {
      var dummy = new ListNode(0, head);

      var first = dummy;
      var second = dummy;

      // Create a gap of n + 1 nodes
      for (int i = 0; i <= n; i++) {
        first = first.next;
      }

      while (first != null) {
        first = first.next;
        second = second.next;
      }

      second.next = second.next.next;

      return dummy.next;
    }
  }
}
