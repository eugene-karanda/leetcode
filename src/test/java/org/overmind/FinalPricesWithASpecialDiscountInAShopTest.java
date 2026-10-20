package org.overmind;

import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/final-prices-with-a-special-discount-in-a-shop/">1475. Final Prices With a Special Discount in a Shop</a> (Easy)
 * <p>
 * Apply to every price a discount equal to the next price that is not greater than it.
 */
public class FinalPricesWithASpecialDiscountInAShopTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.finalPrices(new int[]{8, 4, 6, 2, 3});

    // then
    assertThat(result)
      .containsExactly(4, 2, 4, 2, 3);
  }

  @Test
  void example2() {
    // when
    var result = solution.finalPrices(new int[]{1, 2, 3, 4, 5});

    // then
    assertThat(result)
      .containsExactly(1, 2, 3, 4, 5);
  }

  @Test
  void example3() {
    // when
    var result = solution.finalPrices(new int[]{10, 1, 1, 6});

    // then
    assertThat(result)
      .containsExactly(9, 0, 1, 6);
  }

  class Solution {
    public int[] finalPrices(int[] prices) {
      var stack = new Stack<Integer>();

      for (int i = 0; i < prices.length; i++) {
        while (!stack.isEmpty() && prices[i] <= prices[stack.peek()]) {
          prices[stack.pop()] -= prices[i];
        }

        stack.push(i);
      }

      return prices;
    }
  }
}
