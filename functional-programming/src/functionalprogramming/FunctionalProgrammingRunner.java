package functionalprogramming;

import java.util.List;

public class FunctionalProgrammingRunner {
    public static void main(String[] args) {
        List<String> list = List.of("Apple", "Bat", "Cat", "Dog");

        printFPWithFiltering(list);


    }

    private static void printBasic(List<String> list) {
        for (String string: list) {
            System.out.println(string);
        }
    }

    private static void printFPWithFiltering(List<String> list) {
        list.stream()
                .filter(element -> element.endsWith("at"))
                .forEach(
                element -> System.out.println(element));
    }
}
