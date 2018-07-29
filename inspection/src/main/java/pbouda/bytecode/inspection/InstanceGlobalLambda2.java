package pbouda.bytecode.inspection;

import java.util.function.Function;

public class InstanceGlobalLambda2 {

    private final String instanceVar = "ENHANCE: ";

    private final Function<String, String> MAGIC_FUNCTION = text -> instanceVar + ": " + text;

}
