package org.overmind;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/robot-return-to-origin/">657. Robot Return to Origin</a> (Easy)
 * <p>
 * Check whether a robot returns to the origin after a sequence of moves.
 */
public class RobotReturnToOriginTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.judgeCircle("UD");

    // then
    assertThat(result)
      .isTrue();
  }

  @Test
  void example2() {
    // when
    var result = solution.judgeCircle("LL");

    // then
    assertThat(result)
      .isFalse();
  }

  class Solution {
    public boolean judgeCircle(String moves) {
      int rightCount = 0;
      int leftCount = 0;
      int upCount = 0;
      int downCount = 0;

      for(char c: moves.toCharArray()){
        switch(c) {
          case 'R':
            rightCount++;
            break;
          case 'L':
            leftCount++;
            break;
          case 'U':
            upCount++;
            break;
          case 'D':
            downCount++;
            break;
        }
      }

      return (rightCount == leftCount)
        && (upCount == downCount);
    }
  }
}
