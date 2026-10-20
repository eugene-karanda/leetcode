package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/edit-distance/">72. Edit Distance</a> (Medium)
 * <p>
 * Find the minimum number of insertions, deletions and replacements to turn one word into another.
 */
@Disabled
public class EditDistanceTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.minDistance("horse", "ros");

    // then
    assertThat(result)
      .isEqualTo(3);
  }

  @Test
  void example2() {
    // when
    var result = solution.minDistance("intention", "execution");

    // then
    assertThat(result)
      .isEqualTo(5);
  }

  class Solution {
    public int minDistance(String word1, String word2) {
      throw new UnsupportedOperationException();
    }
  }
}
