package org.overmind;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/palindrome-number/">9. Palindrome Number</a> (Easy)
 * <p>
 * Check whether an integer reads the same backward as forward.
 */
public class PalindromeNumberTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.isPalindrome(121);

    // then
    assertThat(result)
      .isTrue();
  }

  @Test
  void example2() {
    // when
    var result = solution.isPalindrome(-121);

    // then
    assertThat(result)
      .isFalse();
  }

  @Test
  void example3() {
    // when
    var result = solution.isPalindrome(10);

    // then
    assertThat(result)
      .isFalse();
  }

  class Solution {
    public boolean isPalindrome(int x) {
      if (x < 0) {
        return false;
      }

      var digits = new ArrayList<>();

      while(x != 0) {
        digits.add(x % 10);
        x /= 10;
      }

      for (int i = 0; i < digits.size() / 2; i++) {
        if (digits.get(i) != digits.get(digits.size() - i - 1)) {
          return false;
        }
      }

      return true;
    }
  }
}
