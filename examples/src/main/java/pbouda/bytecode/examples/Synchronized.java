package pbouda.bytecode.examples;

public class Synchronized {

    private final Object lock = new Object();

    public synchronized int getSynchronizedNumber() {
        return 1;
    }

    public int getLockedNumber() {
        synchronized (lock) {
            return 1;
        }
    }
}
