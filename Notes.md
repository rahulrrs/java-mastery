# Java Programming

## What is Java
- Java is a high level, object-oriented programming language used for web development, game development, application and enterprise Software.
- Java is a platform-independent programming language because Java programs run on the Java Virtual Machine (JVM), allowing the same program to run on different devices. Once a Java program is compiled into byte code, it can run on any device that has a JVM installed.
- Java has popular frameworks like hibernate and spring which makes it more powerful for enterprise application.
- Java is considered to be fast, secure and powerful programming language 

### Characteristics of Java
- **Platform Independent**: Java programs can run on any device that has a JVM.
- **Object-Oriented**: Java follows concepts like class, object, inheritance, polymorphism, abstraction, and encapsulation.
- **Secure**: Java provides security features to protect programs from harmful code.
- **Robust**: Java has strong memory management and exception handling.
- **Portable**: Java bytecode can be moved and run on different systems.
- **Multithreaded**: Java can run multiple tasks at the same time.
- **Distributed**: Java supports network-based applications.
- **High Performance**: Java is faster than many interpreted languages because of the JIT compiler.
- **Dynamic**: Java can load classes and libraries during runtime.
- **Architecture Neutral**: Java bytecode is not dependent on any specific processor or machine.


## Program vs Process
| Program | Process |
|---|---|
|A program is a set of instructions written in a programming language to perform a specific task.|A process is a program that is currently in execution.|
|Program is stored on disk.|A process is loaded into RAM during runtime.|

## Programming vs Coding
| Coding | Programming |
|---|---|
| Coding means writing instructions in a programming language. | Programming means creating a complete software solution. |
| It mainly focuses on writing code. | It focuses on planning, logic, coding, testing, and maintenance. |
| Coding is one part of programming. | Programming includes coding and other steps. |
| It needs knowledge of syntax. | It needs problem-solving, design, and logical thinking. |
| Example: Writing a Java loop or `if` condition. | Example: Building a complete Java application. |


| Source Code | Bytecode |
|---|---|
| Source code is the code written by the programmer. | Bytecode is the intermediate code generated after compilation. |
| It is written in a human-readable programming language. | It is not easily readable by humans. |
| In Java, source code is stored in a `.java` file. | In Java, bytecode is stored in a `.class` file. |
| Source code is compiled by the Java compiler. | Bytecode is executed by the JVM. |
| Example: `Main.java` | Example: `Main.class` |

## JDK vs JRE vs JVM vs JIT

### Definition

| Term | Full Form | Meaning |
|---|---|---|
| JDK | Java Development Kit | Used to develop, compile, and run Java programs. |
| JRE | Java Runtime Environment | Used to run Java programs. |
| JVM | Java Virtual Machine | Executes Java bytecode and makes Java platform-independent. |
| JIT | Just-In-Time Compiler | Converts bytecode into machine code at runtime for faster execution. |

### Difference

| JDK | JRE | JVM | JIT |
|---|---|---|---|
| For developers | For users who only run Java apps | Runs bytecode | Improves JVM performance |
| Contains JRE, compiler, and tools | Contains JVM and libraries | Part of JRE | Part of JVM |
| Used to write, compile, and run Java code | Used only to run Java code | Converts bytecode into execution | Converts frequently used bytecode into machine code |
| Example: Needed to compile `Main.java` | Needed to run Java applications | Runs `Main.class` bytecode | Speeds up repeated code execution |

### Relationship

```text
JDK = JRE + Development Tools
JRE = JVM + Libraries
JVM contains JIT
```

### Java Execution Flow

```text
Source Code (.java)
        ↓
Java Compiler (javac)
        ↓
Bytecode (.class)
        ↓
JVM
        ↓
Machine Code
```

## Easy Memory Line

JDK is used to develop Java programs, JRE is used to run Java programs, JVM executes bytecode, and JIT improves execution speed.