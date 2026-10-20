package org.overmind;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/shuffle-the-array/">1470. Shuffle the Array</a> (Easy)
 * <p>
 * Rearrange {@code [x1, ..., xn, y1, ..., yn]} into {@code [x1, y1, ..., xn, yn]}.
 */
public class ShuffleTheArrayTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.shuffle(new int[]{2, 5, 1, 3, 4, 7}, 3);

    // then
    assertThat(result)
      .containsExactly(2, 3, 5, 4, 1, 7);
  }

  @Test
  void example2() {
    // when
    var result = solution.shuffle(new int[]{1, 2, 3, 4, 4, 3, 2, 1}, 4);

    // then
    assertThat(result)
      .containsExactly(1, 4, 2, 3, 3, 2, 4, 1);
  }

  @Test
  void example3() {
    // when
    var result = solution.shuffle(new int[]{1, 1, 2, 2}, 2);

    // then
    assertThat(result)
      .containsExactly(1, 2, 1, 2);
  }

  class Solution {
    public int[] shuffle(int[] nums, int n) {
      var result = new int[2 * n];

      for (var i = 0; i < n; i++) {
        result[2 * i] = nums[i];
        result[2 * i + 1] = nums[i + n];
      }

      return result;
    }
  }
}
