package pbouda.bytecode.examples;

import java.util.function.Function;
import java.util.function.Predicate;

public class LocalLambdaMethodReference {

    public void instanceMethod() {
        Function<String, String> magicLambda = text -> text;
        System.out.println(magicLambda.apply("Text"));

        Function<String, String> methodReference =
                LocalLambdaMethodReference::upper;
        System.out.println(methodReference.apply("Text"));
    }

    private static String upper(String text) {
        return text.toUpperCase();
    }
}
