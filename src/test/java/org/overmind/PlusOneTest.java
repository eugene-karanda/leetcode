package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/plus-one/">66. Plus One</a> (Easy)
 * <p>
 * Add one to a non-negative integer stored as an array of digits.
 */
@Disabled
public class PlusOneTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.plusOne(new int[]{1, 2, 3});

    // then
    assertThat(result)
      .containsExactly(1, 2, 4);
  }

  @Test
  void example2() {
    // when
    var result = solution.plusOne(new int[]{4, 3, 2, 1});

    // then
    assertThat(result)
      .containsExactly(4, 3, 2, 2);
  }

  @Test
  void example3() {
    // when
    var result = solution.plusOne(new int[]{9});

    // then
    assertThat(result)
      .containsExactly(1, 0);
  }

  class Solution {
    public int[] plusOne(int[] digits) {
      throw new UnsupportedOperationException();
    }
  }
}
