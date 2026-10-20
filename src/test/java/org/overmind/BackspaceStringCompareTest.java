package org.overmind;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/backspace-string-compare/">844. Backspace String Compare</a> (Easy)
 * <p>
 * Compare two strings after applying the backspace character {@code '#'}.
 */
public class BackspaceStringCompareTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.backspaceCompare("ab#c", "ad#c");

    // then
    assertThat(result)
      .isTrue();
  }

  @Test
  void example2() {
    // when
    var result = solution.backspaceCompare("ab##", "c#d#");

    // then
    assertThat(result)
      .isTrue();
  }

  @Test
  void example3() {
    // when
    var result = solution.backspaceCompare("a#c", "b");

    // then
    assertThat(result)
      .isFalse();
  }

  class Solution {
    public boolean backspaceCompare(String first, String second) {
      char[] firstChars = first.toCharArray();
      char[] secondChars = second.toCharArray();

      int firstSkip = 0;
      int secondSkip = 0;

      int firstIndex = firstChars.length - 1;
      int secondIndex = secondChars.length - 1;

      while (firstIndex >= 0 && secondIndex >= 0) {
        while (firstIndex >= 0) {
          if (firstChars[firstIndex] == '#') {
            firstSkip++;
            firstIndex--;
            continue;
          }

          if (firstSkip > 0) {
            firstIndex--;
            firstSkip--;
          } else {
            break;
          }
        }

        while (secondIndex >= 0) {
          if (secondChars[secondIndex] == '#') {
            secondSkip++;
            secondIndex--;
            continue;
          }

          if (secondSkip > 0) {
            secondIndex--;
            secondSkip--;
          } else {
            break;
          }
        }

        if (firstIndex >= 0 && secondIndex >= 0) {
          if (firstChars[firstIndex] == secondChars[secondIndex]) {
            firstIndex--;
            secondIndex--;
          } else {
            return false;
          }
        } else {
          break;
        }
      }

      while (firstIndex >= 0) {
        if (firstChars[firstIndex] == '#') {
          firstSkip++;
          firstIndex--;
          continue;
        }

        if (firstSkip > 0) {
          firstIndex--;
          firstSkip--;
          continue;
        }

        return false;
      }

      while (secondIndex >= 0) {
        if (secondChars[secondIndex] == '#') {
          secondSkip++;
          secondIndex--;
          continue;
        }

        if (secondSkip > 0) {
          secondIndex--;
          secondSkip--;
          continue;
        }

        return false;
      }

      return true;
    }
  }
}
