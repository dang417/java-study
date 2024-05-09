package api.h;

public class RecordsRunner {

    record Person(String name, String email, String phoneNumber) {
        Person {
            if (name == null)
                throw new IllegalArgumentException("Name is null");
        }

        public String name() {
            System.out.println("Do Something");
            return name;
        }
    }

    public static void main(String[] args) {
        Person person = new Person("Ranga", "ranga@gmail.com", "123-456-7890");
        Person person1 = new Person("Ranga", "ranga@gmail.com", "123-456-7890");
        Person person2 = new Person("Ranga1", "ranga@gmail.com", "123-456-7890");
        System.out.println(person.equals(person1));
        System.out.println(person.equals(person2));
        System.out.println(person.name());
    }
}