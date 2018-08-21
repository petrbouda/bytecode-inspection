# Reentrant Lock

- Nothing special generated.

```
$ javap -v -p examples/target/classes/pbouda/bytecode/examples/Lock

Warning: File ./Lock.class does not contain class Lock
Classfile /Users/pbouda/experimental/bytecode-practise/examples/target/classes/pbouda/bytecode/examples/Lock.class
  Last modified Aug 21, 2018; size 904 bytes
  MD5 checksum ea5f488b0327950d752de9da9cf1e0a2
  Compiled from "Lock.java"
public class pbouda.bytecode.examples.Lock
  minor version: 0
  major version: 54
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #9                          // pbouda/bytecode/examples/Lock
  super_class: #5                         // java/lang/Object
  interfaces: 0, fields: 2, methods: 3, attributes: 1
Constant pool:
   #1 = Methodref          #5.#29         // java/lang/Object."<init>":()V
   #2 = Class              #30            // java/util/concurrent/locks/ReentrantLock
   #3 = Methodref          #2.#29         // java/util/concurrent/locks/ReentrantLock."<init>":()V
   #4 = Fieldref           #9.#31         // pbouda/bytecode/examples/Lock.lock:Ljava/util/concurrent/locks/ReentrantLock;
   #5 = Class              #32            // java/lang/Object
   #6 = Fieldref           #9.#33         // pbouda/bytecode/examples/Lock.myObject:Ljava/lang/Object;
   #7 = Methodref          #2.#34         // java/util/concurrent/locks/ReentrantLock.lock:()V
   #8 = Methodref          #2.#35         // java/util/concurrent/locks/ReentrantLock.unlock:()V
   #9 = Class              #36            // pbouda/bytecode/examples/Lock
  #10 = Utf8               lock
  #11 = Utf8               Ljava/util/concurrent/locks/ReentrantLock;
  #12 = Utf8               myObject
  #13 = Utf8               Ljava/lang/Object;
  #14 = Utf8               <init>
  #15 = Utf8               ()V
  #16 = Utf8               Code
  #17 = Utf8               LineNumberTable
  #18 = Utf8               LocalVariableTable
  #19 = Utf8               this
  #20 = Utf8               Lpbouda/bytecode/examples/Lock;
  #21 = Utf8               getMyObject
  #22 = Utf8               ()Ljava/lang/Object;
  #23 = Utf8               StackMapTable
  #24 = Class              #37            // java/lang/Throwable
  #25 = Utf8               setMyObject
  #26 = Utf8               (Ljava/lang/Object;)V
  #27 = Utf8               SourceFile
  #28 = Utf8               Lock.java
  #29 = NameAndType        #14:#15        // "<init>":()V
  #30 = Utf8               java/util/concurrent/locks/ReentrantLock
  #31 = NameAndType        #10:#11        // lock:Ljava/util/concurrent/locks/ReentrantLock;
  #32 = Utf8               java/lang/Object
  #33 = NameAndType        #12:#13        // myObject:Ljava/lang/Object;
  #34 = NameAndType        #10:#15        // lock:()V
  #35 = NameAndType        #38:#15        // unlock:()V
  #36 = Utf8               pbouda/bytecode/examples/Lock
  #37 = Utf8               java/lang/Throwable
  #38 = Utf8               unlock
{
  private final java.util.concurrent.locks.ReentrantLock lock;
    descriptor: Ljava/util/concurrent/locks/ReentrantLock;
    flags: (0x0012) ACC_PRIVATE, ACC_FINAL

  private java.lang.Object myObject;
    descriptor: Ljava/lang/Object;
    flags: (0x0002) ACC_PRIVATE

  public pbouda.bytecode.examples.Lock();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: new           #2                  // class java/util/concurrent/locks/ReentrantLock
         8: dup
         9: invokespecial #3                  // Method java/util/concurrent/locks/ReentrantLock."<init>":()V
        12: putfield      #4                  // Field lock:Ljava/util/concurrent/locks/ReentrantLock;
        15: aload_0
        16: new           #5                  // class java/lang/Object
        19: dup
        20: invokespecial #1                  // Method java/lang/Object."<init>":()V
        23: putfield      #6                  // Field myObject:Ljava/lang/Object;
        26: return
      LineNumberTable:
        line 5: 0
        line 7: 4
        line 9: 15
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      27     0  this   Lpbouda/bytecode/examples/Lock;

  public java.lang.Object getMyObject();
    descriptor: ()Ljava/lang/Object;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=3, args_size=1
         0: aload_0
         1: getfield      #4                  // Field lock:Ljava/util/concurrent/locks/ReentrantLock;
         4: invokevirtual #7                  // Method java/util/concurrent/locks/ReentrantLock.lock:()V
         7: aload_0
         8: getfield      #6                  // Field myObject:Ljava/lang/Object;
        11: astore_1
        12: aload_0
        13: getfield      #4                  // Field lock:Ljava/util/concurrent/locks/ReentrantLock;
        16: invokevirtual #8                  // Method java/util/concurrent/locks/ReentrantLock.unlock:()V
        19: aload_1
        20: areturn
        21: astore_2
        22: aload_0
        23: getfield      #4                  // Field lock:Ljava/util/concurrent/locks/ReentrantLock;
        26: invokevirtual #8                  // Method java/util/concurrent/locks/ReentrantLock.unlock:()V
        29: aload_2
        30: athrow
      Exception table:
         from    to  target type
             7    12    21   any
      LineNumberTable:
        line 12: 0
        line 14: 7
        line 16: 12
        line 14: 19
        line 16: 21
        line 17: 29
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      31     0  this   Lpbouda/bytecode/examples/Lock;
      StackMapTable: number_of_entries = 1
        frame_type = 85 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]

  public void setMyObject(java.lang.Object);
    descriptor: (Ljava/lang/Object;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=2
         0: aload_0
         1: getfield      #4                  // Field lock:Ljava/util/concurrent/locks/ReentrantLock;
         4: invokevirtual #7                  // Method java/util/concurrent/locks/ReentrantLock.lock:()V
         7: aload_0
         8: aload_1
         9: putfield      #6                  // Field myObject:Ljava/lang/Object;
        12: aload_0
        13: getfield      #4                  // Field lock:Ljava/util/concurrent/locks/ReentrantLock;
        16: invokevirtual #8                  // Method java/util/concurrent/locks/ReentrantLock.unlock:()V
        19: goto          32
        22: astore_2
        23: aload_0
        24: getfield      #4                  // Field lock:Ljava/util/concurrent/locks/ReentrantLock;
        27: invokevirtual #8                  // Method java/util/concurrent/locks/ReentrantLock.unlock:()V
        30: aload_2
        31: athrow
        32: return
      Exception table:
         from    to  target type
             7    12    22   any
      LineNumberTable:
        line 21: 0
        line 23: 7
        line 25: 12
        line 26: 19
        line 25: 22
        line 26: 30
        line 27: 32
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      33     0  this   Lpbouda/bytecode/examples/Lock;
            0      33     1 myObject   Ljava/lang/Object;
      StackMapTable: number_of_entries = 2
        frame_type = 86 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 9 /* same */
}
SourceFile: "Lock.java"
```
