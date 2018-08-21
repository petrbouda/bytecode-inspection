package pbouda.bytecode.examples;

public class ThrowException {

    public void throwCatchedException() throws InterruptedException {
        throw new InterruptedException();
    }

    public void throwUncatchedException() {
        throw new IllegalArgumentException();
    }

    public void catchException() {
        try {
            throw new IllegalArgumentException();
        } catch (Exception ex) {
            System.out.println();
        }
    }
}
