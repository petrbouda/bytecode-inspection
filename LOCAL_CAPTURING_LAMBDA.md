# Local Capturing Lambda

```
javap -v -p target/classes/pbouda/bytecode/examples/LocalCapturingLambda.class
Classfile /home/pbouda/experiments/bytecode-practise/examples/target/classes/pbouda/bytecode/examples/LocalCapturingLambda.class
  Last modified Nov 14, 2019; size 3491 bytes
  MD5 checksum f429e4c5069156d45979ab7f0f7f045d
  Compiled from "LocalCapturingLambda.java"
public class pbouda.bytecode.examples.LocalCapturingLambda
  minor version: 0
  major version: 54
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #10                         // pbouda/bytecode/examples/LocalCapturingLambda
  super_class: #17                        // java/lang/Object
  interfaces: 0, fields: 1, methods: 3, attributes: 3
Constant pool:
    #1 = Methodref          #17.#52       // java/lang/Object."<init>":()V
    #2 = Methodref          #53.#54       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
    #3 = Methodref          #53.#55       // java/lang/Integer.intValue:()I
    #4 = InvokeDynamic      #0:#61        // #0:apply:(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Ljava/util/function/Function;
    #5 = Fieldref           #62.#63       // java/lang/System.out:Ljava/io/PrintStream;
    #6 = String             #64           // Text
    #7 = InterfaceMethodref #65.#66       // java/util/function/Function.apply:(Ljava/lang/Object;)Ljava/lang/Object;
    #8 = Class              #67           // java/lang/String
    #9 = Methodref          #68.#69       // java/io/PrintStream.println:(Ljava/lang/String;)V
   #10 = Class              #70           // pbouda/bytecode/examples/LocalCapturingLambda
   #11 = String             #71           // my_string
   #12 = InvokeDynamic      #1:#75        // #1:test:(Ljava/lang/String;)Ljava/util/function/Predicate;
   #13 = String             #49           // text
   #14 = InterfaceMethodref #76.#77       // java/util/function/Predicate.test:(Ljava/lang/Object;)Z
   #15 = Methodref          #68.#78       // java/io/PrintStream.println:(Z)V
   #16 = InvokeDynamic      #2:#81        // #2:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Ljava/lang/String;
   #17 = Class              #82           // java/lang/Object
   #18 = Utf8               MY_STRING
   #19 = Utf8               Ljava/lang/String;
   #20 = Utf8               ConstantValue
   #21 = Utf8               <init>
   #22 = Utf8               ()V
   #23 = Utf8               Code
   #24 = Utf8               LineNumberTable
   #25 = Utf8               LocalVariableTable
   #26 = Utf8               this
   #27 = Utf8               Lpbouda/bytecode/examples/LocalCapturingLambda;
   #28 = Utf8               instanceMethod
   #29 = Utf8               integer1
   #30 = Utf8               Ljava/lang/Integer;
   #31 = Utf8               integer2
   #32 = Utf8               integer3
   #33 = Utf8               integer4
   #34 = Utf8               integer5
   #35 = Utf8               integer6
   #36 = Utf8               integer7
   #37 = Utf8               integer8
   #38 = Utf8               integer9
   #39 = Utf8               integer10
   #40 = Utf8               magicLambda
   #41 = Utf8               Ljava/util/function/Function;
   #42 = Utf8               magicPredicate
   #43 = Utf8               Ljava/util/function/Predicate;
   #44 = Utf8               LocalVariableTypeTable
   #45 = Utf8               Ljava/util/function/Function<Ljava/lang/String;Ljava/lang/String;>;
   #46 = Utf8               Ljava/util/function/Predicate<Ljava/lang/String;>;
   #47 = Utf8               lambda$instanceMethod$0
   #48 = Utf8               (Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Ljava/lang/String;
   #49 = Utf8               text
   #50 = Utf8               SourceFile
   #51 = Utf8               LocalCapturingLambda.java
   #52 = NameAndType        #21:#22       // "<init>":()V
   #53 = Class              #83           // java/lang/Integer
   #54 = NameAndType        #84:#85       // valueOf:(I)Ljava/lang/Integer;
   #55 = NameAndType        #86:#87       // intValue:()I
   #56 = Utf8               BootstrapMethods
   #57 = MethodHandle       6:#88         // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
   #58 = MethodType         #89           //  (Ljava/lang/Object;)Ljava/lang/Object;
   #59 = MethodHandle       6:#90         // REF_invokeStatic pbouda/bytecode/examples/LocalCapturingLambda.lambda$instanceMethod$0:(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Ljava/lang/String;
   #60 = MethodType         #91           //  (Ljava/lang/String;)Ljava/lang/String;
   #61 = NameAndType        #92:#93       // apply:(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Ljava/util/function/Function;
   #62 = Class              #94           // java/lang/System
   #63 = NameAndType        #95:#96       // out:Ljava/io/PrintStream;
   #64 = Utf8               Text
   #65 = Class              #97           // java/util/function/Function
   #66 = NameAndType        #92:#89       // apply:(Ljava/lang/Object;)Ljava/lang/Object;
   #67 = Utf8               java/lang/String
   #68 = Class              #98           // java/io/PrintStream
   #69 = NameAndType        #99:#100      // println:(Ljava/lang/String;)V
   #70 = Utf8               pbouda/bytecode/examples/LocalCapturingLambda
   #71 = Utf8               my_string
   #72 = MethodType         #101          //  (Ljava/lang/Object;)Z
   #73 = MethodHandle       5:#102        // REF_invokeVirtual java/lang/String.equals:(Ljava/lang/Object;)Z
   #74 = MethodType         #103          //  (Ljava/lang/String;)Z
   #75 = NameAndType        #104:#105     // test:(Ljava/lang/String;)Ljava/util/function/Predicate;
   #76 = Class              #106          // java/util/function/Predicate
   #77 = NameAndType        #104:#101     // test:(Ljava/lang/Object;)Z
   #78 = NameAndType        #99:#107      // println:(Z)V
   #79 = MethodHandle       6:#108        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #80 = String             #109          // \u0001 my_string \u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001
   #81 = NameAndType        #110:#111     // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Ljava/lang/String;
   #82 = Utf8               java/lang/Object
   #83 = Utf8               java/lang/Integer
   #84 = Utf8               valueOf
   #85 = Utf8               (I)Ljava/lang/Integer;
   #86 = Utf8               intValue
   #87 = Utf8               ()I
   #88 = Methodref          #112.#113     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
   #89 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #90 = Methodref          #10.#114      // pbouda/bytecode/examples/LocalCapturingLambda.lambda$instanceMethod$0:(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Ljava/lang/String;
   #91 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #92 = Utf8               apply
   #93 = Utf8               (Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Ljava/util/function/Function;
   #94 = Utf8               java/lang/System
   #95 = Utf8               out
   #96 = Utf8               Ljava/io/PrintStream;
   #97 = Utf8               java/util/function/Function
   #98 = Utf8               java/io/PrintStream
   #99 = Utf8               println
  #100 = Utf8               (Ljava/lang/String;)V
  #101 = Utf8               (Ljava/lang/Object;)Z
  #102 = Methodref          #8.#115       // java/lang/String.equals:(Ljava/lang/Object;)Z
  #103 = Utf8               (Ljava/lang/String;)Z
  #104 = Utf8               test
  #105 = Utf8               (Ljava/lang/String;)Ljava/util/function/Predicate;
  #106 = Utf8               java/util/function/Predicate
  #107 = Utf8               (Z)V
  #108 = Methodref          #116.#117     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #109 = Utf8               \u0001 my_string \u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001
  #110 = Utf8               makeConcatWithConstants
  #111 = Utf8               (Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Ljava/lang/String;
  #112 = Class              #118          // java/lang/invoke/LambdaMetafactory
  #113 = NameAndType        #119:#123     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #114 = NameAndType        #47:#48       // lambda$instanceMethod$0:(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Ljava/lang/String;
  #115 = NameAndType        #124:#101     // equals:(Ljava/lang/Object;)Z
  #116 = Class              #125          // java/lang/invoke/StringConcatFactory
  #117 = NameAndType        #110:#126     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #118 = Utf8               java/lang/invoke/LambdaMetafactory
  #119 = Utf8               metafactory
  #120 = Class              #128          // java/lang/invoke/MethodHandles$Lookup
  #121 = Utf8               Lookup
  #122 = Utf8               InnerClasses
  #123 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #124 = Utf8               equals
  #125 = Utf8               java/lang/invoke/StringConcatFactory
  #126 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #127 = Class              #129          // java/lang/invoke/MethodHandles
  #128 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #129 = Utf8               java/lang/invoke/MethodHandles
{
  private static final java.lang.String MY_STRING;
    descriptor: Ljava/lang/String;
    flags: (0x001a) ACC_PRIVATE, ACC_STATIC, ACC_FINAL
    ConstantValue: String my_string

  public pbouda.bytecode.examples.LocalCapturingLambda();
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
            0       5     0  this   Lpbouda/bytecode/examples/LocalCapturingLambda;

  public void instanceMethod();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=10, locals=13, args_size=1
         0: iconst_1
         1: invokestatic  #2                  // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         4: astore_1
         5: iconst_1
         6: aload_1
         7: invokevirtual #3                  // Method java/lang/Integer.intValue:()I
        10: iadd
        11: invokestatic  #2                  // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        14: astore_2
        15: iconst_1
        16: aload_1
        17: invokevirtual #3                  // Method java/lang/Integer.intValue:()I
        20: iadd
        21: invokestatic  #2                  // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        24: astore_3
        25: iconst_1
        26: aload_1
        27: invokevirtual #3                  // Method java/lang/Integer.intValue:()I
        30: iadd
        31: invokestatic  #2                  // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        34: astore        4
        36: iconst_1
        37: aload_1
        38: invokevirtual #3                  // Method java/lang/Integer.intValue:()I
        41: iadd
        42: invokestatic  #2                  // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        45: astore        5
        47: iconst_1
        48: aload_1
        49: invokevirtual #3                  // Method java/lang/Integer.intValue:()I
        52: iadd
        53: invokestatic  #2                  // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        56: astore        6
        58: iconst_1
        59: aload_1
        60: invokevirtual #3                  // Method java/lang/Integer.intValue:()I
        63: iadd
        64: invokestatic  #2                  // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        67: astore        7
        69: iconst_1
        70: aload_1
        71: invokevirtual #3                  // Method java/lang/Integer.intValue:()I
        74: iadd
        75: invokestatic  #2                  // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        78: astore        8
        80: iconst_1
        81: aload_1
        82: invokevirtual #3                  // Method java/lang/Integer.intValue:()I
        85: iadd
        86: invokestatic  #2                  // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        89: astore        9
        91: iconst_1
        92: aload_1
        93: invokevirtual #3                  // Method java/lang/Integer.intValue:()I
        96: iadd
        97: invokestatic  #2                  // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       100: astore        10
       102: aload_1
       103: aload_2
       104: aload_3
       105: aload         4
       107: aload         5
       109: aload         6
       111: aload         7
       113: aload         8
       115: aload         9
       117: aload         10
       119: invokedynamic #4,  0              // InvokeDynamic #0:apply:(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Ljava/util/function/Function;
       124: astore        11
       126: getstatic     #5                  // Field java/lang/System.out:Ljava/io/PrintStream;
       129: aload         11
       131: ldc           #6                  // String Text
       133: invokeinterface #7,  2            // InterfaceMethod java/util/function/Function.apply:(Ljava/lang/Object;)Ljava/lang/Object;
       138: checkcast     #8                  // class java/lang/String
       141: invokevirtual #9                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
       144: ldc           #11                 // String my_string
       146: invokedynamic #12,  0             // InvokeDynamic #1:test:(Ljava/lang/String;)Ljava/util/function/Predicate;
       151: astore        12
       153: getstatic     #5                  // Field java/lang/System.out:Ljava/io/PrintStream;
       156: aload         12
       158: ldc           #13                 // String text
       160: invokeinterface #14,  2           // InterfaceMethod java/util/function/Predicate.test:(Ljava/lang/Object;)Z
       165: invokevirtual #15                 // Method java/io/PrintStream.println:(Z)V
       168: return
      LineNumberTable:
        line 11: 0
        line 12: 5
        line 13: 15
        line 14: 25
        line 15: 36
        line 16: 47
        line 17: 58
        line 18: 69
        line 19: 80
        line 20: 91
        line 23: 102
        line 35: 126
        line 37: 144
        line 38: 153
        line 39: 168
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     169     0  this   Lpbouda/bytecode/examples/LocalCapturingLambda;
            5     164     1 integer1   Ljava/lang/Integer;
           15     154     2 integer2   Ljava/lang/Integer;
           25     144     3 integer3   Ljava/lang/Integer;
           36     133     4 integer4   Ljava/lang/Integer;
           47     122     5 integer5   Ljava/lang/Integer;
           58     111     6 integer6   Ljava/lang/Integer;
           69     100     7 integer7   Ljava/lang/Integer;
           80      89     8 integer8   Ljava/lang/Integer;
           91      78     9 integer9   Ljava/lang/Integer;
          102      67    10 integer10   Ljava/lang/Integer;
          126      43    11 magicLambda   Ljava/util/function/Function;
          153      16    12 magicPredicate   Ljava/util/function/Predicate;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
          126      43    11 magicLambda   Ljava/util/function/Function<Ljava/lang/String;Ljava/lang/String;>;
          153      16    12 magicPredicate   Ljava/util/function/Predicate<Ljava/lang/String;>;

  private static java.lang.String lambda$instanceMethod$0(java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String);
    descriptor: (Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Ljava/lang/String;
    flags: (0x100a) ACC_PRIVATE, ACC_STATIC, ACC_SYNTHETIC
    Code:
      stack=11, locals=11, args_size=11
         0: aload         10
         2: aload_0
         3: aload_1
         4: aload_2
         5: aload_3
         6: aload         4
         8: aload         5
        10: aload         6
        12: aload         7
        14: aload         8
        16: aload         9
        18: invokedynamic #16,  0             // InvokeDynamic #2:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Ljava/lang/String;
        23: areturn
      LineNumberTable:
        line 23: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      24     0 integer1   Ljava/lang/Integer;
            0      24     1 integer2   Ljava/lang/Integer;
            0      24     2 integer3   Ljava/lang/Integer;
            0      24     3 integer4   Ljava/lang/Integer;
            0      24     4 integer5   Ljava/lang/Integer;
            0      24     5 integer6   Ljava/lang/Integer;
            0      24     6 integer7   Ljava/lang/Integer;
            0      24     7 integer8   Ljava/lang/Integer;
            0      24     8 integer9   Ljava/lang/Integer;
            0      24     9 integer10   Ljava/lang/Integer;
            0      24    10  text   Ljava/lang/String;
}
SourceFile: "LocalCapturingLambda.java"
InnerClasses:
  public static final #121= #120 of #127; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
BootstrapMethods:
  0: #57 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #58 (Ljava/lang/Object;)Ljava/lang/Object;
      #59 REF_invokeStatic pbouda/bytecode/examples/LocalCapturingLambda.lambda$instanceMethod$0:(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Ljava/lang/String;
      #60 (Ljava/lang/String;)Ljava/lang/String;
  1: #57 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #72 (Ljava/lang/Object;)Z
      #73 REF_invokeVirtual java/lang/String.equals:(Ljava/lang/Object;)Z
      #74 (Ljava/lang/String;)Z
  2: #79 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #80 \u0001 my_string \u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001
```