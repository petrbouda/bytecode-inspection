# Static Global Lambda

```
private static java.lang.String lambda$static$0(java.lang.String);
    descriptor: (Ljava/lang/String;)Ljava/lang/String;
    flags: (0x100a) ACC_PRIVATE, ACC_STATIC, ACC_SYNTHETIC
```

- Static method generated - `ACC_SYNTHETIC`
- Lambda registered in a static initializing block
- More info in LOCAL_LAMBDA.md

```
javap -v -p inspection/target/classes/pbouda/bytecode/inspection/StaticGlobalLambda.class
Classfile /Users/pbouda/IdeaProjects/bytecode-inspection/inspection/target/classes/pbouda/bytecode/inspection/StaticGlobalLambda.class
  Last modified Jul 29, 2018; size 1237 bytes
  MD5 checksum 5aeecf3356405cf4f8913414a7825e9f
  Compiled from "StaticGlobalLambda.java"
public class pbouda.bytecode.inspection.StaticGlobalLambda
  minor version: 0
  major version: 54
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #4                          // pbouda/bytecode/inspection/StaticGlobalLambda
  super_class: #5                         // java/lang/Object
  interfaces: 0, fields: 1, methods: 3, attributes: 3
Constant pool:
   #1 = Methodref          #5.#24         // java/lang/Object."<init>":()V
   #2 = InvokeDynamic      #0:#30         // #0:apply:()Ljava/util/function/Function;
   #3 = Fieldref           #4.#31         // pbouda/bytecode/inspection/StaticGlobalLambda.MAGIC_FUNCTION:Ljava/util/function/Function;
   #4 = Class              #32            // pbouda/bytecode/inspection/StaticGlobalLambda
   #5 = Class              #33            // java/lang/Object
   #6 = Utf8               MAGIC_FUNCTION
   #7 = Utf8               Ljava/util/function/Function;
   #8 = Utf8               Signature
   #9 = Utf8               Ljava/util/function/Function<Ljava/lang/String;Ljava/lang/String;>;
  #10 = Utf8               <init>
  #11 = Utf8               ()V
  #12 = Utf8               Code
  #13 = Utf8               LineNumberTable
  #14 = Utf8               LocalVariableTable
  #15 = Utf8               this
  #16 = Utf8               Lpbouda/bytecode/inspection/StaticGlobalLambda;
  #17 = Utf8               lambda$static$0
  #18 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #19 = Utf8               text
  #20 = Utf8               Ljava/lang/String;
  #21 = Utf8               <clinit>
  #22 = Utf8               SourceFile
  #23 = Utf8               StaticGlobalLambda.java
  #24 = NameAndType        #10:#11        // "<init>":()V
  #25 = Utf8               BootstrapMethods
  #26 = MethodHandle       6:#34          // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #27 = MethodType         #35            //  (Ljava/lang/Object;)Ljava/lang/Object;
  #28 = MethodHandle       6:#36          // REF_invokeStatic pbouda/bytecode/inspection/StaticGlobalLambda.lambda$static$0:(Ljava/lang/String;)Ljava/lang/String;
  #29 = MethodType         #18            //  (Ljava/lang/String;)Ljava/lang/String;
  #30 = NameAndType        #37:#38        // apply:()Ljava/util/function/Function;
  #31 = NameAndType        #6:#7          // MAGIC_FUNCTION:Ljava/util/function/Function;
  #32 = Utf8               pbouda/bytecode/inspection/StaticGlobalLambda
  #33 = Utf8               java/lang/Object
  #34 = Methodref          #39.#40        // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #35 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #36 = Methodref          #4.#41         // pbouda/bytecode/inspection/StaticGlobalLambda.lambda$static$0:(Ljava/lang/String;)Ljava/lang/String;
  #37 = Utf8               apply
  #38 = Utf8               ()Ljava/util/function/Function;
  #39 = Class              #42            // java/lang/invoke/LambdaMetafactory
  #40 = NameAndType        #43:#47        // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #41 = NameAndType        #17:#18        // lambda$static$0:(Ljava/lang/String;)Ljava/lang/String;
  #42 = Utf8               java/lang/invoke/LambdaMetafactory
  #43 = Utf8               metafactory
  #44 = Class              #49            // java/lang/invoke/MethodHandles$Lookup
  #45 = Utf8               Lookup
  #46 = Utf8               InnerClasses
  #47 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #48 = Class              #50            // java/lang/invoke/MethodHandles
  #49 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #50 = Utf8               java/lang/invoke/MethodHandles
{
  private static final java.util.function.Function<java.lang.String, java.lang.String> MAGIC_FUNCTION;
    descriptor: Ljava/util/function/Function;
    flags: (0x001a) ACC_PRIVATE, ACC_STATIC, ACC_FINAL
    Signature: #9                           // Ljava/util/function/Function<Ljava/lang/String;Ljava/lang/String;>;

  public pbouda.bytecode.inspection.StaticGlobalLambda();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 5: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lpbouda/bytecode/inspection/StaticGlobalLambda;

  private static java.lang.String lambda$static$0(java.lang.String);
    descriptor: (Ljava/lang/String;)Ljava/lang/String;
    flags: (0x100a) ACC_PRIVATE, ACC_STATIC, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: areturn
      LineNumberTable:
        line 7: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  text   Ljava/lang/String;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: invokedynamic #2,  0              // InvokeDynamic #0:apply:()Ljava/util/function/Function;
         5: putstatic     #3                  // Field MAGIC_FUNCTION:Ljava/util/function/Function;
         8: return
      LineNumberTable:
        line 7: 0
}
SourceFile: "StaticGlobalLambda.java"
InnerClasses:
  public static final #45= #44 of #48;    // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
BootstrapMethods:
  0: #26 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #27 (Ljava/lang/Object;)Ljava/lang/Object;
      #28 REF_invokeStatic pbouda/bytecode/inspection/StaticGlobalLambda.lambda$static$0:(Ljava/lang/String;)Ljava/lang/String;
      #29 (Ljava/lang/String;)Ljava/lang/String;
```

