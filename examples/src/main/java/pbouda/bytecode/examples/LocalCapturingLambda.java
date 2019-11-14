package pbouda.bytecode.examples;

import java.util.function.Function;
import java.util.function.Predicate;

public class LocalCapturingLambda {

    private static final String MY_STRING = "my_string";

    public void instanceMethod() {
        Integer integer1 = 1;
        Integer integer2 = 1 + integer1;
        Integer integer3 = 1 + integer1;
        Integer integer4 = 1 + integer1;
        Integer integer5 = 1 + integer1;
        Integer integer6 = 1 + integer1;
        Integer integer7 = 1 + integer1;
        Integer integer8 = 1 + integer1;
        Integer integer9 = 1 + integer1;
        Integer integer10 = 1 + integer1;


        Function<String, String> magicLambda = text -> text + " " + MY_STRING + " "
                        + integer1
                        + integer2
                        + integer3
                        + integer4
                        + integer5
                        + integer6
                        + integer7
                        + integer8
                        + integer9
                        + integer10;

        System.out.println(magicLambda.apply("Text"));

        Predicate<String> magicPredicate = MY_STRING::equals;
        System.out.println(magicPredicate.test("text"));
    }
}
