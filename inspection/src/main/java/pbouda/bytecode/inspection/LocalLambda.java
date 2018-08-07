package pbouda.bytecode.inspection;

import java.util.function.Function;
import java.util.function.Predicate;

public class LocalLambda {

    public void instanceMethod() {
        Function<String, String> magicLambda = text -> text;
        System.out.println(magicLambda.apply("Text"));

        Predicate<String> magicPredicate = text -> true;
        System.out.println(magicPredicate.test("text"));
    }
}
