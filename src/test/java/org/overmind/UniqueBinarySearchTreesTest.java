package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/unique-binary-search-trees/">96. Unique Binary Search Trees</a> (Medium)
 * <p>
 * Count the structurally unique BSTs that store the values 1 to n.
 */
@Disabled
public class UniqueBinarySearchTreesTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.numTrees(3);

    // then
    assertThat(result)
      .isEqualTo(5);
  }

  @Test
  void example2() {
    // when
    var result = solution.numTrees(1);

    // then
    assertThat(result)
      .isEqualTo(1);
  }

  class Solution {
    public int numTrees(int n) {
      throw new UnsupportedOperationException();
    }
  }
}
