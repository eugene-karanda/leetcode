package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/remove-duplicates-from-sorted-list/">83. Remove Duplicates from Sorted List</a> (Easy)
 * <p>
 * Delete duplicates from a sorted linked list so that each value appears once.
 */
@Disabled
public class RemoveDuplicatesFromSortedListTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.deleteDuplicates(ListNode.of(1, 1, 2));

    // then
    assertThat(result)
      .isEqualTo(ListNode.of(1, 2));
  }

  @Test
  void example2() {
    // when
    var result = solution.deleteDuplicates(ListNode.of(1, 1, 2, 3, 3));

    // then
    assertThat(result)
      .isEqualTo(ListNode.of(1, 2, 3));
  }

  class Solution {
    public ListNode deleteDuplicates(ListNode head) {
      throw new UnsupportedOperationException();
    }
  }
}
