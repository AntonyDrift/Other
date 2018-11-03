package com.company;

import java.util.ArrayList;
import java.util.List;

public class Task7 {

    public static void main() {

        List<Integer> numsList = new ArrayList<>();

        numsList.add(10);
        numsList.add(-6);
        numsList.add(12);
        numsList.add(6);
        numsList.add(-99);
        numsList.add(44);
        numsList.add(-60);



        System.out.println(numsList);


        int count = numsList.size();
        int replace = 0;

        for (int i = 0; i < count-replace; i++) {
            if (numsList.get(i) < 0) {
                numsList.add(numsList.get(i));
                numsList.remove(numsList.get(i));
                replace++;
            }
            }
        System.out.println(numsList);
        }
    }




