# Java Basics, Input & Operators ☕

Java is a high-level, object-oriented, and strongly typed programming language.

It is widely used in:
- Software Development
- Backend Development
- Android Development
- DSA & Competitive Programming

---

# Structure of a Java Program

Every Java program starts with a class and a `main()` method.

## Basic Syntax

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

| Keyword | Meaning |
|---|---|
| `public` | accessible from anywhere |
| `class` | blueprint of objects |
| `JavaBasics` | class name |

> File name and class name must be the same.

Example:

```java
JavaBasics.java
```

---

## `public static void main(String[] args)`

This is the entry point of every Java program.

| Keyword | Meaning |
|---|---|
| `public` | accessible everywhere |
| `static` | method runs without object |
| `void` | returns nothing |
| `main()` | main function |
| `String[] args` | command line arguments |

---

# Output in Java 🖥️

## `print()`

Prints output on the same line.

```java
System.out.print("Hello ");
System.out.print("World");
```

### Output

```java
Hello World
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

# Taking Input in Java ⌨️

Java uses the `Scanner` class to take input from the user.

## Import Scanner

```java
import java.util.Scanner;
```

---

# Creating Scanner Object

```java
Scanner sc = new Scanner(System.in);
```

- `Scanner` → class
- `sc` → object name
- `System.in` → standard input stream

---

# Common Input Methods

| Method | Used For |
|---|---|
| `nextInt()` | Integer input |
| `nextFloat()` | Float input |
| `nextDouble()` | Double input |
| `next()` | Single word |
| `nextLine()` | Full line |
| `nextBoolean()` | Boolean value |

---

# Example Program

```java
import java.util.Scanner;

public class InputExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
```

---

# Important Input Note ⚠️

## Difference between `next()` and `nextLine()`

| Method | Behavior |
|---|---|
| `next()` | reads one word |
| `nextLine()` | reads complete line |

---

# Data Types in Java 📦

Data types define:
- type of value
- memory allocation
- range of data

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

Reference/User-defined data types.

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

# Example of Data Types

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

# Operators in Java ⚡

Operators are symbols used to perform operations on variables and values.

---

# Types of Operators

| Operator Type | Example |
|---|---|
| Arithmetic | `+ - * / %` |
| Relational | `== != > < >= <=` |
| Logical | `&& || !` |
| Assignment | `= += -= *=` |
| Unary | `++ --` |
| Ternary | `? :` |
| Bitwise | `& \| ^` |

---

# 1. Arithmetic Operators

Used for mathematical calculations.

```java
int a = 10;
int b = 5;

System.out.println(a + b);
System.out.println(a - b);
System.out.println(a * b);
System.out.println(a / b);
System.out.println(a % b);
```

---

# 2. Relational Operators

Used for comparison.

```java
System.out.println(10 > 5);
System.out.println(10 == 5);
```

Returns:

```java
true or false
```

---

# 3. Logical Operators

Used with boolean values.

```java
System.out.println(true && false);
System.out.println(true || false);
System.out.println(!true);
```

---

# 4. Assignment Operators

Used to assign values.

```java
int x = 10;

x += 5;
x -= 2;
```

---

# 5. Unary Operators

Work on a single operand.

```java
int a = 5;

a++;
a--;
```

---

# Pre Increment vs Post Increment

## Pre Increment

```java
int a = 5;

System.out.println(++a);
```

### Output

```java
6
```

Value increases first.

---

## Post Increment

```java
int a = 5;

System.out.println(a++);
```

### Output

```java
5
```

Value prints first, then increases.

---

# Operator Precedence 🧠

Operator precedence decides the order of execution in an expression.

## Example

```java
int x = 3 * 4 - 1;
```

### Output

```java
11
```

Because:

```java
(3 * 4) - 1
```

Multiplication has higher precedence than subtraction.

---

# Basic Precedence Order

| Operators | Priority |
|---|---|
| `()` | Highest |
| `++ -- !` | High |
| `* / %` | High |
| `+ -` | Medium |
| `> < >= <=` | Low |
| `&&` | Lower |
| `||` | Lowest |

---

# Associativity

If operators have same precedence, associativity decides evaluation order.

---

## Left to Right

```java
10 - 5 + 2
```

Evaluated as:

```java
(10 - 5) + 2
```

---

## Right to Left

Assignment operators work right to left.

```java
a = b = c = 10;
```

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

## Wrong

```java
int a = 10 / 3;
```

Expecting decimal output.

---

## Correct

```java
double a = 10.0 / 3;
```

---

# Theory Questions 🎯

## Q1. Why is Java called strongly typed?

Because every variable must have a defined data type.

---

## Q2. Difference between `print()` and `println()`?

- `print()` → same line
- `println()` → next line

---

## Q3. Difference between `next()` and `nextLine()`?

- `next()` → one word
- `nextLine()` → complete line

---

## Q4. Difference between `=` and `==`?

- `=` → assignment
- `==` → comparison

---

## Q5. Which has higher precedence: `*` or `+`?

`*` has higher precedence.

---

# Quick Summary 🚀

- Java programs start from `main()`
- Scanner is used for input
- Data types define value storage
- Operators perform operations
- Precedence decides execution order
- Associativity resolves same-priority operations
- Java is strongly typed