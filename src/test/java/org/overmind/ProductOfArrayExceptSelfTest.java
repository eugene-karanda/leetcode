package org.overmind;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/product-of-array-except-self/">238. Product of Array Except Self</a> (Medium)
 * <p>
 * Return an array where each element is the product of all other elements, without using division in O(n).
 */
public class ProductOfArrayExceptSelfTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.productExceptSelf(new int[]{1, 2, 3, 4});

    // then
    assertThat(result)
      .containsExactly(24, 12, 8, 6);
  }

  @Test
  void example2() {
    // when
    var result = solution.productExceptSelf(new int[]{-1, 1, 0, -3, 3});

    // then
    assertThat(result)
      .containsExactly(0, 0, 9, 0, 0);
  }

  class Solution {
    public int[] productExceptSelf(int[] nums) {
      int zeroCount = 0;
      int product = 1;

      for(int i = 0 ; i < nums.length && zeroCount < 2 ; i++) {
        if(nums[i] != 0) {
          product *= nums[i];
        } else {
          zeroCount++;
        }
      }

      if(zeroCount == 0) {
        for(int i = 0 ; i < nums.length ; i++) {
          nums[i] = product / nums[i];
        }
      } else if(zeroCount == 1) {
        for(int i = 0 ; i < nums.length ; i++) {
          nums[i] = (nums[i] == 0) ? product : 0;
        }
      } else {
        for(int i = 0 ; i < nums.length ; i++) {
          nums[i] = 0;
        }
      }

      return nums;
    }
  }
}
