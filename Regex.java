package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {



    public void checkEmail(String enterEmailAdress) {
        Pattern p = Pattern.compile("^[a-zA-Z]+\\w+[@]+[a-zA-Z]+(.com)$|(.org)$+");
        Matcher m = p.matcher(enterEmailAdress);
        System.out.println(m.find());
    }

    public void checkHexNumber(String enterHexNumber) {
        Pattern p = Pattern.compile("[0][xX][0-9a-fA-F]");
        Matcher m = p.matcher(enterHexNumber);
        while (m.find()) {
            System.out.print(m.group() + " ");
        }
    }

    public void checkParagraphTag(String enterParagraphTag){
        Pattern p = Pattern.compile("(<p{1}[^>]*)");
        Matcher m = p.matcher(enterParagraphTag);
        String result = m.replaceAll("<p");
        System.out.println(result);
    }

    public void checkPhoneNumber(String enterPhoneNumber) {
        Pattern p = Pattern.compile("(\\+)+(375)+((44)|(29)|(33)|(25))+((\\d{3})+(\\d{2})+(\\d{2})){1}");
        Matcher m = p.matcher(enterPhoneNumber);
        while (m.find()) {
            System.out.println(m.group(1) + m.group(2) +
                    "(" + m.group(3) + ")" +
                    m.group(9) + "-" + m.group(10) + "-" + m.group(11));
        }
    }

    public void  checkInternetProtocol(String enterInternetProtocol){
        Pattern p = Pattern.compile("^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.");
        Matcher m = p.matcher(enterInternetProtocol);
        while (m.find()){
            System.out.println(m.group());
        }
    }
}
