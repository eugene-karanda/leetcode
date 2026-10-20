package org.overmind;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/move-zeroes/">283. Move Zeroes</a> (Easy)
 * <p>
 * Move all zeroes to the end of the array in place, keeping the order of the other elements.
 */
public class MoveZeroesTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // given
    var nums = new int[]{0, 1, 0, 3, 12};

    // when
    solution.moveZeroes(nums);

    // then
    assertThat(nums)
      .containsExactly(1, 3, 12, 0, 0);
  }

  @Test
  void example2() {
    // given
    var nums = new int[]{0};

    // when
    solution.moveZeroes(nums);

    // then
    assertThat(nums)
      .containsExactly(0);
  }

  class Solution {
    public void moveZeroes(int[] nums) {
      int zeroIndex = -1;

      for (int i = 0; i < nums.length; i++) {
        if(nums[i] == 0) {
          if(zeroIndex == -1) {
            zeroIndex = i;
          }
        } else {
          if (zeroIndex != -1) {
            int tmp = nums[i];
            nums[i] = nums[zeroIndex];
            nums[zeroIndex] = tmp;
            zeroIndex++;
          }
        }
      }
    }
  }
}
