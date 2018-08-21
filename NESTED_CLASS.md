# Nested class

- Generated package-private method `access$000(pbouda.bytecode.examples.Nested)` in outer class
    - This violates the encapsulation, someone can access the nested class from outside
- New JEP regarding nested classes (Nestmates JEP)[http://openjdk.java.net/jeps/181]
- Nested class contains field to be able to reach the outer class
```
final pbouda.bytecode.examples.Nested this$0;
```
- Added new Attribute to see that the class also has Nested Class 
```
InnerClasses:
  public #6= #5 of #3; // Inner=class pbouda/bytecode/examples/Nested$Inner of class pbouda/bytecode/examples/Nested
```

```
$ javap -v -p examples/target/classes/pbouda/bytecode/examples/javap -v -p Nested.class

Classfile /Users/pbouda/experimental/bytecode-practise/examples/target/classes/pbouda/bytecode/examples/Nested.class
  Last modified Aug 21, 2018; size 519 bytes
  MD5 checksum c7bbcd2860f488909650a0b9ac00e42a
  Compiled from "Nested.java"
public class pbouda.bytecode.examples.Nested
  minor version: 0
  major version: 54
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #3                          // pbouda/bytecode/examples/Nested
  super_class: #4                         // java/lang/Object
  interfaces: 0, fields: 1, methods: 2, attributes: 2
Constant pool:
   #1 = Fieldref           #3.#22         // pbouda/bytecode/examples/Nested.i:I
   #2 = Methodref          #4.#23         // java/lang/Object."<init>":()V
   #3 = Class              #24            // pbouda/bytecode/examples/Nested
   #4 = Class              #25            // java/lang/Object
   #5 = Class              #26            // pbouda/bytecode/examples/Nested$Inner
   #6 = Utf8               Inner
   #7 = Utf8               InnerClasses
   #8 = Utf8               i
   #9 = Utf8               I
  #10 = Utf8               <init>
  #11 = Utf8               ()V
  #12 = Utf8               Code
  #13 = Utf8               LineNumberTable
  #14 = Utf8               LocalVariableTable
  #15 = Utf8               this
  #16 = Utf8               Lpbouda/bytecode/examples/Nested;
  #17 = Utf8               access$000
  #18 = Utf8               (Lpbouda/bytecode/examples/Nested;)I
  #19 = Utf8               x0
  #20 = Utf8               SourceFile
  #21 = Utf8               Nested.java
  #22 = NameAndType        #8:#9          // i:I
  #23 = NameAndType        #10:#11        // "<init>":()V
  #24 = Utf8               pbouda/bytecode/examples/Nested
  #25 = Utf8               java/lang/Object
  #26 = Utf8               pbouda/bytecode/examples/Nested$Inner
{
  private int i;
    descriptor: I
    flags: (0x0002) ACC_PRIVATE

  public pbouda.bytecode.examples.Nested();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #2                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 3: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lpbouda/bytecode/examples/Nested;

  static int access$000(pbouda.bytecode.examples.Nested);
    descriptor: (Lpbouda/bytecode/examples/Nested;)I
    flags: (0x1008) ACC_STATIC, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #1                  // Field i:I
         4: ireturn
      LineNumberTable:
        line 3: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0    x0   Lpbouda/bytecode/examples/Nested;
}
SourceFile: "Nested.java"
InnerClasses:
  public #6= #5 of #3;                    // Inner=class pbouda/bytecode/examples/Nested$Inner of class pbouda/bytecode/examples/Nested
```


```
$ javap -v -p examples/target/classes/pbouda/bytecode/examples/javap -v -p Nested\$Inner

Warning: File ./Nested$Inner.class does not contain class Nested$Inner
Classfile /Users/pbouda/experimental/bytecode-practise/examples/target/classes/pbouda/bytecode/examples/Nested$Inner.class
  Last modified Aug 21, 2018; size 634 bytes
  MD5 checksum fea976524026ca3861bb0b0b61cffc03
  Compiled from "Nested.java"
public class pbouda.bytecode.examples.Nested$Inner
  minor version: 0
  major version: 54
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #4                          // pbouda/bytecode/examples/Nested$Inner
  super_class: #5                         // java/lang/Object
  interfaces: 0, fields: 1, methods: 2, attributes: 2
Constant pool:
   #1 = Fieldref           #4.#21         // pbouda/bytecode/examples/Nested$Inner.this$0:Lpbouda/bytecode/examples/Nested;
   #2 = Methodref          #5.#22         // java/lang/Object."<init>":()V
   #3 = Methodref          #23.#24        // pbouda/bytecode/examples/Nested.access$000:(Lpbouda/bytecode/examples/Nested;)I
   #4 = Class              #25            // pbouda/bytecode/examples/Nested$Inner
   #5 = Class              #26            // java/lang/Object
   #6 = Utf8               this$0
   #7 = Utf8               Lpbouda/bytecode/examples/Nested;
   #8 = Utf8               <init>
   #9 = Utf8               (Lpbouda/bytecode/examples/Nested;)V
  #10 = Utf8               Code
  #11 = Utf8               LineNumberTable
  #12 = Utf8               LocalVariableTable
  #13 = Utf8               this
  #14 = Utf8               Inner
  #15 = Utf8               InnerClasses
  #16 = Utf8               Lpbouda/bytecode/examples/Nested$Inner;
  #17 = Utf8               i
  #18 = Utf8               ()I
  #19 = Utf8               SourceFile
  #20 = Utf8               Nested.java
  #21 = NameAndType        #6:#7          // this$0:Lpbouda/bytecode/examples/Nested;
  #22 = NameAndType        #8:#27         // "<init>":()V
  #23 = Class              #28            // pbouda/bytecode/examples/Nested
  #24 = NameAndType        #29:#30        // access$000:(Lpbouda/bytecode/examples/Nested;)I
  #25 = Utf8               pbouda/bytecode/examples/Nested$Inner
  #26 = Utf8               java/lang/Object
  #27 = Utf8               ()V
  #28 = Utf8               pbouda/bytecode/examples/Nested
  #29 = Utf8               access$000
  #30 = Utf8               (Lpbouda/bytecode/examples/Nested;)I
{
  final pbouda.bytecode.examples.Nested this$0;
    descriptor: Lpbouda/bytecode/examples/Nested;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  public pbouda.bytecode.examples.Nested$Inner(pbouda.bytecode.examples.Nested);
    descriptor: (Lpbouda/bytecode/examples/Nested;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: putfield      #1                  // Field this$0:Lpbouda/bytecode/examples/Nested;
         5: aload_0
         6: invokespecial #2                  // Method java/lang/Object."<init>":()V
         9: return
      LineNumberTable:
        line 7: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lpbouda/bytecode/examples/Nested$Inner;
            0      10     1 this$0   Lpbouda/bytecode/examples/Nested;

  public int i();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #1                  // Field this$0:Lpbouda/bytecode/examples/Nested;
         4: invokestatic  #3                  // Method pbouda/bytecode/examples/Nested.access$000:(Lpbouda/bytecode/examples/Nested;)I
         7: ireturn
      LineNumberTable:
        line 9: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lpbouda/bytecode/examples/Nested$Inner;
}
SourceFile: "Nested.java"
InnerClasses:
  public #14= #4 of #23;                  // Inner=class pbouda/bytecode/examples/Nested$Inner of class pbouda/bytecode/examples/Nested
```
