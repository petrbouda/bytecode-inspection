package pbouda.bytecode.examples;

public class Synchronized {

    private final Object lock = new Object();

    private Integer number = 1;


    public synchronized Integer getSyncMethod() {
        return number;
    }

    public synchronized void setSyncMethod(Integer number) {
        this.number = number;
    }

    public synchronized Integer getSyncBlock() {
        synchronized (lock) {
            return number;
        }
    }

    public synchronized void setSyncBlock(Integer number) {
        synchronized (lock) {
            this.number = number;
        }
    }
}
