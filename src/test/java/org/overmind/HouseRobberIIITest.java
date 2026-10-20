package org.overmind;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/house-robber-iii/">337. House Robber III</a> (Medium)
 * <p>
 * House Robber, but the houses form a binary tree and directly linked houses cannot both be robbed.
 */
public class HouseRobberIIITest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.rob(TreeNode.of(3, 2, 3, null, 3, null, 1));

    // then
    assertThat(result)
      .isEqualTo(7);
  }

  @Test
  void example2() {
    // when
    var result = solution.rob(TreeNode.of(3, 4, 5, 1, 3, null, 1));

    // then
    assertThat(result)
      .isEqualTo(9);
  }

  class Solution {
    public int rob(TreeNode root) {
      return robInfo(root).max;
    }

    public Info robInfo(TreeNode root) {
      if(root == null) {
        return new Info(0, 0);
      }

      Info leftInfo = robInfo(root.left);
      Info rightInfo = robInfo(root.right);

      int subMax = leftInfo.max + rightInfo.max;
      int max = Math.max(subMax, root.val + leftInfo.subMax + rightInfo.subMax);

      return new Info(max, subMax);
    }
  }

  class Info {
    int max;
    int subMax;

    public Info(int max, int subMax) {
      this.max = max;
      this.subMax = subMax;
    }
  }
}
