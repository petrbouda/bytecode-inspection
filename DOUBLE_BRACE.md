# Double Brace

- Two Nested classes created only for the purpose of every `double-brace initialization`
- Contains reference to enclosing method:
```
EnclosingMethod: #22.#23                // pbouda.bytecode.examples.DoubleBrace.<init>
```
- Contains synthetic field to outer class
```
final pbouda.bytecode.examples.DoubleBrace this$0;
    descriptor: Lpbouda/bytecode/examples/DoubleBrace;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC
```
- BEWARE: We can ery easily reach megamorphhic dispatch
    - We can create a lot of pointless instances
    
```
InnerClasses:
  #5;                                     // class pbouda/bytecode/examples/DoubleBrace$2
  #2;                                     // class pbouda/bytecode/examples/DoubleBrace$1
```

```
$ javap -v -p examples/target/classes/pbouda/bytecode/examples/DoubleBrace

Warning: File ./DoubleBrace.class does not contain class DoubleBrace
Classfile /Users/pbouda/experimental/bytecode-practise/examples/target/classes/pbouda/bytecode/examples/DoubleBrace.class
  Last modified Aug 21, 2018; size 630 bytes
  MD5 checksum 44548f73731b8524863bb59d649b5afe
  Compiled from "DoubleBrace.java"
public class pbouda.bytecode.examples.DoubleBrace
  minor version: 0
  major version: 54
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #7                          // pbouda/bytecode/examples/DoubleBrace
  super_class: #8                         // java/lang/Object
  interfaces: 0, fields: 1, methods: 1, attributes: 2
Constant pool:
   #1 = Methodref          #8.#23         // java/lang/Object."<init>":()V
   #2 = Class              #24            // pbouda/bytecode/examples/DoubleBrace$1
   #3 = Methodref          #2.#25         // pbouda/bytecode/examples/DoubleBrace$1."<init>":(Lpbouda/bytecode/examples/DoubleBrace;)V
   #4 = Fieldref           #7.#26         // pbouda/bytecode/examples/DoubleBrace.arr:Ljava/util/List;
   #5 = Class              #27            // pbouda/bytecode/examples/DoubleBrace$2
   #6 = Methodref          #5.#25         // pbouda/bytecode/examples/DoubleBrace$2."<init>":(Lpbouda/bytecode/examples/DoubleBrace;)V
   #7 = Class              #28            // pbouda/bytecode/examples/DoubleBrace
   #8 = Class              #29            // java/lang/Object
   #9 = Utf8               InnerClasses
  #10 = Utf8               arr
  #11 = Utf8               Ljava/util/List;
  #12 = Utf8               Signature
  #13 = Utf8               Ljava/util/List<Ljava/lang/Integer;>;
  #14 = Utf8               <init>
  #15 = Utf8               ()V
  #16 = Utf8               Code
  #17 = Utf8               LineNumberTable
  #18 = Utf8               LocalVariableTable
  #19 = Utf8               this
  #20 = Utf8               Lpbouda/bytecode/examples/DoubleBrace;
  #21 = Utf8               SourceFile
  #22 = Utf8               DoubleBrace.java
  #23 = NameAndType        #14:#15        // "<init>":()V
  #24 = Utf8               pbouda/bytecode/examples/DoubleBrace$1
  #25 = NameAndType        #14:#30        // "<init>":(Lpbouda/bytecode/examples/DoubleBrace;)V
  #26 = NameAndType        #10:#11        // arr:Ljava/util/List;
  #27 = Utf8               pbouda/bytecode/examples/DoubleBrace$2
  #28 = Utf8               pbouda/bytecode/examples/DoubleBrace
  #29 = Utf8               java/lang/Object
  #30 = Utf8               (Lpbouda/bytecode/examples/DoubleBrace;)V
{
  private final java.util.List<java.lang.Integer> arr;
    descriptor: Ljava/util/List;
    flags: (0x0012) ACC_PRIVATE, ACC_FINAL
    Signature: #13                          // Ljava/util/List<Ljava/lang/Integer;>;

  public pbouda.bytecode.examples.DoubleBrace();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: new           #2                  // class pbouda/bytecode/examples/DoubleBrace$1
         8: dup
         9: aload_0
        10: invokespecial #3                  // Method pbouda/bytecode/examples/DoubleBrace$1."<init>":(Lpbouda/bytecode/examples/DoubleBrace;)V
        13: putfield      #4                  // Field arr:Ljava/util/List;
        16: new           #5                  // class pbouda/bytecode/examples/DoubleBrace$2
        19: dup
        20: aload_0
        21: invokespecial #6                  // Method pbouda/bytecode/examples/DoubleBrace$2."<init>":(Lpbouda/bytecode/examples/DoubleBrace;)V
        24: pop
        25: return
      LineNumberTable:
        line 10: 0
        line 11: 4
        line 15: 16
        line 18: 25
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lpbouda/bytecode/examples/DoubleBrace;
}
SourceFile: "DoubleBrace.java"
InnerClasses:
  #5;                                     // class pbouda/bytecode/examples/DoubleBrace$2
  #2;                                     // class pbouda/bytecode/examples/DoubleBrace$1
```

```
$ javap -v -p examples/target/classes/pbouda/bytecode/examples/DoubleBrace\$1

Warning: File ./DoubleBrace$1.class does not contain class DoubleBrace$1
Classfile /Users/pbouda/experimental/bytecode-practise/examples/target/classes/pbouda/bytecode/examples/DoubleBrace$1.class
  Last modified Aug 21, 2018; size 733 bytes
  MD5 checksum 90858e5ec2f8f6f2618d3306a5281ad0
  Compiled from "DoubleBrace.java"
class pbouda.bytecode.examples.DoubleBrace$1 extends java.util.ArrayList<java.lang.Integer>
  minor version: 0
  major version: 54
  flags: (0x0020) ACC_SUPER
  this_class: #5                          // pbouda/bytecode/examples/DoubleBrace$1
  super_class: #6                         // java/util/ArrayList
  interfaces: 0, fields: 1, methods: 1, attributes: 4
Constant pool:
   #1 = Fieldref           #5.#24         // pbouda/bytecode/examples/DoubleBrace$1.this$0:Lpbouda/bytecode/examples/DoubleBrace;
   #2 = Methodref          #6.#23         // java/util/ArrayList."<init>":()V
   #3 = Methodref          #25.#26        // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #4 = Methodref          #5.#27         // pbouda/bytecode/examples/DoubleBrace$1.add:(Ljava/lang/Object;)Z
   #5 = Class              #28            // pbouda/bytecode/examples/DoubleBrace$1
   #6 = Class              #29            // java/util/ArrayList
   #7 = Utf8               this$0
   #8 = Utf8               Lpbouda/bytecode/examples/DoubleBrace;
   #9 = Utf8               <init>
  #10 = Utf8               (Lpbouda/bytecode/examples/DoubleBrace;)V
  #11 = Utf8               Code
  #12 = Utf8               LineNumberTable
  #13 = Utf8               LocalVariableTable
  #14 = Utf8               this
  #15 = Utf8               InnerClasses
  #16 = Utf8               Lpbouda/bytecode/examples/DoubleBrace$1;
  #17 = Utf8               Signature
  #18 = Utf8               Ljava/util/ArrayList<Ljava/lang/Integer;>;
  #19 = Utf8               SourceFile
  #20 = Utf8               DoubleBrace.java
  #21 = Utf8               EnclosingMethod
  #22 = Class              #30            // pbouda/bytecode/examples/DoubleBrace
  #23 = NameAndType        #9:#31         // "<init>":()V
  #24 = NameAndType        #7:#8          // this$0:Lpbouda/bytecode/examples/DoubleBrace;
  #25 = Class              #32            // java/lang/Integer
  #26 = NameAndType        #33:#34        // valueOf:(I)Ljava/lang/Integer;
  #27 = NameAndType        #35:#36        // add:(Ljava/lang/Object;)Z
  #28 = Utf8               pbouda/bytecode/examples/DoubleBrace$1
  #29 = Utf8               java/util/ArrayList
  #30 = Utf8               pbouda/bytecode/examples/DoubleBrace
  #31 = Utf8               ()V
  #32 = Utf8               java/lang/Integer
  #33 = Utf8               valueOf
  #34 = Utf8               (I)Ljava/lang/Integer;
  #35 = Utf8               add
  #36 = Utf8               (Ljava/lang/Object;)Z
{
  final pbouda.bytecode.examples.DoubleBrace this$0;
    descriptor: Lpbouda/bytecode/examples/DoubleBrace;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  pbouda.bytecode.examples.DoubleBrace$1(pbouda.bytecode.examples.DoubleBrace);
    descriptor: (Lpbouda/bytecode/examples/DoubleBrace;)V
    flags: (0x0000)
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: putfield      #1                  // Field this$0:Lpbouda/bytecode/examples/DoubleBrace;
         5: aload_0
         6: invokespecial #2                  // Method java/util/ArrayList."<init>":()V
         9: aload_0
        10: iconst_1
        11: invokestatic  #3                  // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        14: invokevirtual #4                  // Method add:(Ljava/lang/Object;)Z
        17: pop
        18: return
      LineNumberTable:
        line 11: 0
        line 12: 9
        line 13: 18
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lpbouda/bytecode/examples/DoubleBrace$1;
            0      19     1 this$0   Lpbouda/bytecode/examples/DoubleBrace;
}
Signature: #18                          // Ljava/util/ArrayList<Ljava/lang/Integer;>;
SourceFile: "DoubleBrace.java"
EnclosingMethod: #22.#23                // pbouda.bytecode.examples.DoubleBrace.<init>
InnerClasses:
  #5;                                     // class pbouda/bytecode/examples/DoubleBrace$1
```