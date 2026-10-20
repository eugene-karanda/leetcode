package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/word-ladder/">127. Word Ladder</a> (Hard)
 * <p>
 * Find the length of the shortest transformation sequence from {@code beginWord} to {@code endWord}, changing one letter at a time; every intermediate word must be in the word list.
 */
@Disabled
public class WordLadderTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.ladderLength("hit", "cog", List.of("hot", "dot", "dog", "lot", "log", "cog"));

    // then
    assertThat(result)
      .isEqualTo(5);
  }

  @Test
  void example2() {
    // when
    var result = solution.ladderLength("hit", "cog", List.of("hot", "dot", "dog", "lot", "log"));

    // then
    assertThat(result)
      .isEqualTo(0);
  }

  class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
      throw new UnsupportedOperationException();
    }
  }
}
