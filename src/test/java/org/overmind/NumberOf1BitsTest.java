package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/number-of-1-bits/">191. Number of 1 Bits</a> (Easy)
 * <p>
 * Count the number of 1 bits in an integer.
 */
@Disabled
public class NumberOf1BitsTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.hammingWeight(11);

    // then
    assertThat(result)
      .isEqualTo(3);
  }

  @Test
  void example2() {
    // when
    var result = solution.hammingWeight(128);

    // then
    assertThat(result)
      .isEqualTo(1);
  }

  @Test
  void example3() {
    // when
    var result = solution.hammingWeight(2147483645);

    // then
    assertThat(result)
      .isEqualTo(30);
  }

  class Solution {
    public int hammingWeight(int n) {
      throw new UnsupportedOperationException();
    }
  }
}
