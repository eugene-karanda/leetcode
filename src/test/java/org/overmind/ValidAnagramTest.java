package org.overmind;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/valid-anagram/">242. Valid Anagram</a> (Easy)
 * <p>
 * Check whether one string is an anagram of another.
 */
public class ValidAnagramTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.isAnagram("army", "mary");

    // then
    assertThat(result)
      .isTrue();
  }

  @Test
  void example2() {
    // when
    var result = solution.isAnagram("army", "marry");

    // then
    assertThat(result)
      .isFalse();
  }

  @Test
  void example3() {
    // when
    var result = solution.isAnagram("a", "aaaa");

    // then
    assertThat(result)
      .isFalse();
  }

  @Test
  void example4() {
    // when
    var result = solution.isAnagram("word", "word");

    // then
    assertThat(result)
      .isTrue();
  }

  class Solution {

    public boolean isAnagram(String left, String right) {
      Map<Character, Integer> leftMap = countMap(left);
      Map<Character, Integer> rightMap = countMap(right);

      return leftMap.equals(rightMap);
    }

    private Map<Character, Integer> countMap(String str) {
      var map = new HashMap<Character, Integer>(str.length());

      for (char c : str.toCharArray()) {
        map.merge(c, 1, Integer::sum);
      }

      return map;
    }
  }
}
