# Try With Resources

- Chaos :)

```
$ javap -v -p examples/target/classes/pbouda/bytecode/examples/TryWithResources

Warning: File ./TryWithResources.class does not contain class TryWithResources
Classfile /Users/pbouda/experimental/bytecode-practise/examples/target/classes/pbouda/bytecode/examples/TryWithResources.class
  Last modified Aug 21, 2018; size 1022 bytes
  MD5 checksum 1823a6f85b570e5019ec95f1164862dc
  Compiled from "TryWithResources.java"
public class pbouda.bytecode.examples.TryWithResources
  minor version: 0
  major version: 54
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // pbouda/bytecode/examples/TryWithResources
  super_class: #12                        // java/lang/Object
  interfaces: 0, fields: 0, methods: 2, attributes: 1
Constant pool:
   #1 = Methodref          #12.#28        // java/lang/Object."<init>":()V
   #2 = Class              #29            // java/io/StringReader
   #3 = String             #30            //
   #4 = Methodref          #2.#31         // java/io/StringReader."<init>":(Ljava/lang/String;)V
   #5 = Fieldref           #32.#33        // java/lang/System.out:Ljava/io/PrintStream;
   #6 = Methodref          #2.#34         // java/io/StringReader.read:()I
   #7 = Methodref          #35.#36        // java/io/PrintStream.println:(I)V
   #8 = Methodref          #2.#37         // java/io/StringReader.close:()V
   #9 = Class              #38            // java/lang/Throwable
  #10 = Methodref          #9.#39         // java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
  #11 = Class              #40            // pbouda/bytecode/examples/TryWithResources
  #12 = Class              #41            // java/lang/Object
  #13 = Utf8               <init>
  #14 = Utf8               ()V
  #15 = Utf8               Code
  #16 = Utf8               LineNumberTable
  #17 = Utf8               LocalVariableTable
  #18 = Utf8               this
  #19 = Utf8               Lpbouda/bytecode/examples/TryWithResources;
  #20 = Utf8               tryWithResources
  #21 = Utf8               reader
  #22 = Utf8               Ljava/io/StringReader;
  #23 = Utf8               StackMapTable
  #24 = Utf8               Exceptions
  #25 = Class              #42            // java/io/IOException
  #26 = Utf8               SourceFile
  #27 = Utf8               TryWithResources.java
  #28 = NameAndType        #13:#14        // "<init>":()V
  #29 = Utf8               java/io/StringReader
  #30 = Utf8
  #31 = NameAndType        #13:#43        // "<init>":(Ljava/lang/String;)V
  #32 = Class              #44            // java/lang/System
  #33 = NameAndType        #45:#46        // out:Ljava/io/PrintStream;
  #34 = NameAndType        #47:#48        // read:()I
  #35 = Class              #49            // java/io/PrintStream
  #36 = NameAndType        #50:#51        // println:(I)V
  #37 = NameAndType        #52:#14        // close:()V
  #38 = Utf8               java/lang/Throwable
  #39 = NameAndType        #53:#54        // addSuppressed:(Ljava/lang/Throwable;)V
  #40 = Utf8               pbouda/bytecode/examples/TryWithResources
  #41 = Utf8               java/lang/Object
  #42 = Utf8               java/io/IOException
  #43 = Utf8               (Ljava/lang/String;)V
  #44 = Utf8               java/lang/System
  #45 = Utf8               out
  #46 = Utf8               Ljava/io/PrintStream;
  #47 = Utf8               read
  #48 = Utf8               ()I
  #49 = Utf8               java/io/PrintStream
  #50 = Utf8               println
  #51 = Utf8               (I)V
  #52 = Utf8               close
  #53 = Utf8               addSuppressed
  #54 = Utf8               (Ljava/lang/Throwable;)V
{
  public pbouda.bytecode.examples.TryWithResources();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 6: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lpbouda/bytecode/examples/TryWithResources;

  public void tryWithResources() throws java.io.IOException;
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=6, args_size=1
         0: new           #2                  // class java/io/StringReader
         3: dup
         4: ldc           #3                  // String
         6: invokespecial #4                  // Method java/io/StringReader."<init>":(Ljava/lang/String;)V
         9: astore_1
        10: aconst_null
        11: astore_2
        12: getstatic     #5                  // Field java/lang/System.out:Ljava/io/PrintStream;
        15: aload_1
        16: invokevirtual #6                  // Method java/io/StringReader.read:()I
        19: invokevirtual #7                  // Method java/io/PrintStream.println:(I)V
        22: aload_2
        23: ifnull        42
        26: aload_1
        27: invokevirtual #8                  // Method java/io/StringReader.close:()V
        30: goto          85
        33: astore_3
        34: aload_2
        35: aload_3
        36: invokevirtual #10                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        39: goto          85
        42: aload_1
        43: invokevirtual #8                  // Method java/io/StringReader.close:()V
        46: goto          85
        49: astore_3
        50: aload_3
        51: astore_2
        52: aload_3
        53: athrow
        54: astore        4
        56: aload_2
        57: ifnull        78
        60: aload_1
        61: invokevirtual #8                  // Method java/io/StringReader.close:()V
        64: goto          82
        67: astore        5
        69: aload_2
        70: aload         5
        72: invokevirtual #10                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        75: goto          82
        78: aload_1
        79: invokevirtual #8                  // Method java/io/StringReader.close:()V
        82: aload         4
        84: athrow
        85: return
      Exception table:
         from    to  target type
            26    30    33   Class java/lang/Throwable
            12    22    49   Class java/lang/Throwable
            12    22    54   any
            60    64    67   Class java/lang/Throwable
            49    56    54   any
      LineNumberTable:
        line 9: 0
        line 10: 12
        line 11: 22
        line 9: 49
        line 11: 54
        line 12: 85
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           10      75     1 reader   Ljava/io/StringReader;
            0      86     0  this   Lpbouda/bytecode/examples/TryWithResources;
      StackMapTable: number_of_entries = 8
        frame_type = 255 /* full_frame */
          offset_delta = 33
          locals = [ class pbouda/bytecode/examples/TryWithResources, class java/io/StringReader, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 70 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 68 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 12
          locals = [ class pbouda/bytecode/examples/TryWithResources, class java/io/StringReader, class java/lang/Throwable, top, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 10 /* same */
        frame_type = 3 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class pbouda/bytecode/examples/TryWithResources ]
          stack = []
    Exceptions:
      throws java.io.IOException
}
SourceFile: "TryWithResources.java"
```