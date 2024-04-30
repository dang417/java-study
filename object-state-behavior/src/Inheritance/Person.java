package Inheritance;

public class Person {
    // state
    private String name;
    private String email;
    private String phoneNumber;

    //constructer
    public Person(String name) {
        this.name = name;
    }

    //behavior
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
