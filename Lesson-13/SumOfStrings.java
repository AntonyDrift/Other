package com.company;

import java.util.Date;

public class SumOfStrings {

    private String str1 = "Hello";
    private String str2 = " Java";
    private String str3 = " World";

    public void sumByPlus(){
        Date dateStart = new Date();
        for (int i=0;i<10000;i++) {
            String result1 = str1 + str2 + str3;
            System.out.println(result1);
        }
        Date dateEnd = new Date();
        System.out.println("Speedtime sumByPlus: " + (dateEnd.getTime() - dateStart.getTime()));
    }

    public void sumByStringBuilder(){
        Date dateStart = new Date();
        for (int i=0;i<10000;i++) {
            StringBuilder strBuilder = new StringBuilder();
            String result2 = strBuilder.append(str1).append(str2).append(str3).toString();
            System.out.println(result2);
        }
        Date dateEnd = new Date();
        System.out.println("Speedtime sumByStringBuilder: " + (dateEnd.getTime() - dateStart.getTime()));
    }

}
