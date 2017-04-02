package ru.schernigin.map;

import java.util.*;
import java.util.Map;

/**
 * Created by USER on 30.03.2017.
 */
public class SimpleRUCache<K, V> extends LinkedHashMap<K, V> {
    private final int capacsity;

    public SimpleRUCache(int capacsity) {
        super(capacsity + 1, 1.1f, true);
        this.capacsity = capacsity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest){
        return this.size() > capacsity;
    }
}
