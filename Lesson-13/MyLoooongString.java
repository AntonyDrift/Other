package com.company;

public class MyLoooongString {

    String str = "My looooong     11112222 striing";

    public String printResult(){
        return str.replaceAll("(.)(\\1{1,})", "$1");
    }
}
