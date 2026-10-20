package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/multiply-strings/">43. Multiply Strings</a> (Medium)
 * <p>
 * Multiply two non-negative integers given as strings.
 */
@Disabled
public class MultiplyStringsTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.multiply("2", "3");

    // then
    assertThat(result)
      .isEqualTo("6");
  }

  @Test
  void example2() {
    // when
    var result = solution.multiply("123", "456");

    // then
    assertThat(result)
      .isEqualTo("56088");
  }

  class Solution {
    public String multiply(String num1, String num2) {
      throw new UnsupportedOperationException();
    }
  }
}
