package tips.nonaccess.package1;

final class FinalClass {}

//class SomeClass extends FinalClass{} - can't extend final class

class SomeClass {
    final public void doSomething() {}
    public void doSomethingElse(final int arg) {
//        arg = 6 can't change final argument
    }
}

class ExtendingClass extends SomeClass {
//    public void doSomething() {} can't override final method
}

public class FinalNonAccessModifierRunner {
    public static void main(String[] args) {
        final int i = 5; // can't change final variable

    }
}

// all variables and all arguments are being final is typically recommended