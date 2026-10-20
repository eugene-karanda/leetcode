package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/maximum-product-subarray/">152. Maximum Product Subarray</a> (Medium)
 * <p>
 * Find the subarray with the largest product.
 */
@Disabled
public class MaximumProductSubarrayTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.maxProduct(new int[]{2, 3, -2, 4});

    // then
    assertThat(result)
      .isEqualTo(6);
  }

  @Test
  void example2() {
    // when
    var result = solution.maxProduct(new int[]{-2, 0, -1});

    // then
    assertThat(result)
      .isEqualTo(0);
  }

  class Solution {
    public int maxProduct(int[] nums) {
      throw new UnsupportedOperationException();
    }
  }
}
