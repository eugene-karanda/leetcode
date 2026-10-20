package org.overmind;

import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/set-mismatch/">645. Set Mismatch</a> (Easy)
 * <p>
 * Find the number that occurs twice and the number that is missing in an array of 1..n.
 */
public class SetMismatchTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.findErrorNums(new int[]{1, 2, 2, 4});

    // then
    assertThat(result)
      .containsExactly(2, 3);
  }

  @Test
  void example2() {
    // when
    var result = solution.findErrorNums(new int[]{1, 1});

    // then
    assertThat(result)
      .containsExactly(1, 2);
  }

  class Solution {
    public int[] findErrorNums(int[] nums) {
      int n = nums.length;
      int diff = (1 + n) * n / 2;

      for (var i = 0; i < n; i++) {
        diff -= nums[i];
      }

      var hashSet = new HashSet<Integer>();

      for (int num : nums) {
        var add = hashSet.add(num);

        if (!add) return new int[]{num, diff + num};
      }

      return new int[]{};
    }
  }
}
