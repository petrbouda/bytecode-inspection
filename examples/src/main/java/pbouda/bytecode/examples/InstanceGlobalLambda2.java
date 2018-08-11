package pbouda.bytecode.examples;

import java.util.function.Function;

public class InstanceGlobalLambda2 {

    private final String instanceVar = "ENHANCE: ";

    private final Function<String, String> MAGIC_FUNCTION = text -> instanceVar + ": " + text;

}
