package org.overmind;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/middle-of-the-linked-list/">876. Middle of the Linked List</a> (Easy)
 * <p>
 * Return the middle node of a linked list; for two middle nodes, return the second one.
 */
public class MiddleOfTheLinkedListTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.middleNode(ListNode.of(1, 2, 3, 4, 5));

    // then
    assertThat(result)
      .isEqualTo(ListNode.of(3, 4, 5));
  }

  @Test
  void example2() {
    // when
    var result = solution.middleNode(ListNode.of(1, 2, 3, 4, 5, 6));

    // then
    assertThat(result)
      .isEqualTo(ListNode.of(4, 5, 6));
  }

  class Solution {
    public ListNode middleNode(ListNode head) {
      int count = 0;

      for (ListNode ln = head ; ln != null ; ln = ln.next) {
        count++;
      }

      int middle = count / 2;

      ListNode ln = head;
      for ( ; middle > 0 ; middle--) {
        ln = ln.next;
      }

      return ln;
    }
  }
}
