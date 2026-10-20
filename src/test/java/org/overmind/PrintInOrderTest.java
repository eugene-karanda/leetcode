package org.overmind;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/print-in-order/">1114. Print in Order</a> (Easy)
 * <p>
 * Make three threads print "first", "second" and "third" in order, whatever order they are started in.
 */
public class PrintInOrderTest {

  @Test
  void example1() throws InterruptedException {
    // when
    var result = print(1, 2, 3);

    // then
    assertThat(result)
      .isEqualTo("firstsecondthird");
  }

  @Test
  void example2() throws InterruptedException {
    // when
    var result = print(1, 3, 2);

    // then
    assertThat(result)
      .isEqualTo("firstsecondthird");
  }

  private String print(int... order) throws InterruptedException {
    var foo = new Foo();
    var output = new StringBuffer();
    var threads = new ArrayList<Thread>();

    for (int method : order) {
      threads.add(new Thread(() -> {
        try {
          switch (method) {
            case 1 -> foo.first(() -> output.append("first"));
            case 2 -> foo.second(() -> output.append("second"));
            case 3 -> foo.third(() -> output.append("third"));
          }
        } catch (InterruptedException e) {
          Thread.currentThread().interrupt();
        }
      }));
    }

    threads.forEach(Thread::start);
    for (var thread : threads) {
      thread.join(1000);
    }

    return output.toString();
  }

  class Foo {

    private final AtomicBoolean waiter1 = new AtomicBoolean(false);
    private final AtomicBoolean waiter2 = new AtomicBoolean(false);

    public Foo() {

    }

    public void first(Runnable printFirst) throws InterruptedException {
      printFirst.run();

      synchronized (waiter1) {
        waiter1.set(true);
        waiter1.notifyAll();
      }
    }

    public void second(Runnable printSecond) throws InterruptedException {
      synchronized (waiter1) {
        if (!waiter1.get()) {
          waiter1.wait();
        }
      }

      printSecond.run();

      synchronized (waiter2) {
        waiter2.set(true);
        waiter2.notifyAll();
      }
    }

    public void third(Runnable printThird) throws InterruptedException {
      synchronized (waiter1) {
        if (!waiter1.get()) {
          waiter1.wait();
        }
      }

      synchronized (waiter2) {
        if (!waiter2.get()) {
          waiter2.wait();
        }
      }

      printThird.run();
    }
  }
}
