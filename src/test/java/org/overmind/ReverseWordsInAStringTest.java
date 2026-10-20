package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/reverse-words-in-a-string/">151. Reverse Words in a String</a> (Medium)
 * <p>
 * Reverse the order of the words in a string.
 */
@Disabled
public class ReverseWordsInAStringTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.reverseWords("the sky is blue");

    // then
    assertThat(result)
      .isEqualTo("blue is sky the");
  }

  @Test
  void example2() {
    // when
    var result = solution.reverseWords("  hello world  ");

    // then
    assertThat(result)
      .isEqualTo("world hello");
  }

  @Test
  void example3() {
    // when
    var result = solution.reverseWords("a good   example");

    // then
    assertThat(result)
      .isEqualTo("example good a");
  }

  class Solution {
    public String reverseWords(String s) {
      throw new UnsupportedOperationException();
    }
  }
}
