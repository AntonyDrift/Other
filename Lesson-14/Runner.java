package com.company;

public class Runner {

    public static void main(String[] args) {

        String enterEmailAdress = "Antonydrift96@gmail.com";
        String enterHexNumber = "0xB10xfdfd0x3s321";
        String enterParagraphTag = "<p id=p1> blah </p> some text <p> info </p>";
        String enterPhoneNumber = "+375257370208+375297fdgf882438+375257585677";
        String enterInternetProtocol = "255.255.255.255.257.255.255.255";

        Regex run = new Regex();
        System.out.print(enterEmailAdress + " is E-mail adress? ");
        run.checkEmail(enterEmailAdress);
        System.out.println("\n" + enterHexNumber +" converted to Hex: ");
        run.checkHexNumber(enterHexNumber);
        System.out.println();
        System.out.println("\n" + enterParagraphTag + " replace paragraphs tags: ");
        run.checkParagraphTag(enterParagraphTag);
        System.out.println("\n" + enterPhoneNumber + " get phone numbers: ");
        run.checkPhoneNumber(enterPhoneNumber);
        System.out.println("\n" + enterInternetProtocol + " find ipv4 protocols: ");
        run.checkInternetProtocol(enterInternetProtocol);

    }
}
