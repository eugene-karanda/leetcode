package org.overmind;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/roman-to-integer/">13. Roman to Integer</a> (Easy)
 * <p>
 * Convert a Roman numeral to an integer.
 */
public class RomanToIntegerTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.romanToInt("III");

    // then
    assertThat(result)
      .isEqualTo(3);
  }

  @Test
  void example2() {
    // when
    var result = solution.romanToInt("LVIII");

    // then
    assertThat(result)
      .isEqualTo(58);
  }

  @Test
  void example3() {
    // when
    var result = solution.romanToInt("MCMXCIV");

    // then
    assertThat(result)
      .isEqualTo(1994);
  }

  class Solution {

    private static final Map<Character, Integer> SYMBOLS = Map.of(
      'I', 1,
      'V', 5,
      'X', 10,
      'L', 50,
      'C', 100,
      'D', 500,
      'M', 1000
    );

    public int romanToInt(String s) {
      int result = 0;

      for (int i = 0; i < s.length();) {
        char ch = s.charAt(i);
        Character nextCh = (i + 1 < s.length()) ? s.charAt(i + 1) : 'A';

        if (SYMBOLS.get(ch) < SYMBOLS.getOrDefault(nextCh, 0)) {
          result += SYMBOLS.get(nextCh);
          result -= SYMBOLS.get(ch);
          i += 2;
        } else {
          result += SYMBOLS.get(ch);
          i += 1;
        }
      }

      return result;
    }
  }
}
