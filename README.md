# Bytecode Practise

```
$ java -version
java version "10.0.2" 2018-07-17
Java(TM) SE Runtime Environment 18.3 (build 10.0.2+13)
Java HotSpot(TM) 64-Bit Server VM 18.3 (build 10.0.2+13, mixed mode)
```

https://docs.oracle.com/javase/specs/jvms/se10/html/jvms-4.html

#### Bytecode Viewer

https://github.com/Konloch/bytecode-viewer

#### Opcodes Invoke* / Method Handle / BootstrapMethod (Class-File Argument)

https://www.infoq.com/articles/Invokedynamic-Javas-secret-weapon

```
This example has shown the simplest case of invokedynamic, which uses 
the special case of a constant CallSite object. This means that 
the BSM (and lookup) is done only once and so subsequent calls are fast.

The call site and target method can change during the lifetime of the program
```

#### Bytecode Instructions

https://en.wikipedia.org/wiki/Java_bytecode_instruction_listings

#### TODO

- generics / types / instanceof / annotations
