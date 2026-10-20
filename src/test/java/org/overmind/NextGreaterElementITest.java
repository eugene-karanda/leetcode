package org.overmind;

import org.junit.jupiter.api.Test;

import java.util.ArrayDeque;
import java.util.HashMap;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/next-greater-element-i/">496. Next Greater Element I</a> (Easy)
 * <p>
 * For every element of {@code nums1}, find the next greater element to its right in {@code nums2}.
 */
public class NextGreaterElementITest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.nextGreaterElement(new int[]{4, 1, 2}, new int[]{1, 3, 4, 2});

    // then
    assertThat(result)
      .containsExactly(-1, 3, -1);
  }

  @Test
  void example2() {
    // when
    var result = solution.nextGreaterElement(new int[]{2, 4}, new int[]{1, 2, 3, 4});

    // then
    assertThat(result)
      .containsExactly(3, -1);
  }

  class Solution {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
      var hashMap = new HashMap<Integer, Integer>(nums2.length);
      var stack = new ArrayDeque<Integer>();

      for (int i = 0; i < nums2.length; i++) {
        while (!stack.isEmpty() && nums2[i] > stack.peek()) {
          hashMap.put(stack.pop(), nums2[i]);
        }

        stack.push(nums2[i]);
      }

      var result = new int[nums1.length];

      for (int i = 0; i < nums1.length; i++) {
        result[i] = hashMap.getOrDefault(nums1[i], -1);
      }

      return result;
    }
  }
}
