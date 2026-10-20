package org.overmind;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/add-two-numbers/">2. Add Two Numbers</a> (Medium)
 * <p>
 * Add two non-negative numbers stored as linked lists of digits in reverse order.
 */
public class AddTwoNumbersTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.addTwoNumbers(ListNode.of(2, 4, 3), ListNode.of(5, 6, 4));

    // then
    assertThat(result)
      .isEqualTo(ListNode.of(7, 0, 8));
  }

  @Test
  void example2() {
    // when
    var result = solution.addTwoNumbers(ListNode.of(0), ListNode.of(0));

    // then
    assertThat(result)
      .isEqualTo(ListNode.of(0));
  }

  @Test
  void example3() {
    // when
    var result = solution.addTwoNumbers(ListNode.of(9, 9, 9, 9, 9, 9, 9), ListNode.of(9, 9, 9, 9));

    // then
    assertThat(result)
      .isEqualTo(ListNode.of(8, 9, 9, 9, 0, 0, 0, 1));
  }

  class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      int fsum = l1.val + l2.val;

      ListNode resultHead = new ListNode(fsum % 10);
      ListNode resultTail = resultHead;

      int ac = fsum / 10;

      l1 = l1.next;
      l2 = l2.next;

      while (l1 != null && l2 != null) {
        int sum = l1.val + l2.val + ac;
        int digit = sum % 10;
        ac = sum / 10;

        resultTail.next = new ListNode(digit);
        resultTail = resultTail.next;

        l1 = l1.next;
        l2 = l2.next;
      }

      while (l1 != null) {
        int sum = l1.val + ac;
        resultTail.next = new ListNode(sum % 10);
        resultTail = resultTail.next;
        ac = sum / 10;
        l1 = l1.next;
      }

      while (l2 != null) {
        int sum = l2.val + ac;
        resultTail.next = new ListNode(sum % 10);
        resultTail = resultTail.next;
        ac = sum / 10;
        l2 = l2.next;
      }

      if (ac > 0) {
        resultTail.next = new ListNode(ac);
      }

      return resultHead;
    }
  }
}
