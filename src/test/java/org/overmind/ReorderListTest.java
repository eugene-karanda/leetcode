package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/reorder-list/">143. Reorder List</a> (Medium)
 * <p>
 * Reorder a linked list L0 -> Ln -> L1 -> Ln-1 -> ... in place.
 */
@Disabled
public class ReorderListTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // given
    var head = ListNode.of(1, 2, 3, 4);

    // when
    solution.reorderList(head);

    // then
    assertThat(head)
      .isEqualTo(ListNode.of(1, 4, 2, 3));
  }

  @Test
  void example2() {
    // given
    var head = ListNode.of(1, 2, 3, 4, 5);

    // when
    solution.reorderList(head);

    // then
    assertThat(head)
      .isEqualTo(ListNode.of(1, 5, 2, 4, 3));
  }

  class Solution {
    public void reorderList(ListNode head) {
      throw new UnsupportedOperationException();
    }
  }
}
