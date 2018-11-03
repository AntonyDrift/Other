package com.company;

public class Runner{

    public static void main(String[] args) {

        ListAndMap runListAndMap = new ListAndMap();

        System.out.println("Size unique nums: " + runListAndMap.countUnique()+"\n****************");

        System.out.println("Is unique map? " + runListAndMap.isUnique()+"\n****************");

        Polynomial runPolynomial = new Polynomial();
        runPolynomial.enterPolynomials();
        System.out.println("\n\n********BLACK BOX********");

        BlackBox runBlackBox = new BlackBox();
        runBlackBox.addElement(12);
        runBlackBox.getminElement(8);
        runBlackBox.getMaxElement(1);
        runBlackBox.start();
    }
}
