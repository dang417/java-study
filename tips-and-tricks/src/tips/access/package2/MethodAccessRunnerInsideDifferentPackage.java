package tips.access.package2;

import tips.access.package1.ExampleClass;

public class MethodAccessRunnerInsideDifferentPackage {
    public static void main(String[] args) {
        ExampleClass exampleClass = new ExampleClass();
//        exampleClass.privateMethod();
//        exampleClass.protectedMethod();
        exampleClass.publicMethod();
//        exampleClass.defaultMethod();
    }
}
