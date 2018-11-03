package com.company;

public class CheckStringForStartAndEnd {

    public boolean checkMyString(String myString, String word) {
        return myString.toLowerCase().endsWith(word)
                && myString.toLowerCase().startsWith(word);
    }
}
