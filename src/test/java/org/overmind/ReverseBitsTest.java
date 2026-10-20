package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/reverse-bits/">190. Reverse Bits</a> (Easy)
 * <p>
 * Reverse the bits of a 32-bit integer.
 */
@Disabled
public class ReverseBitsTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.reverseBits(43261596);

    // then
    assertThat(result)
      .isEqualTo(964176192);
  }

  @Test
  void example2() {
    // when
    var result = solution.reverseBits(2147483644);

    // then
    assertThat(result)
      .isEqualTo(1073741822);
  }

  class Solution {
    public int reverseBits(int n) {
      throw new UnsupportedOperationException();
    }
  }
}
