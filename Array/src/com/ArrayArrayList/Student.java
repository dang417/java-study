package com.ArrayArrayList;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;

public class Student {
    private String name;
    private ArrayList<Integer> marks = new ArrayList<Integer>();

    Student(String name, int... marks) {
        this.name = name;

        for (int mark:marks) {
            this.marks.add(mark);
        }
    }

    public int getNumberOfMarks() {
        return marks.size();
    }

    public int getTotalSumOfMarks() {
        int totalSum = 0;
        for (int mark:marks) {
            totalSum += mark;
        }
        return totalSum;
    }

    public int getMaximumMark() {
        return Collections.max(marks);
    }

    public int getMinimumMark() {
        return Collections.min(marks);
    }

    public BigDecimal getAverageMark() {
        int sum = getTotalSumOfMarks();
        int number = getNumberOfMarks();
        return new BigDecimal(sum).divide(new BigDecimal(number), 3, BigDecimal.ROUND_HALF_UP);
    }

    public void addNewMark(int mark) {
        marks.add(mark);
    }

    public void removeMarkAtIndex(int index) {
        marks.remove(index);
    }

    public String toString() {
        return name + marks;
    }
}
