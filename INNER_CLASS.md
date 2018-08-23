# Inner class

- Two generated classes
    - Outer Class - `InnerClass`
    - Inner Class (private) - `InnerClass$RealInnerClass`
    - Inner Class 2 (public) - `InnerClass$RealInnerClass2`

- Private inner class contains a real magic in terms of constructors
    - Private and package-private constructors generated
    - Package-private constructor is used to create a new instance and pass reference to the outer class
    - `Method pbouda/bytecode/examples/InnerClass$RealInnerClass."<init>":(Lpbouda/bytecode/examples/InnerClass$1;)V`

```
javap -v -p examples/target/classes/pbouda/bytecode/examples/InnerClass.class
Classfile /Users/pbouda/experimental/bytecode-practise/examples/target/classes/pbouda/bytecode/examples/InnerClass.class
  Last modified Aug 23, 2018; size 816 bytes
  MD5 checksum ccf1b7b1df57f88b68bcb8ffed0d86c4
  Compiled from "InnerClass.java"
public class pbouda.bytecode.examples.InnerClass
  minor version: 0
  major version: 54
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // pbouda/bytecode/examples/InnerClass
  super_class: #9                         // java/lang/Object
  interfaces: 0, fields: 2, methods: 1, attributes: 2
Constant pool:
   #1 = Methodref          #9.#27         // java/lang/Object."<init>":()V
   #2 = Class              #28            // pbouda/bytecode/examples/InnerClass$RealInnerClass
   #3 = Methodref          #2.#29         // pbouda/bytecode/examples/InnerClass$RealInnerClass."<init>":(Lpbouda/bytecode/examples/InnerClass$1;)V
   #4 = Fieldref           #8.#30         // pbouda/bytecode/examples/InnerClass.realInnerClass:Lpbouda/bytecode/examples/InnerClass$RealInnerClass;
   #5 = Class              #31            // pbouda/bytecode/examples/InnerClass$RealInnerClass2
   #6 = Methodref          #5.#27         // pbouda/bytecode/examples/InnerClass$RealInnerClass2."<init>":()V
   #7 = Fieldref           #8.#32         // pbouda/bytecode/examples/InnerClass.realInnerClass2:Lpbouda/bytecode/examples/InnerClass$RealInnerClass2;
   #8 = Class              #33            // pbouda/bytecode/examples/InnerClass
   #9 = Class              #34            // java/lang/Object
  #10 = Class              #35            // pbouda/bytecode/examples/InnerClass$1
  #11 = Utf8               InnerClasses
  #12 = Utf8               RealInnerClass2
  #13 = Utf8               RealInnerClass
  #14 = Utf8               realInnerClass
  #15 = Utf8               Lpbouda/bytecode/examples/InnerClass$RealInnerClass;
  #16 = Utf8               realInnerClass2
  #17 = Utf8               Lpbouda/bytecode/examples/InnerClass$RealInnerClass2;
  #18 = Utf8               <init>
  #19 = Utf8               ()V
  #20 = Utf8               Code
  #21 = Utf8               LineNumberTable
  #22 = Utf8               LocalVariableTable
  #23 = Utf8               this
  #24 = Utf8               Lpbouda/bytecode/examples/InnerClass;
  #25 = Utf8               SourceFile
  #26 = Utf8               InnerClass.java
  #27 = NameAndType        #18:#19        // "<init>":()V
  #28 = Utf8               pbouda/bytecode/examples/InnerClass$RealInnerClass
  #29 = NameAndType        #18:#36        // "<init>":(Lpbouda/bytecode/examples/InnerClass$1;)V
  #30 = NameAndType        #14:#15        // realInnerClass:Lpbouda/bytecode/examples/InnerClass$RealInnerClass;
  #31 = Utf8               pbouda/bytecode/examples/InnerClass$RealInnerClass2
  #32 = NameAndType        #16:#17        // realInnerClass2:Lpbouda/bytecode/examples/InnerClass$RealInnerClass2;
  #33 = Utf8               pbouda/bytecode/examples/InnerClass
  #34 = Utf8               java/lang/Object
  #35 = Utf8               pbouda/bytecode/examples/InnerClass$1
  #36 = Utf8               (Lpbouda/bytecode/examples/InnerClass$1;)V
{
  private pbouda.bytecode.examples.InnerClass$RealInnerClass realInnerClass;
    descriptor: Lpbouda/bytecode/examples/InnerClass$RealInnerClass;
    flags: (0x0002) ACC_PRIVATE

  private pbouda.bytecode.examples.InnerClass$RealInnerClass2 realInnerClass2;
    descriptor: Lpbouda/bytecode/examples/InnerClass$RealInnerClass2;
    flags: (0x0002) ACC_PRIVATE

  public pbouda.bytecode.examples.InnerClass();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: new           #2                  // class pbouda/bytecode/examples/InnerClass$RealInnerClass
         8: dup
         9: aconst_null
        10: invokespecial #3                  // Method pbouda/bytecode/examples/InnerClass$RealInnerClass."<init>":(Lpbouda/bytecode/examples/InnerClass$1;)V
        13: putfield      #4                  // Field realInnerClass:Lpbouda/bytecode/examples/InnerClass$RealInnerClass;
        16: aload_0
        17: new           #5                  // class pbouda/bytecode/examples/InnerClass$RealInnerClass2
        20: dup
        21: invokespecial #6                  // Method pbouda/bytecode/examples/InnerClass$RealInnerClass2."<init>":()V
        24: putfield      #7                  // Field realInnerClass2:Lpbouda/bytecode/examples/InnerClass$RealInnerClass2;
        27: return
      LineNumberTable:
        line 3: 0
        line 5: 4
        line 7: 16
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      28     0  this   Lpbouda/bytecode/examples/InnerClass;
}
SourceFile: "InnerClass.java"
InnerClasses:
  static #10;                             // class pbouda/bytecode/examples/InnerClass$1
  public static #12= #5 of #8;            // RealInnerClass2=class pbouda/bytecode/examples/InnerClass$RealInnerClass2 of class pbouda/bytecode/examples/InnerClass
  private static #13= #2 of #8;           // RealInnerClass=class pbouda/bytecode/examples/InnerClass$RealInnerClass of class pbouda/bytecode/examples/InnerClass
```

```
javap -v -p examples/target/classes/pbouda/bytecode/examples/InnerClass\$RealInnerClass.class

Classfile /Users/pbouda/experimental/bytecode-practise/examples/target/classes/pbouda/bytecode/examples/InnerClass$RealInnerClass.class
  Last modified Aug 23, 2018; size 753 bytes
  MD5 checksum 656c0190f7b2c19b2bce242982101e18
  Compiled from "InnerClass.java"
class pbouda.bytecode.examples.InnerClass$RealInnerClass
  minor version: 0
  major version: 54
  flags: (0x0020) ACC_SUPER
  this_class: #4                          // pbouda/bytecode/examples/InnerClass$RealInnerClass
  super_class: #5                         // java/lang/Object
  interfaces: 0, fields: 1, methods: 3, attributes: 2
Constant pool:
   #1 = Methodref          #4.#25         // pbouda/bytecode/examples/InnerClass$RealInnerClass."<init>":()V
   #2 = Methodref          #5.#25         // java/lang/Object."<init>":()V
   #3 = Fieldref           #4.#26         // pbouda/bytecode/examples/InnerClass$RealInnerClass.number:I
   #4 = Class              #28            // pbouda/bytecode/examples/InnerClass$RealInnerClass
   #5 = Class              #29            // java/lang/Object
   #6 = Utf8               number
   #7 = Utf8               I
   #8 = Utf8               <init>
   #9 = Utf8               ()V
  #10 = Utf8               Code
  #11 = Utf8               LineNumberTable
  #12 = Utf8               LocalVariableTable
  #13 = Utf8               this
  #14 = Utf8               RealInnerClass
  #15 = Utf8               InnerClasses
  #16 = Utf8               Lpbouda/bytecode/examples/InnerClass$RealInnerClass;
  #17 = Utf8               getNumber
  #18 = Utf8               ()I
  #19 = Class              #30            // pbouda/bytecode/examples/InnerClass$1
  #20 = Utf8               (Lpbouda/bytecode/examples/InnerClass$1;)V
  #21 = Utf8               x0
  #22 = Utf8               Lpbouda/bytecode/examples/InnerClass$1;
  #23 = Utf8               SourceFile
  #24 = Utf8               InnerClass.java
  #25 = NameAndType        #8:#9          // "<init>":()V
  #26 = NameAndType        #6:#7          // number:I
  #27 = Class              #31            // pbouda/bytecode/examples/InnerClass
  #28 = Utf8               pbouda/bytecode/examples/InnerClass$RealInnerClass
  #29 = Utf8               java/lang/Object
  #30 = Utf8               pbouda/bytecode/examples/InnerClass$1
  #31 = Utf8               pbouda/bytecode/examples/InnerClass
{
  private int number;
    descriptor: I
    flags: (0x0002) ACC_PRIVATE

  private pbouda.bytecode.examples.InnerClass$RealInnerClass();
    descriptor: ()V
    flags: (0x0002) ACC_PRIVATE
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #2                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 9: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lpbouda/bytecode/examples/InnerClass$RealInnerClass;

  public int getNumber();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #3                  // Field number:I
         4: ireturn
      LineNumberTable:
        line 14: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lpbouda/bytecode/examples/InnerClass$RealInnerClass;

  pbouda.bytecode.examples.InnerClass$RealInnerClass(pbouda.bytecode.examples.InnerClass$1);
    descriptor: (Lpbouda/bytecode/examples/InnerClass$1;)V
    flags: (0x1000) ACC_SYNTHETIC
    Code:
      stack=1, locals=2, args_size=2
         0: aload_0
         1: invokespecial #1                  // Method "<init>":()V
         4: return
      LineNumberTable:
        line 9: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lpbouda/bytecode/examples/InnerClass$RealInnerClass;
            0       5     1    x0   Lpbouda/bytecode/examples/InnerClass$1;
}
SourceFile: "InnerClass.java"
InnerClasses:
  private static #14= #4 of #27;          // RealInnerClass=class pbouda/bytecode/examples/InnerClass$RealInnerClass of class pbouda/bytecode/examples/InnerClass
  static #19;                             // class pbouda/bytecode/examples/InnerClass$1
```

```
javap -v -p examples/target/classes/pbouda/bytecode/examples/InnerClass\$RealInnerClass2.class
Classfile /Users/pbouda/experimental/bytecode-practise/examples/target/classes/pbouda/bytecode/examples/InnerClass$RealInnerClass2.class
  Last modified Aug 23, 2018; size 537 bytes
  MD5 checksum de6b9dc853cf541ce7d4d0cbee6717c9
  Compiled from "InnerClass.java"
public class pbouda.bytecode.examples.InnerClass$RealInnerClass2
  minor version: 0
  major version: 54
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #3                          // pbouda/bytecode/examples/InnerClass$RealInnerClass2
  super_class: #4                         // java/lang/Object
  interfaces: 0, fields: 1, methods: 2, attributes: 2
Constant pool:
   #1 = Methodref          #4.#20         // java/lang/Object."<init>":()V
   #2 = Fieldref           #3.#21         // pbouda/bytecode/examples/InnerClass$RealInnerClass2.number:I
   #3 = Class              #23            // pbouda/bytecode/examples/InnerClass$RealInnerClass2
   #4 = Class              #24            // java/lang/Object
   #5 = Utf8               number
   #6 = Utf8               I
   #7 = Utf8               <init>
   #8 = Utf8               ()V
   #9 = Utf8               Code
  #10 = Utf8               LineNumberTable
  #11 = Utf8               LocalVariableTable
  #12 = Utf8               this
  #13 = Utf8               RealInnerClass2
  #14 = Utf8               InnerClasses
  #15 = Utf8               Lpbouda/bytecode/examples/InnerClass$RealInnerClass2;
  #16 = Utf8               getNumber
  #17 = Utf8               ()I
  #18 = Utf8               SourceFile
  #19 = Utf8               InnerClass.java
  #20 = NameAndType        #7:#8          // "<init>":()V
  #21 = NameAndType        #5:#6          // number:I
  #22 = Class              #25            // pbouda/bytecode/examples/InnerClass
  #23 = Utf8               pbouda/bytecode/examples/InnerClass$RealInnerClass2
  #24 = Utf8               java/lang/Object
  #25 = Utf8               pbouda/bytecode/examples/InnerClass
{
  private int number;
    descriptor: I
    flags: (0x0002) ACC_PRIVATE

  public pbouda.bytecode.examples.InnerClass$RealInnerClass2();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 18: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lpbouda/bytecode/examples/InnerClass$RealInnerClass2;

  public int getNumber();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #2                  // Field number:I
         4: ireturn
      LineNumberTable:
        line 23: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lpbouda/bytecode/examples/InnerClass$RealInnerClass2;
}
SourceFile: "InnerClass.java"
InnerClasses:
  public static #13= #3 of #22;           // RealInnerClass2=class pbouda/bytecode/examples/InnerClass$RealInnerClass2 of class pbouda/bytecode/examples/InnerClass
```