package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/sort-list/">148. Sort List</a> (Medium)
 * <p>
 * Sort a linked list in O(n log n) time.
 */
@Disabled
public class SortListTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.sortList(ListNode.of(4, 2, 1, 3));

    // then
    assertThat(result)
      .isEqualTo(ListNode.of(1, 2, 3, 4));
  }

  @Test
  void example2() {
    // when
    var result = solution.sortList(ListNode.of(-1, 5, 3, 4, 0));

    // then
    assertThat(result)
      .isEqualTo(ListNode.of(-1, 0, 3, 4, 5));
  }

  @Test
  void example3() {
    // when
    var result = solution.sortList(ListNode.of());

    // then
    assertThat(result)
      .isNull();
  }

  class Solution {
    public ListNode sortList(ListNode head) {
      throw new UnsupportedOperationException();
    }
  }
}
