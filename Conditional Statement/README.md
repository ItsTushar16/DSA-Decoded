# Conditional Statements in Java

Conditional statements are used to make decisions in a program based on certain conditions.

---

# Types of Conditional Statements

1. if-else  
2. else-if ladder  
3. ternary operator  
4. switch statement  

---

# 1. if-else Statement

Used when there are two possible outcomes.

## Syntax

```java
if(condition){
    // code if condition is true
}
else{
    // code if condition is false
}
```

## Example

```java
public class Main {
    public static void main(String[] args) {

        int age = 18;

        if(age >= 18){
            System.out.println("Eligible to vote");
        }
        else{
            System.out.println("Not eligible");
        }
    }
}
```

---

# 2. else-if Ladder

Used when multiple conditions are checked.

## Syntax

```java
if(condition1){
    
}
else if(condition2){
    
}
else{
    
}
```

## Example

```java
public class Main {
    public static void main(String[] args) {

        int marks = 75;

        if(marks >= 90){
            System.out.println("Grade A");
        }
        else if(marks >= 70){
            System.out.println("Grade B");
        }
        else{
            System.out.println("Grade C");
        }
    }
}
```

## Important Point

- Only one block executes.
- Conditions are checked from top to bottom.

---

# 3. Ternary Operator

Short form of if-else.

## Syntax

```java
variable = (condition) ? statement1 : statement2;
```

## Example

```java
public class Main {
    public static void main(String[] args) {

        int num = 10;

        String result = (num % 2 == 0) ? "Even" : "Odd";

        System.out.println(result);
    }
}
```

## Important Point

- Makes code shorter and cleaner.
- Best for simple conditions.

---

# 4. Switch Statement

Used when checking multiple fixed values.

## Syntax

```java
switch(variable){

    case value1:
        // code
        break;

    case value2:
        // code
        break;

    default:
        // code
}
```

## Example

```java
public class Main {
    public static void main(String[] args) {

        int day = 2;

        switch(day){

            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            default:
                System.out.println("Invalid Day");
        }
    }
}
```

## Important Points

- `break` stops execution.
- `default` runs when no case matches.
- Case values should be unique.

---

# Theory Questions

## Q1. Difference between if-else and switch?

- `if-else` is used for conditions and ranges.
- `switch` is used for fixed values.

---

## Q2. What happens if break is not used in switch?

Execution continues to the next case. This is called fall-through.

---

## Q3. Can we use String in switch?

Yes, Java supports String in switch statements.

---

# Quick Summary

- `if-else` → two conditions
- `else-if` → multiple conditions
- `ternary` → short form of if-else
- `switch` → multiple fixed choices