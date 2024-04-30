package Inheritance;

import java.math.BigDecimal;

public class Employee extends Person{
    //state
    private String title;
    private String employer;
    private char employeeGrade;
    private BigDecimal salay;

    //constructor
    public Employee(String name, String title) {
        super(name);
        this.title = title;
    }

    //behavior
    public String getTitle() {
        return title;
    }

    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public char getEmployeeGrade() {
        return employeeGrade;
    }

    public void setEmployeeGrade(char employeeGrade) {
        this.employeeGrade = employeeGrade;
    }

    public BigDecimal getSalay() {
        return salay;
    }

    public void setSalay(BigDecimal salay) {
        this.salay = salay;
    }

    public String toString() {
        return "#" + super.toString() + "title: " + title + ", employer: " + employer + ", grade: " + employeeGrade + ", salay: " + salay;
    }
}
