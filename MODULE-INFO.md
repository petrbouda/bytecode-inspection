# Module-info class

- No super class
- Has own flag `ACC_MODULE`
- Automatically required module `"java.base" ACC_MANDATED`
- Flag for a transitive module `"org.apache.commons.lang3" ACC_TRANSITIVE`

```
$ javap -v -p module-a/target/classes/module-info.class

Classfile /Users/pbouda/IdeaProjects/bytecode-examples/module-a/target/classes/module-info.class
  Last modified Jul 29, 2018; size 261 bytes
  MD5 checksum 8b218685168dc70cd4d36f8b8f7e56cd
  Compiled from "module-info.java"
module bytecode.module.a
  minor version: 0
  major version: 54
  flags: (0x8000) ACC_MODULE
  this_class: #1                          // "module-info"
  super_class: #0
  interfaces: 0, fields: 0, methods: 0, attributes: 2
Constant pool:
   #1 = Class              #11            // "module-info"
   #2 = Utf8               SourceFile
   #3 = Utf8               module-info.java
   #4 = Utf8               Module
   #5 = Module             #12            // "bytecode.module.a"
   #6 = Module             #13            // "java.base"
   #7 = Utf8               10.0.2
   #8 = Module             #14            // "org.joda.time"
   #9 = Module             #15            // "org.apache.commons.lang3"
  #10 = Package            #16            // pbouda/bytecode/modulea
  #11 = Utf8               module-info
  #12 = Utf8               bytecode.module.a
  #13 = Utf8               java.base
  #14 = Utf8               org.joda.time
  #15 = Utf8               org.apache.commons.lang3
  #16 = Utf8               pbouda/bytecode/modulea
{
}
SourceFile: "module-info.java"
Module:
  #5,0                                    // "bytecode.module.a"
  #0
  3                                       // requires
    #6,8000                                 // "java.base" ACC_MANDATED
    #7                                      // 10.0.2
    #8,0                                    // "org.joda.time"
    #0
    #9,20                                   // "org.apache.commons.lang3" ACC_TRANSITIVE
    #0
  1                                       // exports
    #10,0                                   // pbouda/bytecode/modulea
  0                                       // opens
  0                                       // uses
  0                                       // provides
```

```
$ javap -v -p examples/target/classes/module-info.class

Classfile /Users/pbouda/IdeaProjects/bytecode-examples/examples/target/classes/module-info.class
  Last modified Jul 29, 2018; size 196 bytes
  MD5 checksum 03e96cdcce8b92df4aa37b8a9b4f6364
  Compiled from "module-info.java"
module bytecode.examples
  minor version: 0
  major version: 54
  flags: (0x8000) ACC_MODULE
  this_class: #1                          // "module-info"
  super_class: #0
  interfaces: 0, fields: 0, methods: 0, attributes: 2
Constant pool:
   #1 = Class              #9             // "module-info"
   #2 = Utf8               SourceFile
   #3 = Utf8               module-info.java
   #4 = Utf8               Module
   #5 = Module             #10            // "bytecode.examples"
   #6 = Module             #11            // "java.base"
   #7 = Utf8               10.0.2
   #8 = Module             #12            // "bytecode.module.a"
   #9 = Utf8               module-info
  #10 = Utf8               bytecode.examples
  #11 = Utf8               java.base
  #12 = Utf8               bytecode.module.a
{
}
SourceFile: "module-info.java"
Module:
  #5,0                                    // "bytecode.examples"
  #0
  2                                       // requires
    #6,8000                                 // "java.base" ACC_MANDATED
    #7                                      // 10.0.2
    #8,0                                    // "bytecode.module.a"
    #0
  0                                       // exports
  0                                       // opens
  0                                       // uses
  0                                       // provides
```

