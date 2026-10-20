package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/binary-search-tree-iterator/">173. Binary Search Tree Iterator</a> (Medium)
 * <p>
 * Implement an iterator over a binary search tree that returns the values in ascending order.
 */
@Disabled
public class BinarySearchTreeIteratorTest {

  @Test
  void example1() {
    // given
    var iterator = new BSTIterator(TreeNode.of(7, 3, 15, null, null, 9, 20));

    // then
    assertThat(iterator.next())
      .isEqualTo(3);
    assertThat(iterator.next())
      .isEqualTo(7);
    assertThat(iterator.hasNext())
      .isTrue();
    assertThat(iterator.next())
      .isEqualTo(9);
    assertThat(iterator.hasNext())
      .isTrue();
    assertThat(iterator.next())
      .isEqualTo(15);
    assertThat(iterator.hasNext())
      .isTrue();
    assertThat(iterator.next())
      .isEqualTo(20);
    assertThat(iterator.hasNext())
      .isFalse();
  }

  class BSTIterator {

    public BSTIterator(TreeNode root) {
    }

    public int next() {
      throw new UnsupportedOperationException();
    }

    public boolean hasNext() {
      throw new UnsupportedOperationException();
    }
  }
}
