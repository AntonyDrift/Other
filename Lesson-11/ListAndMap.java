package com.company;

import java.util.*;

public class ListAndMap {

    List<Integer> integerList = new ArrayList<Integer>(Arrays.asList(new Integer[]{3, 7, 3, -1, 2, 3, 7, 2, 15, 15}));
    Map<String, String> enterNames = new HashMap<>();

    public void enterNamesMethod(){

        enterNames.put("Marty", "Stepp");
        enterNames.put("Stuart", "Reges");
        enterNames.put("Jessica", "Miller");
        enterNames.put("Amanda", "Camp");
        enterNames.put("Hal", "Perkins");

        enterNames.put("Kendrick", "Perkins");
        enterNames.put("Stuart", "Reges");
        enterNames.put("Jessica", "Miller");
        enterNames.put("Bruce", "Reges");
        enterNames.put("Hal", "Perkins");
    }

    public int countUnique() {
        Set<Integer> set = new HashSet<Integer>(integerList);
        return set.size();
    }

    public boolean isUnique() {

        return new HashSet<>(enterNames.values()).size() == enterNames.size();
    }
}