package com.ArrayArrayList;

import java.math.BigDecimal;

public class StudentRunner {
    public static void main(String[] args) {
        Student student = new Student ("mark", 97, 85, 100, 35);
        int number = student.getNumberOfMarks();
        int sum = student.getTotalSumOfMarks();
        int maximumMark = student.getMaximumMark();
        int minimumMark = student.getMinimumMark();
        BigDecimal averageMark = student.getAverageMark();
        student.addNewMark(35);
        student.removeMarkAtIndex(1);


        System.out.println(student);
        System.out.println(number);
        System.out.println(sum);
        System.out.println(maximumMark);
        System.out.println(minimumMark);
        System.out.println(averageMark);
    }
}
