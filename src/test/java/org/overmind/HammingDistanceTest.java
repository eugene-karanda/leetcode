package org.overmind;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/hamming-distance/">461. Hamming Distance</a> (Easy)
 * <p>
 * Count the positions at which the bits of two integers differ.
 */
public class HammingDistanceTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.hammingDistance(1, 4);

    // then
    assertThat(result)
      .isEqualTo(2);
  }

  @Test
  void example2() {
    // when
    var result = solution.hammingDistance(3, 1);

    // then
    assertThat(result)
      .isEqualTo(1);
  }

  class Solution {
    public int hammingDistance(int x, int y) {
      int count = 0;

      while(x > 0 || y > 0) {
        if(x % 2 != y % 2) {
          count++;
        }

        x /= 2;
        y /= 2;
      }

      return count;
    }
  }
}
