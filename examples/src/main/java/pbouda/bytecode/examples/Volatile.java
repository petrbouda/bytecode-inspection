package pbouda.bytecode.examples;

public class Volatile {

    private volatile Object myObject;

    private Object getMyObject() {
        return myObject;
    }

    private void setMyObject(Object myObject) {
        this.myObject = myObject;
    }
}
