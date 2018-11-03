package com.company;

public class ReplaceStringMethod {

    private String str1 = "My: ( string:(";
    private String boring = ":(";
    private String happy = ":)";

    public void replaceString(){
        System.out.println("Before:     " + str1);
        String result = str1.replace(boring,happy);
        System.out.println("After:      " + result);
        }
    }

