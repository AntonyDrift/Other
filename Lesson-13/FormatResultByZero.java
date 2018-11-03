package com.company;

import java.util.ArrayList;
import java.util.Date;
import java.util.Formatter;
import java.util.List;

public class FormatResultByZero {

    int enterNum = 123;
    StringBuilder strBuilder = new StringBuilder(10);
    StringBuffer strBuffer = new StringBuffer(10);
    String resultString;
    long timeVersion1;
    long timeVersion2;
    long timeVersion3;


    public void version1() {

        Date dateStart = new Date();
        String enterString = Integer.toString(enterNum);

        for (int i = 0; i < strBuilder.capacity(); i++) {
            strBuilder.append(0);
        }
        for (int n = 0; n < 1000; n++) {
            if (enterString.length() <= 10) {
                strBuilder.insert(10 - enterString.length(), enterString);
                strBuilder.delete(10, strBuilder.length());
                System.out.println("Result: " + strBuilder);
            } else System.out.println("Result: " + strBuilder);
        }
        Date dateEnd = new Date();
        timeVersion1 = (dateEnd.getTime() - dateStart.getTime());
    }

    public void version2() {

        Date dateStart = new Date();
        String enterString = Integer.toString(enterNum);

        for (int i = 0; i < strBuffer.capacity(); i++) {
            strBuffer.append(0);
        }

        for (int n = 0; n < 1000; n++) {
            if (enterString.length() <= 10) {
                strBuffer.insert(10 - enterString.length(), enterString);
                strBuffer.delete(10, strBuffer.length());
                System.out.println("Result: " + strBuffer);
            } else System.out.println("Result: " + strBuffer);
        }
        Date dateEnd = new Date();
        timeVersion2 = (dateEnd.getTime() - dateStart.getTime());
    }

    public void version3() {
        Date dateStart = new Date();
        Formatter formatString = new Formatter();
        String enterString = Integer.toString(enterNum);

        for (int n = 0; n < 1000; n++) {
            if (enterString.length() <= 10) {
                System.out.println(formatString.format("Result: %010d\n", enterNum));
            } else
                System.out.println(formatString.format("Result: %010d\n", 0));
        }
        Date dateEnd = new Date();
        timeVersion3 = (dateEnd.getTime() - dateStart.getTime());
    }


    public void comrareTimeVersions() {
        String stringbuilder = "StringBuilder time: " + timeVersion1;
        String stringbuffer = "StringBuffer time: " + timeVersion2;
        String formatter = "Formatter time: " + timeVersion3;

        List<Long>resultTime = new ArrayList<>();
        resultTime.add(timeVersion1);
        resultTime.add(timeVersion2);
        resultTime.add(timeVersion3);

        long count = resultTime.get(0);
        int resMin = 0;
        for (int i=0;i<resultTime.size();i++){
            if (resultTime.get(i)<count){
                resMin=i;
            }
        }
        switch (resMin){
           case 0:
                System.out.println(stringbuilder + "\nIt's fastest method!");break;
            case 1:
                System.out.println(stringbuffer + "\nIt's fastest method!");break;
            case 2:
                System.out.println(formatter + "\nIt's fastest method!");break;
                default:
                    System.out.println(stringbuilder+"\n"+stringbuffer+"\n"+formatter);
        }

    }
}

/*FROM 10000 TIMES HAD NEXT RESULT:
StringBuilder time: 439
StringBuffer time: 313
Formatter time: 267685
 */
