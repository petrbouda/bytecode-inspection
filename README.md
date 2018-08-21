# Bytecode Practise

https://docs.oracle.com/javase/specs/jvms/se10/html/jvms-4.html

#### Opcodes Invoke* / Method Handle / BootstrapMethod (Class-File Argument)

https://www.infoq.com/articles/Invokedynamic-Javas-secret-weapon

```
This example has shown the simplest case of invokedynamic, which uses 
the special case of a constant CallSite object. This means that 
the BSM (and lookup) is done only once and so subsequent calls are fast.

The call site and target method can change during the lifetime of the program
```

#### Bytecode Instructions

[https://en.wikipedia.org/wiki/Java_bytecode_instruction_listings]

#### TODO

- try-with-resources
- exception
- synchronized (method and block)
- inner classes
- anonymous classes
- double brace
```
new ArrayList<Integer>() {{
   add(1);
   add(2);
}};
```
- generics / types / instanceof
