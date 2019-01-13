# Annotation Class Retention

- The annotation is supposed to be visible in bytecode but it's not taken into account by JVM Runtime
- An attribute `RuntimeInvisibleAnnotations`

#### Annotation's Bytecode

```
javap -v -p examples/target/classes/pbouda/bytecode/examples/annotations/ClassAnnotatedType.class 

Classfile /home/pbouda/experiments/bytecode-practise/examples/target/classes/pbouda/bytecode/examples/annotations/ClassAnnotatedType.class
  Last modified Jan 13, 2019; size 704 bytes
  MD5 checksum 73a286b2096a70eca9976695fcc2063e
  Compiled from "ClassAnnotatedType.java"
public class pbouda.bytecode.examples.annotations.ClassAnnotatedType
  minor version: 0
  major version: 54
  flags: ACC_PUBLIC, ACC_SUPER
Constant pool:
   #1 = Methodref          #4.#24         // java/lang/Object."<init>":()V
   #2 = Fieldref           #3.#25         // pbouda/bytecode/examples/annotations/ClassAnnotatedType.myField:Ljava/lang/String;
   #3 = Class              #26            // pbouda/bytecode/examples/annotations/ClassAnnotatedType
   #4 = Class              #27            // java/lang/Object
   #5 = Utf8               myField
   #6 = Utf8               Ljava/lang/String;
   #7 = Utf8               RuntimeInvisibleAnnotations
   #8 = Utf8               Lpbouda/bytecode/examples/annotations/ClassAnnotation;
   #9 = Utf8               description
  #10 = Utf8               Annotated Field
  #11 = Utf8               <init>
  #12 = Utf8               ()V
  #13 = Utf8               Code
  #14 = Utf8               LineNumberTable
  #15 = Utf8               LocalVariableTable
  #16 = Utf8               this
  #17 = Utf8               Lpbouda/bytecode/examples/annotations/ClassAnnotatedType;
  #18 = Utf8               myMethod
  #19 = Utf8               ()Ljava/lang/String;
  #20 = Utf8               Annotated Method
  #21 = Utf8               SourceFile
  #22 = Utf8               ClassAnnotatedType.java
  #23 = Utf8               Annotated Class
  #24 = NameAndType        #11:#12        // "<init>":()V
  #25 = NameAndType        #5:#6          // myField:Ljava/lang/String;
  #26 = Utf8               pbouda/bytecode/examples/annotations/ClassAnnotatedType
  #27 = Utf8               java/lang/Object
{
  private java.lang.String myField;
    descriptor: Ljava/lang/String;
    flags: ACC_PRIVATE
    RuntimeInvisibleAnnotations:
      0: #8(#9=s#10)

  public pbouda.bytecode.examples.annotations.ClassAnnotatedType();
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
            0       5     0  this   Lpbouda/bytecode/examples/annotations/ClassAnnotatedType;

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
            0       5     0  this   Lpbouda/bytecode/examples/annotations/ClassAnnotatedType;
    RuntimeInvisibleAnnotations:
      0: #8(#9=s#20)
}
SourceFile: "ClassAnnotatedType.java"
RuntimeInvisibleAnnotations:
  0: #8(#9=s#23)
```