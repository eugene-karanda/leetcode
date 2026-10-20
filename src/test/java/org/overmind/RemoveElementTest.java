package org.overmind;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/remove-element/">27. Remove Element</a> (Easy)
 * <p>
 * Remove all occurrences of {@code val} from the array in place; return the number of remaining elements.
 */
public class RemoveElementTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // given
    var nums = new int[]{3, 2, 2, 3};

    // when
    var result = solution.removeElement(nums, 3);

    // then
    assertThat(result)
      .isEqualTo(2);
    assertThat(Arrays.copyOf(nums, result))
      .containsExactlyInAnyOrder(2, 2);
  }

  @Test
  void example2() {
    // given
    var nums = new int[]{0, 1, 2, 2, 3, 0, 4, 2};

    // when
    var result = solution.removeElement(nums, 2);

    // then
    assertThat(result)
      .isEqualTo(5);
    assertThat(Arrays.copyOf(nums, result))
      .containsExactlyInAnyOrder(0, 1, 4, 0, 3);
  }

  class Solution {
    public int removeElement(int[] nums, int val) {
      int i = 0;
      int j = nums.length - 1;

      main: while (i <= j) {
        while(nums[i] != val) {
          i++;
          if (i > j) break main;
        }
        while(nums[j] == val) {
          j--;
          if (i > j) break main;
        }

        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
      }

      return i;
    }
  }
}
