package pbouda.bytecode.examples.annotations;

@ClassAnnotation(description = "Annotated Class")
public class ClassAnnotatedType {

    @ClassAnnotation(description = "Annotated Field")
    private String myField;

    @ClassAnnotation(description = "Annotated Method")
    public String myMethod() {
        return myField;
    }
}
