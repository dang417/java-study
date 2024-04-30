package collections;

import java.util.*;

public class SetRunner {
    public static void main(String[] args) {
        List<Character> characters = List.of('A', 'Z', 'A', 'B', 'Z', 'F');

        // sorted ordered
        Set<Character> treeSet = new TreeSet<>(characters);
        System.out.println(treeSet);

        // insert ordered
        Set<Character> linkedHashSet = new LinkedHashSet<>(characters);
        System.out.println(linkedHashSet);

        // not ordered
        Set<Character> hashSet = new HashSet<>(characters);
        System.out.println(hashSet);
    }
}
