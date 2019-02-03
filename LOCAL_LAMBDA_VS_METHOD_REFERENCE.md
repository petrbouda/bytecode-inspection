# Local Lambda vs Method Reference

- Absolutely the same!

```
javap -v -p examples/target/classes/pbouda/bytecode/examples/LocalLambdaMethodReference.class
Classfile /home/pbouda/experiments/bytecode-practise/examples/target/classes/pbouda/bytecode/examples/LocalLambdaMethodReference.class
  Last modified Feb 3, 2019; size 1744 bytes
  MD5 checksum ac255dfbebb901d7489aa14a76a89da7
  Compiled from "LocalLambdaMethodReference.java"
public class pbouda.bytecode.examples.LocalLambdaMethodReference
  minor version: 0
  major version: 54
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #10                         // pbouda/bytecode/examples/LocalLambdaMethodReference
  super_class: #11                        // java/lang/Object
  interfaces: 0, fields: 0, methods: 4, attributes: 3
Constant pool:
   #1 = Methodref          #11.#32        // java/lang/Object."<init>":()V
   #2 = InvokeDynamic      #0:#38         // #0:apply:()Ljava/util/function/Function;
   #3 = Fieldref           #39.#40        // java/lang/System.out:Ljava/io/PrintStream;
   #4 = String             #41            // Text
   #5 = InterfaceMethodref #42.#43        // java/util/function/Function.apply:(Ljava/lang/Object;)Ljava/lang/Object;
   #6 = Class              #44            // java/lang/String
   #7 = Methodref          #45.#46        // java/io/PrintStream.println:(Ljava/lang/String;)V
   #8 = InvokeDynamic      #1:#38         // #1:apply:()Ljava/util/function/Function;
   #9 = Methodref          #6.#48         // java/lang/String.toUpperCase:()Ljava/lang/String;
  #10 = Class              #49            // pbouda/bytecode/examples/LocalLambdaMethodReference
  #11 = Class              #50            // java/lang/Object
  #12 = Utf8               <init>
  #13 = Utf8               ()V
  #14 = Utf8               Code
  #15 = Utf8               LineNumberTable
  #16 = Utf8               LocalVariableTable
  #17 = Utf8               this
  #18 = Utf8               Lpbouda/bytecode/examples/LocalLambdaMethodReference;
  #19 = Utf8               instanceMethod
  #20 = Utf8               magicLambda
  #21 = Utf8               Ljava/util/function/Function;
  #22 = Utf8               methodReference
  #23 = Utf8               LocalVariableTypeTable
  #24 = Utf8               Ljava/util/function/Function<Ljava/lang/String;Ljava/lang/String;>;
  #25 = Utf8               upper
  #26 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #27 = Utf8               text
  #28 = Utf8               Ljava/lang/String;
  #29 = Utf8               lambda$instanceMethod$0
  #30 = Utf8               SourceFile
  #31 = Utf8               LocalLambdaMethodReference.java
  #32 = NameAndType        #12:#13        // "<init>":()V
  #33 = Utf8               BootstrapMethods
  #34 = MethodHandle       6:#51          // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #35 = MethodType         #52            //  (Ljava/lang/Object;)Ljava/lang/Object;
  #36 = MethodHandle       6:#53          // REF_invokeStatic pbouda/bytecode/examples/LocalLambdaMethodReference.lambda$instanceMethod$0:(Ljava/lang/String;)Ljava/lang/String;
  #37 = MethodType         #26            //  (Ljava/lang/String;)Ljava/lang/String;
  #38 = NameAndType        #54:#55        // apply:()Ljava/util/function/Function;
  #39 = Class              #56            // java/lang/System
  #40 = NameAndType        #57:#58        // out:Ljava/io/PrintStream;
  #41 = Utf8               Text
  #42 = Class              #59            // java/util/function/Function
  #43 = NameAndType        #54:#52        // apply:(Ljava/lang/Object;)Ljava/lang/Object;
  #44 = Utf8               java/lang/String
  #45 = Class              #60            // java/io/PrintStream
  #46 = NameAndType        #61:#62        // println:(Ljava/lang/String;)V
  #47 = MethodHandle       6:#63          // REF_invokeStatic pbouda/bytecode/examples/LocalLambdaMethodReference.upper:(Ljava/lang/String;)Ljava/lang/String;
  #48 = NameAndType        #64:#65        // toUpperCase:()Ljava/lang/String;
  #49 = Utf8               pbouda/bytecode/examples/LocalLambdaMethodReference
  #50 = Utf8               java/lang/Object
  #51 = Methodref          #66.#67        // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #52 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #53 = Methodref          #10.#68        // pbouda/bytecode/examples/LocalLambdaMethodReference.lambda$instanceMethod$0:(Ljava/lang/String;)Ljava/lang/String;
  #54 = Utf8               apply
  #55 = Utf8               ()Ljava/util/function/Function;
  #56 = Utf8               java/lang/System
  #57 = Utf8               out
  #58 = Utf8               Ljava/io/PrintStream;
  #59 = Utf8               java/util/function/Function
  #60 = Utf8               java/io/PrintStream
  #61 = Utf8               println
  #62 = Utf8               (Ljava/lang/String;)V
  #63 = Methodref          #10.#69        // pbouda/bytecode/examples/LocalLambdaMethodReference.upper:(Ljava/lang/String;)Ljava/lang/String;
  #64 = Utf8               toUpperCase
  #65 = Utf8               ()Ljava/lang/String;
  #66 = Class              #70            // java/lang/invoke/LambdaMetafactory
  #67 = NameAndType        #71:#75        // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #68 = NameAndType        #29:#26        // lambda$instanceMethod$0:(Ljava/lang/String;)Ljava/lang/String;
  #69 = NameAndType        #25:#26        // upper:(Ljava/lang/String;)Ljava/lang/String;
  #70 = Utf8               java/lang/invoke/LambdaMetafactory
  #71 = Utf8               metafactory
  #72 = Class              #77            // java/lang/invoke/MethodHandles$Lookup
  #73 = Utf8               Lookup
  #74 = Utf8               InnerClasses
  #75 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #76 = Class              #78            // java/lang/invoke/MethodHandles
  #77 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #78 = Utf8               java/lang/invoke/MethodHandles
{
  public pbouda.bytecode.examples.LocalLambdaMethodReference();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 6: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lpbouda/bytecode/examples/LocalLambdaMethodReference;

  public void instanceMethod();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=1
         0: invokedynamic #2,  0              // InvokeDynamic #0:apply:()Ljava/util/function/Function;
         5: astore_1
         6: getstatic     #3                  // Field java/lang/System.out:Ljava/io/PrintStream;
         9: aload_1
        10: ldc           #4                  // String Text
        12: invokeinterface #5,  2            // InterfaceMethod java/util/function/Function.apply:(Ljava/lang/Object;)Ljava/lang/Object;
        17: checkcast     #6                  // class java/lang/String
        20: invokevirtual #7                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
        23: invokedynamic #8,  0              // InvokeDynamic #1:apply:()Ljava/util/function/Function;
        28: astore_2
        29: getstatic     #3                  // Field java/lang/System.out:Ljava/io/PrintStream;
        32: aload_2
        33: ldc           #4                  // String Text
        35: invokeinterface #5,  2            // InterfaceMethod java/util/function/Function.apply:(Ljava/lang/Object;)Ljava/lang/Object;
        40: checkcast     #6                  // class java/lang/String
        43: invokevirtual #7                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
        46: return
      LineNumberTable:
        line 9: 0
        line 10: 6
        line 12: 23
        line 14: 29
        line 15: 46
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      47     0  this   Lpbouda/bytecode/examples/LocalLambdaMethodReference;
            6      41     1 magicLambda   Ljava/util/function/Function;
           29      18     2 methodReference   Ljava/util/function/Function;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            6      41     1 magicLambda   Ljava/util/function/Function<Ljava/lang/String;Ljava/lang/String;>;
           29      18     2 methodReference   Ljava/util/function/Function<Ljava/lang/String;Ljava/lang/String;>;

  private static java.lang.String upper(java.lang.String);
    descriptor: (Ljava/lang/String;)Ljava/lang/String;
    flags: (0x000a) ACC_PRIVATE, ACC_STATIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #9                  // Method java/lang/String.toUpperCase:()Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 18: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  text   Ljava/lang/String;

  private static java.lang.String lambda$instanceMethod$0(java.lang.String);
    descriptor: (Ljava/lang/String;)Ljava/lang/String;
    flags: (0x100a) ACC_PRIVATE, ACC_STATIC, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: areturn
      LineNumberTable:
        line 9: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  text   Ljava/lang/String;
}
SourceFile: "LocalLambdaMethodReference.java"
InnerClasses:
  public static final #73= #72 of #76;    // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
BootstrapMethods:
  0: #34 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #35 (Ljava/lang/Object;)Ljava/lang/Object;
      #36 REF_invokeStatic pbouda/bytecode/examples/LocalLambdaMethodReference.lambda$instanceMethod$0:(Ljava/lang/String;)Ljava/lang/String;
      #37 (Ljava/lang/String;)Ljava/lang/String;
  1: #34 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #35 (Ljava/lang/Object;)Ljava/lang/Object;
      #47 REF_invokeStatic pbouda/bytecode/examples/LocalLambdaMethodReference.upper:(Ljava/lang/String;)Ljava/lang/String;
      #37 (Ljava/lang/String;)Ljava/lang/String;
```