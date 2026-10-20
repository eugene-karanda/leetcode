package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/intersection-of-two-linked-lists/">160. Intersection of Two Linked Lists</a> (Easy)
 * <p>
 * Return the node at which two linked lists intersect, or null.
 */
@Disabled
public class IntersectionOfTwoLinkedListsTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // given
    var lists = intersected(2, new int[]{4, 1, 8, 4, 5}, 3, new int[]{5, 6, 1, 8, 4, 5});

    // when
    var result = solution.getIntersectionNode(lists[0], lists[1]);

    // then
    assertThat(result)
      .isSameAs(lists[2]);
  }

  @Test
  void example2() {
    // given
    var lists = intersected(3, new int[]{1, 9, 1, 2, 4}, 1, new int[]{3, 2, 4});

    // when
    var result = solution.getIntersectionNode(lists[0], lists[1]);

    // then
    assertThat(result)
      .isSameAs(lists[2]);
  }

  @Test
  void example3() {
    // when
    var result = solution.getIntersectionNode(ListNode.of(2, 6, 4), ListNode.of(1, 5));

    // then
    assertThat(result)
      .isNull();
  }

  /**
   * Builds two lists that share the tail starting at {@code a[skipA]} (and {@code b[skipB]}).
   *
   * @return the head of the first list, the head of the second list and the intersection node
   */
  private ListNode[] intersected(int skipA, int[] a, int skipB, int[] b) {
    var headA = ListNode.of(a);
    var intersection = headA;
    for (int i = 0; i < skipA; i++) {
      intersection = intersection.next;
    }

    var headB = ListNode.of(Arrays.copyOf(b, skipB));
    var tailB = headB;
    while (tailB.next != null) {
      tailB = tailB.next;
    }
    tailB.next = intersection;

    return new ListNode[]{headA, headB, intersection};
  }

  class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
      throw new UnsupportedOperationException();
    }
  }
}
