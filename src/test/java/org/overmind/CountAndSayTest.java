package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/count-and-say/">38. Count and Say</a> (Medium)
 * <p>
 * Return the n-th element of the count-and-say sequence.
 */
@Disabled
public class CountAndSayTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.countAndSay(4);

    // then
    assertThat(result)
      .isEqualTo("1211");
  }

  @Test
  void example2() {
    // when
    var result = solution.countAndSay(1);

    // then
    assertThat(result)
      .isEqualTo("1");
  }

  class Solution {
    public String countAndSay(int n) {
      throw new UnsupportedOperationException();
    }
  }
}
