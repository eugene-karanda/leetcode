package org.overmind;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/regular-expression-matching/">10. Regular Expression Matching</a> (Hard)
 * <p>
 * Check whether the whole string matches a pattern with {@code '.'} (any character) and {@code '*'} (zero or more of the preceding character).
 */
public class RegularExpressionMatchingTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.isMatch("aa", "a");

    // then
    assertThat(result)
      .isFalse();
  }

  @Test
  void example2() {
    // when
    var result = solution.isMatch("aa", "a*");

    // then
    assertThat(result)
      .isTrue();
  }

  @Test
  void example3() {
    // when
    var result = solution.isMatch("ab", ".*");

    // then
    assertThat(result)
      .isTrue();
  }

  class Solution {

    private Boolean[][] memo;

    public boolean isMatch(String str, String pattern) {
      memo = new Boolean[str.length() + 1][pattern.length() + 1];
      return isMatch(str, pattern, 0, 0);
    }

    private boolean isMatch(
      String str,
      String pattern,
      int strIndex,
      int patternIndex
    ) {
      if (memo[strIndex][patternIndex] != null) {
        return memo[strIndex][patternIndex];
      }

      if (patternIndex == pattern.length()) {
        return memo[strIndex][patternIndex] =
          strIndex == str.length();
      }

      boolean firstMatches =
        strIndex < str.length()
          && (pattern.charAt(patternIndex) == str.charAt(strIndex)
          || pattern.charAt(patternIndex) == '.');

      boolean hasStar =
        patternIndex + 1 < pattern.length()
          && pattern.charAt(patternIndex + 1) == '*';

      boolean result;

      if (hasStar) {
        result =
          isMatch(str, pattern, strIndex, patternIndex + 2)
            || (firstMatches
            && isMatch(
            str,
            pattern,
            strIndex + 1,
            patternIndex
          ));
      } else {
        result =
          firstMatches
            && isMatch(
            str,
            pattern,
            strIndex + 1,
            patternIndex + 1
          );
      }

      return memo[strIndex][patternIndex] = result;
    }
  }
}
