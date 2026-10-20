package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/reverse-linked-list-ii/">92. Reverse Linked List II</a> (Medium)
 * <p>
 * Reverse the nodes of a linked list from position {@code left} to position {@code right}.
 */
@Disabled
public class ReverseLinkedListIITest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.reverseBetween(ListNode.of(1, 2, 3, 4, 5), 2, 4);

    // then
    assertThat(result)
      .isEqualTo(ListNode.of(1, 4, 3, 2, 5));
  }

  @Test
  void example2() {
    // when
    var result = solution.reverseBetween(ListNode.of(5), 1, 1);

    // then
    assertThat(result)
      .isEqualTo(ListNode.of(5));
  }

  class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
      throw new UnsupportedOperationException();
    }
  }
}
