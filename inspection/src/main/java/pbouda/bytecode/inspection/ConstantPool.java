package pbouda.bytecode.inspection;

public class ConstantPool {

    private static String staticNonConstant = "NON_CONSTANT";
    private static final String staticConstant = "CONSTANT";
    private String instanceNonConstant = "NON_CONSTANT";
    private final String instanceConstant = "CONSTANT";

    public void method() {
        System.out.println(staticConstant);
        System.out.println(staticNonConstant);
        System.out.println(instanceConstant);
        System.out.println(instanceNonConstant);
    }
}
