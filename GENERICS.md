# Generics

```
javap -v -p examples/target/classes/pbouda/bytecode/examples/Generics.class 
Classfile /home/pbouda/experiments/bytecode-practise/examples/target/classes/pbouda/bytecode/examples/Generics.class
  Last modified Jan 13, 2019; size 987 bytes
  MD5 checksum e73297cf768d9810fe3275fa86e629da
  Compiled from "Generics.java"
public class pbouda.bytecode.examples.Generics<TYPE extends java.lang.Object> extends java.util.ArrayList<java.lang.String>
  minor version: 0
  major version: 54
  flags: ACC_PUBLIC, ACC_SUPER
Constant pool:
   #1 = Methodref          #5.#32         // java/util/ArrayList."<init>":()V
   #2 = Fieldref           #4.#33         // pbouda/bytecode/examples/Generics.myField:Ljava/lang/Object;
   #3 = Fieldref           #4.#34         // pbouda/bytecode/examples/Generics.myList:Ljava/util/ArrayList;
   #4 = Class              #35            // pbouda/bytecode/examples/Generics
   #5 = Class              #36            // java/util/ArrayList
   #6 = Utf8               myList
   #7 = Utf8               Ljava/util/ArrayList;
   #8 = Utf8               Signature
   #9 = Utf8               Ljava/util/ArrayList<TTYPE;>;
  #10 = Utf8               myField
  #11 = Utf8               Ljava/lang/Object;
  #12 = Utf8               TTYPE;
  #13 = Utf8               <init>
  #14 = Utf8               ()V
  #15 = Utf8               Code
  #16 = Utf8               LineNumberTable
  #17 = Utf8               LocalVariableTable
  #18 = Utf8               this
  #19 = Utf8               Lpbouda/bytecode/examples/Generics;
  #20 = Utf8               LocalVariableTypeTable
  #21 = Utf8               Lpbouda/bytecode/examples/Generics<TTYPE;>;
  #22 = Utf8               myMethod
  #23 = Utf8               ()Ljava/lang/Object;
  #24 = Utf8               ()TTYPE;
  #25 = Utf8               myTypedMethod
  #26 = Utf8               (Ljava/lang/Object;)Ljava/util/ArrayList;
  #27 = Utf8               argument
  #28 = Utf8               (TTYPE;)Ljava/util/ArrayList<TTYPE;>;
  #29 = Utf8               <TYPE:Ljava/lang/Object;>Ljava/util/ArrayList<Ljava/lang/String;>;
  #30 = Utf8               SourceFile
  #31 = Utf8               Generics.java
  #32 = NameAndType        #13:#14        // "<init>":()V
  #33 = NameAndType        #10:#11        // myField:Ljava/lang/Object;
  #34 = NameAndType        #6:#7          // myList:Ljava/util/ArrayList;
  #35 = Utf8               pbouda/bytecode/examples/Generics
  #36 = Utf8               java/util/ArrayList
{
  private java.util.ArrayList<TYPE> myList;
    descriptor: Ljava/util/ArrayList;
    flags: ACC_PRIVATE
    Signature: #9                           // Ljava/util/ArrayList<TTYPE;>;

  private TYPE myField;
    descriptor: Ljava/lang/Object;
    flags: ACC_PRIVATE
    Signature: #12                          // TTYPE;

  public pbouda.bytecode.examples.Generics();
    descriptor: ()V
    flags: ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/util/ArrayList."<init>":()V
         4: return
      LineNumberTable:
        line 5: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lpbouda/bytecode/examples/Generics;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lpbouda/bytecode/examples/Generics<TTYPE;>;

  public TYPE myMethod();
    descriptor: ()Ljava/lang/Object;
    flags: ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #2                  // Field myField:Ljava/lang/Object;
         4: areturn
      LineNumberTable:
        line 12: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lpbouda/bytecode/examples/Generics;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lpbouda/bytecode/examples/Generics<TTYPE;>;
    Signature: #24                          // ()TTYPE;

  public java.util.ArrayList<TYPE> myTypedMethod(TYPE);
    descriptor: (Ljava/lang/Object;)Ljava/util/ArrayList;
    flags: ACC_PUBLIC
    Code:
      stack=1, locals=2, args_size=2
         0: aload_0
         1: getfield      #3                  // Field myList:Ljava/util/ArrayList;
         4: areturn
      LineNumberTable:
        line 16: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lpbouda/bytecode/examples/Generics;
            0       5     1 argument   Ljava/lang/Object;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lpbouda/bytecode/examples/Generics<TTYPE;>;
            0       5     1 argument   TTYPE;
    Signature: #28                          // (TTYPE;)Ljava/util/ArrayList<TTYPE;>;
}
Signature: #29                          // <TYPE:Ljava/lang/Object;>Ljava/util/ArrayList<Ljava/lang/String;>;
SourceFile: "Generics.java"
```