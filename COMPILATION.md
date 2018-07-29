# Compile Java Sources

### Compile Modules

```
javac -d out --module-source-path <source-folder> -m <root-module>
```
- Module has to be in the same package what is the name of the module

### Debug Information in Compiled Code

- It increases the size of the class files, thus increasing load time.
- During an execution this information is completely ignored (no difference in performance)
- Debugging information is meta information only.
- Use **-g** option of javac
- Useful for debugging purposes if we don't have source code 
- **BY DEFAULT**: without specifying **-g**
   - Only line numbers and source file information is generated
- Specifying **-g** includes local variable debugging information as well (We can see the real name of variables)

- What a debug info is included: -g:[keyword list] (comma separated list)

**source**: Source file debugging information.
**lines**: Line number debugging information.
**vars**: Local variable debugging information.

- **-g:none** doesn't generate any debug information.