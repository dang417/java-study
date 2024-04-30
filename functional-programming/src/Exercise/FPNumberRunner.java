package Exercise;

import java.util.List;
import java.util.stream.IntStream;

public class FPNumberRunner {
    public static void main(String[] args) {
        IntStream.range(1, 11).map(number -> number * number).forEach(number -> System.out.println(number));

        List<String> list = List.of("Apple", "Ant", "Bat");
        list.stream().map(string -> string.toLowerCase()).forEach(string -> System.out.println(string));

        list.stream().forEach(string -> System.out.println(string.length()));
    }
}
