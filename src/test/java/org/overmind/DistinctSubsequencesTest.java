package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/distinct-subsequences/">115. Distinct Subsequences</a> (Hard)
 * <p>
 * Count the distinct subsequences of {@code s} that equal {@code t}.
 */
@Disabled
public class DistinctSubsequencesTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.numDistinct("rabbbit", "rabbit");

    // then
    assertThat(result)
      .isEqualTo(3);
  }

  @Test
  void example2() {
    // when
    var result = solution.numDistinct("babgbag", "bag");

    // then
    assertThat(result)
      .isEqualTo(5);
  }

  class Solution {
    public int numDistinct(String s, String t) {
      throw new UnsupportedOperationException();
    }
  }
}
