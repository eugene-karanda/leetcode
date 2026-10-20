package org.overmind;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/contiguous-array/">525. Contiguous Array</a> (Medium)
 * <p>
 * Find the longest contiguous subarray with an equal number of 0's and 1's.
 */
public class ContiguousArrayTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.findMaxLength(new int[]{0, 1});

    // then
    assertThat(result)
      .isEqualTo(2);
  }

  @Test
  void example2() {
    // when
    var result = solution.findMaxLength(new int[]{0, 1, 0});

    // then
    assertThat(result)
      .isEqualTo(2);
  }

  @Test
  void example3() {
    // when
    var result = solution.findMaxLength(new int[]{0, 1, 1, 1, 1, 1, 0, 0, 0});

    // then
    assertThat(result)
      .isEqualTo(6);
  }

  class Solution {
    public int findMaxLength(int[] nums) {
      int max = 0;
      int count = 0;
      Map<Integer, Integer> map = new HashMap<>();

      for (int i = 0; i < nums.length; i++) {
        map.putIfAbsent(i - 2 * count, i);

        if (nums[i] > 0) {
          count++;
        }

        int key = i - 2 * count + 1;

        Integer j = map.get(key);

        if (j != null) {
          if (i - j + 1 > max) {
            max = i - j + 1;
          }
        }
      }

      return max;
    }
  }
}
