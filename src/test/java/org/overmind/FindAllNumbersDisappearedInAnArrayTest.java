package org.overmind;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/">448. Find All Numbers Disappeared in an Array</a> (Easy)
 * <p>
 * Find all numbers from 1 to n that do not appear in the array.
 */
public class FindAllNumbersDisappearedInAnArrayTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1});

    // then
    assertThat(result)
      .containsExactlyInAnyOrder(5, 6);
  }

  @Test
  void example2() {
    // when
    var result = solution.findDisappearedNumbers(new int[]{1, 1});

    // then
    assertThat(result)
      .containsExactlyInAnyOrder(2);
  }

  class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
      var n = nums.length;

      var hashSet = new HashSet<Integer>();

      for (var i = 0; i < n; i++) {
        hashSet.add(i + 1);
      }

      for (int num : nums) {
        hashSet.remove(num);
      }

      return hashSet.stream().toList();
    }
  }
}
