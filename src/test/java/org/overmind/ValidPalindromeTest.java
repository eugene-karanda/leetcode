package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/valid-palindrome/">125. Valid Palindrome</a> (Easy)
 * <p>
 * Check whether a string is a palindrome, considering only letters and digits and ignoring case.
 */
@Disabled
public class ValidPalindromeTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.isPalindrome("A man, a plan, a canal: Panama");

    // then
    assertThat(result)
      .isTrue();
  }

  @Test
  void example2() {
    // when
    var result = solution.isPalindrome("race a car");

    // then
    assertThat(result)
      .isFalse();
  }

  @Test
  void example3() {
    // when
    var result = solution.isPalindrome(" ");

    // then
    assertThat(result)
      .isTrue();
  }

  class Solution {
    public boolean isPalindrome(String s) {
      throw new UnsupportedOperationException();
    }
  }
}
