# Instance Global Lambda

```
private static java.lang.String lambda$new$0(java.lang.String);
    descriptor: (Ljava/lang/String;)Ljava/lang/String;
    flags: (0x100a) ACC_PRIVATE, ACC_STATIC, ACC_SYNTHETIC
```

- Static method generated - `ACC_SYNTHETIC`
- Lambda registered in a constructor
- More info in LOCAL_LAMBDA.md

```
$ javap -v -p examples/target/classes/pbouda/bytecode/examples/InstanceGlobalLambda.class

Classfile /Users/pbouda/IdeaProjects/bytecode-examples/examples/target/classes/pbouda/bytecode/examples/InstanceGlobalLambda.class
  Last modified Jul 29, 2018; size 1812 bytes
  MD5 checksum 97d0a7cdb9cae156ce972ab0fccfa076
  Compiled from "InstanceGlobalLambda.java"
public class pbouda.bytecode.examples.InstanceGlobalLambda
  minor version: 0
  major version: 54
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #10                         // pbouda/bytecode/examples/InstanceGlobalLambda
  super_class: #11                        // java/lang/Object
  interfaces: 0, fields: 1, methods: 3, attributes: 3
Constant pool:
   #1 = Methodref          #11.#31        // java/lang/Object."<init>":()V
   #2 = InvokeDynamic      #0:#37         // #0:apply:()Ljava/util/function/Function;
   #3 = Fieldref           #10.#38        // pbouda/bytecode/examples/InstanceGlobalLambda.ENHANCE_FUNCTION:Ljava/util/function/Function;
   #4 = String             #39            // Hello World
   #5 = InterfaceMethodref #40.#41        // java/util/function/Function.apply:(Ljava/lang/Object;)Ljava/lang/Object;
   #6 = Class              #42            // java/lang/String
   #7 = Fieldref           #43.#44        // java/lang/System.out:Ljava/io/PrintStream;
   #8 = Methodref          #45.#46        // java/io/PrintStream.println:(Ljava/lang/String;)V
   #9 = InvokeDynamic      #1:#49         // #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #10 = Class              #50            // pbouda/bytecode/examples/InstanceGlobalLambda
  #11 = Class              #51            // java/lang/Object
  #12 = Utf8               ENHANCE_FUNCTION
  #13 = Utf8               Ljava/util/function/Function;
  #14 = Utf8               Signature
  #15 = Utf8               Ljava/util/function/Function<Ljava/lang/String;Ljava/lang/String;>;
  #16 = Utf8               <init>
  #17 = Utf8               ()V
  #18 = Utf8               Code
  #19 = Utf8               LineNumberTable
  #20 = Utf8               LocalVariableTable
  #21 = Utf8               this
  #22 = Utf8               Lpbouda/bytecode/examples/InstanceGlobalLambda;
  #23 = Utf8               instanceMethod
  #24 = Utf8               helloWorld
  #25 = Utf8               Ljava/lang/String;
  #26 = Utf8               lambda$new$0
  #27 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #28 = Utf8               text
  #29 = Utf8               SourceFile
  #30 = Utf8               InstanceGlobalLambda.java
  #31 = NameAndType        #16:#17        // "<init>":()V
  #32 = Utf8               BootstrapMethods
  #33 = MethodHandle       6:#52          // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #34 = MethodType         #53            //  (Ljava/lang/Object;)Ljava/lang/Object;
  #35 = MethodHandle       6:#54          // REF_invokeStatic pbouda/bytecode/examples/InstanceGlobalLambda.lambda$new$0:(Ljava/lang/String;)Ljava/lang/String;
  #36 = MethodType         #27            //  (Ljava/lang/String;)Ljava/lang/String;
  #37 = NameAndType        #55:#56        // apply:()Ljava/util/function/Function;
  #38 = NameAndType        #12:#13        // ENHANCE_FUNCTION:Ljava/util/function/Function;
  #39 = Utf8               Hello World
  #40 = Class              #57            // java/util/function/Function
  #41 = NameAndType        #55:#53        // apply:(Ljava/lang/Object;)Ljava/lang/Object;
  #42 = Utf8               java/lang/String
  #43 = Class              #58            // java/lang/System
  #44 = NameAndType        #59:#60        // out:Ljava/io/PrintStream;
  #45 = Class              #61            // java/io/PrintStream
  #46 = NameAndType        #62:#63        // println:(Ljava/lang/String;)V
  #47 = MethodHandle       6:#64          // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #48 = String             #65            // ENHANCED: \u0001
  #49 = NameAndType        #66:#27        // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #50 = Utf8               pbouda/bytecode/examples/InstanceGlobalLambda
  #51 = Utf8               java/lang/Object
  #52 = Methodref          #67.#68        // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #53 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #54 = Methodref          #10.#69        // pbouda/bytecode/examples/InstanceGlobalLambda.lambda$new$0:(Ljava/lang/String;)Ljava/lang/String;
  #55 = Utf8               apply
  #56 = Utf8               ()Ljava/util/function/Function;
  #57 = Utf8               java/util/function/Function
  #58 = Utf8               java/lang/System
  #59 = Utf8               out
  #60 = Utf8               Ljava/io/PrintStream;
  #61 = Utf8               java/io/PrintStream
  #62 = Utf8               println
  #63 = Utf8               (Ljava/lang/String;)V
  #64 = Methodref          #70.#71        // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #65 = Utf8               ENHANCED: \u0001
  #66 = Utf8               makeConcatWithConstants
  #67 = Class              #72            // java/lang/invoke/LambdaMetafactory
  #68 = NameAndType        #73:#77        // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #69 = NameAndType        #26:#27        // lambda$new$0:(Ljava/lang/String;)Ljava/lang/String;
  #70 = Class              #78            // java/lang/invoke/StringConcatFactory
  #71 = NameAndType        #66:#79        // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #72 = Utf8               java/lang/invoke/LambdaMetafactory
  #73 = Utf8               metafactory
  #74 = Class              #81            // java/lang/invoke/MethodHandles$Lookup
  #75 = Utf8               Lookup
  #76 = Utf8               InnerClasses
  #77 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #78 = Utf8               java/lang/invoke/StringConcatFactory
  #79 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #80 = Class              #82            // java/lang/invoke/MethodHandles
  #81 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #82 = Utf8               java/lang/invoke/MethodHandles
{
  private final java.util.function.Function<java.lang.String, java.lang.String> ENHANCE_FUNCTION;
    descriptor: Ljava/util/function/Function;
    flags: (0x0012) ACC_PRIVATE, ACC_FINAL
    Signature: #15                          // Ljava/util/function/Function<Ljava/lang/String;Ljava/lang/String;>;

  public pbouda.bytecode.examples.InstanceGlobalLambda();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: invokedynamic #2,  0              // InvokeDynamic #0:apply:()Ljava/util/function/Function;
        10: putfield      #3                  // Field ENHANCE_FUNCTION:Ljava/util/function/Function;
        13: return
      LineNumberTable:
        line 5: 0
        line 7: 4
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lpbouda/bytecode/examples/InstanceGlobalLambda;

  public void instanceMethod();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=1
         0: aload_0
         1: getfield      #3                  // Field ENHANCE_FUNCTION:Ljava/util/function/Function;
         4: ldc           #4                  // String Hello World
         6: invokeinterface #5,  2            // InterfaceMethod java/util/function/Function.apply:(Ljava/lang/Object;)Ljava/lang/Object;
        11: checkcast     #6                  // class java/lang/String
        14: astore_1
        15: getstatic     #7                  // Field java/lang/System.out:Ljava/io/PrintStream;
        18: aload_1
        19: invokevirtual #8                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
        22: return
      LineNumberTable:
        line 11: 0
        line 12: 15
        line 13: 22
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      23     0  this   Lpbouda/bytecode/examples/InstanceGlobalLambda;
           15       8     1 helloWorld   Ljava/lang/String;

  private static java.lang.String lambda$new$0(java.lang.String);
    descriptor: (Ljava/lang/String;)Ljava/lang/String;
    flags: (0x100a) ACC_PRIVATE, ACC_STATIC, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokedynamic #9,  0              // InvokeDynamic #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
         6: areturn
      LineNumberTable:
        line 8: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  text   Ljava/lang/String;
}
SourceFile: "InstanceGlobalLambda.java"
InnerClasses:
  public static final #75= #74 of #80;    // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
BootstrapMethods:
  0: #33 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #34 (Ljava/lang/Object;)Ljava/lang/Object;
      #35 REF_invokeStatic pbouda/bytecode/examples/InstanceGlobalLambda.lambda$new$0:(Ljava/lang/String;)Ljava/lang/String;
      #36 (Ljava/lang/String;)Ljava/lang/String;
  1: #47 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #48 ENHANCED: \u0001
```

