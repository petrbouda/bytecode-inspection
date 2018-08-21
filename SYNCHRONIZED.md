# Synchronized

#### `getSynchronizedNumber()`
- only `ACC_SYNCHRONIZED` flag
- without `monitorenter` and `monitorexit` !!!

#### `getLockedNumber()`
- one `monitorenter` and two `monitorexit`
- Exception table defines a range of try blocks
```
Exception table:
   from    to  target type
       7    10    11   any
      11    14    11   any
```
- Plus stack map structure
```
StackMapTable: number_of_entries = 1
  frame_type = 255 /* full_frame */
    offset_delta = 11
    locals = [ class pbouda/bytecode/examples/Synchronized, class java/lang/Object ]
    stack = [ class java/lang/Throwable ]
```

```
$ javap -v -p examples/target/classes/pbouda/bytecode/examples/Synchronized

Warning: File ./Synchronized.class does not contain class Synchronized
Classfile /Users/pbouda/experimental/bytecode-practise/examples/target/classes/pbouda/bytecode/examples/Synchronized.class
  Last modified Aug 21, 2018; size 639 bytes
  MD5 checksum c4b7ce80d3c1135fe0fba3916506880d
  Compiled from "Synchronized.java"
public class pbouda.bytecode.examples.Synchronized
  minor version: 0
  major version: 54
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #4                          // pbouda/bytecode/examples/Synchronized
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 1, methods: 3, attributes: 1
Constant pool:
   #1 = Methodref          #2.#21         // java/lang/Object."<init>":()V
   #2 = Class              #22            // java/lang/Object
   #3 = Fieldref           #4.#23         // pbouda/bytecode/examples/Synchronized.lock:Ljava/lang/Object;
   #4 = Class              #24            // pbouda/bytecode/examples/Synchronized
   #5 = Utf8               lock
   #6 = Utf8               Ljava/lang/Object;
   #7 = Utf8               <init>
   #8 = Utf8               ()V
   #9 = Utf8               Code
  #10 = Utf8               LineNumberTable
  #11 = Utf8               LocalVariableTable
  #12 = Utf8               this
  #13 = Utf8               Lpbouda/bytecode/examples/Synchronized;
  #14 = Utf8               getSynchronizedNumber
  #15 = Utf8               ()I
  #16 = Utf8               getLockedNumber
  #17 = Utf8               StackMapTable
  #18 = Class              #25            // java/lang/Throwable
  #19 = Utf8               SourceFile
  #20 = Utf8               Synchronized.java
  #21 = NameAndType        #7:#8          // "<init>":()V
  #22 = Utf8               java/lang/Object
  #23 = NameAndType        #5:#6          // lock:Ljava/lang/Object;
  #24 = Utf8               pbouda/bytecode/examples/Synchronized
  #25 = Utf8               java/lang/Throwable
{
  private final java.lang.Object lock;
    descriptor: Ljava/lang/Object;
    flags: (0x0012) ACC_PRIVATE, ACC_FINAL

  public pbouda.bytecode.examples.Synchronized();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: new           #2                  // class java/lang/Object
         8: dup
         9: invokespecial #1                  // Method java/lang/Object."<init>":()V
        12: putfield      #3                  // Field lock:Ljava/lang/Object;
        15: return
      LineNumberTable:
        line 3: 0
        line 5: 4
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lpbouda/bytecode/examples/Synchronized;

  public synchronized int getSynchronizedNumber();
    descriptor: ()I
    flags: (0x0021) ACC_PUBLIC, ACC_SYNCHRONIZED
    Code:
      stack=1, locals=1, args_size=1
         0: iconst_1
         1: ireturn
      LineNumberTable:
        line 8: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lpbouda/bytecode/examples/Synchronized;

  public int getLockedNumber();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=1
         0: aload_0
         1: getfield      #3                  // Field lock:Ljava/lang/Object;
         4: dup
         5: astore_1
         6: monitorenter
         7: iconst_1
         8: aload_1
         9: monitorexit
        10: ireturn
        11: astore_2
        12: aload_1
        13: monitorexit
        14: aload_2
        15: athrow
      Exception table:
         from    to  target type
             7    10    11   any
            11    14    11   any
      LineNumberTable:
        line 12: 0
        line 13: 7
        line 14: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lpbouda/bytecode/examples/Synchronized;
      StackMapTable: number_of_entries = 1
        frame_type = 255 /* full_frame */
          offset_delta = 11
          locals = [ class pbouda/bytecode/examples/Synchronized, class java/lang/Object ]
          stack = [ class java/lang/Throwable ]
}
SourceFile: "Synchronized.java"
```