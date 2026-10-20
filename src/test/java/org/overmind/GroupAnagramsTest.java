package org.overmind;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/group-anagrams/">49. Group Anagrams</a> (Medium)
 * <p>
 * Group the strings that are anagrams of each other.
 */
public class GroupAnagramsTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});

    // then
    assertThat(result)
      .map(group -> group.stream().sorted().toList())
      .containsExactlyInAnyOrder(List.of("bat"), List.of("nat", "tan"), List.of("ate", "eat", "tea"));
  }

  @Test
  void example2() {
    // when
    var result = solution.groupAnagrams(new String[]{""});

    // then
    assertThat(result)
      .containsExactly(List.of(""));
  }

  @Test
  void example3() {
    // when
    var result = solution.groupAnagrams(new String[]{"a"});

    // then
    assertThat(result)
      .containsExactly(List.of("a"));
  }

  class Solution {
    int[] primes = new int[] {
      2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101
    };

    public List<List<String>> groupAnagrams(String[] strs) {

      List<List<String>> result = new LinkedList<>();

      Map<Integer, List<String>> map = new HashMap<>();

      for (int i = 0, strsLength = strs.length; i < strsLength; i++) {
        String str = strs[i];
        int key = 1;

        char[] charArray = str.toCharArray();
        for (int i1 = 0, charArrayLength = charArray.length; i1 < charArrayLength; i1++) {
          char c = charArray[i1];
          key *= primes[c - 'a'];
        }

        List<String> list = map.get(key);

        if (list == null) {
          list = new LinkedList<>();
          map.put(key, list);
          result.add(list);
        }

        list.add(str);
      }

      return result;
    }
  }
}
