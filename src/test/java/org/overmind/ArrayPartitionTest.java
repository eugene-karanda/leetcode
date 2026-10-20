package org.overmind;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/array-partition/">561. Array Partition</a> (Easy)
 * <p>
 * Group the numbers into pairs so that the sum of the minimum of each pair is maximized.
 */
public class ArrayPartitionTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.arrayPairSum(new int[]{1, 4, 3, 2});

    // then
    assertThat(result)
      .isEqualTo(4);
  }

  @Test
  void example2() {
    // when
    var result = solution.arrayPairSum(new int[]{6, 2, 6, 5, 1, 2});

    // then
    assertThat(result)
      .isEqualTo(9);
  }

  class Solution {

    private final int minValue = -10000;
    private final int maxValue = 10000;
    private final int rangeLength = maxValue - minValue + 1;

    public int arrayPairSum(int[] nums) {
      int[] countArray = new int[rangeLength];

      for(int num : nums) {
        countArray[num - minValue]++;
      }

      int sum = 0;
      boolean taken = false;

      for(int i = 0 ; i < rangeLength ; i++) {
        int count = countArray[i];

        if(count == 0) {
          continue;
        }

        sum += (i + minValue) * ((count + (taken ? 0 : 1)) / 2);

        if(count % 2 == 1) {
          taken = !taken;
        }
      }

      return sum;
    }
  }
}
