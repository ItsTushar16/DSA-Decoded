# Java Basics & Data Types ☕

Java is a high-level, object-oriented, and strongly typed programming language.

It is widely used for:
- Software Development
- Android Development
- Backend Development

---

# Basic Structure of a Java Program

Every Java program starts with a class and a `main()` method.

## Syntax

```java
public class JavaBasics {

    public static void main(String[] args) {
        // code here
    }
}
```

---

# Understanding the Boilerplate Code

## `public class JavaBasics`

- `public` → accessible from anywhere
- `class` → blueprint of objects
- `JavaBasics` → class name

> Important: File name and class name should be the same.

Example:

```java
JavaBasics.java
```

---

## `public static void main(String[] args)`

This is the entry point of every Java program.

### Breakdown

| Keyword | Meaning |
|---|---|
| `public` | accessible everywhere |
| `static` | method can run without object |
| `void` | returns nothing |
| `main()` | main function |
| `String[] args` | command line arguments |

---

# Output in Java

## `print()`

Prints output on the same line.

```java
System.out.print("Hello");
System.out.print("World");
```

### Output

```java
HelloWorld
```

---

## `println()`

Prints output and moves to the next line.

```java
System.out.println("Hello");
System.out.println("World");
```

### Output

```java
Hello
World
```

---

# Data Types in Java

Data types define:
- what kind of data a variable stores
- memory size
- value range

---

# Types of Data Types

## 1. Primitive Data Types

Built-in data types provided by Java.

- byte
- short
- char
- boolean
- int
- long
- float
- double

---

## 2. Non-Primitive Data Types

Created by the programmer or provided by Java.

Examples:
- String
- Array
- Class
- Object
- Interface

---

# Primitive Data Types Table

| Data Type | Size | Example |
|---|---|---|
| `byte` | 1 byte | `10` |
| `short` | 2 bytes | `200` |
| `char` | 2 bytes | `'A'` |
| `boolean` | 1 bit* | `true` |
| `int` | 4 bytes | `1000` |
| `long` | 8 bytes | `999999L` |
| `float` | 4 bytes | `12.5f` |
| `double` | 8 bytes | `99.99` |

> 1 byte = 8 bits

---

# Example Program

```java
public class DataTypes {

    public static void main(String[] args) {

        int age = 20;
        float marks = 89.5f;
        char grade = 'A';
        boolean isPassed = true;

        System.out.println(age);
        System.out.println(marks);
        System.out.println(grade);
        System.out.println(isPassed);
    }
}
```

---

# Important Points ✨

- Java is a strongly typed language.
- Every variable must have a data type.
- `float` uses `f` at the end.
- `char` uses single quotes `' '`
- `String` uses double quotes `" "`

---

# Common Beginner Mistakes ⚠️

## Wrong

```java
char ch = "A";
```

## Correct

```java
char ch = 'A';
```

---

## Wrong

```java
float num = 12.5;
```

## Correct

```java
float num = 12.5f;
```

---

# Interview / Viva Questions

## Q1. Difference between primitive and non-primitive data types?

- Primitive types store actual values.
- Non-primitive types store references/objects.

---

## Q2. Why is Java called strongly typed?

Because every variable must be declared with a proper data type.

---

## Q3. Difference between print() and println()?

- `print()` → same line
- `println()` → next line

---

## Q4. Why do we use `static` in main method?

So JVM can call the method without creating an object.

---

# Quick Summary 🚀

- Java programs start from `main()`
- `print()` and `println()` are used for output
- Data types define storage and value type
- Primitive → built-in
- Non-primitive → user-defined/reference types
- Java is strongly typed