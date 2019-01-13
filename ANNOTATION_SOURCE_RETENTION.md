# Annotation Source Retention

- The annotation is supposed to be visible only in source code
- No bytecode attribute used in this case

#### Annotation's Bytecode

```
javap -v -p examples/target/classes/pbouda/bytecode/examples/annotations/SourceAnnotatedType.class 

Classfile /home/pbouda/experiments/bytecode-practise/examples/target/classes/pbouda/bytecode/examples/annotations/SourceAnnotatedType.class
  Last modified Jan 13, 2019; size 500 bytes
  MD5 checksum e969432b06d9d91d03324da08c576317
  Compiled from "SourceAnnotatedType.java"
public class pbouda.bytecode.examples.annotations.SourceAnnotatedType
  minor version: 0
  major version: 54
  flags: ACC_PUBLIC, ACC_SUPER
Constant pool:
   #1 = Methodref          #4.#18         // java/lang/Object."<init>":()V
   #2 = Fieldref           #3.#19         // pbouda/bytecode/examples/annotations/SourceAnnotatedType.myField:Ljava/lang/String;
   #3 = Class              #20            // pbouda/bytecode/examples/annotations/SourceAnnotatedType
   #4 = Class              #21            // java/lang/Object
   #5 = Utf8               myField
   #6 = Utf8               Ljava/lang/String;
   #7 = Utf8               <init>
   #8 = Utf8               ()V
   #9 = Utf8               Code
  #10 = Utf8               LineNumberTable
  #11 = Utf8               LocalVariableTable
  #12 = Utf8               this
  #13 = Utf8               Lpbouda/bytecode/examples/annotations/SourceAnnotatedType;
  #14 = Utf8               myMethod
  #15 = Utf8               ()Ljava/lang/String;
  #16 = Utf8               SourceFile
  #17 = Utf8               SourceAnnotatedType.java
  #18 = NameAndType        #7:#8          // "<init>":()V
  #19 = NameAndType        #5:#6          // myField:Ljava/lang/String;
  #20 = Utf8               pbouda/bytecode/examples/annotations/SourceAnnotatedType
  #21 = Utf8               java/lang/Object
{
  private java.lang.String myField;
    descriptor: Ljava/lang/String;
    flags: ACC_PRIVATE

  public pbouda.bytecode.examples.annotations.SourceAnnotatedType();
    descriptor: ()V
    flags: ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 4: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lpbouda/bytecode/examples/annotations/SourceAnnotatedType;

  public java.lang.String myMethod();
    descriptor: ()Ljava/lang/String;
    flags: ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #2                  // Field myField:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 11: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lpbouda/bytecode/examples/annotations/SourceAnnotatedType;
}
SourceFile: "SourceAnnotatedType.java"
```