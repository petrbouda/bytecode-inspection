package pbouda.bytecode.examples;

import java.util.ArrayList;

public class Generics<TYPE> extends ArrayList<String> {

    private ArrayList<TYPE> myList;

    private TYPE myField;

    public TYPE myMethod() {
        return myField;
    }

    public ArrayList<TYPE> myTypedMethod(TYPE argument) {
        return myList;
    }
}
