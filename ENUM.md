```
javap -v -p examples/target/classes/pbouda/bytecode/examples/MyEnum.class          
    
Classfile /home/pbouda/experiments/bytecode-practise/examples/target/classes/pbouda/bytecode/examples/MyEnum.class
  Last modified Apr 5, 2019; size 1338 bytes
  MD5 checksum bd7126ecc7865acd2c0dfcc62f3ab553
  Compiled from "MyEnum.java"
public class pbouda.bytecode.examples.MyEnum extends java.lang.Enum<pbouda.bytecode.examples.MyEnum>
  minor version: 0
  major version: 54
  flags: (0x4021) ACC_PUBLIC, ACC_SUPER, ACC_ENUM
  this_class: #5                          // pbouda/bytecode/examples/MyEnum
  super_class: #16                        // java/lang/Enum
  interfaces: 0, fields: 4, methods: 5, attributes: 3
Constant pool:
   #1 = Methodref          #5.#48         // pbouda/bytecode/examples/MyEnum."<init>":(Ljava/lang/String;I)V
   #2 = Fieldref           #5.#49         // pbouda/bytecode/examples/MyEnum.$VALUES:[Lpbouda/bytecode/examples/MyEnum;
   #3 = Methodref          #50.#51        // "[Lpbouda/bytecode/examples/MyEnum;".clone:()Ljava/lang/Object;
   #4 = Class              #23            // "[Lpbouda/bytecode/examples/MyEnum;"
   #5 = Class              #52            // pbouda/bytecode/examples/MyEnum
   #6 = Methodref          #16.#53        // java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
   #7 = Methodref          #16.#48        // java/lang/Enum."<init>":(Ljava/lang/String;I)V
   #8 = Class              #54            // pbouda/bytecode/examples/MyEnum$1
   #9 = String             #18            // FIRST
  #10 = Methodref          #8.#48         // pbouda/bytecode/examples/MyEnum$1."<init>":(Ljava/lang/String;I)V
  #11 = Fieldref           #5.#55         // pbouda/bytecode/examples/MyEnum.FIRST:Lpbouda/bytecode/examples/MyEnum;
  #12 = String             #20            // SECOND
  #13 = Fieldref           #5.#56         // pbouda/bytecode/examples/MyEnum.SECOND:Lpbouda/bytecode/examples/MyEnum;
  #14 = String             #21            // THIRD
  #15 = Fieldref           #5.#57         // pbouda/bytecode/examples/MyEnum.THIRD:Lpbouda/bytecode/examples/MyEnum;
  #16 = Class              #58            // java/lang/Enum
  #17 = Utf8               InnerClasses
  #18 = Utf8               FIRST
  #19 = Utf8               Lpbouda/bytecode/examples/MyEnum;
  #20 = Utf8               SECOND
  #21 = Utf8               THIRD
  #22 = Utf8               $VALUES
  #23 = Utf8               [Lpbouda/bytecode/examples/MyEnum;
  #24 = Utf8               values
  #25 = Utf8               ()[Lpbouda/bytecode/examples/MyEnum;
  #26 = Utf8               Code
  #27 = Utf8               LineNumberTable
  #28 = Utf8               valueOf
  #29 = Utf8               (Ljava/lang/String;)Lpbouda/bytecode/examples/MyEnum;
  #30 = Utf8               LocalVariableTable
  #31 = Utf8               name
  #32 = Utf8               Ljava/lang/String;
  #33 = Utf8               <init>
  #34 = Utf8               (Ljava/lang/String;I)V
  #35 = Utf8               this
  #36 = Utf8               Signature
  #37 = Utf8               ()V
  #38 = Utf8               (Ljava/lang/String;ILpbouda/bytecode/examples/MyEnum$1;)V
  #39 = Utf8               x0
  #40 = Utf8               x1
  #41 = Utf8               I
  #42 = Utf8               x2
  #43 = Utf8               Lpbouda/bytecode/examples/MyEnum$1;
  #44 = Utf8               <clinit>
  #45 = Utf8               Ljava/lang/Enum<Lpbouda/bytecode/examples/MyEnum;>;
  #46 = Utf8               SourceFile
  #47 = Utf8               MyEnum.java
  #48 = NameAndType        #33:#34        // "<init>":(Ljava/lang/String;I)V
  #49 = NameAndType        #22:#23        // $VALUES:[Lpbouda/bytecode/examples/MyEnum;
  #50 = Class              #23            // "[Lpbouda/bytecode/examples/MyEnum;"
  #51 = NameAndType        #59:#60        // clone:()Ljava/lang/Object;
  #52 = Utf8               pbouda/bytecode/examples/MyEnum
  #53 = NameAndType        #28:#61        // valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #54 = Utf8               pbouda/bytecode/examples/MyEnum$1
  #55 = NameAndType        #18:#19        // FIRST:Lpbouda/bytecode/examples/MyEnum;
  #56 = NameAndType        #20:#19        // SECOND:Lpbouda/bytecode/examples/MyEnum;
  #57 = NameAndType        #21:#19        // THIRD:Lpbouda/bytecode/examples/MyEnum;
  #58 = Utf8               java/lang/Enum
  #59 = Utf8               clone
  #60 = Utf8               ()Ljava/lang/Object;
  #61 = Utf8               (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
{
  public static final pbouda.bytecode.examples.MyEnum FIRST;
    descriptor: Lpbouda/bytecode/examples/MyEnum;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final pbouda.bytecode.examples.MyEnum SECOND;
    descriptor: Lpbouda/bytecode/examples/MyEnum;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final pbouda.bytecode.examples.MyEnum THIRD;
    descriptor: Lpbouda/bytecode/examples/MyEnum;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  private static final pbouda.bytecode.examples.MyEnum[] $VALUES;
    descriptor: [Lpbouda/bytecode/examples/MyEnum;
    flags: (0x101a) ACC_PRIVATE, ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC

  public static pbouda.bytecode.examples.MyEnum[] values();
    descriptor: ()[Lpbouda/bytecode/examples/MyEnum;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #2                  // Field $VALUES:[Lpbouda/bytecode/examples/MyEnum;
         3: invokevirtual #3                  // Method "[Lpbouda/bytecode/examples/MyEnum;".clone:()Ljava/lang/Object;
         6: checkcast     #4                  // class "[Lpbouda/bytecode/examples/MyEnum;"
         9: areturn
      LineNumberTable:
        line 3: 0

  public static pbouda.bytecode.examples.MyEnum valueOf(java.lang.String);
    descriptor: (Ljava/lang/String;)Lpbouda/bytecode/examples/MyEnum;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: ldc           #5                  // class pbouda/bytecode/examples/MyEnum
         2: aload_0
         3: invokestatic  #6                  // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
         6: checkcast     #5                  // class pbouda/bytecode/examples/MyEnum
         9: areturn
      LineNumberTable:
        line 3: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  name   Ljava/lang/String;

  private pbouda.bytecode.examples.MyEnum();
    descriptor: (Ljava/lang/String;I)V
    flags: (0x0002) ACC_PRIVATE
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: iload_2
         3: invokespecial #7                  // Method java/lang/Enum."<init>":(Ljava/lang/String;I)V
         6: return
      LineNumberTable:
        line 3: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lpbouda/bytecode/examples/MyEnum;
    Signature: #37                          // ()V

  pbouda.bytecode.examples.MyEnum(java.lang.String, int, pbouda.bytecode.examples.MyEnum$1);
    descriptor: (Ljava/lang/String;ILpbouda/bytecode/examples/MyEnum$1;)V
    flags: (0x1000) ACC_SYNTHETIC
    Code:
      stack=3, locals=4, args_size=4
         0: aload_0
         1: aload_1
         2: iload_2
         3: invokespecial #1                  // Method "<init>":(Ljava/lang/String;I)V
         6: return
      LineNumberTable:
        line 3: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lpbouda/bytecode/examples/MyEnum;
            0       7     1    x0   Ljava/lang/String;
            0       7     2    x1   I
            0       7     3    x2   Lpbouda/bytecode/examples/MyEnum$1;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: new           #8                  // class pbouda/bytecode/examples/MyEnum$1
         3: dup
         4: ldc           #9                  // String FIRST
         6: iconst_0
         7: invokespecial #10                 // Method pbouda/bytecode/examples/MyEnum$1."<init>":(Ljava/lang/String;I)V
        10: putstatic     #11                 // Field FIRST:Lpbouda/bytecode/examples/MyEnum;
        13: new           #5                  // class pbouda/bytecode/examples/MyEnum
        16: dup
        17: ldc           #12                 // String SECOND
        19: iconst_1
        20: invokespecial #1                  // Method "<init>":(Ljava/lang/String;I)V
        23: putstatic     #13                 // Field SECOND:Lpbouda/bytecode/examples/MyEnum;
        26: new           #5                  // class pbouda/bytecode/examples/MyEnum
        29: dup
        30: ldc           #14                 // String THIRD
        32: iconst_2
        33: invokespecial #1                  // Method "<init>":(Ljava/lang/String;I)V
        36: putstatic     #15                 // Field THIRD:Lpbouda/bytecode/examples/MyEnum;
        39: iconst_3
        40: anewarray     #5                  // class pbouda/bytecode/examples/MyEnum
        43: dup
        44: iconst_0
        45: getstatic     #11                 // Field FIRST:Lpbouda/bytecode/examples/MyEnum;
        48: aastore
        49: dup
        50: iconst_1
        51: getstatic     #13                 // Field SECOND:Lpbouda/bytecode/examples/MyEnum;
        54: aastore
        55: dup
        56: iconst_2
        57: getstatic     #15                 // Field THIRD:Lpbouda/bytecode/examples/MyEnum;
        60: aastore
        61: putstatic     #2                  // Field $VALUES:[Lpbouda/bytecode/examples/MyEnum;
        64: return
      LineNumberTable:
        line 5: 0
        line 8: 13
        line 9: 26
        line 3: 39
}
Signature: #45                          // Ljava/lang/Enum<Lpbouda/bytecode/examples/MyEnum;>;
SourceFile: "MyEnum.java"
InnerClasses:
  final #8;                               // class pbouda/bytecode/examples/MyEnum$1
```