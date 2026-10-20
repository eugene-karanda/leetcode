package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/simplify-path/">71. Simplify Path</a> (Medium)
 * <p>
 * Simplify an absolute Unix-style path to its canonical form.
 */
@Disabled
public class SimplifyPathTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.simplifyPath("/home/");

    // then
    assertThat(result)
      .isEqualTo("/home");
  }

  @Test
  void example2() {
    // when
    var result = solution.simplifyPath("/home//foo/");

    // then
    assertThat(result)
      .isEqualTo("/home/foo");
  }

  @Test
  void example3() {
    // when
    var result = solution.simplifyPath("/home/user/Documents/../Pictures");

    // then
    assertThat(result)
      .isEqualTo("/home/user/Pictures");
  }

  @Test
  void example4() {
    // when
    var result = solution.simplifyPath("/../");

    // then
    assertThat(result)
      .isEqualTo("/");
  }

  @Test
  void example5() {
    // when
    var result = solution.simplifyPath("/.../a/../b/c/../d/./");

    // then
    assertThat(result)
      .isEqualTo("/.../b/d");
  }

  class Solution {
    public String simplifyPath(String path) {
      throw new UnsupportedOperationException();
    }
  }
}
