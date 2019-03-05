package pbouda.bytecode.examples;

public class Initialization {

    private Object obj1 = new Object();
    private Object obj2;
    private Object obj3;

    {
        this.obj2 = new Object();
    }

    public Initialization() {
        this.obj3 = new Object();
    }
}
