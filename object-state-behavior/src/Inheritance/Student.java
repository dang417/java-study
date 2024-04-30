package Inheritance;

public class Student extends Person{
    //state
    private String collegeName;
    private int year;

    //constructor
    public Student(String name, String collegeName) {
        super(name);
        this.collegeName = collegeName;
    }

    //behavior
    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
