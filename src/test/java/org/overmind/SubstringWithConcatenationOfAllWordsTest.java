package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/substring-with-concatenation-of-all-words/">30. Substring with Concatenation of All Words</a> (Hard)
 * <p>
 * Find all starting indices of substrings that are a concatenation of all the given words.
 */
@Disabled
public class SubstringWithConcatenationOfAllWordsTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.findSubstring("barfoothefoobarman", new String[]{"foo", "bar"});

    // then
    assertThat(result)
      .containsExactlyInAnyOrder(0, 9);
  }

  @Test
  void example2() {
    // when
    var result = solution.findSubstring("wordgoodgoodgoodbestword", new String[]{"word", "good", "best", "word"});

    // then
    assertThat(result)
      .isEmpty();
  }

  @Test
  void example3() {
    // when
    var result = solution.findSubstring("barfoofoobarthefoobarman", new String[]{"bar", "foo", "the"});

    // then
    assertThat(result)
      .containsExactlyInAnyOrder(6, 9, 12);
  }

  class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
      throw new UnsupportedOperationException();
    }
  }
}
