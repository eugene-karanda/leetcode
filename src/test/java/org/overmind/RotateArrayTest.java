package org.overmind;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/rotate-array/">189. Rotate Array</a> (Medium)
 * <p>
 * Rotate the array to the right by {@code k} steps in place.
 */
public class RotateArrayTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // given
    var nums = new int[]{1, 2, 3, 4, 5, 6, 7};

    // when
    solution.rotate(nums, 3);

    // then
    assertThat(nums)
      .containsExactly(5, 6, 7, 1, 2, 3, 4);
  }

  @Test
  void example2() {
    // given
    var nums = new int[]{-1, -100, 3, 99};

    // when
    solution.rotate(nums, 2);

    // then
    assertThat(nums)
      .containsExactly(3, 99, -1, -100);
  }

  @Test
  void example3() {
    // given
    var nums = new int[]{1, 2, 3, 4, 5, 6};

    // when
    solution.rotate(nums, 4);

    // then
    assertThat(nums)
      .containsExactly(3, 4, 5, 6, 1, 2);
  }

  class Solution {
    public void rotate(int[] nums, int k) {
      int d = gcd(nums.length, k);

      for (int j = 0; j < d; j += 1) {
        int tmp = nums[j];
        int i = j;

        do {
          int n = (i + k) % nums.length;
          int tmp2 = nums[n];
          nums[n] = tmp;
          tmp = tmp2;
          i = n;
        } while (i != j);
      }
    }

    public int gcd(int a, int b) {
      while (a > 0 && b > 0) {
        if (a > b) {
          a = a % b;
        } else {
          b = b % a;
        }
      }

      return a + b;
    }
  }
}
