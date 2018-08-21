# Try - all variants

- Method has additional structures:
```
Exception table:
   from    to  target type
       0     8    18   any
```
```
StackMapTable: number_of_entries = 1
    frame_type = 82 /* same_locals_1_stack_item */
      stack = [ class java/lang/Throwable ]
```

- Method contains instruction `athrow` at the end of the method
```
throws an error or exception (notice that the rest of the stack is cleared, leaving only a reference to the Throwable)
```

```
$ javap -v -p examples/target/classes/pbouda/bytecode/examples/Finally

Warning: File ./Finally.class does not contain class Finally
Classfile /Users/pbouda/experimental/bytecode-practise/examples/target/classes/pbouda/bytecode/examples/Finally.class
  Last modified Aug 21, 2018; size 632 bytes
  MD5 checksum e24c99e74d5867cd955cbe02bdc7fca5
  Compiled from "Finally.java"
public class pbouda.bytecode.examples.Finally
  minor version: 0
  major version: 54
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #6                          // pbouda/bytecode/examples/Finally
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 2, attributes: 1
Constant pool:
   #1 = Methodref          #2.#20         // java/lang/Object."<init>":()V
   #2 = Class              #21            // java/lang/Object
   #3 = Fieldref           #22.#23        // java/lang/System.out:Ljava/io/PrintStream;
   #4 = String             #24            // -
   #5 = Methodref          #25.#26        // java/io/PrintStream.println:(Ljava/lang/String;)V
   #6 = Class              #27            // pbouda/bytecode/examples/Finally
   #7 = Utf8               <init>
   #8 = Utf8               ()V
   #9 = Utf8               Code
  #10 = Utf8               LineNumberTable
  #11 = Utf8               LocalVariableTable
  #12 = Utf8               this
  #13 = Utf8               Lpbouda/bytecode/examples/Finally;
  #14 = Utf8               getFinally
  #15 = Utf8               ()Ljava/lang/Object;
  #16 = Utf8               StackMapTable
  #17 = Class              #28            // java/lang/Throwable
  #18 = Utf8               SourceFile
  #19 = Utf8               Finally.java
  #20 = NameAndType        #7:#8          // "<init>":()V
  #21 = Utf8               java/lang/Object
  #22 = Class              #29            // java/lang/System
  #23 = NameAndType        #30:#31        // out:Ljava/io/PrintStream;
  #24 = Utf8               -
  #25 = Class              #32            // java/io/PrintStream
  #26 = NameAndType        #33:#34        // println:(Ljava/lang/String;)V
  #27 = Utf8               pbouda/bytecode/examples/Finally
  #28 = Utf8               java/lang/Throwable
  #29 = Utf8               java/lang/System
  #30 = Utf8               out
  #31 = Utf8               Ljava/io/PrintStream;
  #32 = Utf8               java/io/PrintStream
  #33 = Utf8               println
  #34 = Utf8               (Ljava/lang/String;)V
{
  public pbouda.bytecode.examples.Finally();
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
            0       5     0  this   Lpbouda/bytecode/examples/Finally;

  public java.lang.Object getFinally();
    descriptor: ()Ljava/lang/Object;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=1
         0: new           #2                  // class java/lang/Object
         3: dup
         4: invokespecial #1                  // Method java/lang/Object."<init>":()V
         7: astore_1
         8: getstatic     #3                  // Field java/lang/System.out:Ljava/io/PrintStream;
        11: ldc           #4                  // String -
        13: invokevirtual #5                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
        16: aload_1
        17: areturn
        18: astore_2
        19: getstatic     #3                  // Field java/lang/System.out:Ljava/io/PrintStream;
        22: ldc           #4                  // String -
        24: invokevirtual #5                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
        27: aload_2
        28: athrow
      Exception table:
         from    to  target type
             0     8    18   any
      LineNumberTable:
        line 7: 0
        line 9: 8
        line 7: 16
        line 9: 18
        line 10: 27
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      29     0  this   Lpbouda/bytecode/examples/Finally;
      StackMapTable: number_of_entries = 1
        frame_type = 82 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
}
SourceFile: "Finally.java"
```
