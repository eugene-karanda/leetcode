package org.overmind;

import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/maximum-number-of-balloons/">1189. Maximum Number of Balloons</a> (Easy)
 * <p>
 * Count how many times the word "balloon" can be formed from the letters of the text.
 */
public class MaximumNumberOfBalloonsTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.maxNumberOfBalloons("nlaebolko");

    // then
    assertThat(result)
      .isEqualTo(1);
  }

  @Test
  void example2() {
    // when
    var result = solution.maxNumberOfBalloons("loonbalxballpoon");

    // then
    assertThat(result)
      .isEqualTo(2);
  }

  @Test
  void example3() {
    // when
    var result = solution.maxNumberOfBalloons("leetcode");

    // then
    assertThat(result)
      .isEqualTo(0);
  }

  class Solution {
    public int maxNumberOfBalloons(String text) {
      Map<Integer, Integer> characters = "balloon".chars()
        .boxed()
        .collect(
          Collectors.groupingBy(
            Function.identity(),
            Collectors.summingInt(i -> 1)
          )
        );

      Map<Integer, Integer> countMap = text.chars()
        .filter(characters::containsKey)
        .boxed()
        .collect(
          Collectors.groupingBy(
            Function.identity(),
            Collectors.summingInt(i -> 1)
          )
        );

      if (countMap.size() != characters.size()) {
        return 0;
      }

      return countMap.entrySet().stream()
        .mapToInt(entry -> entry.getValue() / characters.get(entry.getKey()))
        .min()
        .orElse(0);
    }
  }
}
