package org.overmind;

import org.junit.jupiter.api.Test;

import java.util.LinkedHashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/lru-cache/">146. LRU Cache</a> (Medium)
 * <p>
 * Design a least recently used (LRU) cache with O(1) get and put.
 */
public class LRUCacheTest {

  @Test
  void example1() {
    // given
    var cache = new LRUCache(2);

    // when
    cache.put(1, 1);
    cache.put(2, 2);

    // then
    assertThat(cache.get(1))
      .isEqualTo(1);

    // when
    cache.put(3, 3);

    // then
    assertThat(cache.get(2))
      .isEqualTo(-1);

    // when
    cache.put(4, 4);

    // then
    assertThat(cache.get(1))
      .isEqualTo(-1);
    assertThat(cache.get(3))
      .isEqualTo(3);
    assertThat(cache.get(4))
      .isEqualTo(4);
  }

  class LRUCache {

    private final LinkedHashMap<Integer, Integer> cache;

    public LRUCache(int capacity) {
      this.cache = new LinkedHashMap<>(capacity, 0.75f, true) {
        @Override
        protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
          return size() > capacity;
        }
      };
    }

    public int get(int key) {
      return cache.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
      cache.put(key, value);
    }
  }
}
