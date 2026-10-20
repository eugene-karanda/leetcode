package org.overmind;

import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/valid-parentheses/">20. Valid Parentheses</a> (Easy)
 * <p>
 * Check whether a string of brackets is valid.
 */
public class ValidParenthesesTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.isValid("()");

    // then
    assertThat(result)
      .isTrue();
  }

  @Test
  void example2() {
    // when
    var result = solution.isValid("()[]{}");

    // then
    assertThat(result)
      .isTrue();
  }

  @Test
  void example3() {
    // when
    var result = solution.isValid("(]");

    // then
    assertThat(result)
      .isFalse();
  }

  @Test
  void example4() {
    // when
    var result = solution.isValid("([])");

    // then
    assertThat(result)
      .isTrue();
  }

  @Test
  void example5() {
    // when
    var result = solution.isValid("([)]");

    // then
    assertThat(result)
      .isFalse();
  }

  class Solution {

    public boolean isValid(String s) {
      var stack = new Stack<Character>();

      for (char ch : s.toCharArray()) {
        switch (ch) {
          case '(', '[', '{' -> stack.push(ch);
          case ')' -> {
            if (stack.isEmpty() || stack.pop() != '(') {
              return false;
            }
          }
          case ']' -> {
            if (stack.isEmpty() || stack.pop() != '[') {
              return false;
            }
          }
          case '}' -> {
            if (stack.isEmpty() || stack.pop() != '{') {
              return false;
            }
          }
        }
      }

      return stack.isEmpty();
    }
  }
}
