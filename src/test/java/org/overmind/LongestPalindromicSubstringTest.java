package org.overmind;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/longest-palindromic-substring/">5. Longest Palindromic Substring</a> (Medium)
 * <p>
 * Find the longest palindromic substring.
 */
public class LongestPalindromicSubstringTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.longestPalindrome("babad");

    // then
    assertThat(result)
      .isIn("bab", "aba");
  }

  @Test
  void example2() {
    // when
    var result = solution.longestPalindrome("cbbd");

    // then
    assertThat(result)
      .isEqualTo("bb");
  }

  class Solution {

    public String longestPalindrome(String s) {
      int n = s.length();
      if (n == 0) return "";

      int[] d1 = new int[n]; // odd
      int l = 0, r = -1;

      // odd length palindromes
      for (int i = 0; i < n; i++) {
        int k = (i > r) ? 1 : Math.min(d1[l + r - i], r - i + 1);

        while (i - k >= 0 && i + k < n &&
            s.charAt(i - k) == s.charAt(i + k)) {
              k++;
            }

        d1[i] = k;

        if (i + k - 1 > r) {
          l = i - k + 1;
          r = i + k - 1;
        }
      }

      int[] d2 = new int[n]; // even
      l = 0; r = -1;

      // even length palindromes
      for (int i = 0; i < n; i++) {
        int k = (i > r) ? 0 : Math.min(d2[l + r - i + 1], r - i + 1);

        while (i - k - 1 >= 0 && i + k < n &&
            s.charAt(i - k - 1) == s.charAt(i + k)) {
              k++;
            }

        d2[i] = k;

        if (i + k - 1 > r) {
          l = i - k;
          r = i + k - 1;
        }
      }

      // find best
      int bestLen = 0;
      int start = 0;

      for (int i = 0; i < n; i++) {
        // odd
        int len1 = 2 * d1[i] - 1;
        if (len1 > bestLen) {
          bestLen = len1;
          start = i - d1[i] + 1;
        }

        // even
        int len2 = 2 * d2[i];
        if (len2 > bestLen) {
          bestLen = len2;
          start = i - d2[i];
        }
      }

      return s.substring(start, start + bestLen);
    }
  }
}
