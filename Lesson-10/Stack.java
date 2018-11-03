package com.company;

public class Stack {
    private int maxSize;
    private int[] stackArray;
    private int top;


    public Stack(int maxSize) {
        this.maxSize = maxSize;
        stackArray = new int[maxSize];
        top = 0;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public void addElement(int element) {
        if (top <= maxSize) {
            stackArray[++top] = element;
        } else
            System.out.println("Stack is overflow, plz delete top element!");
    }

    public int deleteElement() {
        if (top > 0) {
            stackArray[top] = 0;
            top--;
        }
        return stackArray[top];
    }

    public void viewStack() {
        System.out.println(top);
        System.out.print("Your stack is: ");
        for (int i = maxSize; i > 0; i--) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println("");

    }


}
