package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/pascals-triangle-ii/">119. Pascal's Triangle II</a> (Easy)
 * <p>
 * Return the given row of Pascal's triangle.
 */
@Disabled
public class PascalsTriangleIITest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.getRow(3);

    // then
    assertThat(result)
      .containsExactly(1, 3, 3, 1);
  }

  @Test
  void example2() {
    // when
    var result = solution.getRow(0);

    // then
    assertThat(result)
      .containsExactly(1);
  }

  @Test
  void example3() {
    // when
    var result = solution.getRow(1);

    // then
    assertThat(result)
      .containsExactly(1, 1);
  }

  class Solution {
    public List<Integer> getRow(int rowIndex) {
      throw new UnsupportedOperationException();
    }
  }
}
