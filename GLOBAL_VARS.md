# Global Variables

- Instance Global Vars initiated in the constructor
- Static Global Vars initiated in static-init block

```
$ javap -v -p examples/target/classes/pbouda/bytecode/examples/GlobalVars.class

Classfile /Users/pbouda/IdeaProjects/bytecode-examples/examples/target/classes/pbouda/bytecode/examples/GlobalVars.class
  Last modified Jul 29, 2018; size 1328 bytes
  MD5 checksum 5e67c3aa73d64af56726c5bdb786d87b
  Compiled from "GlobalVars.java"
public class pbouda.bytecode.examples.GlobalVars
  minor version: 0
  major version: 54
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #20                         // pbouda/bytecode/examples/GlobalVars
  super_class: #21                        // java/lang/Object
  interfaces: 0, fields: 13, methods: 2, attributes: 1
Constant pool:
   #1 = Methodref          #21.#48        // java/lang/Object."<init>":()V
   #2 = String             #49            // Private Global Instance
   #3 = Fieldref           #20.#50        // pbouda/bytecode/examples/GlobalVars.privateGlobalInstance:Ljava/lang/String;
   #4 = String             #51            // Public Global Instance
   #5 = Fieldref           #20.#52        // pbouda/bytecode/examples/GlobalVars.publicGlobalInstance:Ljava/lang/String;
   #6 = String             #53            // Protected Global Instance
   #7 = Fieldref           #20.#54        // pbouda/bytecode/examples/GlobalVars.protectedGlobalInstance:Ljava/lang/String;
   #8 = String             #55            // Package-Private Global Instance
   #9 = Fieldref           #20.#56        // pbouda/bytecode/examples/GlobalVars.packageGlobalInstance:Ljava/lang/String;
  #10 = Fieldref           #20.#57        // pbouda/bytecode/examples/GlobalVars.privatePrimitive:I
  #11 = Methodref          #58.#59        // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #12 = Fieldref           #20.#60        // pbouda/bytecode/examples/GlobalVars.privateGlobalStatic:Ljava/lang/Integer;
  #13 = Fieldref           #20.#61        // pbouda/bytecode/examples/GlobalVars.PRIVATE_GLOBAL_FINAL_STATIC:Ljava/lang/Integer;
  #14 = Fieldref           #20.#62        // pbouda/bytecode/examples/GlobalVars.publicGlobalStatic:Ljava/lang/Integer;
  #15 = Fieldref           #20.#63        // pbouda/bytecode/examples/GlobalVars.PUBLIC_GLOBAL_FINAL_STATIC:Ljava/lang/Integer;
  #16 = Fieldref           #20.#64        // pbouda/bytecode/examples/GlobalVars.protectedGlobalStatic:Ljava/lang/Integer;
  #17 = Fieldref           #20.#65        // pbouda/bytecode/examples/GlobalVars.PROTECTED_GLOBAL_FINAL_STATIC:Ljava/lang/Integer;
  #18 = Fieldref           #20.#66        // pbouda/bytecode/examples/GlobalVars.packageGlobalStatic:Ljava/lang/Integer;
  #19 = Fieldref           #20.#67        // pbouda/bytecode/examples/GlobalVars.PACKAGE_GLOBAL_FINAL_STATIC:Ljava/lang/Integer;
  #20 = Class              #68            // pbouda/bytecode/examples/GlobalVars
  #21 = Class              #69            // java/lang/Object
  #22 = Utf8               privateGlobalInstance
  #23 = Utf8               Ljava/lang/String;
  #24 = Utf8               privateGlobalStatic
  #25 = Utf8               Ljava/lang/Integer;
  #26 = Utf8               PRIVATE_GLOBAL_FINAL_STATIC
  #27 = Utf8               publicGlobalInstance
  #28 = Utf8               publicGlobalStatic
  #29 = Utf8               PUBLIC_GLOBAL_FINAL_STATIC
  #30 = Utf8               protectedGlobalInstance
  #31 = Utf8               protectedGlobalStatic
  #32 = Utf8               PROTECTED_GLOBAL_FINAL_STATIC
  #33 = Utf8               packageGlobalInstance
  #34 = Utf8               packageGlobalStatic
  #35 = Utf8               PACKAGE_GLOBAL_FINAL_STATIC
  #36 = Utf8               privatePrimitive
  #37 = Utf8               I
  #38 = Utf8               <init>
  #39 = Utf8               ()V
  #40 = Utf8               Code
  #41 = Utf8               LineNumberTable
  #42 = Utf8               LocalVariableTable
  #43 = Utf8               this
  #44 = Utf8               Lpbouda/bytecode/examples/GlobalVars;
  #45 = Utf8               <clinit>
  #46 = Utf8               SourceFile
  #47 = Utf8               GlobalVars.java
  #48 = NameAndType        #38:#39        // "<init>":()V
  #49 = Utf8               Private Global Instance
  #50 = NameAndType        #22:#23        // privateGlobalInstance:Ljava/lang/String;
  #51 = Utf8               Public Global Instance
  #52 = NameAndType        #27:#23        // publicGlobalInstance:Ljava/lang/String;
  #53 = Utf8               Protected Global Instance
  #54 = NameAndType        #30:#23        // protectedGlobalInstance:Ljava/lang/String;
  #55 = Utf8               Package-Private Global Instance
  #56 = NameAndType        #33:#23        // packageGlobalInstance:Ljava/lang/String;
  #57 = NameAndType        #36:#37        // privatePrimitive:I
  #58 = Class              #70            // java/lang/Integer
  #59 = NameAndType        #71:#72        // valueOf:(I)Ljava/lang/Integer;
  #60 = NameAndType        #24:#25        // privateGlobalStatic:Ljava/lang/Integer;
  #61 = NameAndType        #26:#25        // PRIVATE_GLOBAL_FINAL_STATIC:Ljava/lang/Integer;
  #62 = NameAndType        #28:#25        // publicGlobalStatic:Ljava/lang/Integer;
  #63 = NameAndType        #29:#25        // PUBLIC_GLOBAL_FINAL_STATIC:Ljava/lang/Integer;
  #64 = NameAndType        #31:#25        // protectedGlobalStatic:Ljava/lang/Integer;
  #65 = NameAndType        #32:#25        // PROTECTED_GLOBAL_FINAL_STATIC:Ljava/lang/Integer;
  #66 = NameAndType        #34:#25        // packageGlobalStatic:Ljava/lang/Integer;
  #67 = NameAndType        #35:#25        // PACKAGE_GLOBAL_FINAL_STATIC:Ljava/lang/Integer;
  #68 = Utf8               pbouda/bytecode/examples/GlobalVars
  #69 = Utf8               java/lang/Object
  #70 = Utf8               java/lang/Integer
  #71 = Utf8               valueOf
  #72 = Utf8               (I)Ljava/lang/Integer;
{
  private java.lang.String privateGlobalInstance;
    descriptor: Ljava/lang/String;
    flags: (0x0002) ACC_PRIVATE

  private static java.lang.Integer privateGlobalStatic;
    descriptor: Ljava/lang/Integer;
    flags: (0x000a) ACC_PRIVATE, ACC_STATIC

  private static final java.lang.Integer PRIVATE_GLOBAL_FINAL_STATIC;
    descriptor: Ljava/lang/Integer;
    flags: (0x001a) ACC_PRIVATE, ACC_STATIC, ACC_FINAL

  public java.lang.String publicGlobalInstance;
    descriptor: Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC

  public static java.lang.Integer publicGlobalStatic;
    descriptor: Ljava/lang/Integer;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static final java.lang.Integer PUBLIC_GLOBAL_FINAL_STATIC;
    descriptor: Ljava/lang/Integer;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL

  protected java.lang.String protectedGlobalInstance;
    descriptor: Ljava/lang/String;
    flags: (0x0004) ACC_PROTECTED

  protected static java.lang.Integer protectedGlobalStatic;
    descriptor: Ljava/lang/Integer;
    flags: (0x000c) ACC_PROTECTED, ACC_STATIC

  protected static final java.lang.Integer PROTECTED_GLOBAL_FINAL_STATIC;
    descriptor: Ljava/lang/Integer;
    flags: (0x001c) ACC_PROTECTED, ACC_STATIC, ACC_FINAL

  java.lang.String packageGlobalInstance;
    descriptor: Ljava/lang/String;
    flags: (0x0000)

  static java.lang.Integer packageGlobalStatic;
    descriptor: Ljava/lang/Integer;
    flags: (0x0008) ACC_STATIC

  static final java.lang.Integer PACKAGE_GLOBAL_FINAL_STATIC;
    descriptor: Ljava/lang/Integer;
    flags: (0x0018) ACC_STATIC, ACC_FINAL

  private int privatePrimitive;
    descriptor: I
    flags: (0x0002) ACC_PRIVATE

  public pbouda.bytecode.examples.GlobalVars();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: ldc           #2                  // String Private Global Instance
         7: putfield      #3                  // Field privateGlobalInstance:Ljava/lang/String;
        10: aload_0
        11: ldc           #4                  // String Public Global Instance
        13: putfield      #5                  // Field publicGlobalInstance:Ljava/lang/String;
        16: aload_0
        17: ldc           #6                  // String Protected Global Instance
        19: putfield      #7                  // Field protectedGlobalInstance:Ljava/lang/String;
        22: aload_0
        23: ldc           #8                  // String Package-Private Global Instance
        25: putfield      #9                  // Field packageGlobalInstance:Ljava/lang/String;
        28: aload_0
        29: sipush        999
        32: putfield      #10                 // Field privatePrimitive:I
        35: return
      LineNumberTable:
        line 3: 0
        line 5: 4
        line 11: 10
        line 17: 16
        line 23: 22
        line 29: 28
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      36     0  this   Lpbouda/bytecode/examples/GlobalVars;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: iconst_1
         1: invokestatic  #11                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         4: putstatic     #12                 // Field privateGlobalStatic:Ljava/lang/Integer;
         7: bipush        10
         9: invokestatic  #11                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        12: putstatic     #13                 // Field PRIVATE_GLOBAL_FINAL_STATIC:Ljava/lang/Integer;
        15: iconst_2
        16: invokestatic  #11                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        19: putstatic     #14                 // Field publicGlobalStatic:Ljava/lang/Integer;
        22: bipush        20
        24: invokestatic  #11                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        27: putstatic     #15                 // Field PUBLIC_GLOBAL_FINAL_STATIC:Ljava/lang/Integer;
        30: iconst_3
        31: invokestatic  #11                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        34: putstatic     #16                 // Field protectedGlobalStatic:Ljava/lang/Integer;
        37: bipush        30
        39: invokestatic  #11                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        42: putstatic     #17                 // Field PROTECTED_GLOBAL_FINAL_STATIC:Ljava/lang/Integer;
        45: iconst_4
        46: invokestatic  #11                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        49: putstatic     #18                 // Field packageGlobalStatic:Ljava/lang/Integer;
        52: bipush        40
        54: invokestatic  #11                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        57: putstatic     #19                 // Field PACKAGE_GLOBAL_FINAL_STATIC:Ljava/lang/Integer;
        60: return
      LineNumberTable:
        line 7: 0
        line 9: 7
        line 13: 15
        line 15: 22
        line 19: 30
        line 21: 37
        line 25: 45
        line 27: 52
}
SourceFile: "GlobalVars.java"
```