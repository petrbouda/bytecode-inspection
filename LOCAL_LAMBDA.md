# Local Lambda

- Created a private static method implementing our functional interface
- `BootstrapMethod` for LambdaMetafactory
- https://docs.oracle.com/javase/10/docs/api/java/lang/invoke/LambdaMetafactory.html
- `CallSite` is a holder for MethodHandler variable
- https://docs.oracle.com/javase/10/docs/api/java/lang/invoke/CallSite.html
- `InvokeDynamic #0:apply:()Ljava/util/function/Function;` - `#0` is an index of BootstrapMethod

```
javap -v -p inspection/target/classes/pbouda/bytecode/inspection/LocalLambda.class
Classfile /Users/pbouda/IdeaProjects/bytecode-inspection/inspection/target/classes/pbouda/bytecode/inspection/LocalLambda.class
  Last modified Jul 29, 2018; size 1489 bytes
  MD5 checksum 7c1246926857f4790edf72fa799dbe07
  Compiled from "LocalLambda.java"
public class pbouda.bytecode.inspection.LocalLambda
  minor version: 0
  major version: 54
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // pbouda/bytecode/inspection/LocalLambda
  super_class: #9                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 3, attributes: 3
Constant pool:
   #1 = Methodref          #9.#28         // java/lang/Object."<init>":()V
   #2 = InvokeDynamic      #0:#34         // #0:apply:()Ljava/util/function/Function;
   #3 = Fieldref           #35.#36        // java/lang/System.out:Ljava/io/PrintStream;
   #4 = String             #37            // Text
   #5 = InterfaceMethodref #38.#39        // java/util/function/Function.apply:(Ljava/lang/Object;)Ljava/lang/Object;
   #6 = Class              #40            // java/lang/String
   #7 = Methodref          #41.#42        // java/io/PrintStream.println:(Ljava/lang/String;)V
   #8 = Class              #43            // pbouda/bytecode/inspection/LocalLambda
   #9 = Class              #44            // java/lang/Object
  #10 = Utf8               <init>
  #11 = Utf8               ()V
  #12 = Utf8               Code
  #13 = Utf8               LineNumberTable
  #14 = Utf8               LocalVariableTable
  #15 = Utf8               this
  #16 = Utf8               Lpbouda/bytecode/inspection/LocalLambda;
  #17 = Utf8               instanceMethod
  #18 = Utf8               magicLambda
  #19 = Utf8               Ljava/util/function/Function;
  #20 = Utf8               LocalVariableTypeTable
  #21 = Utf8               Ljava/util/function/Function<Ljava/lang/String;Ljava/lang/String;>;
  #22 = Utf8               lambda$instanceMethod$0
  #23 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #24 = Utf8               text
  #25 = Utf8               Ljava/lang/String;
  #26 = Utf8               SourceFile
  #27 = Utf8               LocalLambda.java
  #28 = NameAndType        #10:#11        // "<init>":()V
  #29 = Utf8               BootstrapMethods
  #30 = MethodHandle       6:#45          // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #31 = MethodType         #46            //  (Ljava/lang/Object;)Ljava/lang/Object;
  #32 = MethodHandle       6:#47          // REF_invokeStatic pbouda/bytecode/inspection/LocalLambda.lambda$instanceMethod$0:(Ljava/lang/String;)Ljava/lang/String;
  #33 = MethodType         #23            //  (Ljava/lang/String;)Ljava/lang/String;
  #34 = NameAndType        #48:#49        // apply:()Ljava/util/function/Function;
  #35 = Class              #50            // java/lang/System
  #36 = NameAndType        #51:#52        // out:Ljava/io/PrintStream;
  #37 = Utf8               Text
  #38 = Class              #53            // java/util/function/Function
  #39 = NameAndType        #48:#46        // apply:(Ljava/lang/Object;)Ljava/lang/Object;
  #40 = Utf8               java/lang/String
  #41 = Class              #54            // java/io/PrintStream
  #42 = NameAndType        #55:#56        // println:(Ljava/lang/String;)V
  #43 = Utf8               pbouda/bytecode/inspection/LocalLambda
  #44 = Utf8               java/lang/Object
  #45 = Methodref          #57.#58        // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #46 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #47 = Methodref          #8.#59         // pbouda/bytecode/inspection/LocalLambda.lambda$instanceMethod$0:(Ljava/lang/String;)Ljava/lang/String;
  #48 = Utf8               apply
  #49 = Utf8               ()Ljava/util/function/Function;
  #50 = Utf8               java/lang/System
  #51 = Utf8               out
  #52 = Utf8               Ljava/io/PrintStream;
  #53 = Utf8               java/util/function/Function
  #54 = Utf8               java/io/PrintStream
  #55 = Utf8               println
  #56 = Utf8               (Ljava/lang/String;)V
  #57 = Class              #60            // java/lang/invoke/LambdaMetafactory
  #58 = NameAndType        #61:#65        // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #59 = NameAndType        #22:#23        // lambda$instanceMethod$0:(Ljava/lang/String;)Ljava/lang/String;
  #60 = Utf8               java/lang/invoke/LambdaMetafactory
  #61 = Utf8               metafactory
  #62 = Class              #67            // java/lang/invoke/MethodHandles$Lookup
  #63 = Utf8               Lookup
  #64 = Utf8               InnerClasses
  #65 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #66 = Class              #68            // java/lang/invoke/MethodHandles
  #67 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #68 = Utf8               java/lang/invoke/MethodHandles
{
  public pbouda.bytecode.inspection.LocalLambda();
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
            0       5     0  this   Lpbouda/bytecode/inspection/LocalLambda;

  public void instanceMethod();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=1
         0: invokedynamic #2,  0              // InvokeDynamic #0:apply:()Ljava/util/function/Function;
         5: astore_1
         6: getstatic     #3                  // Field java/lang/System.out:Ljava/io/PrintStream;
         9: aload_1
        10: ldc           #4                  // String Text
        12: invokeinterface #5,  2            // InterfaceMethod java/util/function/Function.apply:(Ljava/lang/Object;)Ljava/lang/Object;
        17: checkcast     #6                  // class java/lang/String
        20: invokevirtual #7                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
        23: return
      LineNumberTable:
        line 8: 0
        line 9: 6
        line 10: 23
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      24     0  this   Lpbouda/bytecode/inspection/LocalLambda;
            6      18     1 magicLambda   Ljava/util/function/Function;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            6      18     1 magicLambda   Ljava/util/function/Function<Ljava/lang/String;Ljava/lang/String;>;

  private static java.lang.String lambda$instanceMethod$0(java.lang.String);
    descriptor: (Ljava/lang/String;)Ljava/lang/String;
    flags: (0x100a) ACC_PRIVATE, ACC_STATIC, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: areturn
      LineNumberTable:
        line 8: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  text   Ljava/lang/String;
}
SourceFile: "LocalLambda.java"
InnerClasses:
  public static final #63= #62 of #66;    // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
BootstrapMethods:
  0: #30 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #31 (Ljava/lang/Object;)Ljava/lang/Object;
      #32 REF_invokeStatic pbouda/bytecode/inspection/LocalLambda.lambda$instanceMethod$0:(Ljava/lang/String;)Ljava/lang/String;
      #33 (Ljava/lang/String;)Ljava/lang/String;
```