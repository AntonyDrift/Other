package com.company;

import java.util.*;

public class BlackBox {

    private Integer[] enterNums = new Integer[]{-3, 2, 10, 6, -6, 4, 9, -7, 13};
    List<Integer> list = new ArrayList<>(Arrays.asList(enterNums));


    public void addElement(int element) {

        System.out.println("First list:" + list + "\n");

        list.add(element);
    }

    public void getminElement(int kToMin) {

        List<Integer> minList = new ArrayList<>(list);
        Collections.sort(minList);

        System.out.println("Min list:" + minList + "\n");

        for (int i = 0; i < minList.size(); i++) {
            if (i == kToMin - 1) {
                switch (kToMin % 10) {
                    case 1:
                        System.out.println("Your " + kToMin + "st minimal value = " + minList.get(i) + "\n");
                        break;
                    case 2:
                        System.out.println("Your " + kToMin + "nd minimal value = " + minList.get(i) + "\n");
                        break;
                    case 3:
                        System.out.println("Yours " + kToMin + "rd minimal value = " + minList.get(i) + "\n");
                        break;
                    default:
                        System.out.println("Yours " + kToMin + "th minimal value = " + minList.get(i) + "\n");
                        break;
                }
            }
        }
    }

    public void getMaxElement(int nToMax) {

        List<Integer> minList = new ArrayList<>(list);
        Collections.sort(minList);
        List<Integer> maxList = new ArrayList<>(minList);
        Collections.reverse(maxList);

        System.out.println("Max list:" + maxList + "\n");

        for (int i = 0; i < maxList.size(); i++) {
            if (i == nToMax - 1) {
                switch (nToMax % 10) {
                    case 1:
                        System.out.println("Your " + nToMax + "st minimal value = " + maxList.get(i) + "\n");
                        break;
                    case 2:
                        System.out.println("Your " + nToMax + "nd minimal value = " + maxList.get(i) + "\n");
                        break;
                    case 3:
                        System.out.println("Yours " + nToMax + "rd minimal value = " + maxList.get(i) + "\n");
                        break;
                    default:
                        System.out.println("Yours " + nToMax + "th minimal value = " + maxList.get(i) + "\n");
                        break;
                }
            }
        }
    }

    public void start() {

        System.out.println("Last list:" + list + "\n");
    }
}


