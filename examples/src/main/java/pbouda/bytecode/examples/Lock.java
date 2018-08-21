package pbouda.bytecode.examples;

import java.util.concurrent.locks.ReentrantLock;

public class Lock {

    private final ReentrantLock lock = new ReentrantLock();

    private Object myObject = new Object();

    public Object getMyObject() {
        lock.lock();
        try {
            return myObject;
        } finally {
            lock.unlock();
        }
    }

    public void setMyObject(Object myObject) {
        lock.lock();
        try {
            this.myObject = myObject;
        } finally {
            lock.unlock();
        }
    }
}
