package org.overmind;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/string-to-integer-atoi/">8. String to Integer (atoi)</a> (Medium)
 * <p>
 * Convert a string to a 32-bit signed integer, like C's {@code atoi}.
 */
public class StringToIntegerAtoiTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.myAtoi("42");

    // then
    assertThat(result)
      .isEqualTo(42);
  }

  @Test
  void example2() {
    // when
    var result = solution.myAtoi("   -042");

    // then
    assertThat(result)
      .isEqualTo(-42);
  }

  @Test
  void example3() {
    // when
    var result = solution.myAtoi("1337c0d3");

    // then
    assertThat(result)
      .isEqualTo(1337);
  }

  @Test
  void example4() {
    // when
    var result = solution.myAtoi("0-1");

    // then
    assertThat(result)
      .isEqualTo(0);
  }

  @Test
  void example5() {
    // when
    var result = solution.myAtoi("words and 987");

    // then
    assertThat(result)
      .isEqualTo(0);
  }

  class Solution {

    /**
     * myAtoi(string s) function, which converts a string to a 32-bit signed integer.
     * <p>
     * The algorithm for myAtoi(string s) is as follows:
     * <p>
     * Whitespace: Ignore any leading whitespace (" ").
     * Signedness: Determine the sign by checking if the next character is '-' or '+', assuming positivity if neither present.
     * Conversion: Read the integer by skipping leading zeros until a non-digit character is encountered or the end of the string is reached. If no digits were read, then the result is 0.
     * Rounding: If the integer is out of the 32-bit signed integer range [-2^31, 2^31 - 1], then round the integer to remain in the range. Specifically, integers less than -2^31 should be rounded to -2^31, and integers greater than 2^31 - 1 should be rounded to 2^31 - 1.
     * Return the integer as the final result.
     * Note: Doesn't use any built-in library function that converts a string to a number (for example, atoi, stoi, Integer.parseInt, int(), parseInt, Number()). Perform the conversion manually.
     *
     * @param s string
     * @return int
     */
    public int myAtoi(String s) {
      int pos = 0;
      int sign = 1;
      int result = 0;

      // skip leading whitespace
      while (pos < s.length() && s.charAt(pos) == ' ') {
        pos++;
      }

      // determine sign
      if (pos < s.length() && (s.charAt(pos) == '-' || s.charAt(pos) == '+')) {
        sign = s.charAt(pos) == '-' ? -1 : 1;
        pos++;
      }

      // skip leading zeros
      while (pos < s.length() && s.charAt(pos) == '0') {
        pos++;
      }

      while (pos < s.length() && Character.isDigit(s.charAt(pos))) {
        if (result > Integer.MAX_VALUE / 10) {
          return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }

        result *= 10;

        if (result > Integer.MAX_VALUE - (s.charAt(pos) - '0')) {
          return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }

        result += (s.charAt(pos) - '0');

        pos++;
      }

      return sign * result;
    }
  }
}
