# Anonymous Class vs. Lambda

- Anonymous class creates a new class `pbouda/bytecode/examples/AnonymousClass$1` with a number in its name
    - Very important is that new class implements `Runnable` interface in the code which means we can
    very easy end up with megamorphic call because of 3+ implementations of one interface (class)
    - Anonymous method, of course, takes a reference of outer class as a parameter of a generated constructor
- However, a lambda is generated via Bootstrap method

```
javap -v -p examples/target/classes/pbouda/bytecode/examples/AnonymousClass.class

Classfile /Users/pbouda/experimental/bytecode-practise/examples/target/classes/pbouda/bytecode/examples/AnonymousClass.class
    <REMOVED HEADER> ...
{
  public pbouda.bytecode.examples.AnonymousClass();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: new           #2                  // class pbouda/bytecode/examples/AnonymousClass$1
         7: dup
         8: aload_0
         9: invokespecial #3                  // Method pbouda/bytecode/examples/AnonymousClass$1."<init>":(Lpbouda/bytecode/examples/AnonymousClass;)V
        12: pop
        13: invokedynamic #4,  0              // InvokeDynamic #0:run:()Ljava/lang/Runnable;
        18: astore_1
        19: return
      LineNumberTable:
        line 5: 0
        line 6: 4
        line 13: 13
        line 14: 19
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lpbouda/bytecode/examples/AnonymousClass;
           19       1     1 lamba   Ljava/lang/Runnable;

  private static void lambda$new$0();
    descriptor: ()V
    flags: (0x100a) ACC_PRIVATE, ACC_STATIC, ACC_SYNTHETIC
    Code:
      stack=2, locals=0, args_size=0
         0: getstatic     #5                  // Field java/lang/System.out:Ljava/io/PrintStream;
         3: ldc           #6                  // String Lambda Class
         5: invokevirtual #7                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
         8: return
      LineNumberTable:
        line 13: 0
}
SourceFile: "AnonymousClass.java"
InnerClasses:
  #2;                                     // class pbouda/bytecode/examples/AnonymousClass$1
  public static final #55= #54 of #57;    // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
BootstrapMethods:
  0: #27 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #28 ()V
      #29 REF_invokeStatic pbouda/bytecode/examples/AnonymousClass.lambda$new$0:()V
      #28 ()V
```

```
javap -v -p examples/target/classes/pbouda/bytecode/examples/AnonymousClass\$1.class

Classfile /Users/pbouda/experimental/bytecode-practise/examples/target/classes/pbouda/bytecode/examples/AnonymousClass$1.class
  Last modified Aug 23, 2018; size 811 bytes
  MD5 checksum 3f445a993e30ddecf05f706e6dea0b36
  Compiled from "AnonymousClass.java"
class pbouda.bytecode.examples.AnonymousClass$1 implements java.lang.Runnable
  minor version: 0
  major version: 54
  flags: (0x0020) ACC_SUPER
  this_class: #6                          // pbouda/bytecode/examples/AnonymousClass$1
  super_class: #7                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 2, attributes: 3
Constant pool:
   #1 = Fieldref           #6.#26         // pbouda/bytecode/examples/AnonymousClass$1.this$0:Lpbouda/bytecode/examples/AnonymousClass;
   #2 = Methodref          #7.#25         // java/lang/Object."<init>":()V
   #3 = Fieldref           #27.#28        // java/lang/System.out:Ljava/io/PrintStream;
   #4 = String             #29            // Anonymous Class
   #5 = Methodref          #30.#31        // java/io/PrintStream.println:(Ljava/lang/String;)V
   #6 = Class              #32            // pbouda/bytecode/examples/AnonymousClass$1
   #7 = Class              #33            // java/lang/Object
   #8 = Class              #34            // java/lang/Runnable
   #9 = Utf8               this$0
  #10 = Utf8               Lpbouda/bytecode/examples/AnonymousClass;
  #11 = Utf8               <init>
  #12 = Utf8               (Lpbouda/bytecode/examples/AnonymousClass;)V
  #13 = Utf8               Code
  #14 = Utf8               LineNumberTable
  #15 = Utf8               LocalVariableTable
  #16 = Utf8               this
  #17 = Utf8               InnerClasses
  #18 = Utf8               Lpbouda/bytecode/examples/AnonymousClass$1;
  #19 = Utf8               run
  #20 = Utf8               ()V
  #21 = Utf8               SourceFile
  #22 = Utf8               AnonymousClass.java
  #23 = Utf8               EnclosingMethod
  #24 = Class              #35            // pbouda/bytecode/examples/AnonymousClass
  #25 = NameAndType        #11:#20        // "<init>":()V
  #26 = NameAndType        #9:#10         // this$0:Lpbouda/bytecode/examples/AnonymousClass;
  #27 = Class              #36            // java/lang/System
  #28 = NameAndType        #37:#38        // out:Ljava/io/PrintStream;
  #29 = Utf8               Anonymous Class
  #30 = Class              #39            // java/io/PrintStream
  #31 = NameAndType        #40:#41        // println:(Ljava/lang/String;)V
  #32 = Utf8               pbouda/bytecode/examples/AnonymousClass$1
  #33 = Utf8               java/lang/Object
  #34 = Utf8               java/lang/Runnable
  #35 = Utf8               pbouda/bytecode/examples/AnonymousClass
  #36 = Utf8               java/lang/System
  #37 = Utf8               out
  #38 = Utf8               Ljava/io/PrintStream;
  #39 = Utf8               java/io/PrintStream
  #40 = Utf8               println
  #41 = Utf8               (Ljava/lang/String;)V
{
  final pbouda.bytecode.examples.AnonymousClass this$0;
    descriptor: Lpbouda/bytecode/examples/AnonymousClass;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  pbouda.bytecode.examples.AnonymousClass$1(pbouda.bytecode.examples.AnonymousClass);
    descriptor: (Lpbouda/bytecode/examples/AnonymousClass;)V
    flags: (0x0000)
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: putfield      #1                  // Field this$0:Lpbouda/bytecode/examples/AnonymousClass;
         5: aload_0
         6: invokespecial #2                  // Method java/lang/Object."<init>":()V
         9: return
      LineNumberTable:
        line 6: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lpbouda/bytecode/examples/AnonymousClass$1;
            0      10     1 this$0   Lpbouda/bytecode/examples/AnonymousClass;

  public void run();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: getstatic     #3                  // Field java/lang/System.out:Ljava/io/PrintStream;
         3: ldc           #4                  // String Anonymous Class
         5: invokevirtual #5                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
         8: return
      LineNumberTable:
        line 9: 0
        line 10: 8
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lpbouda/bytecode/examples/AnonymousClass$1;
}
SourceFile: "AnonymousClass.java"
EnclosingMethod: #24.#25                // pbouda.bytecode.examples.AnonymousClass.<init>
InnerClasses:
  #6;                                     // class pbouda/bytecode/examples/AnonymousClass$1
```