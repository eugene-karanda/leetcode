package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/">28. Find the Index of the First Occurrence in a String</a> (Easy)
 * <p>
 * Find the index of the first occurrence of {@code needle} in {@code haystack}, or -1.
 */
@Disabled
public class FindTheIndexOfTheFirstOccurrenceInAStringTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.strStr("sadbutsad", "sad");

    // then
    assertThat(result)
      .isEqualTo(0);
  }

  @Test
  void example2() {
    // when
    var result = solution.strStr("leetcode", "leeto");

    // then
    assertThat(result)
      .isEqualTo(-1);
  }

  class Solution {
    public int strStr(String haystack, String needle) {
      throw new UnsupportedOperationException();
    }
  }
}
