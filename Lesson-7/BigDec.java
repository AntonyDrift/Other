package com.company;

import java.math.BigDecimal;

public class BigDec {
    int a;
    double b;

    public BigDec(int a, double b) {
        this.a = a;
        this.b = b;
    }

    void print() {
        System.out.println("Начальные значения: " + a + " и " + b);
        System.out.println();
    }

    BigDecimal devideAsBigDecimal() {
        BigDecimal aa = new BigDecimal(a);
        BigDecimal bb = BigDecimal.valueOf(b);
        BigDecimal res = aa.divide(bb, 10, BigDecimal.ROUND_HALF_UP);
        return res;
    }

    Double devideAsDouble() {
        Double res = (double) a / b;
        return res;
    }

    Integer devideAsInteger() {
        Integer res = a / (int) b;
        return res;
    }

    BigDecimal sumAsBigDecimal() {
        BigDecimal aa = BigDecimal.valueOf(a);
        BigDecimal bb = BigDecimal.valueOf(b);
        BigDecimal res = aa.add(bb);
        return res;
    }

    Double sumAsDouble() {
        Double res = (double) a + b;
        return res;
    }

    Integer sumAsInteger() {
        Integer res = a + (int) b;
        return res;
    }

    BigDecimal multiplyAsBigDecimal() {
        BigDecimal aa = BigDecimal.valueOf(a);
        BigDecimal bb = BigDecimal.valueOf(b);
        BigDecimal res = aa.multiply(bb);
        return res;
    }

    Double multiplyAsDouble() {
        Double res = (double) a * b;
        return res;
    }

    Integer multiplyAsInteger() {
        Integer res = a * (int) b;
        return res;
    }

    BigDecimal subtractAsBigDecimal() {
        BigDecimal aa = new BigDecimal(a);
        BigDecimal bb = new BigDecimal(b);
        BigDecimal res = aa.subtract(bb);
        return res.setScale(6, BigDecimal.ROUND_CEILING); //Ради эксперемента:)
    }

    Double subtractAsDouble() {
        Double res = (double) a - b;
        return res;
    }

    Integer subtractAsInteger() {
        Integer res = a - (int) b;
        return res;
    }

    BigDecimal maxAsBigDecimal() {
        BigDecimal aa = BigDecimal.valueOf(a);
        BigDecimal bb = BigDecimal.valueOf(b);
        BigDecimal res = aa.max(bb);
        return res;
    }

    BigDecimal minAsBigDecimal() {
        BigDecimal aa = BigDecimal.valueOf(a);
        BigDecimal bb = BigDecimal.valueOf(b);
        BigDecimal res = aa.min(bb);
        return res;
    }
}

class Runner {
    public static void main(String[] args) {
        BigDec Run = new BigDec(444, 21.33);
        Run.print();
        System.out.println("Деление в BigDecimal: \t" + Run.devideAsBigDecimal());
        System.out.println("Деление в Double:     \t" + Run.devideAsDouble());
        System.out.println("Деление в Integer:    \t" + Run.devideAsInteger());
        System.out.println();
        System.out.println("Сумма в BigDecimal: \t" + Run.sumAsBigDecimal());
        System.out.println("Сумма в в Double:   \t" + Run.sumAsDouble());
        System.out.println("Сумма в Integer:    \t" + Run.sumAsInteger());
        System.out.println();
        System.out.println("Произведение в BigDecimal: \t" + Run.multiplyAsBigDecimal());
        System.out.println("Произведение в в Double:   \t" + Run.multiplyAsDouble());
        System.out.println("Произведение в Integer:    \t" + Run.multiplyAsInteger());
        System.out.println();
        System.out.println("Вычитание в BigDecimal: \t" + Run.subtractAsBigDecimal());
        System.out.println("Вычитание в Double:     \t" + Run.subtractAsDouble());
        System.out.println("Вычитание в Integer:    \t" + Run.subtractAsInteger());
        System.out.println();
        System.out.println("MAX в BigDecimal:\t" + Run.maxAsBigDecimal());
        System.out.println("MIN в BigDecimal:\t" + Run.minAsBigDecimal());

    }
}
