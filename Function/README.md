# Functions in Java ⚙️

Functions help us organize code into reusable blocks.

They:
- reduce repetition
- improve readability
- make debugging easier
- help in modular programming

---

# Related Files 📂

| Concept | Suggested File Name |
|---|---|
| Basic Function | `FunctionsBasics.java` |
| Function with Parameters | `FunctionParameters.java` |
| Call By Value | `CallByValueDemo.java` |
| Function Overloading | `FunctionOverloading.java` |
| Binary to Decimal | `BinaryToDecimal.java` |
| Decimal to Binary | `DecimalToBinary.java` |
| Prime in Range | `PrimeInRange.java` |

---

# Function Syntax

```java
returnType functionName() {

    // body

    return statement;
}
```

---

# Basic Function Example

📄 File: `FunctionsBasics.java`

```java
public class FunctionsBasics {

    public static void printHello() {

        System.out.println("Hello");
    }

    public static void main(String[] args) {

        printHello();
    }
}
```

### Output

```java
Hello
```

---

# Understanding the Function

| Part | Meaning |
|---|---|
| `public` | accessible everywhere |
| `static` | can call without object |
| `void` | returns nothing |
| `printHello()` | function name |

---

# Function with Parameters

Parameters allow functions to receive values.

## Syntax

```java
returnType functionName(type param1, type param2) {

}
```

---

# Example

📄 File: `FunctionParameters.java`

```java
public class FunctionParameters {

    public static int sum(int a, int b) {

        return a + b;
    }

    public static void main(String[] args) {

        int result = sum(5, 10);

        System.out.println(result);
    }
}
```

---

# Formal Parameters vs Arguments

| Term | Meaning |
|---|---|
| Formal Parameters | variables in function definition |
| Arguments | actual values passed during function call |

## Example

```java
sum(int a, int b)
```

`a` and `b` → formal parameters

```java
sum(5, 10)
```

`5` and `10` → arguments

---

# Call By Value in Java 🧠

Java strictly follows **call by value**.

It sends a copy of the variable, not the original variable.

---

# Example

📄 File: `CallByValueDemo.java`

```java
public class CallByValueDemo {

    public static void changeA(int a) {

        a = 10;

        System.out.println(a);
    }

    public static void main(String[] args) {

        int a = 5;

        changeA(a);

        System.out.println(a);
    }
}
```

### Output

```java
10
5
```

## Why?

Because the original variable is not modified.

Only a copy is sent to the function.

---

# Function Overloading 🔁

Function overloading means:
> Multiple functions with the same name but different parameters.

---

# Example

📄 File: `FunctionOverloading.java`

```java
public class FunctionOverloading {

    public static int sum(int a, int b) {

        return a + b;
    }

    public static int sum(int a, int b, int c) {

        return a + b + c;
    }

    public static void main(String[] args) {

        System.out.println(sum(2, 3));

        System.out.println(sum(2, 3, 4));
    }
}
```

---

# Important Note ⚠️

Function overloading depends on:
- number of parameters
- type of parameters

It does **not** depend only on return type.

---

# Binary Number System 💻

Binary uses only:
- `0`
- `1`

Base of binary system = `2`

---

# Decimal to Binary

📄 File: `DecimalToBinary.java`

## Logic Used

1. Divide number by `2`
2. Store remainder
3. Continue until number becomes `0`

---

# Example

```java
5 → 101
```

---

# Code

```java
public class DecimalToBinary {

    public static void decToBin(int n) {

        int pow = 0;
        int binNum = 0;

        while(n > 0) {

            int rem = n % 2;

            binNum = binNum + (rem * (int)Math.pow(10, pow));

            pow++;

            n = n / 2;
        }

        System.out.println(binNum);
    }

    public static void main(String[] args) {

        decToBin(5);
    }
}
```

### Output

```java
101
```

---

# Binary to Decimal

📄 File: `BinaryToDecimal.java`

## Logic Used

1. Extract last digit
2. Multiply with `2^pow`
3. Add to decimal number

---

# Code

```java
public class BinaryToDecimal {

    public static int binToDec(int n) {

        int pow = 0;
        int dec = 0;

        while(n > 0) {

            int ld = n % 10;

            dec = dec + (ld * (int)Math.pow(2, pow));

            pow++;

            n = n / 10;
        }

        return dec;
    }

    public static void main(String[] args) {

        int decimal = binToDec(101);

        System.out.println(decimal);
    }
}
```

### Output

```java
5
```

---

# Dry Run Example 🔍

## Binary to Decimal

```java
101₂
```

Calculation:

```java
1 × 2² = 4
0 × 2¹ = 0
1 × 2⁰ = 1
```

Final Answer:

```java
4 + 0 + 1 = 5
```

---

# Common Beginner Mistakes ⚠️

## Forgetting `static`

Wrong:

```java
public void hello()
```

inside static main usage.

---

## Confusing parameters and arguments

```java
sum(int a, int b)
```

≠

```java
sum(5, 10)
```

---

## Wrong Binary Logic

Using division by `10` instead of `2` during decimal-to-binary conversion.

---

# Questions 🎯

## Q1. Why do we use functions?

To reduce code repetition and improve modularity.

---

## Q2. Does Java support call by reference?

No. Java strictly follows call by value.

---

## Q3. What is function overloading?

Same function name with different parameters.

---

## Q4. Can we overload functions by changing only return type?

No.

---

## Q5. Why is binary important in programming?

Because computers internally understand binary data.

---

# Quick Summary 🚀

- Functions make code reusable
- Parameters help pass data
- Java uses call by value
- Function overloading improves flexibility
- Binary uses base 2
- Decimal ↔ Binary conversion is an important programming concept