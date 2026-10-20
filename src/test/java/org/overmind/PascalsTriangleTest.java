package org.overmind;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/pascals-triangle/">118. Pascal's Triangle</a> (Easy)
 * <p>
 * Generate the first {@code numRows} rows of Pascal's triangle.
 */
public class PascalsTriangleTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.generate(5);

    // then
    assertThat(result)
      .containsExactly(List.of(1), List.of(1, 1), List.of(1, 2, 1), List.of(1, 3, 3, 1), List.of(1, 4, 6, 4, 1));
  }

  @Test
  void example2() {
    // when
    var result = solution.generate(1);

    // then
    assertThat(result)
      .containsExactly(List.of(1));
  }

  class Solution {
    public List<List<Integer>> generate(int numRows) {
      List<List<Integer>> rows = new ArrayList<>(numRows);
      rows.add(Collections.singletonList(1));

      for (int i = 1 ; i < numRows ; i++) {
        List<Integer> row = new ArrayList<>(i+1);
        List<Integer> prevRow = rows.get(i-1);
        row.add(1);
        for (int j = 1 ; j < i ; j++) {
          row.add(prevRow.get(j-1) + prevRow.get(j));
        }
        row.add(1);

        rows.add(row);
      }

      return rows;
    }
  }
}
