package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock/">121. Best Time to Buy and Sell Stock</a> (Easy)
 * <p>
 * Find the maximum profit from buying a stock on one day and selling it on a later day.
 */
@Disabled
public class BestTimeToBuyAndSellStockTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.maxProfit(new int[]{7, 1, 5, 3, 6, 4});

    // then
    assertThat(result)
      .isEqualTo(5);
  }

  @Test
  void example2() {
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
