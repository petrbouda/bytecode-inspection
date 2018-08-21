package pbouda.bytecode.examples;

public class Finally {

    public Object getFinally() {
        try {
            return new Object();
        } finally {
            System.out.println("-");
        }
    }
}
