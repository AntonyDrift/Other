package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Task6 {
    public static void main(){
        String enteredText = "У Карла кораллы. У Клары кларнет.\n" +
                "Клара у Карла украла кораллы, Карл у Клары украл кларнет.\n" +
                "У Карла кораллов нет, у Клары кларнета нет. ";

        String[] textElements = enteredText.toLowerCase().split("[\\s,.]");
        Map<String, Integer> map = new HashMap<>();
        int count;

        for (int i = 0; i < textElements.length; i++) {
            count = 0;

            for (int j = 0; j < textElements.length; j++) {
                if (textElements[i].equals(textElements[j])) {
                    count++;
                }
            }
            map.put(textElements[i], count);
        }

        System.out.println("\n" + enteredText);
        System.out.print("\nFrequency dictionary: ");
        System.out.print(map + "\n");
    }
}
/*"[\\!@#-^&*()_ =+?.,;:]");*/
