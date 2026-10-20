package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/length-of-last-word/">58. Length of Last Word</a> (Easy)
 * <p>
 * Return the length of the last word in the string.
 */
@Disabled
public class LengthOfLastWordTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.lengthOfLastWord("Hello World");

    // then
    assertThat(result)
      .isEqualTo(5);
  }

  @Test
  void example2() {
    // when
    var result = solution.lengthOfLastWord("   fly me   to   the moon  ");

    // then
    assertThat(result)
      .isEqualTo(4);
  }

  @Test
  void example3() {
    // when
    var result = solution.lengthOfLastWord("luffy is still joyboy");

    // then
    assertThat(result)
      .isEqualTo(6);
  }

  class Solution {
    public int lengthOfLastWord(String s) {
      throw new UnsupportedOperationException();
    }
  }
}
