package pbouda.bytecode.inspection;

public class GlobalVarsInspection {

    private String privateGlobalInstance = "Private Global Instance";

    private static Integer privateGlobalStatic = 1;

    private static final Integer PRIVATE_GLOBAL_FINAL_STATIC = 10;

    public String publicGlobalInstance = "Public Global Instance";

    public static Integer publicGlobalStatic = 2;

    public static final Integer PUBLIC_GLOBAL_FINAL_STATIC = 20;

    protected String protectedGlobalInstance = "Protected Global Instance";

    protected static Integer protectedGlobalStatic = 3;

    protected static final Integer PROTECTED_GLOBAL_FINAL_STATIC = 30;

    String packageGlobalInstance = "Package-Private Global Instance";

    static Integer packageGlobalStatic = 4;

    static final Integer PACKAGE_GLOBAL_FINAL_STATIC = 40;

    private int privatePrimitive = 999;
}
