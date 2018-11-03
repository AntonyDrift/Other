package com.company;

public class CountWordsOnMyString {
    String task5MyString = "Hello, its  my STRING! October 2018.";

    public void CountWords(){
        System.out.println(task5MyString);
        String result = task5MyString.replaceAll("[a-zA-z]+","a");
        int count = 0;
        char charInt = 97;
        for (int i=0;i<result.length();i++){
            if (result.charAt(i)==charInt){
                count++;
            }
        }
       /* System.out.println(result);*/
        System.out.println("Amount of words on string: " + count);

    }
}
