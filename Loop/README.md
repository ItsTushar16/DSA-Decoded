# Loops in Java 🔁

Loops are used to execute a block of code repeatedly until a condition becomes false.
They help in:
- reducing code repetition
- automating repetitive tasks
- solving logic-based problems efficiently

---

# Types of Loops
1. while loop  
2. for loop  
3. do-while loop  

---

# 1. while Loop
The `while` loop checks the condition first, then executes the code.
## Syntax
```java
while(condition){
    // code
}
```
## Example
```java
public class Main {
    public static void main(String[] args) {
        int i = 1;
        while(i <= 5){
            System.out.println(i);
            i++;
        }
    }
}
```
---

# 2. for Loop
Best when the number of iterations is known.
## Syntax

```java
for(initialization; condition; update){
    // code
}
```
## Example
```java
public class Main {
    public static void main(String[] args) {

        for(int i = 1; i <= 5; i++){
            System.out.println(i);
        }
    }
}
```
## Important Point

- Initialization → runs once
- Condition → checked every iteration
- Update → changes loop variable

---

# 3. do-while Loop
Executes at least one time, even if the condition is false.

## Syntax
```java
do{
    // code
}
while(condition);
```
## Example
```java
public class Main {
    public static void main(String[] args) {
        int i = 1;
        do{
            System.out.println(i);
            i++;
        }
        while(i <= 5);
    }
}
```
---

# Reverse a Number
```java
public class Main {
    public static void main(String[] args) {

        int n = 10899;
        int rev = 0;

        while(n > 0){

            int lastDigit = n % 10;

            rev = (rev * 10) + lastDigit;

            n = n / 10;
        }

        System.out.println(rev);
    }
}
```
## Output
```java
99801
```
---

# Prime Number Check
A prime number is divisible only by:
- 1
- itself

```java
public class Main {
    public static void main(String[] args) {

        int n = 7;
        boolean isPrime = true;

        if(n <= 1){
            System.out.println("Not Prime");
        }
        else{

            for(int i = 2; i <= Math.sqrt(n); i++){

                if(n % i == 0){
                    isPrime = false;
                    break;
                }
            }

            if(isPrime){
                System.out.println("Prime Number");
            }
            else{
                System.out.println("Not Prime");
            }
        }
    }
}
```

## Important Point
Instead of checking till `n-1`, we optimize using:

```java
i <= Math.sqrt(n)
```
This reduces unnecessary checks.
---

# break Statement
Used to exit a loop immediately.

```java
for(int i = 1; i <= 5; i++){

    if(i == 3){
        break;
    }

    System.out.println(i);
}
```

## Output
```java
1
2
```

---

# continue Statement
Used to skip the current iteration.

```java
for(int i = 1; i <= 5; i++){

    if(i == 3){
        continue;
    }

    System.out.println(i);
}
```

## Output
```java
1
2
4
5
```

---

# Questions

## Q1. Difference between while and do-while loop?

- `while` checks condition first
- `do-while` executes at least once

---

## Q2. When should we use a for loop?

When the number of iterations is known.

---

## Q3. What does break do?

It immediately terminates the loop.

---

## Q4. What does continue do?

It skips the current iteration and moves to the next one.

---

# Quick Summary ✨

- `while` → condition checked first
- `for` → best for fixed iterations
- `do-while` → runs at least once
- `break` → exits loop
- `continue` → skips iteration
- loops help avoid repetitive code