# Constant Pool

- A table which writes out any constant values that exists within the scope of the class
    - Within methods, fields, but also immutable info that describes class / name of methods ...
- Values are referenced by an offset pointing to a specific entry withing the constant pool
    - Repeated values can be stored only once and referenced multiple times
- Javac emits a byte code that refers to the offset instead of get value from that field
- Only if the field is marked as `final` (reduced edge-cases)
- Leads to the other optimizations especially in AOT Compiler

Points to the same Constant Pool offset and values have also same identity,
JVM also interns strings across class which are available in Constant Pool
```
assert "foo" == "foo"
```


```
$ javap -v -p examples/target/classes/pbouda/bytecode/examples/ConstantPoolProperty.class

Classfile /Users/pbouda/IdeaProjects/bytecode-examples/examples/target/classes/pbouda/bytecode/examples/ConstantPoolProperty.class
  Last modified Aug 7, 2018; size 887 bytes
  MD5 checksum 5441537d84bda1ad1cf5c9bf42804938
  Compiled from "ConstantPoolProperty.java"
public class pbouda.bytecode.examples.ConstantPool
  minor version: 0
  major version: 54
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #7                          // pbouda/bytecode/examples/ConstantPoolProperty
  super_class: #10                        // java/lang/Object
  interfaces: 0, fields: 4, methods: 3, attributes: 1
Constant pool:
   #1 = Methodref          #10.#28        // java/lang/Object."<init>":()V
   #2 = String             #29            // NON_CONSTANT
   #3 = Fieldref           #7.#30         // pbouda/bytecode/examples/ConstantPoolProperty.instanceNonConstant:Ljava/lang/String;
   #4 = String             #31            // CONSTANT
   #5 = Fieldref           #7.#32         // pbouda/bytecode/examples/ConstantPoolProperty.instanceConstant:Ljava/lang/String;
   #6 = Fieldref           #33.#34        // java/lang/System.out:Ljava/io/PrintStream;
   #7 = Class              #35            // pbouda/bytecode/examples/ConstantPoolProperty
   #8 = Methodref          #36.#37        // java/io/PrintStream.println:(Ljava/lang/String;)V
   #9 = Fieldref           #7.#38         // pbouda/bytecode/examples/ConstantPoolProperty.staticNonConstant:Ljava/lang/String;
  #10 = Class              #39            // java/lang/Object
  #11 = Utf8               staticNonConstant
  #12 = Utf8               Ljava/lang/String;
  #13 = Utf8               staticConstant
  #14 = Utf8               ConstantValue
  #15 = Utf8               instanceNonConstant
  #16 = Utf8               instanceConstant
  #17 = Utf8               <init>
  #18 = Utf8               ()V
  #19 = Utf8               Code
  #20 = Utf8               LineNumberTable
  #21 = Utf8               LocalVariableTable
  #22 = Utf8               this
  #23 = Utf8               Lpbouda/bytecode/examples/ConstantPoolProperty;
  #24 = Utf8               method
  #25 = Utf8               <clinit>
  #26 = Utf8               SourceFile
  #27 = Utf8               ConstantPoolProperty.java
  #28 = NameAndType        #17:#18        // "<init>":()V
  #29 = Utf8               NON_CONSTANT
  #30 = NameAndType        #15:#12        // instanceNonConstant:Ljava/lang/String;
  #31 = Utf8               CONSTANT
  #32 = NameAndType        #16:#12        // instanceConstant:Ljava/lang/String;
  #33 = Class              #40            // java/lang/System
  #34 = NameAndType        #41:#42        // out:Ljava/io/PrintStream;
  #35 = Utf8               pbouda/bytecode/examples/ConstantPoolProperty
  #36 = Class              #43            // java/io/PrintStream
  #37 = NameAndType        #44:#45        // println:(Ljava/lang/String;)V
  #38 = NameAndType        #11:#12        // staticNonConstant:Ljava/lang/String;
  #39 = Utf8               java/lang/Object
  #40 = Utf8               java/lang/System
  #41 = Utf8               out
  #42 = Utf8               Ljava/io/PrintStream;
  #43 = Utf8               java/io/PrintStream
  #44 = Utf8               println
  #45 = Utf8               (Ljava/lang/String;)V
{
  private static java.lang.String staticNonConstant;
    descriptor: Ljava/lang/String;
    flags: (0x000a) ACC_PRIVATE, ACC_STATIC

  private static final java.lang.String staticConstant;
    descriptor: Ljava/lang/String;
    flags: (0x001a) ACC_PRIVATE, ACC_STATIC, ACC_FINAL
    ConstantValue: String CONSTANT

  private java.lang.String instanceNonConstant;
    descriptor: Ljava/lang/String;
    flags: (0x0002) ACC_PRIVATE

  private final java.lang.String instanceConstant;
    descriptor: Ljava/lang/String;
    flags: (0x0012) ACC_PRIVATE, ACC_FINAL
    ConstantValue: String CONSTANT

  public pbouda.bytecode.examples.ConstantPool();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: ldc           #2                  // String NON_CONSTANT
         7: putfield      #3                  // Field instanceNonConstant:Ljava/lang/String;
        10: aload_0
        11: ldc           #4                  // String CONSTANT
        13: putfield      #5                  // Field instanceConstant:Ljava/lang/String;
        16: return
      LineNumberTable:
        line 3: 0
        line 7: 4
        line 8: 10
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lpbouda/bytecode/examples/ConstantPoolProperty;

  public void method();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: getstatic     #6                  // Field java/lang/System.out:Ljava/io/PrintStream;
         3: ldc           #4                  // String CONSTANT
         5: invokevirtual #8                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
         8: getstatic     #6                  // Field java/lang/System.out:Ljava/io/PrintStream;
        11: getstatic     #9                  // Field staticNonConstant:Ljava/lang/String;
        14: invokevirtual #8                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
        17: getstatic     #6                  // Field java/lang/System.out:Ljava/io/PrintStream;
        20: ldc           #4                  // String CONSTANT
        22: invokevirtual #8                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
        25: getstatic     #6                  // Field java/lang/System.out:Ljava/io/PrintStream;
        28: aload_0
        29: getfield      #3                  // Field instanceNonConstant:Ljava/lang/String;
        32: invokevirtual #8                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
        35: return
      LineNumberTable:
        line 11: 0
        line 12: 8
        line 13: 17
        line 14: 25
        line 15: 35
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      36     0  this   Lpbouda/bytecode/examples/ConstantPoolProperty;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: ldc           #2                  // String NON_CONSTANT
         2: putstatic     #9                  // Field staticNonConstant:Ljava/lang/String;
         5: return
      LineNumberTable:
        line 5: 0
}
SourceFile: "ConstantPoolProperty.java"
```
