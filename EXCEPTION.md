# Exceptions

#### `throwCatchedException()`
- `athrow` instruction to throw an exception
- A structure for defining an UNCHECKED EXCEPTION for the given method
```
Exceptions:
  throws java.lang.InterruptedException
```

#### `throwUncatchedException()`
- only `athrow` instruction to throw an exception

#### `catchException()`
- A structure for catching exceptions
- `from` and `to` define the scope of try block
```
Exception table:
   from    to  target type
       0     8     8   Class java/lang/IllegalArgumentException
```
- Plus information about exceptions on a stack
```
StackMapTable: number_of_entries = 1
   frame_type = 72 /* same_locals_1_stack_item */
     stack = [ class java/lang/IllegalArgumentException ]
```

```
$ javap -v -p examples/target/classes/pbouda/bytecode/examples/ThrowException

Warning: File ./ThrowException.class does not contain class ThrowException
Classfile /Users/pbouda/experimental/bytecode-practise/examples/target/classes/pbouda/bytecode/examples/ThrowException.class
  Last modified Aug 21, 2018; size 902 bytes
  MD5 checksum d368dd5907875fc535fc8b194ee62bb8
  Compiled from "ThrowException.java"
public class pbouda.bytecode.examples.ThrowException
  minor version: 0
  major version: 54
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // pbouda/bytecode/examples/ThrowException
  super_class: #9                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 4, attributes: 1
Constant pool:
   #1 = Methodref          #9.#26         // java/lang/Object."<init>":()V
   #2 = Class              #27            // java/lang/InterruptedException
   #3 = Methodref          #2.#26         // java/lang/InterruptedException."<init>":()V
   #4 = Class              #28            // java/lang/IllegalArgumentException
   #5 = Methodref          #4.#26         // java/lang/IllegalArgumentException."<init>":()V
   #6 = Fieldref           #29.#30        // java/lang/System.out:Ljava/io/PrintStream;
   #7 = Methodref          #31.#32        // java/io/PrintStream.println:()V
   #8 = Class              #33            // pbouda/bytecode/examples/ThrowException
   #9 = Class              #34            // java/lang/Object
  #10 = Utf8               <init>
  #11 = Utf8               ()V
  #12 = Utf8               Code
  #13 = Utf8               LineNumberTable
  #14 = Utf8               LocalVariableTable
  #15 = Utf8               this
  #16 = Utf8               Lpbouda/bytecode/examples/ThrowException;
  #17 = Utf8               throwCatchedException
  #18 = Utf8               Exceptions
  #19 = Utf8               throwUncatchedException
  #20 = Utf8               catchException
  #21 = Utf8               ex
  #22 = Utf8               Ljava/lang/IllegalArgumentException;
  #23 = Utf8               StackMapTable
  #24 = Utf8               SourceFile
  #25 = Utf8               ThrowException.java
  #26 = NameAndType        #10:#11        // "<init>":()V
  #27 = Utf8               java/lang/InterruptedException
  #28 = Utf8               java/lang/IllegalArgumentException
  #29 = Class              #35            // java/lang/System
  #30 = NameAndType        #36:#37        // out:Ljava/io/PrintStream;
  #31 = Class              #38            // java/io/PrintStream
  #32 = NameAndType        #39:#11        // println:()V
  #33 = Utf8               pbouda/bytecode/examples/ThrowException
  #34 = Utf8               java/lang/Object
  #35 = Utf8               java/lang/System
  #36 = Utf8               out
  #37 = Utf8               Ljava/io/PrintStream;
  #38 = Utf8               java/io/PrintStream
  #39 = Utf8               println
{
  public pbouda.bytecode.examples.ThrowException();
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
            0       5     0  this   Lpbouda/bytecode/examples/ThrowException;

  public void throwCatchedException() throws java.lang.InterruptedException;
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: new           #2                  // class java/lang/InterruptedException
         3: dup
         4: invokespecial #3                  // Method java/lang/InterruptedException."<init>":()V
         7: athrow
      LineNumberTable:
        line 6: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lpbouda/bytecode/examples/ThrowException;
    Exceptions:
      throws java.lang.InterruptedException

  public void throwUncatchedException();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: new           #4                  // class java/lang/IllegalArgumentException
         3: dup
         4: invokespecial #5                  // Method java/lang/IllegalArgumentException."<init>":()V
         7: athrow
      LineNumberTable:
        line 10: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lpbouda/bytecode/examples/ThrowException;

  public void catchException();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=1
         0: new           #4                  // class java/lang/IllegalArgumentException
         3: dup
         4: invokespecial #5                  // Method java/lang/IllegalArgumentException."<init>":()V
         7: athrow
         8: astore_1
         9: getstatic     #6                  // Field java/lang/System.out:Ljava/io/PrintStream;
        12: invokevirtual #7                  // Method java/io/PrintStream.println:()V
        15: return
      Exception table:
         from    to  target type
             0     8     8   Class java/lang/IllegalArgumentException
      LineNumberTable:
        line 15: 0
        line 16: 8
        line 17: 9
        line 19: 15
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            9       6     1    ex   Ljava/lang/IllegalArgumentException;
            0      16     0  this   Lpbouda/bytecode/examples/ThrowException;
      StackMapTable: number_of_entries = 1
        frame_type = 72 /* same_locals_1_stack_item */
          stack = [ class java/lang/IllegalArgumentException ]
}
SourceFile: "ThrowException.java"
```