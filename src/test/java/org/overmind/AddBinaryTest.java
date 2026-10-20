package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/add-binary/">67. Add Binary</a> (Easy)
 * <p>
 * Return the sum of two binary strings as a binary string.
 */
@Disabled
public class AddBinaryTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.addBinary("11", "1");

    // then
    assertThat(result)
      .isEqualTo("100");
  }

  @Test
  void example2() {
    // when
    var result = solution.addBinary("1010", "1011");

    // then
    assertThat(result)
      .isEqualTo("10101");
  }

  class Solution {
    public String addBinary(String a, String b) {
      throw new UnsupportedOperationException();
    }
  }
}
