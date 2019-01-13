# Instance of 

- `instanceof` opcode 

```
javap -v -p examples/target/classes/pbouda/bytecode/examples/InstanceOf.class          
            
Classfile /home/pbouda/experiments/bytecode-practise/examples/target/classes/pbouda/bytecode/examples/InstanceOf.class
  Last modified Jan 13, 2019; size 648 bytes
  MD5 checksum d407819e100b5ab0de5f88df008eb4f4
  Compiled from "InstanceOf.java"
public class pbouda.bytecode.examples.InstanceOf
  minor version: 0
  major version: 54
  flags: ACC_PUBLIC, ACC_SUPER
Constant pool:
   #1 = Methodref          #6.#23         // java/lang/Object."<init>":()V
   #2 = Class              #24            // java/lang/String
   #3 = Fieldref           #25.#26        // java/lang/System.out:Ljava/io/PrintStream;
   #4 = Methodref          #27.#28        // java/io/PrintStream.println:()V
   #5 = Class              #29            // pbouda/bytecode/examples/InstanceOf
   #6 = Class              #30            // java/lang/Object
   #7 = Utf8               <init>
   #8 = Utf8               ()V
   #9 = Utf8               Code
  #10 = Utf8               LineNumberTable
  #11 = Utf8               LocalVariableTable
  #12 = Utf8               this
  #13 = Utf8               Lpbouda/bytecode/examples/InstanceOf;
  #14 = Utf8               main
  #15 = Utf8               ([Ljava/lang/String;)V
  #16 = Utf8               args
  #17 = Utf8               [Ljava/lang/String;
  #18 = Utf8               arg
  #19 = Utf8               Ljava/lang/Object;
  #20 = Utf8               StackMapTable
  #21 = Utf8               SourceFile
  #22 = Utf8               InstanceOf.java
  #23 = NameAndType        #7:#8          // "<init>":()V
  #24 = Utf8               java/lang/String
  #25 = Class              #31            // java/lang/System
  #26 = NameAndType        #32:#33        // out:Ljava/io/PrintStream;
  #27 = Class              #34            // java/io/PrintStream
  #28 = NameAndType        #35:#8         // println:()V
  #29 = Utf8               pbouda/bytecode/examples/InstanceOf
  #30 = Utf8               java/lang/Object
  #31 = Utf8               java/lang/System
  #32 = Utf8               out
  #33 = Utf8               Ljava/io/PrintStream;
  #34 = Utf8               java/io/PrintStream
  #35 = Utf8               println
{
  public pbouda.bytecode.examples.InstanceOf();
    descriptor: ()V
    flags: ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 3: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lpbouda/bytecode/examples/InstanceOf;

  public static void main(java.lang.String[]);
    descriptor: ([Ljava/lang/String;)V
    flags: ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=2, args_size=1
         0: aload_0
         1: iconst_0
         2: aaload
         3: astore_1
         4: aload_1
         5: instanceof    #2                  // class java/lang/String
         8: ifeq          17
        11: getstatic     #3                  // Field java/lang/System.out:Ljava/io/PrintStream;
        14: invokevirtual #4                  // Method java/io/PrintStream.println:()V
        17: return
      LineNumberTable:
        line 6: 0
        line 7: 4
        line 8: 11
        line 10: 17
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      18     0  args   [Ljava/lang/String;
            4      14     1   arg   Ljava/lang/Object;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 17
          locals = [ class java/lang/Object ]
}
SourceFile: "InstanceOf.java"
```