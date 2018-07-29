# Bytecode Inspection

```bash
mvn clean compile
```

```
$ javap -version
10.0.2
```

```
$ javap

Usage: javap <options> <classes>
where possible options include:
  -help  --help  -?                Print this usage message
  -version                         Version information
  -v  -verbose                     Print additional information
  -l                               Print line number and local variable tables
  -public                          Show only public classes and members
  -protected                       Show protected/public classes and members
  -package                         Show package/protected/public classes
                                   and members (default)
  -p  -private                     Show all classes and members
  -c                               Disassemble the code
  -s                               Print internal type signatures
  -sysinfo                         Show system info (path, size, date, MD5 hash)
                                   of class being processed
  -constants                       Show final constants
  --module <module>, -m <module>   Specify module containing classes to be disassembled
  --module-path <path>             Specify where to find application modules
  --system <jdk>                   Specify where to find system modules
  --class-path <path>              Specify where to find user class files
  -classpath <path>                Specify where to find user class files
  -cp <path>                       Specify where to find user class files
  -bootclasspath <path>            Override location of bootstrap class files

GNU-style options may use = instead of whitespace to separate the name of an option
from its value.

Each class to be shown may be specified by a filename, a URL, or by its fully
qualified class name. Examples:
   path/to/MyClass.class
   jar:file:///path/to/MyJar.jar!/mypkg/MyClass.class
   java.lang.Object
```

```
$ javap target/classes/pbouda/bytecode/PrintInspection.class
Compiled from "LambdaInspection.java"
public class pbouda.bytecode.PrintInspection {
  public pbouda.bytecode.PrintInspection();
  public static void main(java.lang.String[]);
}
```

```
$ javap -sysinfo target/classes/pbouda/bytecode/PrintInspection.class
Classfile /Users/pbouda/IdeaProjects/bytecode-inspection/target/classes/pbouda/bytecode/PrintInspection.class
  Last modified Jul 29, 2018; size 586 bytes
  MD5 checksum 83f01a70681231b05640921e1a4f6641
  Compiled from "PrintInspection.java"
public class pbouda.bytecode.PrintInspection {
  public pbouda.bytecode.PrintInspection();
  public static void main(java.lang.String[]);
}
```

Print all class' members (even private method)
```
$ javap -p target/classes/pbouda/bytecode/PrintInspection.class
Compiled from "PrintInspection.java"
public class pbouda.bytecode.PrintInspection {
  public pbouda.bytecode.PrintInspection();
  public static void main(java.lang.String[]);
  private static void print(java.lang.String);
}
```

Print line number and local variable tables
```
$ javap -p -l target/classes/pbouda/bytecode/PrintInspection.class
Compiled from "PrintInspection.java"
public class pbouda.bytecode.PrintInspection {
  public pbouda.bytecode.PrintInspection();
    LineNumberTable:
      line 3: 0
    LocalVariableTable:
      Start  Length  Slot  Name   Signature
          0       5     0  this   Lpbouda/bytecode/PrintInspection;

  public static void main(java.lang.String[]);
    LineNumberTable:
      line 6: 0
      line 7: 5
    LocalVariableTable:
      Start  Length  Slot  Name   Signature
          0       6     0  args   [Ljava/lang/String;

  private static void print(java.lang.String);
    LineNumberTable:
      line 10: 0
      line 11: 7
    LocalVariableTable:
      Start  Length  Slot  Name   Signature
          0       8     0 statement   Ljava/lang/String;
}
```

ALL-IN-ONE

```
javap -v -p target/classes/pbouda/bytecode/PrintInspection.class
Classfile /Users/pbouda/IdeaProjects/bytecode-inspection/target/classes/pbouda/bytecode/PrintInspection.class
  Last modified Jul 29, 2018; size 700 bytes
  MD5 checksum a396f0e3b97c2edf6a010296dff63ae9
  Compiled from "PrintInspection.java"
public class pbouda.bytecode.PrintInspection
  minor version: 0
  major version: 54
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #6                          // pbouda/bytecode/PrintInspection
  super_class: #7                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 3, attributes: 1
Constant pool:
   #1 = Methodref          #7.#25         // java/lang/Object."<init>":()V
   #2 = String             #26            // Print Something
   #3 = Methodref          #6.#27         // pbouda/bytecode/PrintInspection.print:(Ljava/lang/String;)V
   #4 = Fieldref           #28.#29        // java/lang/System.out:Ljava/io/PrintStream;
   #5 = Methodref          #30.#31        // java/io/PrintStream.println:(Ljava/lang/String;)V
   #6 = Class              #32            // pbouda/bytecode/PrintInspection
   #7 = Class              #33            // java/lang/Object
   #8 = Utf8               <init>
   #9 = Utf8               ()V
  #10 = Utf8               Code
  #11 = Utf8               LineNumberTable
  #12 = Utf8               LocalVariableTable
  #13 = Utf8               this
  #14 = Utf8               Lpbouda/bytecode/PrintInspection;
  #15 = Utf8               main
  #16 = Utf8               ([Ljava/lang/String;)V
  #17 = Utf8               args
  #18 = Utf8               [Ljava/lang/String;
  #19 = Utf8               print
  #20 = Utf8               (Ljava/lang/String;)V
  #21 = Utf8               statement
  #22 = Utf8               Ljava/lang/String;
  #23 = Utf8               SourceFile
  #24 = Utf8               PrintInspection.java
  #25 = NameAndType        #8:#9          // "<init>":()V
  #26 = Utf8               Print Something
  #27 = NameAndType        #19:#20        // print:(Ljava/lang/String;)V
  #28 = Class              #34            // java/lang/System
  #29 = NameAndType        #35:#36        // out:Ljava/io/PrintStream;
  #30 = Class              #37            // java/io/PrintStream
  #31 = NameAndType        #38:#20        // println:(Ljava/lang/String;)V
  #32 = Utf8               pbouda/bytecode/PrintInspection
  #33 = Utf8               java/lang/Object
  #34 = Utf8               java/lang/System
  #35 = Utf8               out
  #36 = Utf8               Ljava/io/PrintStream;
  #37 = Utf8               java/io/PrintStream
  #38 = Utf8               println
{
  public pbouda.bytecode.PrintInspection();
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
            0       5     0  this   Lpbouda/bytecode/PrintInspection;

  public static void main(java.lang.String[]);
    descriptor: ([Ljava/lang/String;)V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=1, args_size=1
         0: ldc           #2                  // String Print Something
         2: invokestatic  #3                  // Method print:(Ljava/lang/String;)V
         5: return
      LineNumberTable:
        line 6: 0
        line 7: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  args   [Ljava/lang/String;

  private static void print(java.lang.String);
    descriptor: (Ljava/lang/String;)V
    flags: (0x000a) ACC_PRIVATE, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: getstatic     #4                  // Field java/lang/System.out:Ljava/io/PrintStream;
         3: aload_0
         4: invokevirtual #5                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
         7: return
      LineNumberTable:
        line 10: 0
        line 11: 7
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0 statement   Ljava/lang/String;
}
SourceFile: "PrintInspection.java"
```