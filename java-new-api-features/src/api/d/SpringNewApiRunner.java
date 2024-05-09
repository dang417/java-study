package api.d;

class SampleClass {
    String str = null;
}

public class SpringNewApiRunner {

    public static void main(String[] args) {
        System.out.println(" ".isBlank());
        System.out.println(" L R ".strip().replace(" ", "@"));
        System.out.println(" L R ".stripLeading().replace(" ", "@"));
        System.out.println(" L R ".stripTrailing().replace(" ", "@"));
        "Line1\nLine2\nLine3\nLine4".lines().forEach(System.out::println);

        System.out.println((String) "UPPER".transform(s -> s.substring(2)));
        System.out.println("My name is %s. My age is %d.".formatted("Ranga", 25));


        SampleClass sample = new SampleClass();
        String str = null;
        System.out.println(sample.str.isBlank());
    }
}
