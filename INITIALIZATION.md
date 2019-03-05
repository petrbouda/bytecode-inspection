# All types of init instance variables

```java
public class Initialization {

    private Object obj1 = new Object();
    private Object obj2;
    private Object obj3;

    {
        this.obj2 = new Object();
    }

    public Initialization() {
        this.obj3 = new Object();
    }
}
```

```
javap -v -p examples/target/classes/pbouda/bytecode/examples/Initialization.class

Classfile /home/pbouda/experiments/bytecode-practise/examples/target/classes/pbouda/bytecode/examples/Initialization.class
  Last modified Mar 5, 2019; size 462 bytes
  MD5 checksum 7f851699338d6d004957d7b8662f8797
  Compiled from "Initialization.java"
public class pbouda.bytecode.examples.Initialization
  minor version: 0
  major version: 54
  flags: ACC_PUBLIC, ACC_SUPER
Constant pool:
   #1 = Methodref          #2.#20         // java/lang/Object."<init>":()V
   #2 = Class              #21            // java/lang/Object
   #3 = Fieldref           #6.#22         // pbouda/bytecode/examples/Initialization.obj1:Ljava/lang/Object;
   #4 = Fieldref           #6.#23         // pbouda/bytecode/examples/Initialization.obj2:Ljava/lang/Object;
   #5 = Fieldref           #6.#24         // pbouda/bytecode/examples/Initialization.obj3:Ljava/lang/Object;
   #6 = Class              #25            // pbouda/bytecode/examples/Initialization
   #7 = Utf8               obj1
   #8 = Utf8               Ljava/lang/Object;
   #9 = Utf8               obj2
  #10 = Utf8               obj3
  #11 = Utf8               <init>
  #12 = Utf8               ()V
  #13 = Utf8               Code
  #14 = Utf8               LineNumberTable
  #15 = Utf8               LocalVariableTable
  #16 = Utf8               this
  #17 = Utf8               Lpbouda/bytecode/examples/Initialization;
  #18 = Utf8               SourceFile
  #19 = Utf8               Initialization.java
  #20 = NameAndType        #11:#12        // "<init>":()V
  #21 = Utf8               java/lang/Object
  #22 = NameAndType        #7:#8          // obj1:Ljava/lang/Object;
  #23 = NameAndType        #9:#8          // obj2:Ljava/lang/Object;
  #24 = NameAndType        #10:#8         // obj3:Ljava/lang/Object;
  #25 = Utf8               pbouda/bytecode/examples/Initialization
{
  private java.lang.Object obj1;
    descriptor: Ljava/lang/Object;
    flags: ACC_PRIVATE

  private java.lang.Object obj2;
    descriptor: Ljava/lang/Object;
    flags: ACC_PRIVATE

  private java.lang.Object obj3;
    descriptor: Ljava/lang/Object;
    flags: ACC_PRIVATE

  public pbouda.bytecode.examples.Initialization();
    descriptor: ()V
    flags: ACC_PUBLIC
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: new           #2                  // class java/lang/Object
         8: dup
         9: invokespecial #1                  // Method java/lang/Object."<init>":()V
        12: putfield      #3                  // Field obj1:Ljava/lang/Object;
        15: aload_0
        16: new           #2                  // class java/lang/Object
        19: dup
        20: invokespecial #1                  // Method java/lang/Object."<init>":()V
        23: putfield      #4                  // Field obj2:Ljava/lang/Object;
        26: aload_0
        27: new           #2                  // class java/lang/Object
        30: dup
        31: invokespecial #1                  // Method java/lang/Object."<init>":()V
        34: putfield      #5                  // Field obj3:Ljava/lang/Object;
        37: return
      LineNumberTable:
        line 13: 0
        line 5: 4
        line 10: 15
        line 14: 26
        line 15: 37
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      38     0  this   Lpbouda/bytecode/examples/Initialization;
}
SourceFile: "Initialization.java"

```