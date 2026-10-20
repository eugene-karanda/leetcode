package org.overmind;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/swap-nodes-in-pairs/">24. Swap Nodes in Pairs</a> (Medium)
 * <p>
 * Swap every two adjacent nodes of a linked list without modifying the node values.
 */
public class SwapNodesInPairsTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.swapPairs(ListNode.of(1, 2, 3, 4));

    // then
    assertThat(result)
      .isEqualTo(ListNode.of(2, 1, 4, 3));
  }

  @Test
  void example2() {
    // when
    var result = solution.swapPairs(null);

    // then
    assertThat(result)
      .isNull();
  }

  @Test
  void example3() {
    // when
    var result = solution.swapPairs(ListNode.of(1));

    // then
    assertThat(result)
      .isEqualTo(ListNode.of(1));
  }

  @Test
  void example4() {
    // when
    var result = solution.swapPairs(ListNode.of(1, 2, 3));

    // then
    assertThat(result)
      .isEqualTo(ListNode.of(2, 1, 3));
  }

  class Solution {
    public ListNode swapPairs(ListNode head) {
      var dummy = new ListNode(-1);
      dummy.next = head;

      var current = dummy;

      while (current.next != null && current.next.next != null) {
        var first = current.next;
        var second = first.next;

        // Swap
        first.next = second.next;
        second.next = first;
        current.next = second;

        // Move to next pair
        current = first;
      }

      return dummy.next;
    }
  }
}
