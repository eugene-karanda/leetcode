package org.overmind;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/add-binary/">67. Add Binary</a> (Easy)
 * <p>
 * Return the sum of two binary strings as a binary string.
 */
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
    public String addBinary(String left, String right) {
      if (left.length() < right.length()) {
        var tmp = left;
        left = right;
        right = tmp;
      }

      var result = new char[left.length() + 1];
      var carry = 0;

      for (int i = 0; i < right.length(); i++) {
        var leftVal = left.charAt(left.length() - 1 - i) - '0';
        var rightVal = right.charAt(right.length() - 1 - i) - '0';

        var tmp = leftVal + rightVal + carry;

        result[left.length() - i] = (char)((tmp & 1) + '0');
        carry = tmp >> 1;
      }

      for (int i = right.length(); i < left.length(); i++) {
        var leftVal = left.charAt(left.length() - 1 - i) - '0';

        var tmp = leftVal + carry;

        result[left.length() - i] = (char)((tmp & 1) + '0');
        carry = tmp >> 1;
      }

      if (carry == 1) {
        result[0] = '1';
        return new String(result);
      } else {
        return new String(result, 1, left.length());
      }

    }
  }
}
