package pbouda.bytecode.examples;

import java.util.ArrayList;
import java.util.List;

public class DoubleBrace {

    private final List<Integer> arr;

    public DoubleBrace() {
        arr = new ArrayList<>() {{
            add(1);
        }};

        new ArrayList<>() {{
            add(1);
        }};
    }
}
