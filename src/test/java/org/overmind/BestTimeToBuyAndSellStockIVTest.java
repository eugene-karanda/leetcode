package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iv/">188. Best Time to Buy and Sell Stock IV</a> (Hard)
 * <p>
 * Find the maximum profit from at most {@code k} stock transactions.
 */
@Disabled
public class BestTimeToBuyAndSellStockIVTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.maxProfit(2, new int[]{2, 4, 1});

    // then
    assertThat(result)
      .isEqualTo(2);
  }

  @Test
  void example2() {
    // when
    var result = solution.maxProfit(2, new int[]{3, 2, 6, 5, 0, 3});

    // then
    assertThat(result)
      .isEqualTo(7);
  }

  class Solution {
    public int maxProfit(int k, int[] prices) {
      throw new UnsupportedOperationException();
    }
  }
}
