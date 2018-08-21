package pbouda.bytecode.examples;

public class Nested {

    private int i;

    public class Inner {
        public int i() {
            return i;
        }
    }
}
