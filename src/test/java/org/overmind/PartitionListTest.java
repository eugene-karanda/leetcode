package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/partition-list/">86. Partition List</a> (Medium)
 * <p>
 * Partition a linked list so that nodes less than {@code x} come before the others, keeping the relative order.
 */
@Disabled
public class PartitionListTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.partition(ListNode.of(1, 4, 3, 2, 5, 2), 3);

    // then
    assertThat(result)
      .isEqualTo(ListNode.of(1, 2, 2, 4, 3, 5));
  }

  @Test
  void example2() {
    // when
    var result = solution.partition(ListNode.of(2, 1), 2);

    // then
    assertThat(result)
      .isEqualTo(ListNode.of(1, 2));
  }

  class Solution {
    public ListNode partition(ListNode head, int x) {
      throw new UnsupportedOperationException();
    }
  }
}
