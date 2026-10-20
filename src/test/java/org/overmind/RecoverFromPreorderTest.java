package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/recover-a-tree-from-preorder-traversal/">1028. Recover a Tree From Preorder Traversal</a> (Hard)
 * <p>
 * Recover a binary tree from its preorder traversal string, where the depth of each node is given by the number of dashes before its value.
 */
@Disabled
public class RecoverFromPreorderTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.recoverFromPreorder("1-2--3--4-5--6--7");

    // then
    assertThat(result)
      .isEqualTo(new TreeNode(1,
        new TreeNode(2,
          new TreeNode(3),
          new TreeNode(4)),
        new TreeNode(5,
          new TreeNode(6),
          new TreeNode(7))
      ));
  }

  @Test
  void example2() {
    // when
    var result = solution.recoverFromPreorder("1-2--3---4-5--6---7");

    // then
    assertThat(result)
      .isEqualTo(new TreeNode(1,
        new TreeNode(2,
          new TreeNode(3,
            new TreeNode(5),
            null
          ),
          null
        ),
        new TreeNode(5,
          new TreeNode(6,
            new TreeNode(7),
            null
          ),
          null
        )
      ));
  }

  @Test
  void example3() {
    // when
    var result = solution.recoverFromPreorder("1-401--349---90--88");

    // then
    assertThat(result)
      .isEqualTo(new TreeNode(1,
        new TreeNode(401,
          new TreeNode(349,
            new TreeNode(90),
            null
          ),
          new TreeNode(88)
        ),
        null
      ));
  }

  class Solution {
    public TreeNode recoverFromPreorder(String traversal) {
      throw new UnsupportedOperationException();
    }
  }
}
