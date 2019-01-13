package pbouda.bytecode.examples.annotations;

@RuntimeAnnotation(description = "Annotated Class")
public class RuntimeAnnotatedType {

    @RuntimeAnnotation(description = "Annotated Field")
    private String myField;

    @RuntimeAnnotation(description = "Annotated Method")
    public String myMethod() {
        return myField;
    }
}
