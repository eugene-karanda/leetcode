package org.overmind;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/rotating-the-box/">1861. Rotating the Box</a> (Medium)
 * <p>
 * Rotate the box 90 degrees clockwise so that stones {@code '#'} fall down until they hit an obstacle {@code '*'} or the bottom.
 */
public class RotatingTheBoxTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    // given
    var box = new char[][]{
      {'#', '#', '*', '.', '*', '.'},
      {'#', '#', '#', '*', '.', '.'},
      {'#', '#', '#', '.', '#', '.'}
    };

    // when
    var result = solution.rotateTheBox(box);

    // then
    assertThat(result)
      .isDeepEqualTo(new char[][]{
        {'.', '#', '#'},
        {'.', '#', '#'},
        {'#', '#', '*'},
        {'#', '*', '.'},
        {'#', '.', '*'},
        {'#', '.', '.'}
      });
  }

  class Solution {
    public char[][] rotateTheBox(char[][] box) {
      char[][] result = new char[box[0].length][box.length];

      for (int i = 0; i < box.length; i++) {
        var stones = 0;

        for (int j = 0; j < box[i].length; j++) {
          char item = box[i][j];

          if (item == '*') {
            result[j][box.length - i - 1] = '*';

            for (int stoneIndex = 0; stoneIndex < stones; stoneIndex++) {
              result[j - stoneIndex - 1][box.length - i - 1] = '#';
            }
            stones = 0;
          } else {
            result[j][box.length - i - 1] = '.';
          }

          if (item == '#') {
            stones++;
          }
        }

        for (int stoneIndex = 0; stoneIndex < stones; stoneIndex++) {
          result[box[i].length - stoneIndex - 1][box.length - i - 1] = '#';
        }
      }

      return result;
    }
  }
}
