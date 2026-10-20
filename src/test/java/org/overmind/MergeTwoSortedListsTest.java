package org.overmind;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/merge-two-sorted-lists/">21. Merge Two Sorted Lists</a> (Easy)
 * <p>
 * Merge two sorted linked lists into one sorted list.
 */
public class MergeTwoSortedListsTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.mergeTwoLists(ListNode.of(1, 2, 4), ListNode.of(1, 3, 4));

    // then
    assertThat(result)
      .isEqualTo(ListNode.of(1, 1, 2, 3, 4, 4));
  }

  @Test
  void example2() {
    // when
    var result = solution.mergeTwoLists(ListNode.of(), ListNode.of());

    // then
    assertThat(result)
      .isNull();
  }

  @Test
  void example3() {
    // when
    var result = solution.mergeTwoLists(ListNode.of(), ListNode.of(0));

    // then
    assertThat(result)
      .isEqualTo(ListNode.of(0));
  }

  class Solution {
    public ListNode mergeTwoLists(ListNode first, ListNode second) {
      var dummyHead = new ListNode();
      var current = dummyHead;

      while (first != null && second != null) {
        if (first.val < second.val) {
          current.next = first;
          first = first.next;
        } else {
          current.next = second;
          second = second.next;
        }
        current = current.next;
      }

      while (first != null) {
        current.next = first;
        first = first.next;
        current = current.next;
      }

      while (second != null) {
        current.next = second;
        second = second.next;
        current = current.next;
      }

      return dummyHead.next;
    }
  }
}
