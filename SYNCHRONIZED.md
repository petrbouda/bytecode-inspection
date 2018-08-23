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
$ javap -v -p examples/target/classes/pbouda/bytecode/examples/Synchronized.class

Classfile /Users/pbouda/experimental/bytecode-practise/examples/target/classes/pbouda/bytecode/examples/Synchronized.class
  Last modified Aug 23, 2018; size 1060 bytes
  MD5 checksum dfa766825f935cc2bc18295dbba6bec0
  Compiled from "Synchronized.java"
public class pbouda.bytecode.examples.Synchronized
  minor version: 0
  major version: 54
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #6                          // pbouda/bytecode/examples/Synchronized
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 2, methods: 5, attributes: 1
Constant pool:
   #1 = Methodref          #2.#29         // java/lang/Object."<init>":()V
   #2 = Class              #30            // java/lang/Object
   #3 = Fieldref           #6.#31         // pbouda/bytecode/examples/Synchronized.lock:Ljava/lang/Object;
   #4 = Methodref          #26.#32        // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #5 = Fieldref           #6.#33         // pbouda/bytecode/examples/Synchronized.number:Ljava/lang/Integer;
   #6 = Class              #34            // pbouda/bytecode/examples/Synchronized
   #7 = Utf8               lock
   #8 = Utf8               Ljava/lang/Object;
   #9 = Utf8               number
  #10 = Utf8               Ljava/lang/Integer;
  #11 = Utf8               <init>
  #12 = Utf8               ()V
  #13 = Utf8               Code
  #14 = Utf8               LineNumberTable
  #15 = Utf8               LocalVariableTable
  #16 = Utf8               this
  #17 = Utf8               Lpbouda/bytecode/examples/Synchronized;
  #18 = Utf8               getSyncMethod
  #19 = Utf8               ()Ljava/lang/Integer;
  #20 = Utf8               setSyncMethod
  #21 = Utf8               (Ljava/lang/Integer;)V
  #22 = Utf8               getSyncBlock
  #23 = Utf8               StackMapTable
  #24 = Class              #35            // java/lang/Throwable
  #25 = Utf8               setSyncBlock
  #26 = Class              #36            // java/lang/Integer
  #27 = Utf8               SourceFile
  #28 = Utf8               Synchronized.java
  #29 = NameAndType        #11:#12        // "<init>":()V
  #30 = Utf8               java/lang/Object
  #31 = NameAndType        #7:#8          // lock:Ljava/lang/Object;
  #32 = NameAndType        #37:#38        // valueOf:(I)Ljava/lang/Integer;
  #33 = NameAndType        #9:#10         // number:Ljava/lang/Integer;
  #34 = Utf8               pbouda/bytecode/examples/Synchronized
  #35 = Utf8               java/lang/Throwable
  #36 = Utf8               java/lang/Integer
  #37 = Utf8               valueOf
  #38 = Utf8               (I)Ljava/lang/Integer;
{
  private final java.lang.Object lock;
    descriptor: Ljava/lang/Object;
    flags: (0x0012) ACC_PRIVATE, ACC_FINAL

  private java.lang.Integer number;
    descriptor: Ljava/lang/Integer;
    flags: (0x0002) ACC_PRIVATE

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
        15: aload_0
        16: iconst_1
        17: invokestatic  #4                  // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        20: putfield      #5                  // Field number:Ljava/lang/Integer;
        23: return
      LineNumberTable:
        line 3: 0
        line 5: 4
        line 7: 15
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      24     0  this   Lpbouda/bytecode/examples/Synchronized;

  public synchronized java.lang.Integer getSyncMethod();
    descriptor: ()Ljava/lang/Integer;
    flags: (0x0021) ACC_PUBLIC, ACC_SYNCHRONIZED
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #5                  // Field number:Ljava/lang/Integer;
         4: areturn
      LineNumberTable:
        line 11: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lpbouda/bytecode/examples/Synchronized;

  public synchronized void setSyncMethod(java.lang.Integer);
    descriptor: (Ljava/lang/Integer;)V
    flags: (0x0021) ACC_PUBLIC, ACC_SYNCHRONIZED
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: putfield      #5                  // Field number:Ljava/lang/Integer;
         5: return
      LineNumberTable:
        line 15: 0
        line 16: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lpbouda/bytecode/examples/Synchronized;
            0       6     1 number   Ljava/lang/Integer;

  public synchronized java.lang.Integer getSyncBlock();
    descriptor: ()Ljava/lang/Integer;
    flags: (0x0021) ACC_PUBLIC, ACC_SYNCHRONIZED
    Code:
      stack=2, locals=3, args_size=1
         0: aload_0
         1: getfield      #3                  // Field lock:Ljava/lang/Object;
         4: dup
         5: astore_1
         6: monitorenter
         7: aload_0
         8: getfield      #5                  // Field number:Ljava/lang/Integer;
        11: aload_1
        12: monitorexit
        13: areturn
        14: astore_2
        15: aload_1
        16: monitorexit
        17: aload_2
        18: athrow
      Exception table:
         from    to  target type
             7    13    14   any
            14    17    14   any
      LineNumberTable:
        line 19: 0
        line 20: 7
        line 21: 14
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lpbouda/bytecode/examples/Synchronized;
      StackMapTable: number_of_entries = 1
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class pbouda/bytecode/examples/Synchronized, class java/lang/Object ]
          stack = [ class java/lang/Throwable ]

  public synchronized void setSyncBlock(java.lang.Integer);
    descriptor: (Ljava/lang/Integer;)V
    flags: (0x0021) ACC_PUBLIC, ACC_SYNCHRONIZED
    Code:
      stack=2, locals=4, args_size=2
         0: aload_0
         1: getfield      #3                  // Field lock:Ljava/lang/Object;
         4: dup
         5: astore_2
         6: monitorenter
         7: aload_0
         8: aload_1
         9: putfield      #5                  // Field number:Ljava/lang/Integer;
        12: aload_2
        13: monitorexit
        14: goto          22
        17: astore_3
        18: aload_2
        19: monitorexit
        20: aload_3
        21: athrow
        22: return
      Exception table:
         from    to  target type
             7    14    17   any
            17    20    17   any
      LineNumberTable:
        line 25: 0
        line 26: 7
        line 27: 12
        line 28: 22
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      23     0  this   Lpbouda/bytecode/examples/Synchronized;
            0      23     1 number   Ljava/lang/Integer;
      StackMapTable: number_of_entries = 2
        frame_type = 255 /* full_frame */
          offset_delta = 17
          locals = [ class pbouda/bytecode/examples/Synchronized, class java/lang/Integer, class java/lang/Object ]
          stack = [ class java/lang/Throwable ]
        frame_type = 250 /* chop */
          offset_delta = 4
}
SourceFile: "Synchronized.java"
```