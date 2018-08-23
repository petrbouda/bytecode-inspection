package pbouda.bytecode.examples;

public class AnonymousClass {

    public AnonymousClass() {
        new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous Class");
            }
        };

        Runnable lamba = () -> System.out.println("Lambda Class");
    }
}
