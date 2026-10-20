package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/gray-code/">89. Gray Code</a> (Medium)
 * <p>
 * Return any n-bit Gray code sequence starting with 0.
 */
@Disabled
public class GrayCodeTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.grayCode(2);

    // then
    assertGrayCode(result, 2);
  }

  @Test
  void example2() {
    // when
    var result = solution.grayCode(1);

    // then
    assertGrayCode(result, 1);
  }

  private void assertGrayCode(List<Integer> code, int n) {
    assertThat(code)
      .hasSize(1 << n)
      .startsWith(0)
      .doesNotHaveDuplicates()
      .allMatch(value -> value >= 0 && value < 1 << n);

    for (int i = 0; i < code.size(); i++) {
      int next = code.get((i + 1) % code.size());
      assertThat(Integer.bitCount(code.get(i) ^ next))
        .isEqualTo(1);
    }
  }

  class Solution {
    public List<Integer> grayCode(int n) {
      throw new UnsupportedOperationException();
    }
  }
}
