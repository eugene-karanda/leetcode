package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/next-permutation/">31. Next Permutation</a> (Medium)
 * <p>
 * Rearrange the array into the next lexicographically greater permutation in place.
 */
@Disabled
public class NextPermutationTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // given
    var nums = new int[]{1, 2, 3};

    // when
    solution.nextPermutation(nums);

    // then
    assertThat(nums)
      .containsExactly(1, 3, 2);
  }

  @Test
  void example2() {
    // given
    var nums = new int[]{3, 2, 1};

    // when
    solution.nextPermutation(nums);

    // then
    assertThat(nums)
      .containsExactly(1, 2, 3);
  }

  @Test
  void example3() {
    // given
    var nums = new int[]{1, 1, 5};

    // when
    solution.nextPermutation(nums);

    // then
    assertThat(nums)
      .containsExactly(1, 5, 1);
  }

  class Solution {
    public void nextPermutation(int[] nums) {
      throw new UnsupportedOperationException();
    }
  }
}
