package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/fraction-to-recurring-decimal/">166. Fraction to Recurring Decimal</a> (Medium)
 * <p>
 * Return the fraction as a decimal string, with the repeating part in parentheses.
 */
@Disabled
public class FractionToRecurringDecimalTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.fractionToDecimal(1, 2);

    // then
    assertThat(result)
      .isEqualTo("0.5");
  }

  @Test
  void example2() {
    // when
    var result = solution.fractionToDecimal(2, 1);

    // then
    assertThat(result)
      .isEqualTo("2");
  }

  @Test
  void example3() {
    // when
    var result = solution.fractionToDecimal(4, 333);

    // then
    assertThat(result)
      .isEqualTo("0.(012)");
  }

  class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
      throw new UnsupportedOperationException();
    }
  }
}
