package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/sort-colors/">75. Sort Colors</a> (Medium)
 * <p>
 * Sort an array of 0's, 1's and 2's in place in one pass (Dutch national flag problem).
 */
@Disabled
public class SortColorsTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // given
    var nums = new int[]{2, 0, 2, 1, 1, 0};

    // when
    solution.sortColors(nums);

    // then
    assertThat(nums)
      .containsExactly(0, 0, 1, 1, 2, 2);
  }

  @Test
  void example2() {
    // given
    var nums = new int[]{2, 0, 1};

    // when
    solution.sortColors(nums);

    // then
    assertThat(nums)
      .containsExactly(0, 1, 2);
  }

  class Solution {
    public void sortColors(int[] nums) {
      throw new UnsupportedOperationException();
    }
  }
}
