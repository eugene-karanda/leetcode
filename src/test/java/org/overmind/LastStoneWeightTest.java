package org.overmind;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.ListIterator;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/last-stone-weight/">1046. Last Stone Weight</a> (Easy)
 * <p>
 * Smash the two heaviest stones together until at most one is left; return its weight.
 */
public class LastStoneWeightTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.lastStoneWeight(new int[]{2, 7, 4, 1, 8, 1});

    // then
    assertThat(result)
      .isEqualTo(1);
  }

  @Test
  void example2() {
    // when
    var result = solution.lastStoneWeight(new int[]{1});

    // then
    assertThat(result)
      .isEqualTo(1);
  }

  class Solution {

    public int lastStoneWeight(int[] stones) {
      for (int i = 0; i < stones.length - 1; i++) {
        for (int j = i + 1; j < stones.length; j++) {
          if(stones[i] < stones[j]) {
            int tmp = stones[i];
            stones[i] = stones[j];
            stones[j] = tmp;
          }
        }
      }

      LinkedList<Integer> list = new LinkedList<>();
      for (int stone : stones) {
        list.add(stone);
      }

      while (list.size() > 1) {
        int s1 = list.pollFirst();
        int s2 = list.pollFirst();

        int diff = s1 - s2;

        ListIterator<Integer> iterator = list.listIterator();

        while(true) {
          if (!iterator.hasNext()) {
            iterator.add(diff);
            break;
          }

          int next = iterator.next();
          if (next < diff) {
            iterator.previous();
            iterator.add(diff);
            break;
          }
        }
      }

      if(list.isEmpty()) {
        return 0;
      } else {
        return list.getFirst();
      }
    }
  }
}
