package org.overmind;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/self-dividing-numbers/">728. Self Dividing Numbers</a> (Easy)
 * <p>
 * Return all self-dividing numbers in the range [{@code left}, {@code right}].
 */
public class SelfDividingNumbersTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.selfDividingNumbers(1, 22);

    // then
    assertThat(result)
      .containsExactly(1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22);
  }

  @Test
  void example2() {
    // when
    var result = solution.selfDividingNumbers(47, 85);

    // then
    assertThat(result)
      .containsExactly(48, 55, 66, 77);
  }

  class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
      List<Integer> result = new ArrayList<>();

      rangeLoop: for(int n = left ; n <= right ; n++) {
        int num = n;

        while(num > 0) {
          int digit = num % 10;

          if(digit == 0 || n % digit != 0) {
            continue rangeLoop;
          }

          num /= 10;
        }

        result.add(n);
      }

      return result;
    }
  }
}
