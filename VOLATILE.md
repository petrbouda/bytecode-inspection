# Volatile Field

- Absolutely no difference apart from `ACC_VOLATILE` flag.

- [https://stackoverflow.com/questions/16898367/how-to-decompile-volatile-variable-in-java]
```
The concept of memory barrier doesn't exist at the level of Java specification. 
It is a low-level implementation detail of certain CPU architectures, such as 
the NUMA architecture which is the most popular today.

Therefore you would need to look at the machine code produced by a Just-in-Time 
compiler inside a specific JVM implementation, such as HotSpot on an x86 architecture. 
There, if you are skilled enough to interpret x86 machine code, you would see the 
manifestation of the memory barrier.
```

```
$ javap -v -p examples/target/classes/pbouda/bytecode/examples/javap -v -p Volatile

Warning: File ./Volatile.class does not contain class Volatile
Classfile /Users/pbouda/experimental/bytecode-practise/examples/target/classes/pbouda/bytecode/examples/Volatile.class
  Last modified Aug 21, 2018; size 561 bytes
  MD5 checksum 560db59d0cf56ec3f497c683e5570217
  Compiled from "Volatile.java"
public class pbouda.bytecode.examples.Volatile
  minor version: 0
  major version: 54
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #3                          // pbouda/bytecode/examples/Volatile
  super_class: #4                         // java/lang/Object
  interfaces: 0, fields: 1, methods: 3, attributes: 1
Constant pool:
   #1 = Methodref          #4.#20         // java/lang/Object."<init>":()V
   #2 = Fieldref           #3.#21         // pbouda/bytecode/examples/Volatile.myObject:Ljava/lang/Object;
   #3 = Class              #22            // pbouda/bytecode/examples/Volatile
   #4 = Class              #23            // java/lang/Object
   #5 = Utf8               myObject
   #6 = Utf8               Ljava/lang/Object;
   #7 = Utf8               <init>
   #8 = Utf8               ()V
   #9 = Utf8               Code
  #10 = Utf8               LineNumberTable
  #11 = Utf8               LocalVariableTable
  #12 = Utf8               this
  #13 = Utf8               Lpbouda/bytecode/examples/Volatile;
  #14 = Utf8               getMyObject
  #15 = Utf8               ()Ljava/lang/Object;
  #16 = Utf8               setMyObject
  #17 = Utf8               (Ljava/lang/Object;)V
  #18 = Utf8               SourceFile
  #19 = Utf8               Volatile.java
  #20 = NameAndType        #7:#8          // "<init>":()V
  #21 = NameAndType        #5:#6          // myObject:Ljava/lang/Object;
  #22 = Utf8               pbouda/bytecode/examples/Volatile
  #23 = Utf8               java/lang/Object
{
  private volatile java.lang.Object myObject;
    descriptor: Ljava/lang/Object;
    flags: (0x0042) ACC_PRIVATE, ACC_VOLATILE

  public pbouda.bytecode.examples.Volatile();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 3: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lpbouda/bytecode/examples/Volatile;

  private java.lang.Object getMyObject();
    descriptor: ()Ljava/lang/Object;
    flags: (0x0002) ACC_PRIVATE
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #2                  // Field myObject:Ljava/lang/Object;
         4: areturn
      LineNumberTable:
        line 8: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lpbouda/bytecode/examples/Volatile;

  private void setMyObject(java.lang.Object);
    descriptor: (Ljava/lang/Object;)V
    flags: (0x0002) ACC_PRIVATE
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: putfield      #2                  // Field myObject:Ljava/lang/Object;
         5: return
      LineNumberTable:
        line 12: 0
        line 13: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lpbouda/bytecode/examples/Volatile;
            0       6     1 myObject   Ljava/lang/Object;
}
SourceFile: "Volatile.java"
```
