package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/gas-station/">134. Gas Station</a> (Medium)
 * <p>
 * Find the gas station to start from to travel around the circuit once, or -1.
 */
@Disabled
public class GasStationTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.canCompleteCircuit(new int[]{1, 2, 3, 4, 5}, new int[]{3, 4, 5, 1, 2});

    // then
    assertThat(result)
      .isEqualTo(3);
  }

  @Test
  void example2() {
    // when
    var result = solution.canCompleteCircuit(new int[]{2, 3, 4}, new int[]{3, 4, 3});

    // then
    assertThat(result)
      .isEqualTo(-1);
  }

  class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
      throw new UnsupportedOperationException();
    }
  }
}
