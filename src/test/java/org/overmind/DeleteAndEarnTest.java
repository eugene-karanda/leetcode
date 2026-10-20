package org.overmind;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/delete-and-earn/">740. Delete and Earn</a> (Medium)
 * <p>
 * Maximize points by taking numbers, where taking {@code x} deletes every {@code x - 1} and {@code x + 1}.
 */
public class DeleteAndEarnTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.deleteAndEarn(new int[]{3, 4, 2});

    // then
    assertThat(result)
      .isEqualTo(6);
  }

  @Test
  void example2() {
    // when
    var result = solution.deleteAndEarn(new int[]{2, 2, 3, 3, 3, 4});

    // then
    assertThat(result)
      .isEqualTo(9);
  }

  class Solution {
    public int deleteAndEarn(int[] nums) {
      int[] countArray = new int[10000];

      for (int num : nums) {
        countArray[num]++;
      }

      countArray[1] = Math.max(countArray[0], countArray[1]);

      for (int i = 2; i < countArray.length; i++) {
        countArray[i] = Math.max(countArray[i - 1], countArray[i - 2] + (countArray[i] * i));
      }

      return countArray[countArray.length - 1];
    }
  }
}
