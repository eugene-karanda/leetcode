package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iii/">123. Best Time to Buy and Sell Stock III</a> (Hard)
 * <p>
 * Find the maximum profit from at most two stock transactions.
 */
@Disabled
public class BestTimeToBuyAndSellStockIIITest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.maxProfit(new int[]{3, 3, 5, 0, 0, 3, 1, 4});

    // then
    assertThat(result)
      .isEqualTo(6);
  }

  @Test
  void example2() {
    // when
    var result = solution.maxProfit(new int[]{1, 2, 3, 4, 5});

    // then
    assertThat(result)
      .isEqualTo(4);
  }

  @Test
  void example3() {
    // when
    var result = solution.maxProfit(new int[]{7, 6, 4, 3, 1});

    // then
    assertThat(result)
      .isEqualTo(0);
  }

  class Solution {
    public int maxProfit(int[] prices) {
      throw new UnsupportedOperationException();
    }
  }
}
