package org.overmind;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

/**
 * <a href="https://leetcode.com/problems/integer-to-roman/">12. Integer to Roman</a> (Medium)
 * <p>
 * Convert an integer from 1 to 3999 to a Roman numeral.
 */
public class IntegerToRomanTest {

  private final Solution solution = new Solution();

  public static Stream<Arguments> examples() {
    return Stream.of(
      arguments(3749, "MMMDCCXLIX"),
      arguments(58, "LVIII"),
      arguments(1994, "MCMXCIV"),
      arguments(1, "I")
    );
  }

  @MethodSource("examples")
  @ParameterizedTest
  void example(int num, String expected) {
    // when
    var result = solution.intToRoman(num);

    // then
    assertThat(result)
      .isEqualTo(expected);
  }

  class Solution {

    private static final String[] ONES = new String[]{"I", "X", "C", "M"};
    private static final String[] FIVES = new String[]{"V", "L", "D"};

    public String intToRoman(int num) {
      if (num > 3999) throw new IllegalArgumentException("Number is too big");

      var digitCount = (int) (Math.log10(num) + 1);
      var sb = new StringBuilder();

      for (int i = digitCount - 1; i >= 0; i--) {
        var digit = (num / (int) Math.pow(10, i)) % 10;

        if (digit < 4) {
          sb.append(ONES[i].repeat(digit));
        } else if (digit == 4) {
          sb.append(ONES[i]);
          sb.append(FIVES[i]);
        } else if (digit == 5) {
          sb.append(FIVES[i]);
        } else if (digit < 9) {
          sb.append(FIVES[i]);
          sb.append(ONES[i].repeat(digit - 5));
        } else {
          sb.append(ONES[i]);
          sb.append(ONES[i + 1]);
        }
      }

      return sb.toString();
    }
  }
}
