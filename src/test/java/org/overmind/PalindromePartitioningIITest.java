package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/palindrome-partitioning-ii/">132. Palindrome Partitioning II</a> (Hard)
 * <p>
 * Find the minimum number of cuts to partition a string into palindromes.
 */
@Disabled
public class PalindromePartitioningIITest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.minCut("aab");

    // then
    assertThat(result)
      .isEqualTo(1);
  }

  @Test
  void example2() {
    // when
    var result = solution.minCut("a");

    // then
    assertThat(result)
      .isEqualTo(0);
  }

  @Test
  void example3() {
    // when
    var result = solution.minCut("ab");

    // then
    assertThat(result)
      .isEqualTo(1);
  }

  class Solution {
    public int minCut(String s) {
      throw new UnsupportedOperationException();
    }
  }
}
