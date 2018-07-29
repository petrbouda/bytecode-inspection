# Javap Examples

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

Print only public methods
```
$ javap out/bytecode.inspection/pbouda/bytecode/PrintInspection.class
Compiled from "PrintInspection.java"
public class pbouda.bytecode.PrintInspection {
  public pbouda.bytecode.PrintInspection();
  public static void main(java.lang.String[]);
}
```

Information about a class file
```
$ javap -sysinfo out/bytecode.inspection/pbouda/bytecode/PrintInspection.class
Classfile /Users/pbouda/IdeaProjects/bytecode-inspection/out/bytecode.inspection/pbouda/bytecode/PrintInspection.class
  Last modified Jul 29, 2018; size 520 bytes
  MD5 checksum bcf3fb55121a260e69b86d5961f58370
  Compiled from "PrintInspection.java"
public class pbouda.bytecode.PrintInspection {
  public pbouda.bytecode.PrintInspection();
  public static void main(java.lang.String[]);
}
```

Print all class' members (even private method)
```
$ javap -p out/bytecode.inspection/pbouda/bytecode/PrintInspection.class
Compiled from "PrintInspection.java"
public class pbouda.bytecode.PrintInspection {
  public pbouda.bytecode.PrintInspection();
  public static void main(java.lang.String[]);
  private static void print(java.lang.String);
}
```

ALL-IN-ONE (verbose + private methods)
```
javap -v -p out/bytecode.inspection/pbouda/bytecode/PrintInspection.class
Classfile /Users/pbouda/IdeaProjects/bytecode-inspection/out/bytecode.inspection/pbouda/bytecode/PrintInspection.class
  Last modified Jul 29, 2018; size 520 bytes
  MD5 checksum bcf3fb55121a260e69b86d5961f58370
  Compiled from "PrintInspection.java"
public class pbouda.bytecode.PrintInspection
  minor version: 0
  major version: 54
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #6                          // pbouda/bytecode/PrintInspection
  super_class: #7                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 3, attributes: 1
Constant pool:
   #1 = Methodref          #7.#18         // java/lang/Object."<init>":()V
   #2 = String             #19            // Print Something
   #3 = Methodref          #6.#20         // pbouda/bytecode/PrintInspection.print:(Ljava/lang/String;)V
   #4 = Fieldref           #21.#22        // java/lang/System.out:Ljava/io/PrintStream;
   #5 = Methodref          #23.#24        // java/io/PrintStream.println:(Ljava/lang/String;)V
   #6 = Class              #25            // pbouda/bytecode/PrintInspection
   #7 = Class              #26            // java/lang/Object
   #8 = Utf8               <init>
   #9 = Utf8               ()V
  #10 = Utf8               Code
  #11 = Utf8               LineNumberTable
  #12 = Utf8               main
  #13 = Utf8               ([Ljava/lang/String;)V
  #14 = Utf8               print
  #15 = Utf8               (Ljava/lang/String;)V
  #16 = Utf8               SourceFile
  #17 = Utf8               PrintInspection.java
  #18 = NameAndType        #8:#9          // "<init>":()V
  #19 = Utf8               Print Something
  #20 = NameAndType        #14:#15        // print:(Ljava/lang/String;)V
  #21 = Class              #27            // java/lang/System
  #22 = NameAndType        #28:#29        // out:Ljava/io/PrintStream;
  #23 = Class              #30            // java/io/PrintStream
  #24 = NameAndType        #31:#15        // println:(Ljava/lang/String;)V
  #25 = Utf8               pbouda/bytecode/PrintInspection
  #26 = Utf8               java/lang/Object
  #27 = Utf8               java/lang/System
  #28 = Utf8               out
  #29 = Utf8               Ljava/io/PrintStream;
  #30 = Utf8               java/io/PrintStream
  #31 = Utf8               println
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
}
SourceFile: "PrintInspection.java"
```