package com.example.cache;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LRUCacheTest {

    @Test
    void testBasicPutAndGet() {
        LRUCache<Integer, String> cache = new LRUCache<>(3);
        cache.put(1, "One");
        assertEquals("One", cache.get(1));
    }

    @Test
    void testEviction() {
        LRUCache<Integer, String> cache = new LRUCache<>(2);
        cache.put(1, "One");
        cache.put(2, "Two");
        cache.put(3, "Three");

        assertNull(cache.get(1)); // LRU entry (1) should be evicted
    }

    // Add more tests as needed for thread-safety and corner cases
}
