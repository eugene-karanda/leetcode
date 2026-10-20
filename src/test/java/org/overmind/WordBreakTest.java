package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/word-break/">139. Word Break</a> (Medium)
 * <p>
 * Check whether a string can be segmented into words from the dictionary.
 */
@Disabled
public class WordBreakTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.wordBreak("leetcode", List.of("leet", "code"));

    // then
    assertThat(result)
      .isTrue();
  }

  @Test
  void example2() {
    // when
    var result = solution.wordBreak("applepenapple", List.of("apple", "pen"));

    // then
    assertThat(result)
      .isTrue();
  }

  @Test
  void example3() {
    // when
    var result = solution.wordBreak("catsandog", List.of("cats", "dog", "sand", "and", "cat"));

    // then
    assertThat(result)
      .isFalse();
  }

  class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
      throw new UnsupportedOperationException();
    }
  }
}
