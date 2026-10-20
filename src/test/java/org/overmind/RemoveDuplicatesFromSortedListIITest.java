package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/">82. Remove Duplicates from Sorted List II</a> (Medium)
 * <p>
 * Delete all nodes that have duplicate values from a sorted linked list, leaving only distinct values.
 */
@Disabled
public class RemoveDuplicatesFromSortedListIITest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.deleteDuplicates(ListNode.of(1, 2, 3, 3, 4, 4, 5));

    // then
    assertThat(result)
      .isEqualTo(ListNode.of(1, 2, 5));
  }

  @Test
  void example2() {
    // when
    var result = solution.deleteDuplicates(ListNode.of(1, 1, 1, 2, 3));

    // then
    assertThat(result)
      .isEqualTo(ListNode.of(2, 3));
  }

  class Solution {
    public ListNode deleteDuplicates(ListNode head) {
      throw new UnsupportedOperationException();
    }
  }
}
