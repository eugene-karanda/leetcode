package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/compare-version-numbers/">165. Compare Version Numbers</a> (Medium)
 * <p>
 * Compare two version numbers.
 */
@Disabled
public class CompareVersionNumbersTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.compareVersion("1.2", "1.10");

    // then
    assertThat(result)
      .isEqualTo(-1);
  }

  @Test
  void example2() {
    // when
    var result = solution.compareVersion("1.01", "1.001");

    // then
    assertThat(result)
      .isEqualTo(0);
  }

  @Test
  void example3() {
    // when
    var result = solution.compareVersion("1.0", "1.0.0.0");

    // then
    assertThat(result)
      .isEqualTo(0);
  }

  class Solution {
    public int compareVersion(String version1, String version2) {
      throw new UnsupportedOperationException();
    }
  }
}
