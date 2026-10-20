package org.overmind;

import java.util.Objects;

public class ListNode {
  int val;
  ListNode next;

  ListNode() {
  }

  ListNode(int val) {
    this.val = val;
  }

  ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }

  @Override
  public String toString() {
    return val + (next == null ? "" : "->" + next);
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    ListNode listNode = (ListNode) o;
    return val == listNode.val && Objects.equals(next, listNode.next);
  }

  @Override
  public int hashCode() {
    return Objects.hash(val, next);
  }

  public static ListNode of(int... values) {
    var dummy = new ListNode();
    var current = dummy;

    for (var value : values) {
      current.next = new ListNode(value);
      current = current.next;
    }

    return dummy.next;
  }


}
