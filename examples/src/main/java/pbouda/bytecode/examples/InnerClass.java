package pbouda.bytecode.examples;

public class InnerClass {

    private RealInnerClass realInnerClass = new RealInnerClass();

    private RealInnerClass2 realInnerClass2 = new RealInnerClass2();

    private static class RealInnerClass {

        private int number;

        public int getNumber() {
            return number;
        }
    }

    public static class RealInnerClass2 {

        private int number;

        public int getNumber() {
            return number;
        }
    }
}
