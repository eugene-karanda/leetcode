package org.overmind;

import org.junit.jupiter.api.Test;

import java.util.concurrent.atomic.AtomicBoolean;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/print-foobar-alternately/">1115. Print FooBar Alternately</a> (Medium)
 * <p>
 * Make two threads print "foo" and "bar" alternately {@code n} times.
 */
public class PrintFooBarAlternatelyTest {

  @Test
  void example1() throws InterruptedException {
    // when
    var result = print(1);

    // then
    assertThat(result)
      .isEqualTo("foobar");
  }

  @Test
  void example2() throws InterruptedException {
    // when
    var result = print(2);

    // then
    assertThat(result)
      .isEqualTo("foobarfoobar");
  }

  private String print(int n) throws InterruptedException {
    var fooBar = new FooBar(n);
    var output = new StringBuffer();

    var foo = new Thread(() -> {
      try {
        fooBar.foo(() -> output.append("foo"));
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
      }
    });
    var bar = new Thread(() -> {
      try {
        fooBar.bar(() -> output.append("bar"));
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
      }
    });

    bar.start();
    foo.start();
    foo.join(1000);
    bar.join(1000);

    return output.toString();
  }

  class FooBar {
    private final int n;
    private final AtomicBoolean fooTurn = new AtomicBoolean(true);

    public FooBar(int n) {
      this.n = n;
    }

    public void foo(Runnable printFoo) throws InterruptedException {
      for (int i = 0; i < n; i++) {
        synchronized(fooTurn) {
          if(!fooTurn.get()) {
            fooTurn.wait();
          }

          printFoo.run();
          fooTurn.set(false);
          fooTurn.notify();
        }
      }
    }

    public void bar(Runnable printBar) throws InterruptedException {
      for (int i = 0; i < n; i++) {
        synchronized(fooTurn) {
          if (fooTurn.get()) {
            fooTurn.wait();
          }

          printBar.run();
          fooTurn.set(true);
          fooTurn.notify();
        }
      }
    }
  }
}
