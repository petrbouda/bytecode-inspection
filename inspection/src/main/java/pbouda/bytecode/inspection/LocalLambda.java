package pbouda.bytecode.inspection;

import java.util.function.Function;

public class LocalLambda {

    public void instanceMethod() {
        Function<String, String> magicLambda = text -> text;
        System.out.println(magicLambda.apply("Text"));
    }
}
