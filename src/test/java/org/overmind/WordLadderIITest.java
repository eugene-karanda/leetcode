package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/word-ladder-ii/">126. Word Ladder II</a> (Hard)
 * <p>
 * Return all shortest transformation sequences from {@code beginWord} to {@code endWord}.
 */
@Disabled
public class WordLadderIITest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.findLadders("hit", "cog", List.of("hot", "dot", "dog", "lot", "log", "cog"));

    // then
    assertThat(result)
      .containsExactlyInAnyOrder(List.of("hit", "hot", "dot", "dog", "cog"), List.of("hit", "hot", "lot", "log", "cog"));
  }

  @Test
  void example2() {
    // when
    var result = solution.findLadders("hit", "cog", List.of("hot", "dot", "dog", "lot", "log"));

    // then
    assertThat(result)
      .isEmpty();
  }

  class Solution {
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
      throw new UnsupportedOperationException();
    }
  }
}
