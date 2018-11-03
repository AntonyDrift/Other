package com.company;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Polynomial {

    HashMap<Integer, Integer> polynomialMap1 = new HashMap<Integer, Integer>();
    HashMap<Integer, Integer> polynomialMap2 = new HashMap<Integer, Integer>();
    HashMap<Integer, Integer> polynomialMapSum = new HashMap<Integer, Integer>();
    Scanner scan = new Scanner(System.in);

    public void enterPolynomials() {

        System.out.print("Enter degree of polynomials: ");
        int enterDegree = scan.nextInt();

        for (int degree = 0; degree <= enterDegree; degree++) {
            char dx;
            dx = (char) (97 + degree);

            System.out.print("Enter " + dx + "=");

            int value = scan.nextInt();
            polynomialMap1.put(degree, value);
        }

        System.out.print("First polynomial is: ");

        for (int res1 = enterDegree; res1 >= 0; res1--) {
            if ((res1 != 0) && (res1 != 1)) {
                System.out.print(polynomialMap1.get(res1) + "x^" + res1 + " + ");
            } else if (res1 == 1) {
                System.out.print(polynomialMap1.get(1) + "x + ");
            } else if (res1 == 0) {
                System.out.println(polynomialMap1.get(0));
            }
        }


        for (int degree = 0; degree <= enterDegree; degree++) {
            char dx;
            dx = (char) (97 + degree);

            System.out.print("Enter " + dx + "=");

            int value = scan.nextInt();
            polynomialMap2.put(degree, value);
        }

        System.out.print("Second polynomial is: ");

        for (int res2 = enterDegree; res2 >= 0; res2--) {
            if ((res2 != 0) && (res2 != 1)) {
                System.out.print(polynomialMap2.get(res2) + "x^" + res2 + " + ");
            } else if (res2 == 1) {
                System.out.print(polynomialMap2.get(1) + "x + ");
            } else if (res2 == 0) {
                System.out.println(polynomialMap2.get(0));
            }
        }

        System.out.print("Sum of polynomials : ");

        for (int sum = enterDegree; sum >= 0; sum--) {
            polynomialMapSum.put(sum, polynomialMap1.get(sum) + polynomialMap2.get(sum));

            if ((sum != 0) && (sum != 1)) {
                System.out.print(polynomialMapSum.get(sum) + "x^" + sum + " + ");
            } else if (sum == 1) {
                System.out.print(polynomialMapSum.get(sum) + "x + ");
            } else if (sum == 0) {
                System.out.println(polynomialMapSum.get(sum));
            }
        }
    }
}








