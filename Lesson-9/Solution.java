package com.company;


import java.lang.reflect.Method;

public class Solution <T extends ClassForGenerics & InterfaceForGenerics> {
    T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public static void main(String[] args) {

        Pair<String, Integer> pair = new Pair<>("First key", 1);
        System.out.println(pair.getKey() + " " + pair.getValue());

        Pair<Integer, String> swappedPair = PairUtil.swap(pair);
        System.out.println(swappedPair.getKey() + " " + swappedPair.getValue());

        Solution<ClassForGenerics> solution = new Solution<>();
        ClassForGenerics classForGenerics = new ClassForGenerics(14F);
        classForGenerics.test();



        Solution<?> solution1 = new Solution<>();
        solution1.testAnnotation(Pair.class);
    }

    public void testAnnotation(Class cls) {
        for (Method m : cls.getDeclaredMethods()) {
            if (m.isAnnotationPresent(Transaction.class)) {
                Transaction annotation = m.getAnnotation(Transaction.class);
                String start = annotation.start();
                String end = annotation.end();
                System.out.println(start +" " + end);

            } else System.out.println("Method with annotation is not found");break;
        }
    }
}