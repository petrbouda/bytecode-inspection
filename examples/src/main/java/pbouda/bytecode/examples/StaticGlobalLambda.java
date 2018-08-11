package pbouda.bytecode.examples;

import java.util.function.Function;

public class StaticGlobalLambda {

    private static final Function<String, String> MAGIC_FUNCTION = text -> text;

}
