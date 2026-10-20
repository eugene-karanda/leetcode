package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/palindrome-partitioning/">131. Palindrome Partitioning</a> (Medium)
 * <p>
 * Return all ways to partition a string into palindromes.
 */
@Disabled
public class PalindromePartitioningTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.partition("aab");

    // then
    assertThat(result)
      .containsExactlyInAnyOrder(List.of("a", "a", "b"), List.of("aa", "b"));
  }

  @Test
  void example2() {
    // when
    var result = solution.partition("a");

    // then
    assertThat(result)
      .containsExactlyInAnyOrder(List.of("a"));
  }

  class Solution {
    public List<List<String>> partition(String s) {
      throw new UnsupportedOperationException();
    }
  }
}
