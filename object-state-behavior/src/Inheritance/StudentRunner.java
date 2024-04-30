package Inheritance;

public class StudentRunner {
    public static void main(String[] args) {
//        Student student = new Student();
//        student.setName("Ranga");
//        student.setEmail("in28minutes@gmail.com");
//
//        Person person = new Person();
//        String value = person.toString();
//        System.out.println(value);
//        System.out.println(person);

        Employee employee = new Employee("Ranga", "Programmer Analyst");
        employee.setEmail("ranga@in28minutes.com");
        employee.setPhoneNumber("123-456-7890");
        employee.setEmployeeGrade('A');

        System.out.print(employee);
    }
}
