package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/word-break-ii/">140. Word Break II</a> (Hard)
 * <p>
 * Return all ways to segment a string into words from the dictionary.
 */
@Disabled
public class WordBreakIITest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.wordBreak("catsanddog", List.of("cat", "cats", "and", "sand", "dog"));

    // then
    assertThat(result)
      .containsExactlyInAnyOrder("cats and dog", "cat sand dog");
  }

  @Test
  void example2() {
    // when
    var result = solution.wordBreak("pineapplepenapple", List.of("apple", "pen", "applepen", "pine", "pineapple"));

    // then
    assertThat(result)
      .containsExactlyInAnyOrder("pine apple pen apple", "pineapple pen apple", "pine applepen apple");
  }

  @Test
  void example3() {
    // when
    var result = solution.wordBreak("catsandog", List.of("cats", "dog", "sand", "and", "cat"));

    // then
    assertThat(result)
      .isEmpty();
  }

  class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
      throw new UnsupportedOperationException();
    }
  }
}
