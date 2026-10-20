package org.overmind;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/letter-combinations-of-a-phone-number/">17. Letter Combinations of a Phone Number</a> (Medium)
 * <p>
 * Return all letter combinations that a phone number could represent.
 */
public class LetterCombinationsOfAPhoneNumberTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.letterCombinations("23");

    // then
    assertThat(result)
      .containsExactlyInAnyOrder("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf");
  }

  @Test
  void example2() {
    // when
    var result = solution.letterCombinations("2");

    // then
    assertThat(result)
      .containsExactlyInAnyOrder("a", "b", "c");
  }

  class Solution {
    private final String[] buttons = {
      "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public List<String> letterCombinations(String digits) {
      if (digits.isEmpty()) {
        return List.of();
      }

      var result = new ArrayList<String>();
      int[] letterIndexes = new int[digits.length()];

      do {
        var stringBuilder = new StringBuilder();

        for (int i = 0; i < digits.length(); i++) {
          stringBuilder.append(buttons[digits.charAt(i) - '2'].charAt(letterIndexes[i]));
        }

        result.add(stringBuilder.toString());

        letterIndexes[letterIndexes.length - 1]++;

        for (int i = letterIndexes.length - 1; i > 0; i--) {
          if (letterIndexes[i] == buttons[digits.charAt(i) - '2'].length()) {
            letterIndexes[i] = 0;
            letterIndexes[i - 1]++; // carry
          } else {
            break;
          }
        }
      } while (letterIndexes[0] != buttons[digits.charAt(0) - '2'].length());

      return result;
    }
  }
}
