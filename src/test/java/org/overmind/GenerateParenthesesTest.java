package org.overmind;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/generate-parentheses/">22. Generate Parentheses</a> (Medium)
 * <p>
 * Generate all combinations of {@code n} pairs of well-formed parentheses.
 */
public class GenerateParenthesesTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.generateParenthesis(3);

    // then
    assertThat(result)
      .containsExactlyInAnyOrder("((()))", "(()())", "(())()", "()(())", "()()()");
  }

  @Test
  void example2() {
    // when
    var result = solution.generateParenthesis(1);

    // then
    assertThat(result)
      .containsExactlyInAnyOrder("()");
  }

  class Solution {

    public List<String> generateParenthesis(int n) {
      var result = new ArrayList<String>();
      var current = new StringBuilder();

      backtrack(n, 0, 0, current, result);

      return result;
    }

    private void backtrack(int n, int open, int close, StringBuilder current, List<String> result) {
      if (open == n && close == n) {
        result.add(current.toString());
        return;
      }

      if (open < n) {
        current.append('(');
        backtrack(n, open + 1, close, current, result);
        current.deleteCharAt(current.length() - 1);
      }

      if (close < open) {
        current.append(')');
        backtrack(n, open, close + 1, current, result);
        current.deleteCharAt(current.length() - 1);
      }
    }
  }
}
