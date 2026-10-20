package org.overmind;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/">122. Best Time to Buy and Sell Stock II</a> (Medium)
 * <p>
 * Find the maximum profit from buying and selling a stock any number of times.
 */
public class BestTimeToBuyAndSellStockIITest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.maxProfit(new int[]{7, 1, 5, 3, 6, 4});

    // then
    assertThat(result)
      .isEqualTo(7);
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
      int max = 0;

      for (int j = 1, len = prices.length; j < len; j++) {
        if (prices[j] > prices[j - 1]) {
          max += prices[j] - prices[j - 1];
        }
      }

      return max;
    }
  }
}
