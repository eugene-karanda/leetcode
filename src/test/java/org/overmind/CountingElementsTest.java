package org.overmind;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/counting-elements/">1426. Counting Elements</a> (Easy)
 * <p>
 * Count the elements {@code x} for which {@code x + 1} is also in the array.
 */
public class CountingElementsTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.countElements(new int[]{1, 2, 3});

    // then
    assertThat(result)
      .isEqualTo(2);
  }

  @Test
  void example2() {
    // when
    var result = solution.countElements(new int[]{1, 1, 3, 3, 5, 5, 7, 7});

    // then
    assertThat(result)
      .isEqualTo(0);
  }

  class Solution {
    public int countElements(int[] arr) {
      int count = 0;
      Set<Integer> set = new HashSet<>(arr.length);

      for (int number : arr) {
        set.add(number);
      }

      for (int number : arr) {
        if(set.contains(number + 1)) {
          count++;
        }
      }

      return count;
    }
  }
}
