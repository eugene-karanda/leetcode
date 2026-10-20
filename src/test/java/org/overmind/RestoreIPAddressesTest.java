package org.overmind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/restore-ip-addresses/">93. Restore IP Addresses</a> (Medium)
 * <p>
 * Return all valid IP addresses that can be formed by inserting dots into a string of digits.
 */
@Disabled
public class RestoreIPAddressesTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // when
    var result = solution.restoreIpAddresses("25525511135");

    // then
    assertThat(result)
      .containsExactlyInAnyOrder("255.255.11.135", "255.255.111.35");
  }

  @Test
  void example2() {
    // when
    var result = solution.restoreIpAddresses("0000");

    // then
    assertThat(result)
      .containsExactlyInAnyOrder("0.0.0.0");
  }

  @Test
  void example3() {
    // when
    var result = solution.restoreIpAddresses("101023");

    // then
    assertThat(result)
      .containsExactlyInAnyOrder("1.0.10.23", "1.0.102.3", "10.1.0.23", "10.10.2.3", "101.0.2.3");
  }

  class Solution {
    public List<String> restoreIpAddresses(String s) {
      throw new UnsupportedOperationException();
    }
  }
}
