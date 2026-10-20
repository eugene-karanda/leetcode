package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/path-sum-ii/">113. Path Sum II</a> (Medium)
 * <p>
 * Return all root-to-leaf paths that sum up to {@code targetSum}.
 */
@Disabled
public class PathSumIITest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.pathSum(TreeNode.of(5, 4, 8, 11, null, 13, 4, 7, 2, null, null, 5, 1), 22);

    // then
    assertThat(result)
      .containsExactlyInAnyOrder(List.of(5, 4, 11, 2), List.of(5, 8, 4, 5));
  }

  @Test
  void example2() {
    // when
    var result = solution.pathSum(TreeNode.of(1, 2, 3), 5);

    // then
    assertThat(result)
      .isEmpty();
  }

  @Test
  void example3() {
    // when
    var result = solution.pathSum(TreeNode.of(1, 2), 0);

    // then
    assertThat(result)
      .isEmpty();
  }

  class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
      throw new UnsupportedOperationException();
    }
  }
}
