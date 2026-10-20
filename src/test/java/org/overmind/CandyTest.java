package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/candy/">135. Candy</a> (Hard)
 * <p>
 * Find the minimum number of candies so that children with a higher rating than a neighbour get more.
 */
@Disabled
public class CandyTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.candy(new int[]{1, 0, 2});

    // then
    assertThat(result)
      .isEqualTo(5);
  }

  @Test
  void example2() {
    // when
    var result = solution.candy(new int[]{1, 2, 2});

    // then
    assertThat(result)
      .isEqualTo(4);
  }

  class Solution {
    public int candy(int[] ratings) {
      throw new UnsupportedOperationException();
    }
  }
}
