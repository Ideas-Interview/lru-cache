package com.example.cache;

/**
 * A stub for a thread-safe LRU Cache.
 *
 * @param <K> the type of keys
 * @param <V> the type of values
 */
public class LRUCache<K, V> {

    private final int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        // TODO: Initialize cache structures
    }

    /**
     * Retrieve a value from the cache.
     * @param key The key
     * @return The value if present, else null
     */
    public V get(K key) {
        // TODO: Implement LRU get logic
        return null;
    }

    /**
     * Insert or update a key-value pair in the cache.
     * @param key The key
     * @param value The value
     */
    public void put(K key, V value) {
        // TODO: Implement LRU put logic with eviction
    }

    /**
     * Returns the current number of elements in the cache.
     */
    public int size() {
        // TODO: Return current cache size
        return 0;
    }
}
