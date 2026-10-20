package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/max-points-on-a-line/">149. Max Points on a Line</a> (Hard)
 * <p>
 * Find the maximum number of points that lie on the same straight line.
 */
@Disabled
public class MaxPointsOnALineTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.maxPoints(new int[][]{{1, 1}, {2, 2}, {3, 3}});

    // then
    assertThat(result)
      .isEqualTo(3);
  }

  @Test
  void example2() {
    // when
    var result = solution.maxPoints(new int[][]{{1, 1}, {3, 2}, {5, 3}, {4, 1}, {2, 3}, {1, 4}});

    // then
    assertThat(result)
      .isEqualTo(4);
  }

  class Solution {
    public int maxPoints(int[][] points) {
      throw new UnsupportedOperationException();
    }
  }
}
