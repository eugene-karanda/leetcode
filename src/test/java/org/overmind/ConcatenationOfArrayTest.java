package org.overmind;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/concatenation-of-array/">1929. Concatenation of Array</a> (Easy)
 * <p>
 * Return the array concatenated with itself.
 */
public class ConcatenationOfArrayTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.getConcatenation(new int[]{1, 2, 1});

    // then
    assertThat(result)
      .containsExactly(1, 2, 1, 1, 2, 1);
  }

  @Test
  void example2() {
    // when
    var result = solution.getConcatenation(new int[]{1, 3, 2, 1});

    // then
    assertThat(result)
      .containsExactly(1, 3, 2, 1, 1, 3, 2, 1);
  }

  class Solution {
    public int[] getConcatenation(int[] nums) {
      var ans = new int[nums.length * 2];

      for (var i = 0; i < nums.length; i++) {
        ans[i] = nums[i];
        ans[i + nums.length] = nums[i];
      }

      return ans;
    }
  }
}
