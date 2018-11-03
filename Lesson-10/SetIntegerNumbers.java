package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetIntegerNumbers {
    Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
    Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5, 6));
    Set<Integer> result = new HashSet<>();

    public void print(){
        System.out.println(set1);
        System.out.println(set2);}

    public void addNums() {
        result.addAll(set1);
        result.addAll(set2);
        System.out.println(result);

    }

    public void retainNums(){
        set1.retainAll(set2);
        System.out.println(set1);

    }

}

