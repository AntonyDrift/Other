package com.company;

public class Runner {

    public static void main(String[] args) {
        SumOfStrings runTask1 = new SumOfStrings();
        runTask1.sumByPlus();
        System.out.println("********finish 1st by Plus********");
        runTask1.sumByStringBuilder();
        System.out.println("********finish 1st by StrinBuilder********");

        ReplaceStringMethod runTask2 = new ReplaceStringMethod();
        runTask2.replaceString();
        System.out.println("********finish 2nd********");

        CheckStringForStartAndEnd runTask3 = new CheckStringForStartAndEnd();
        String myString = "Hi, its my string. Hi-hi";
        String word = "hi";
        System.out.println(runTask3.checkMyString(myString, word));
        System.out.println("********finish 3rd********");

        String surname = "zhurkov";
        String firstname = "anton";
        String patronymic = "olegovich";
        NameSurname runTask4 = new NameSurname();
        System.out.println(runTask4.fio(surname,firstname,patronymic));
        System.out.println("********finish 4th********");

        CountWordsOnMyString runTask5 = new CountWordsOnMyString();
        runTask5.CountWords();
        System.out.println("********finish 5th********");

        MyLoooongString runTask6 = new MyLoooongString();
        System.out.println(runTask6.printResult());
        System.out.println("********finish 6th********");

        FormatResultByZero runTask7 = new FormatResultByZero();
        runTask7.version1();
        runTask7.version2();
        runTask7.version3();
        runTask7.comrareTimeVersions();
        System.out.println("********finish 7th********");
    }
}
