package org.overmind;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.overmind.Utils.array;

/**
 * <a href="https://leetcode.com/problems/merge-k-sorted-lists/">23. Merge k Sorted Lists</a> (Hard)
 * <p>
 * Merge {@code k} sorted linked lists into one sorted list.
 */
public class MergeKSortedListsTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.mergeKLists(array(
      ListNode.of(1, 4, 5),
      ListNode.of(1, 3, 4),
      ListNode.of(2, 6)
    ));

    // then
    assertThat(result)
      .isEqualTo(ListNode.of(1, 1, 2, 3, 4, 4, 5, 6));
  }

  @Test
  void example2() {
    // when
    var result = solution.mergeKLists(array());

    // then
    assertThat(result)
      .isNull();
  }

  @Test
  void example3() {
    // when
    var result = solution.mergeKLists(array(
      (ListNode) null
    ));

    // then
    assertThat(result)
      .isNull();
  }

  class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
      if (lists.length == 0) {
        return null;
      }

      int interval = 1;
      while (interval < lists.length) {
        for (int i = 0; i + interval < lists.length; i += interval * 2) {
          lists[i] = mergeTwoLists(lists[i], lists[i + interval]);
        }

        interval *= 2;
      }

      return lists[0];
    }

    private ListNode mergeTwoLists(ListNode left, ListNode right) {
      var dummy = new ListNode();
      var current = dummy;

      while (left != null && right != null) {
        if (left.val <= right.val) {
          current.next = left;
          left = left.next;
        } else {
          current.next = right;
          right = right.next;
        }

        current = current.next;
      }

      current.next = left != null ? left : right;
      return dummy.next;
    }
  }
}
