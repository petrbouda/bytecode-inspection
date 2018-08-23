# Varargs

- Varargs is simple array - viz `numbers   [I` - an array of integers
- All types has effective way how to reach the parameters of the method till 3rd argument
    - LOADS Variables and PUSHES them on the stack
    - `iload_1`, `iload_2`, `iload_3` - for integers
    - It's not only for parameters, it's for local variables in general
    - Simply it means to load variable with an index 1 from array of variables belonging to the frame
    
```
javap -v -p examples/target/classes/pbouda/bytecode/examples/Varargs.class

Classfile /Users/pbouda/experimental/bytecode-practise/examples/target/classes/pbouda/bytecode/examples/Varargs.class
    <HEADER REMOVED> ...
{
  public pbouda.bytecode.examples.Varargs();
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
            0       5     0  this   Lpbouda/bytecode/examples/Varargs;

  public void methodA(int...);
    descriptor: ([I)V
    flags: (0x0081) ACC_PUBLIC, ACC_VARARGS
    Code:
      stack=2, locals=2, args_size=2
         0: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
         3: aload_1
         4: invokevirtual #3                  // Method java/io/PrintStream.println:(Ljava/lang/Object;)V
         7: return
      LineNumberTable:
        line 6: 0
        line 7: 7
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lpbouda/bytecode/examples/Varargs;
            0       8     1 numbers   [I

  public void methodB(int, int);
    descriptor: (II)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=3
         0: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
         3: iload_1
         4: invokevirtual #4                  // Method java/io/PrintStream.println:(I)V
         7: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
        10: iload_2
        11: invokevirtual #4                  // Method java/io/PrintStream.println:(I)V
        14: return
      LineNumberTable:
        line 10: 0
        line 11: 7
        line 12: 14
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lpbouda/bytecode/examples/Varargs;
            0      15     1    n1   I
            0      15     2    n2   I

  public void methodC(int, int, int, int, int);
    descriptor: (IIIII)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=6, args_size=6
         0: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
         3: iload_1
         4: invokevirtual #4                  // Method java/io/PrintStream.println:(I)V
         7: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
        10: iload_2
        11: invokevirtual #4                  // Method java/io/PrintStream.println:(I)V
        14: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
        17: iload_3
        18: invokevirtual #4                  // Method java/io/PrintStream.println:(I)V
        21: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
        24: iload         4
        26: invokevirtual #4                  // Method java/io/PrintStream.println:(I)V
        29: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
        32: iload         5
        34: invokevirtual #4                  // Method java/io/PrintStream.println:(I)V
        37: return
      LineNumberTable:
        line 15: 0
        line 16: 7
        line 17: 14
        line 18: 21
        line 19: 29
        line 20: 37
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      38     0  this   Lpbouda/bytecode/examples/Varargs;
            0      38     1    n1   I
            0      38     2    n2   I
            0      38     3    n3   I
            0      38     4    n4   I
            0      38     5    n5   I

  public void methodD(byte, short, int, float, double, java.lang.Object);
    descriptor: (BSIFDLjava/lang/Object;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=8, args_size=7
         0: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
         3: iload_1
         4: invokevirtual #4                  // Method java/io/PrintStream.println:(I)V
         7: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
        10: iload_2
        11: invokevirtual #4                  // Method java/io/PrintStream.println:(I)V
        14: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
        17: iload_3
        18: invokevirtual #4                  // Method java/io/PrintStream.println:(I)V
        21: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
        24: fload         4
        26: invokevirtual #5                  // Method java/io/PrintStream.println:(F)V
        29: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
        32: dload         5
        34: invokevirtual #6                  // Method java/io/PrintStream.println:(D)V
        37: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
        40: aload         7
        42: invokevirtual #3                  // Method java/io/PrintStream.println:(Ljava/lang/Object;)V
        45: return
      LineNumberTable:
        line 23: 0
        line 24: 7
        line 25: 14
        line 26: 21
        line 27: 29
        line 28: 37
        line 29: 45
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      46     0  this   Lpbouda/bytecode/examples/Varargs;
            0      46     1    n0   B
            0      46     2    n1   S
            0      46     3    n2   I
            0      46     4    n3   F
            0      46     5    n4   D
            0      46     7    n5   Ljava/lang/Object;

  public void methodE(int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int);
    descriptor: (IIIIIIIIIIIIIIIIIIIIIIIII)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=26, args_size=26
         0: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
         3: iload_1
         4: invokevirtual #4                  // Method java/io/PrintStream.println:(I)V
         7: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
        10: iload_2
        11: invokevirtual #4                  // Method java/io/PrintStream.println:(I)V
        14: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
        17: iload_3
        18: invokevirtual #4                  // Method java/io/PrintStream.println:(I)V
        21: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
        24: iload         4
        26: invokevirtual #4                  // Method java/io/PrintStream.println:(I)V
        29: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
        32: iload         5
        34: invokevirtual #4                  // Method java/io/PrintStream.println:(I)V
        37: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
        40: iload         6
        42: invokevirtual #4                  // Method java/io/PrintStream.println:(I)V
        45: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
        48: iload         7
        50: invokevirtual #4                  // Method java/io/PrintStream.println:(I)V
        53: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
        56: iload         8
        58: invokevirtual #4                  // Method java/io/PrintStream.println:(I)V
        61: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
        64: iload         9
        66: invokevirtual #4                  // Method java/io/PrintStream.println:(I)V
        69: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
        72: iload         10
        74: invokevirtual #4                  // Method java/io/PrintStream.println:(I)V
        77: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
        80: iload         11
        82: invokevirtual #4                  // Method java/io/PrintStream.println:(I)V
        85: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
        88: iload         12
        90: invokevirtual #4                  // Method java/io/PrintStream.println:(I)V
        93: return
      LineNumberTable:
        line 36: 0
        line 37: 7
        line 38: 14
        line 39: 21
        line 40: 29
        line 41: 37
        line 42: 45
        line 43: 53
        line 44: 61
        line 45: 69
        line 46: 77
        line 47: 85
        line 48: 93
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      94     0  this   Lpbouda/bytecode/examples/Varargs;
            0      94     1   n11   I
            0      94     2   n12   I
            0      94     3   n13   I
            0      94     4   n14   I
            0      94     5   n15   I
            0      94     6   n21   I
            0      94     7   n22   I
            0      94     8   n23   I
            0      94     9   n24   I
            0      94    10   n25   I
            0      94    11   n31   I
            0      94    12   n32   I
            0      94    13   n33   I
            0      94    14   n34   I
            0      94    15   n35   I
            0      94    16   n41   I
            0      94    17   n42   I
            0      94    18   n43   I
            0      94    19   n44   I
            0      94    20   n45   I
            0      94    21   n51   I
            0      94    22   n52   I
            0      94    23   n53   I
            0      94    24   n54   I
            0      94    25   n55   I
}
SourceFile: "Varargs.java"
```