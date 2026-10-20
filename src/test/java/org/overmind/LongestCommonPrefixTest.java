package org.overmind;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/longest-common-prefix/">14. Longest Common Prefix</a> (Easy)
 * <p>
 * Find the longest common prefix of an array of strings.
 */
public class LongestCommonPrefixTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.longestCommonPrefix(new String[]{"flower", "flow", "flight"});

    // then
    assertThat(result)
      .isEqualTo("fl");
  }

  @Test
  void example2() {
    // when
    var result = solution.longestCommonPrefix(new String[]{"dog", "racecar", "car"});

    // then
    assertThat(result)
      .isEqualTo("");
  }

  class Solution {

    public String longestCommonPrefix(String[] strs) {
      char[] prefix = strs[0].toCharArray();
      int prefixLength = prefix.length;

      for (int i = 1; i < strs.length; i++) {
        if (strs[i].length() < prefixLength) {
          prefixLength = strs[i].length();
        }

        for (int j = 0; j < prefixLength; j++) {
          if (strs[i].charAt(j) != prefix[j]) {
            prefixLength = j;
            break;
          }
        }

        if (prefixLength == 0) {
          return "";
        }
      }

      return new String(prefix, 0, prefixLength);
    }
  }
}
