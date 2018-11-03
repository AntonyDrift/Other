package com.company;

import javax.sound.midi.Soundbank;

public class ClassForGenerics implements InterfaceForGenerics {

    private Number number;

    ClassForGenerics(Number number) {
        this.number = number;
    }

    public Number getNumber() {
        return number;
    }

    public void setNumber(Number number) {
        this.number = number;
    }

    public void test() {
        if (number instanceof Integer) {
            System.out.println("integer type");
        } else if (number instanceof Float) {
            System.out.println("float type");
        } else System.out.println("bad");
    }
}

