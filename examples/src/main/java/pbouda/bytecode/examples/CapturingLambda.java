package pbouda.bytecode.examples;

import java.util.function.Function;

public class CapturingLambda {

    public static Function<String, String> createNonCapturingLambda() {
        return text -> text;
    }

    public static Function<String, String> createCapturingLambda() {
        int integer1 = 1;
        return text -> text + integer1;
    }

    public static void main(String[] args) {
        Function<String, String> capturingLambda1 = createCapturingLambda();
        Function<String, String> capturingLambda2 = createCapturingLambda();
        Function<String, String> nonCapturinglambda1 = createNonCapturingLambda();
        Function<String, String> nonCapturinglambda2 = createNonCapturingLambda();
        System.out.println(capturingLambda1.apply("CAPTURING"));
        System.out.println(nonCapturinglambda1.apply("NON_CAPTURING"));
    }
}
