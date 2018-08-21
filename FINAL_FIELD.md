# Final field

- No added instructions 
- [https://stackoverflow.com/questions/35319212/java-bytecode-final-field-assignment-jasmin]
```
The Java language enforces a lot of constraints that are not enforced at the 
bytecode level. One of them is handling of final fields.

In Java bytecode, the only constraints on final fields are that static final 
fields cannot be assigned outside the <clinit> method and nonstatic final 
fields cannot be assigned outside the <init> methods (i.e constructors).
```

```
$ javap -v -p examples/target/classes/pbouda/bytecode/examples/FinalField

Warning: File ./FinalField.class does not contain class FinalField
Classfile /Users/pbouda/experimental/bytecode-practise/examples/target/classes/pbouda/bytecode/examples/FinalField.class
  Last modified Aug 21, 2018; size 402 bytes
  MD5 checksum 9b5f583e061d2859b044af102e7c83f4
  Compiled from "FinalField.java"
public class pbouda.bytecode.examples.FinalField
  minor version: 0
  major version: 54
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #3                          // pbouda/bytecode/examples/FinalField
  super_class: #4                         // java/lang/Object
  interfaces: 0, fields: 1, methods: 1, attributes: 1
Constant pool:
   #1 = Methodref          #4.#16         // java/lang/Object."<init>":()V
   #2 = Fieldref           #3.#17         // pbouda/bytecode/examples/FinalField.myObject:Ljava/lang/Object;
   #3 = Class              #18            // pbouda/bytecode/examples/FinalField
   #4 = Class              #19            // java/lang/Object
   #5 = Utf8               myObject
   #6 = Utf8               Ljava/lang/Object;
   #7 = Utf8               <init>
   #8 = Utf8               (Ljava/lang/Object;)V
   #9 = Utf8               Code
  #10 = Utf8               LineNumberTable
  #11 = Utf8               LocalVariableTable
  #12 = Utf8               this
  #13 = Utf8               Lpbouda/bytecode/examples/FinalField;
  #14 = Utf8               SourceFile
  #15 = Utf8               FinalField.java
  #16 = NameAndType        #7:#20         // "<init>":()V
  #17 = NameAndType        #5:#6          // myObject:Ljava/lang/Object;
  #18 = Utf8               pbouda/bytecode/examples/FinalField
  #19 = Utf8               java/lang/Object
  #20 = Utf8               ()V
{
  private final java.lang.Object myObject;
    descriptor: Ljava/lang/Object;
    flags: (0x0012) ACC_PRIVATE, ACC_FINAL

  public pbouda.bytecode.examples.FinalField(java.lang.Object);
    descriptor: (Ljava/lang/Object;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: aload_1
         6: putfield      #2                  // Field myObject:Ljava/lang/Object;
         9: return
      LineNumberTable:
        line 7: 0
        line 8: 4
        line 9: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lpbouda/bytecode/examples/FinalField;
            0      10     1 myObject   Ljava/lang/Object;
}
SourceFile: "FinalField.java"
```
