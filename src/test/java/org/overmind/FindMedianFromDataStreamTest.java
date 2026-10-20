package org.overmind;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.Optional;
import java.util.PriorityQueue;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;

/**
 * <a href="https://leetcode.com/problems/find-median-from-data-stream/">295. Find Median from Data Stream</a> (Hard)
 * <p>
 * Implement a data structure that accepts a stream of numbers and returns the median of all elements added so far.
 */
public class FindMedianFromDataStreamTest {

  @Test
  void example1() {
    // given
    var medianFinder = new MedianFinder();

    // when
    medianFinder.addNum(1);
    medianFinder.addNum(2);

    // then
    assertThat(medianFinder.findMedian())
      .isCloseTo(1.5, within(1e-5));

    // when
    medianFinder.addNum(3);

    // then
    assertThat(medianFinder.findMedian())
      .isCloseTo(2.0, within(1e-5));
  }

  @Test
  void example2() {
    var medianFinder = new MedianFinder();

    medianFinder.addNum(40);
    assertThat(medianFinder.findMedian()).isCloseTo(40.00000, within(1e-5));
    medianFinder.addNum(12);
    assertThat(medianFinder.findMedian()).isCloseTo(26.00000, within(1e-5));
    medianFinder.addNum(16);
    assertThat(medianFinder.findMedian()).isCloseTo(16.00000, within(1e-5));
    medianFinder.addNum(14);
    assertThat(medianFinder.findMedian()).isCloseTo(15.00000, within(1e-5));
    medianFinder.addNum(35);
    assertThat(medianFinder.findMedian()).isCloseTo(16.00000, within(1e-5));
    medianFinder.addNum(19);
    assertThat(medianFinder.findMedian()).isCloseTo(17.50000, within(1e-5));
    medianFinder.addNum(34);
    assertThat(medianFinder.findMedian()).isCloseTo(19.00000, within(1e-5));
    medianFinder.addNum(35);
    assertThat(medianFinder.findMedian()).isCloseTo(26.50000, within(1e-5));
    medianFinder.addNum(28);
    assertThat(medianFinder.findMedian()).isCloseTo(28.00000, within(1e-5));
    medianFinder.addNum(35);
    assertThat(medianFinder.findMedian()).isCloseTo(31.00000, within(1e-5));
    medianFinder.addNum(26);
    assertThat(medianFinder.findMedian()).isCloseTo(28.00000, within(1e-5));
    medianFinder.addNum(6);
    assertThat(medianFinder.findMedian()).isCloseTo(27.00000, within(1e-5));
    medianFinder.addNum(8);
    assertThat(medianFinder.findMedian()).isCloseTo(26.00000, within(1e-5));
    medianFinder.addNum(2);
    assertThat(medianFinder.findMedian()).isCloseTo(22.50000, within(1e-5));
    medianFinder.addNum(14);
    assertThat(medianFinder.findMedian()).isCloseTo(19.00000, within(1e-5));
    medianFinder.addNum(25);
    assertThat(medianFinder.findMedian()).isCloseTo(22.00000, within(1e-5));
    medianFinder.addNum(25);
    assertThat(medianFinder.findMedian()).isCloseTo(25.00000, within(1e-5));
    medianFinder.addNum(4);
    assertThat(medianFinder.findMedian()).isCloseTo(22.00000, within(1e-5));
    medianFinder.addNum(33);
    assertThat(medianFinder.findMedian()).isCloseTo(25.00000, within(1e-5));
    medianFinder.addNum(18);
    assertThat(medianFinder.findMedian()).isCloseTo(22.00000, within(1e-5));
    medianFinder.addNum(10);
    assertThat(medianFinder.findMedian()).isCloseTo(19.00000, within(1e-5));
    medianFinder.addNum(14);
    assertThat(medianFinder.findMedian()).isCloseTo(18.50000, within(1e-5));
    medianFinder.addNum(27);
    assertThat(medianFinder.findMedian()).isCloseTo(19.00000, within(1e-5));
    medianFinder.addNum(3);
    assertThat(medianFinder.findMedian()).isCloseTo(18.50000, within(1e-5));
    medianFinder.addNum(35);
    assertThat(medianFinder.findMedian()).isCloseTo(19.00000, within(1e-5));
    medianFinder.addNum(13);
    assertThat(medianFinder.findMedian()).isCloseTo(18.50000, within(1e-5));
    medianFinder.addNum(24);
    assertThat(medianFinder.findMedian()).isCloseTo(19.00000, within(1e-5));
    medianFinder.addNum(27);
    assertThat(medianFinder.findMedian()).isCloseTo(21.50000, within(1e-5));
    medianFinder.addNum(14);
    assertThat(medianFinder.findMedian()).isCloseTo(19.00000, within(1e-5));
    medianFinder.addNum(5);
    assertThat(medianFinder.findMedian()).isCloseTo(18.50000, within(1e-5));
    medianFinder.addNum(0);
    assertThat(medianFinder.findMedian()).isCloseTo(18.00000, within(1e-5));
    medianFinder.addNum(38);
    assertThat(medianFinder.findMedian()).isCloseTo(18.50000, within(1e-5));
    medianFinder.addNum(19);
    assertThat(medianFinder.findMedian()).isCloseTo(19.00000, within(1e-5));
    medianFinder.addNum(25);
    assertThat(medianFinder.findMedian()).isCloseTo(19.00000, within(1e-5));
    medianFinder.addNum(11);
    assertThat(medianFinder.findMedian()).isCloseTo(19.00000, within(1e-5));
    medianFinder.addNum(14);
    assertThat(medianFinder.findMedian()).isCloseTo(18.50000, within(1e-5));
    medianFinder.addNum(31);
    assertThat(medianFinder.findMedian()).isCloseTo(19.00000, within(1e-5));
    medianFinder.addNum(30);
    assertThat(medianFinder.findMedian()).isCloseTo(19.00000, within(1e-5));
    medianFinder.addNum(11);
    assertThat(medianFinder.findMedian()).isCloseTo(19.00000, within(1e-5));
    medianFinder.addNum(31);
    assertThat(medianFinder.findMedian()).isCloseTo(19.00000, within(1e-5));
    medianFinder.addNum(0);
    assertThat(medianFinder.findMedian()).isCloseTo(19.00000, within(1e-5));
  }

  class MedianFinder {
    private Optional<Integer> median;
    private final PriorityQueue<Integer> left;
    private final PriorityQueue<Integer> right;

    public MedianFinder() {
      median = Optional.empty();
      left = new PriorityQueue<>(Comparator.reverseOrder());
      right = new PriorityQueue<>(Comparator.naturalOrder());
    }

    public void addNum(int num) {
      median.ifPresentOrElse(
        m -> {
          if (num > m) {
            left.add(m);
            right.add(num);
          } else {
            left.add(num);
            right.add(m);
          }

          median = Optional.empty();
        },
        () -> {
          if (left.isEmpty()) {
            median = Optional.of(num);
          } else if (num < left.peek()) {
            left.add(num);
            median = Optional.of(left.poll());
          } else {
            right.add(num);
            median = Optional.of(right.poll());
          }
        }
      );
    }

    public double findMedian() {
      return median.map(Integer::doubleValue)
        .orElseGet(() -> ((double) left.peek() + (double) right.peek()) / 2.0);
    }
  }
}
