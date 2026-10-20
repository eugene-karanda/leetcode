package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/evaluate-reverse-polish-notation/">150. Evaluate Reverse Polish Notation</a> (Medium)
 * <p>
 * Evaluate an arithmetic expression in Reverse Polish Notation.
 */
@Disabled
public class EvaluateReversePolishNotationTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.evalRPN(new String[]{"2", "1", "+", "3", "*"});

    // then
    assertThat(result)
      .isEqualTo(9);
  }

  @Test
  void example2() {
    // when
    var result = solution.evalRPN(new String[]{"4", "13", "5", "/", "+"});

    // then
    assertThat(result)
      .isEqualTo(6);
  }

  @Test
  void example3() {
    // when
    var result = solution.evalRPN(new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"});

    // then
    assertThat(result)
      .isEqualTo(22);
  }

  class Solution {
    public int evalRPN(String[] tokens) {
      throw new UnsupportedOperationException();
    }
  }
}
