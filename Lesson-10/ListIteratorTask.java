package com.company;



import java.util.*;

public class ListIteratorTask {

    List<Integer> arrayMarkList = new ArrayList<>();
    List<String> arrayPupilListV1 = new ArrayList<>();
    List<String> arrayPupilListV2 = new ArrayList<>();



    public void printMarkList() {

        for (int i = 0; i < 7; i++) {
            int a = 0 + (int) (Math.random() * (10 - 0) + 1);
            arrayMarkList.add(a);
        }
        System.out.println("List mark: " + arrayMarkList);
    }

    public void negativeMarks() {

        ListIterator<Integer> markList = arrayMarkList.listIterator();

        while (markList.hasNext()) {
            if (markList.next() < 4) {
                markList.remove();
            }
        }
        System.out.println("List without negative marks: " + arrayMarkList);
    }

    public void maxMark() {

        ListIterator<Integer> markList = arrayMarkList.listIterator();

        int maxValue = markList.next();

        while (markList.hasNext()) {
            if (maxValue < markList.next()) {
                maxValue = markList.previous();
            }
        }
        System.out.println("Max value mark: " + maxValue);
    }

    public void reversePrintVersion1() {

        arrayPupilListV1.add("Anton");
        arrayPupilListV1.add("Andrey");
        arrayPupilListV1.add("Yaroslav");
        arrayPupilListV1.add("Vadim");
        arrayPupilListV1.add("Aleksei");
        arrayPupilListV1.add("Marina");
        arrayPupilListV1.add("Oksana");

        System.out.println("Print pupil list: ");

        for (int i = 0; i < arrayPupilListV1.size(); i++) {
            System.out.print(arrayPupilListV1.get(i) + " ");
        }
        System.out.println("\nPrint reverse pupil list version #1: ");

        Collections.reverse(arrayPupilListV1);
        for (int i = 0; i < arrayPupilListV1.size(); i++) {
            System.out.print(arrayPupilListV1.get(i) + " ");
        }
    }

        public void reversePrintVersion2(){

            arrayPupilListV2.add("Anton");
            arrayPupilListV2.add("Andrey");
            arrayPupilListV2.add("Yaroslav");
            arrayPupilListV2.add("Vadim");
            arrayPupilListV2.add("Aleksei");
            arrayPupilListV2.add("Marina");
            arrayPupilListV2.add("Oksana");

            System.out.println("\nPrint reverse pupil list version #2: ");

            for (int i = arrayPupilListV2.size()-1; i>=0; i--){
                String reverse = arrayPupilListV2.get(i);
                System.out.print(reverse + " ");
            }
            System.out.println("");

        }
    }






