package com.ArrayArrayList;

public class Exercise {
    private String[] week = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

    public void longestString() {
        String longestString = "";
        for (String day:week) {
            if (day.length() > longestString.length()) {
                longestString = day;
            }
        }
        System.out.println(longestString);
    }

    public void printBackwords() {
        for (int i=week.length-1; i>=0; i--) {
            System.out.println(week[i]);
        }
    }
}
