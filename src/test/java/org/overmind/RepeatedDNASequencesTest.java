package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/repeated-dna-sequences/">187. Repeated DNA Sequences</a> (Medium)
 * <p>
 * Return all 10-letter sequences that occur more than once in a DNA molecule.
 */
@Disabled
public class RepeatedDNASequencesTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT");

    // then
    assertThat(result)
      .containsExactlyInAnyOrder("AAAAACCCCC", "CCCCCAAAAA");
  }

  @Test
  void example2() {
    // when
    var result = solution.findRepeatedDnaSequences("AAAAAAAAAAAAA");

    // then
    assertThat(result)
      .containsExactlyInAnyOrder("AAAAAAAAAA");
  }

  class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
      throw new UnsupportedOperationException();
    }
  }
}
