package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/valid-number/">65. Valid Number</a> (Hard)
 * <p>
 * Check whether a string is a valid number.
 */
@Disabled
public class ValidNumberTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.isNumber("0");

    // then
    assertThat(result)
      .isTrue();
  }

  @Test
  void example2() {
    // when
    var result = solution.isNumber("e");

    // then
    assertThat(result)
      .isFalse();
  }

  @Test
  void example3() {
    // when
    var result = solution.isNumber(".");

    // then
    assertThat(result)
      .isFalse();
  }

  class Solution {
    public boolean isNumber(String s) {
      throw new UnsupportedOperationException();
    }
  }
}
