package org.overmind;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/find-anagram-mappings/">760. Find Anagram Mappings</a> (Easy)
 * <p>
 * For every element of {@code A}, find the index of the same element in its anagram {@code B}.
 */
public class FindAnagramMappingsTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.anagramMappings(new int[]{12, 28, 46, 32, 50}, new int[]{50, 12, 32, 46, 28});

    // then
    assertThat(result)
      .containsExactly(1, 4, 3, 2, 0);
  }

  @Test
  void example2() {
    // when
    var result = solution.anagramMappings(new int[]{84, 46}, new int[]{84, 46});

    // then
    assertThat(result)
      .containsExactly(0, 1);
  }

  class Solution {
    public int[] anagramMappings(int[] A, int[] B) {
      int n = A.length;

      boolean[] used = new boolean[n];
      int[] P = new int[n];

      for(int i = 0; i < n; i++) {
        for(int j = 0; j < n; j++) {
          if(used[j]) {
            continue;
          }

          if(A[i] == B[j]) {
            P[i] = j;
            used[j] = true;
            break;
          }
        }
      }

      return P;
    }
  }
}
