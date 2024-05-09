package api.g;

public class TextBlockRunner {
    public static void main(String[] args) {
        String str = """
                Line 1
                    Line 2
                    Line 3
                        Line 4
                        Line 5
                    Line 5
                """;
        System.out.println(str);
    }
}
