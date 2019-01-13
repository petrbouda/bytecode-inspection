# Annotation Runtime Retention

- The annotation is supposed to be visible even during JVM Runtime
- An attribute `RuntimeVisibleAnnotations`

#### Annotation's Bytecode

```
javap -v -p examples/target/classes/pbouda/bytecode/examples/annotations/RuntimeAnnotatedType.class

Classfile /home/pbouda/experiments/bytecode-practise/examples/target/classes/pbouda/bytecode/examples/annotations/RuntimeAnnotatedType.class
  Last modified Jan 13, 2019; size 710 bytes
  MD5 checksum f6a59138b315924eaad297149d1f2e79
  Compiled from "RuntimeAnnotatedType.java"
public class pbouda.bytecode.examples.annotations.RuntimeAnnotatedType
  minor version: 0
  major version: 54
  flags: ACC_PUBLIC, ACC_SUPER
Constant pool:
   #1 = Methodref          #4.#24         // java/lang/Object."<init>":()V
   #2 = Fieldref           #3.#25         // pbouda/bytecode/examples/annotations/RuntimeAnnotatedType.myField:Ljava/lang/String;
   #3 = Class              #26            // pbouda/bytecode/examples/annotations/RuntimeAnnotatedType
   #4 = Class              #27            // java/lang/Object
   #5 = Utf8               myField
   #6 = Utf8               Ljava/lang/String;
   #7 = Utf8               RuntimeVisibleAnnotations
   #8 = Utf8               Lpbouda/bytecode/examples/annotations/RuntimeAnnotation;
   #9 = Utf8               description
  #10 = Utf8               Annotated Field
  #11 = Utf8               <init>
  #12 = Utf8               ()V
  #13 = Utf8               Code
  #14 = Utf8               LineNumberTable
  #15 = Utf8               LocalVariableTable
  #16 = Utf8               this
  #17 = Utf8               Lpbouda/bytecode/examples/annotations/RuntimeAnnotatedType;
  #18 = Utf8               myMethod
  #19 = Utf8               ()Ljava/lang/String;
  #20 = Utf8               Annotated Method
  #21 = Utf8               SourceFile
  #22 = Utf8               RuntimeAnnotatedType.java
  #23 = Utf8               Annotated Class
  #24 = NameAndType        #11:#12        // "<init>":()V
  #25 = NameAndType        #5:#6          // myField:Ljava/lang/String;
  #26 = Utf8               pbouda/bytecode/examples/annotations/RuntimeAnnotatedType
  #27 = Utf8               java/lang/Object
{
  private java.lang.String myField;
    descriptor: Ljava/lang/String;
    flags: ACC_PRIVATE
    RuntimeVisibleAnnotations:
      0: #8(#9=s#10)

  public pbouda.bytecode.examples.annotations.RuntimeAnnotatedType();
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
            0       5     0  this   Lpbouda/bytecode/examples/annotations/RuntimeAnnotatedType;

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
            0       5     0  this   Lpbouda/bytecode/examples/annotations/RuntimeAnnotatedType;
    RuntimeVisibleAnnotations:
      0: #8(#9=s#20)
}
SourceFile: "RuntimeAnnotatedType.java"
RuntimeVisibleAnnotations:
  0: #8(#9=s#23)
```