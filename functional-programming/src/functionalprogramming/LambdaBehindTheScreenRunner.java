package functionalprogramming;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class EvenNumberPredicate implements Predicate<Integer> {

    @Override
    public boolean test(Integer integer) {
        return integer % 2 == 0;
    }
}

class PrintConsumer implements Consumer<Integer> {

    @Override
    public void accept(Integer integer) {
        System.out.println(integer);
    }
}

class SquareFunction implements Function<Integer, Integer> {

    @Override
    public Integer apply(Integer integer) {
        return integer * integer;
    }
}

public class LambdaBehindTheScreenRunner {

    public static void main(String[] args) {
        List.of(23, 43, 34, 45, 36, 48)
                .stream()
                .filter(new EvenNumberPredicate())
                .map(new SquareFunction())
                .forEach(new PrintConsumer());

    }
}
