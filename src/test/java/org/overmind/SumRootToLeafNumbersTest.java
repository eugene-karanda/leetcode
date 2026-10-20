package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/sum-root-to-leaf-numbers/">129. Sum Root to Leaf Numbers</a> (Medium)
 * <p>
 * Sum all numbers formed by the digits along the root-to-leaf paths.
 */
@Disabled
public class SumRootToLeafNumbersTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.sumNumbers(TreeNode.of(1, 2, 3));

    // then
    assertThat(result)
      .isEqualTo(25);
  }

  @Test
  void example2() {
    // when
    var result = solution.sumNumbers(TreeNode.of(4, 9, 0, 5, 1));

    // then
    assertThat(result)
      .isEqualTo(1026);
  }

  class Solution {
    public int sumNumbers(TreeNode root) {
      throw new UnsupportedOperationException();
    }
  }
}
