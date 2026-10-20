package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/text-justification/">68. Text Justification</a> (Hard)
 * <p>
 * Format words into lines of exactly {@code maxWidth} characters, fully justified.
 */
@Disabled
public class TextJustificationTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.fullJustify(new String[]{"This", "is", "an", "example", "of", "text", "justification."}, 16);

    // then
    assertThat(result)
      .containsExactly("This    is    an", "example  of text", "justification.  ");
  }

  @Test
  void example2() {
    // when
    var result = solution.fullJustify(new String[]{"What", "must", "be", "acknowledgment", "shall", "be"}, 16);

    // then
    assertThat(result)
      .containsExactly("What   must   be", "acknowledgment  ", "shall be        ");
  }

  @Test
  void example3() {
    // when
    var result = solution.fullJustify(new String[]{"Science", "is", "what", "we", "understand", "well", "enough", "to", "explain", "to", "a", "computer.", "Art", "is", "everything", "else", "we", "do"}, 20);

    // then
    assertThat(result)
      .containsExactly("Science  is  what we", "understand      well", "enough to explain to", "a  computer.  Art is", "everything  else  we", "do                  ");
  }

  class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
      throw new UnsupportedOperationException();
    }
  }
}
