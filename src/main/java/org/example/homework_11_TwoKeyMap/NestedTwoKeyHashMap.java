package org.example.homework_11_TwoKeyMap;

import java.util.*;

public class NestedTwoKeyHashMap<K1, K2, V> implements TwoKeyMap<K1, K2, V> {

    private final Map<K1, Map<K2, V>> data = new HashMap<>();
    private int size = 0;

    @Override
    public void put(K1 k1, K2 k2, V value) {
        Objects.requireNonNull(k1, "k1 is null");
        Objects.requireNonNull(k2, "k2 is null");
        Objects.requireNonNull(value, "value is null");
        Map<K2, V> innerMap = data.computeIfAbsent(k1, k -> new HashMap<>());

        if (!(innerMap.containsKey(k2))) {
            size++;
        }

        innerMap.put(k2, value);
    }

    @Override
    public V get(K1 k1, K2 k2) {
        Objects.requireNonNull(k1, "k1 is null");
        Objects.requireNonNull(k2, "k2 is null");
        containsKeys(k1, k2);
        return data.get(k1).get(k2);
    }

    @Override
    public void remove(K1 k1, K2 k2) {
        Objects.requireNonNull(k1, "k1 is null");
        Objects.requireNonNull(k2, "k2 is null");
        containsKeys(k1, k2);
        data.get(k1).remove(k2);
        size--;
    }

    @Override
    public void containsKeys(K1 k1, K2 k2) {
        Objects.requireNonNull(k1, "k1 is null");
        Objects.requireNonNull(k2, "k2 is null");
        if (!(data.containsKey(k1))) {
            throw new IllegalArgumentException("There's no key: " + k1);
        } else if (!(data.get(k1).containsKey(k2))) {
            throw new IllegalArgumentException("Key: " + k1 + " doesn't have subkey: " + k2);
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public Set<Entry<K1, K2, V>> entrySet() {
        HashSet<Entry<K1, K2, V>> setOfEntries = new HashSet<>();
        for (Map.Entry<K1, Map<K2, V>> outerMap : data.entrySet()) {
            for (Map.Entry<K2, V> innerMap : outerMap.getValue().entrySet()) {
                K1 keyOuter = outerMap.getKey();
                K2 keyInner = innerMap.getKey();
                V value = innerMap.getValue();
                setOfEntries.add(new OneEntry(keyOuter, keyInner, value));
            }
        }
        return setOfEntries;
    }

    @Override
    public Set<Pair<K1, K2>> keySet() {
        HashSet<Pair<K1, K2>> setOfDoubleKeys = new HashSet<>();
        for (Map.Entry<K1, Map<K2, V>> outerMap : data.entrySet()) {
            for (Map.Entry<K2, V> innerMap : outerMap.getValue().entrySet()) {
                K1 keyOuter = outerMap.getKey();
                K2 keyInner = innerMap.getKey();
                Pair<K1, K2> pair = new Pair<>(keyOuter, keyInner);
                setOfDoubleKeys.add(pair);
            }
        }
        return setOfDoubleKeys;
    }

    @Override
    public Collection<V> values() {
        ArrayList<V> listOfValues = new ArrayList<>();
        for (Map.Entry<K1, Map<K2, V>> outerMap : data.entrySet()) {
            for (Map.Entry<K2, V> innerMap : outerMap.getValue().entrySet()) {
                V value = innerMap.getValue();
                listOfValues.add(value);
            }
        }
        return listOfValues;
    }

    @Override
    public void clear() {
        data.clear();
        size = 0;
    }

    @Override
    public Iterator<Entry<K1, K2, V>> iterator() {
        return entrySet().iterator();
    }

    private class OneEntry implements TwoKeyMap.Entry<K1, K2, V> {
        private final K1 key1;
        private final K2 key2;
        private V value;

        public OneEntry(K1 key1, K2 key2, V value) {
            this.key1 = key1;
            this.key2 = key2;
            this.value = value;
        }

        @Override
        public K1 getKey1() {
            return key1;
        }

        @Override
        public K2 getKey2() {
            return key2;
        }

        @Override
        public V getValue() {
            return value;
        }

        @Override
        public String toString() {
            return "OneEntry{" +
                    "key1=" + key1 +
                    ", key2=" + key2 +
                    ", value=" + value +
                    '}';
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<K1, Map<K2, V>> outerMap : data.entrySet()) {
            for (Map.Entry<K2, V> innerMap : outerMap.getValue().entrySet()) {
                K1 keyOuter = outerMap.getKey();
                K2 keyInner = innerMap.getKey();
                V value = innerMap.getValue();
                sb.append(keyOuter).append(" -> ").append(keyInner).append(" -> ").append(value).append("\n");
            }
        }
        return sb.toString();
    }
}