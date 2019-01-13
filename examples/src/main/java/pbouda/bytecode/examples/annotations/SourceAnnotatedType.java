package pbouda.bytecode.examples.annotations;

@SourceAnnotation(description = "Annotated Class")
public class SourceAnnotatedType {

    @SourceAnnotation(description = "Annotated Field")
    private String myField;

    @SourceAnnotation(description = "Annotated Method")
    public String myMethod() {
        return myField;
    }
}
