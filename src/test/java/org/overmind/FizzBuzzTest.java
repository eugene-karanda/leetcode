package org.overmind;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/fizz-buzz/">412. Fizz Buzz</a> (Easy)
 * <p>
 * Return the FizzBuzz sequence from 1 to {@code n}.
 */
public class FizzBuzzTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.fizzBuzz(3);

    // then
    assertThat(result)
      .containsExactly("1", "2", "Fizz");
  }

  @Test
  void example2() {
    // when
    var result = solution.fizzBuzz(5);

    // then
    assertThat(result)
      .containsExactly("1", "2", "Fizz", "4", "Buzz");
  }

  @Test
  void example3() {
    // when
    var result = solution.fizzBuzz(15);

    // then
    assertThat(result)
      .containsExactly("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz");
  }

  class Solution {
    public List<String> fizzBuzz(int n) {
      ArrayList<String> result = new ArrayList<>();

      for (int i = 1; i <= n; i++) {
        if(i % 15 == 0) {
          result.add("FizzBuzz");
        } else if(i % 5 == 0) {
          result.add("Buzz");
        } else if(i % 3 == 0){
          result.add("Fizz");
        } else {
          result.add(Integer.toString(i));
        }
      }

      return result;
    }
  }
}
