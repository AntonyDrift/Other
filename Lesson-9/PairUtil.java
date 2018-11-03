package com.company;



public final class PairUtil<K,V> {
    private K key;
    private V value;

    @Transaction(start = "fdfd", end = "dsdsd")
    public static <K,V> Pair <V,K> swap(Pair<K,V>swapper){
        return new Pair<V,K>(swapper.getValue(), swapper.getKey());
    }
}
