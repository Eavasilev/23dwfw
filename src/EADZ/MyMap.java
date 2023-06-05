package EADZ;

import java.util.Collections;
import java.util.HashMap;


public class MyMap<K, V> extends HashMap<K, V> {
    @Override
    public V get(Object key) {
        if (super.get(key) == null)
        return (V)Collections.<String>emptyList();
        else
            return super.get(key);
        }
}