package org.overmind;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/">28. Find the Index of the First Occurrence in a String</a> (Easy)
 * <p>
 * Find the index of the first occurrence of {@code needle} in {@code haystack}, or -1.
 */
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
      var n = haystack.length();
      var m = needle.length();

      var value = haystack.getBytes();
      var str = needle.getBytes();

      var first = needle.charAt(0);
      int max = (n - m);
      for (int i = 0; i <= max; i++) {
        // Look for first character.
        if (haystack.charAt(i) != first) {
          while (++i <= max && value[i] != first);
        }
        // Found first character, now look at the rest of value
        if (i <= max) {
          int j = i + 1;
          int end = j + m - 1;
          for (int k = 1; j < end && value[j] == str[k]; j++, k++);
          if (j == end) {
            // Found whole string.
            return i;
          }
        }
      }
      return -1;
    }
  }
}
