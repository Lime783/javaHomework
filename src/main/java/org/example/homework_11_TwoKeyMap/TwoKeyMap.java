package org.example.homework_11_TwoKeyMap;

public interface TwoKeyMap<K1, K2, V> extends Iterable<TwoKeyMap.Entry<K1, K2, V>> {

    // podstawowe operacje
    void put(K1 k1, K2 k2, V value);
    V get(K1 k1, K2 k2);
    void remove(K1 k1, K2 k2);

    // Zapytania/inspekcja
    void containsKeys(K1 k1, K2 k2);
    int size();
    boolean isEmpty();

    // Widoki i iteracja
    java.util.Set<Entry<K1, K2, V>> entrySet();
    java.util.Set<Pair<K1, K2>> keySet();
    java.util.Collection<V> values();

    // Operacje masowe
    void clear();

    // Typy pomocnicze
    interface Entry<K1, K2, V> {
        K1 getKey1();
        K2 getKey2();
        V getValue();
    }
}
