package functionalprogramming;

import java.lang.reflect.Method;
import java.security.PrivilegedAction;
import java.util.List;
import java.util.function.Predicate;

public class MethodReferencesRunner {
    public static void print(Integer integer) {
        System.out.println(integer);
    }

    public static void main(String[] args) {
        List.of("Ant", "Bat", "Cat", "Dog", "Elephant").stream()
                .map(String::length)
                .forEach(MethodReferencesRunner::print);

        Integer max = List.of(23, 45, 67, 34).stream()
                .filter(MethodReferencesRunner::isEven)
                .max(Integer::compare).get();

        PrivilegedAction<Predicate<Integer>> evenPredicate = () -> createEvenPredicate();
        PrivilegedAction<Predicate<Integer>> oddPredicate = () -> createOddPredicate();

        List.of(23, 43, 34, 45, 36).stream()
                .filter(evenPredicate.run());
    }

    private static Predicate<Integer> createOddPredicate() {
        return n -> n % 2 == 1;
    }

    private static Predicate<Integer> createEvenPredicate() {
        return n -> n % 2 == 0;
    }


    public static boolean isEven(Integer integer) {
        return integer % 2 == 0;
    }
}
