# Instance Global Lambda with Instant field

```
private java.lang.String lambda$new$0(java.lang.String);
    descriptor: (Ljava/lang/String;)Ljava/lang/String;
    flags: (0x1002) ACC_PRIVATE, ACC_SYNTHETIC
```

- Instance method generated - `ACC_SYNTHETIC`
- Lambda registered in a constructor
- More info in LOCAL_LAMBDA.md

```
$ javap -v -p examples/target/classes/pbouda/bytecode/examples/InstanceGlobalLambda2.class

Classfile /Users/pbouda/IdeaProjects/bytecode-examples/examples/target/classes/pbouda/bytecode/examples/InstanceGlobalLambda2.class
  Last modified Jul 29, 2018; size 1616 bytes
  MD5 checksum 9fda79d8b61fc9f5c3bd0bcbe201eef3
  Compiled from "InstanceGlobalLambda2.java"
public class pbouda.bytecode.examples.InstanceGlobalLambda2
  minor version: 0
  major version: 54
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #7                          // pbouda/bytecode/examples/InstanceGlobalLambda2
  super_class: #8                         // java/lang/Object
  interfaces: 0, fields: 2, methods: 2, attributes: 3
Constant pool:
   #1 = Methodref          #8.#28         // java/lang/Object."<init>":()V
   #2 = String             #29            // ENHANCE:
   #3 = Fieldref           #7.#30         // pbouda/bytecode/examples/InstanceGlobalLambda2.instanceVar:Ljava/lang/String;
   #4 = InvokeDynamic      #0:#36         // #0:apply:(Lpbouda/bytecode/examples/InstanceGlobalLambda2;)Ljava/util/function/Function;
   #5 = Fieldref           #7.#37         // pbouda/bytecode/examples/InstanceGlobalLambda2.MAGIC_FUNCTION:Ljava/util/function/Function;
   #6 = InvokeDynamic      #1:#40         // #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #7 = Class              #41            // pbouda/bytecode/examples/InstanceGlobalLambda2
   #8 = Class              #42            // java/lang/Object
   #9 = Utf8               instanceVar
  #10 = Utf8               Ljava/lang/String;
  #11 = Utf8               ConstantValue
  #12 = Utf8               MAGIC_FUNCTION
  #13 = Utf8               Ljava/util/function/Function;
  #14 = Utf8               Signature
  #15 = Utf8               Ljava/util/function/Function<Ljava/lang/String;Ljava/lang/String;>;
  #16 = Utf8               <init>
  #17 = Utf8               ()V
  #18 = Utf8               Code
  #19 = Utf8               LineNumberTable
  #20 = Utf8               LocalVariableTable
  #21 = Utf8               this
  #22 = Utf8               Lpbouda/bytecode/examples/InstanceGlobalLambda2;
  #23 = Utf8               lambda$new$0
  #24 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #25 = Utf8               text
  #26 = Utf8               SourceFile
  #27 = Utf8               InstanceGlobalLambda2.java
  #28 = NameAndType        #16:#17        // "<init>":()V
  #29 = Utf8               ENHANCE:
  #30 = NameAndType        #9:#10         // instanceVar:Ljava/lang/String;
  #31 = Utf8               BootstrapMethods
  #32 = MethodHandle       6:#43          // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #33 = MethodType         #44            //  (Ljava/lang/Object;)Ljava/lang/Object;
  #34 = MethodHandle       7:#45          // REF_invokeSpecial pbouda/bytecode/examples/InstanceGlobalLambda2.lambda$new$0:(Ljava/lang/String;)Ljava/lang/String;
  #35 = MethodType         #24            //  (Ljava/lang/String;)Ljava/lang/String;
  #36 = NameAndType        #46:#47        // apply:(Lpbouda/bytecode/examples/InstanceGlobalLambda2;)Ljava/util/function/Function;
  #37 = NameAndType        #12:#13        // MAGIC_FUNCTION:Ljava/util/function/Function;
  #38 = MethodHandle       6:#48          // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #39 = String             #49            // ENHANCE: : \u0001
  #40 = NameAndType        #50:#24        // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #41 = Utf8               pbouda/bytecode/examples/InstanceGlobalLambda2
  #42 = Utf8               java/lang/Object
  #43 = Methodref          #51.#52        // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #44 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #45 = Methodref          #7.#53         // pbouda/bytecode/examples/InstanceGlobalLambda2.lambda$new$0:(Ljava/lang/String;)Ljava/lang/String;
  #46 = Utf8               apply
  #47 = Utf8               (Lpbouda/bytecode/examples/InstanceGlobalLambda2;)Ljava/util/function/Function;
  #48 = Methodref          #54.#55        // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #49 = Utf8               ENHANCE: : \u0001
  #50 = Utf8               makeConcatWithConstants
  #51 = Class              #56            // java/lang/invoke/LambdaMetafactory
  #52 = NameAndType        #57:#61        // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #53 = NameAndType        #23:#24        // lambda$new$0:(Ljava/lang/String;)Ljava/lang/String;
  #54 = Class              #62            // java/lang/invoke/StringConcatFactory
  #55 = NameAndType        #50:#63        // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #56 = Utf8               java/lang/invoke/LambdaMetafactory
  #57 = Utf8               metafactory
  #58 = Class              #65            // java/lang/invoke/MethodHandles$Lookup
  #59 = Utf8               Lookup
  #60 = Utf8               InnerClasses
  #61 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #62 = Utf8               java/lang/invoke/StringConcatFactory
  #63 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #64 = Class              #66            // java/lang/invoke/MethodHandles
  #65 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #66 = Utf8               java/lang/invoke/MethodHandles
{
  private final java.lang.String instanceVar;
    descriptor: Ljava/lang/String;
    flags: (0x0012) ACC_PRIVATE, ACC_FINAL
    ConstantValue: String ENHANCE:

  private final java.util.function.Function<java.lang.String, java.lang.String> MAGIC_FUNCTION;
    descriptor: Ljava/util/function/Function;
    flags: (0x0012) ACC_PRIVATE, ACC_FINAL
    Signature: #15                          // Ljava/util/function/Function<Ljava/lang/String;Ljava/lang/String;>;

  public pbouda.bytecode.examples.InstanceGlobalLambda2();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: ldc           #2                  // String ENHANCE:
         7: putfield      #3                  // Field instanceVar:Ljava/lang/String;
        10: aload_0
        11: aload_0
        12: invokedynamic #4,  0              // InvokeDynamic #0:apply:(Lpbouda/bytecode/examples/InstanceGlobalLambda2;)Ljava/util/function/Function;
        17: putfield      #5                  // Field MAGIC_FUNCTION:Ljava/util/function/Function;
        20: return
      LineNumberTable:
        line 5: 0
        line 7: 4
        line 9: 10
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      21     0  this   Lpbouda/bytecode/examples/InstanceGlobalLambda2;

  private java.lang.String lambda$new$0(java.lang.String);
    descriptor: (Ljava/lang/String;)Ljava/lang/String;
    flags: (0x1002) ACC_PRIVATE, ACC_SYNTHETIC
    Code:
      stack=1, locals=2, args_size=2
         0: aload_1
         1: invokedynamic #6,  0              // InvokeDynamic #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
         6: areturn
      LineNumberTable:
        line 9: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lpbouda/bytecode/examples/InstanceGlobalLambda2;
            0       7     1  text   Ljava/lang/String;
}
SourceFile: "InstanceGlobalLambda2.java"
InnerClasses:
  public static final #59= #58 of #64;    // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
BootstrapMethods:
  0: #32 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #33 (Ljava/lang/Object;)Ljava/lang/Object;
      #34 REF_invokeSpecial pbouda/bytecode/examples/InstanceGlobalLambda2.lambda$new$0:(Ljava/lang/String;)Ljava/lang/String;
      #35 (Ljava/lang/String;)Ljava/lang/String;
  1: #38 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #39 ENHANCE: : \u0001
```

