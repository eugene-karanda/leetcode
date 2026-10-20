package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/rotate-list/">61. Rotate List</a> (Medium)
 * <p>
 * Rotate a linked list to the right by {@code k} places.
 */
@Disabled
public class RotateListTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.rotateRight(ListNode.of(1, 2, 3, 4, 5), 2);

    // then
    assertThat(result)
      .isEqualTo(ListNode.of(4, 5, 1, 2, 3));
  }

  @Test
  void example2() {
    // when
    var result = solution.rotateRight(ListNode.of(0, 1, 2), 4);

    // then
    assertThat(result)
      .isEqualTo(ListNode.of(2, 0, 1));
  }

  class Solution {
    public ListNode rotateRight(ListNode head, int k) {
      throw new UnsupportedOperationException();
    }
  }
}
