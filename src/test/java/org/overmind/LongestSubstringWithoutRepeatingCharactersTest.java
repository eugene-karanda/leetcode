package org.overmind;

import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/longest-substring-without-repeating-characters/">3. Longest Substring Without Repeating Characters</a> (Medium)
 * <p>
 * Find the length of the longest substring without repeating characters.
 */
public class LongestSubstringWithoutRepeatingCharactersTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.lengthOfLongestSubstring("abcabcbb");

    // then
    assertThat(result)
      .isEqualTo(3);
  }

  @Test
  void example2() {
    // when
    var result = solution.lengthOfLongestSubstring("bbbbb");

    // then
    assertThat(result)
      .isEqualTo(1);
  }

  @Test
  void example3() {
    // when
    var result = solution.lengthOfLongestSubstring("pwwkew");

    // then
    assertThat(result)
      .isEqualTo(3);
  }

  class Solution {
    public int lengthOfLongestSubstring(String s) {
      var charSet = new HashSet<Character>();
      int left = 0, maxLength = 0;

      for (int right = 0; right < s.length(); right++) {
        while (charSet.contains(s.charAt(right))) {
          charSet.remove(s.charAt(left));
          left++;
        }
        charSet.add(s.charAt(right));

        if (right - left + 1 > maxLength) {
          maxLength = right - left + 1;
        }
      }

      return maxLength;
    }
  }
}
