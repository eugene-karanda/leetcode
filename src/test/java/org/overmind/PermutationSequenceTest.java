package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/permutation-sequence/">60. Permutation Sequence</a> (Hard)
 * <p>
 * Return the k-th permutation of the numbers 1 to n in lexicographic order.
 */
@Disabled
public class PermutationSequenceTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.getPermutation(3, 3);

    // then
    assertThat(result)
      .isEqualTo("213");
  }

  @Test
  void example2() {
    // when
    var result = solution.getPermutation(4, 9);

    // then
    assertThat(result)
      .isEqualTo("2314");
  }

  @Test
  void example3() {
    // when
    var result = solution.getPermutation(3, 1);

    // then
    assertThat(result)
      .isEqualTo("123");
  }

  class Solution {
    public String getPermutation(int n, int k) {
      throw new UnsupportedOperationException();
    }
  }
}
