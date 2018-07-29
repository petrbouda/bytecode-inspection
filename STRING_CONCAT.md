# String Concatenation

- Inner class for Method Handle
- Bootstrap Method for a concat invocation with invokeStatic
- `java/lang/invoke/StringConcatFactory.makeConcatWithConstants`

```
$ javap -v -p inspection/target/classes/pbouda/bytecode/inspection/StringConcat.class

Classfile /Users/pbouda/IdeaProjects/bytecode-inspection/inspection/target/classes/pbouda/bytecode/inspection/StringConcat.class
  Last modified Jul 29, 2018; size 874 bytes
  MD5 checksum 3918b1e093216edb4cde4809888b8090
  Compiled from "StringConcat.java"
public class pbouda.bytecode.inspection.StringConcat
  minor version: 0
  major version: 54
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #3                          // pbouda/bytecode/inspection/StringConcat
  super_class: #4                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 2, attributes: 3
Constant pool:
   #1 = Methodref          #4.#18         // java/lang/Object."<init>":()V
   #2 = InvokeDynamic      #0:#22         // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #3 = Class              #23            // pbouda/bytecode/inspection/StringConcat
   #4 = Class              #24            // java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Utf8               Code
   #8 = Utf8               LineNumberTable
   #9 = Utf8               LocalVariableTable
  #10 = Utf8               this
  #11 = Utf8               Lpbouda/bytecode/inspection/StringConcat;
  #12 = Utf8               concatMethod
  #13 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #14 = Utf8               name
  #15 = Utf8               Ljava/lang/String;
  #16 = Utf8               SourceFile
  #17 = Utf8               StringConcat.java
  #18 = NameAndType        #5:#6          // "<init>":()V
  #19 = Utf8               BootstrapMethods
  #20 = MethodHandle       6:#25          // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #21 = String             #26            // Hello \u0001
  #22 = NameAndType        #27:#13        // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #23 = Utf8               pbouda/bytecode/inspection/StringConcat
  #24 = Utf8               java/lang/Object
  #25 = Methodref          #28.#29        // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #26 = Utf8               Hello \u0001
  #27 = Utf8               makeConcatWithConstants
  #28 = Class              #30            // java/lang/invoke/StringConcatFactory
  #29 = NameAndType        #27:#34        // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #30 = Utf8               java/lang/invoke/StringConcatFactory
  #31 = Class              #36            // java/lang/invoke/MethodHandles$Lookup
  #32 = Utf8               Lookup
  #33 = Utf8               InnerClasses
  #34 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #35 = Class              #37            // java/lang/invoke/MethodHandles
  #36 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #37 = Utf8               java/lang/invoke/MethodHandles
{
  public pbouda.bytecode.inspection.StringConcat();
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
            0       5     0  this   Lpbouda/bytecode/inspection/StringConcat;

  private static java.lang.String concatMethod(java.lang.String);
    descriptor: (Ljava/lang/String;)Ljava/lang/String;
    flags: (0x000a) ACC_PRIVATE, ACC_STATIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokedynamic #2,  0              // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
         6: areturn
      LineNumberTable:
        line 5: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  name   Ljava/lang/String;
}
SourceFile: "StringConcat.java"
InnerClasses:
  public static final #32= #31 of #35;    // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
BootstrapMethods:
  0: #20 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #21 Hello \u0001
```