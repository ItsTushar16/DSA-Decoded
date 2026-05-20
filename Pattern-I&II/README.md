# Pattern Printing in Java ⭐

Pattern printing is one of the best ways to improve:
- loop understanding
- nested loop concepts
- logic building
- problem-solving skills

It is widely asked in:
- college labs
- viva exams
- beginner coding rounds

---

# Related Files 📂

| Pattern | Suggested File Name |
|---|---|
| Hollow Rectangle | `HollowRectangle.java` |
| Inverted Pyramid | `InvertedPyramid.java` |
| Inverted Number Pyramid | `InvertedNumberPyramid.java` |
| Floyd's Triangle | `FloydsTriangle.java` |
| 0-1 Triangle | `ZeroOneTriangle.java` |
| Butterfly Pattern | `Butterfly.java` |
| Solid Rhombus | `SolidRhombus.java` |
| Hollow Rhombus | `HollowRhombus.java` |
| Diamond Pattern | `Diamond.java` |

---

# Important Concept 🧠

Most patterns use:
- nested loops
- spaces
- stars (`*`)
- rows & columns logic

---

# 1. Hollow Rectangle Pattern

📄 File: `HollowRectangle.java`

## Pattern

```java
*****
*   *
*   *
*****
```

## Logic

- Print `*` on borders
- Print spaces inside

## Core Condition

```java
if(i == 1 || i == rows || j == 1 || j == cols)
```

---

# 2. Inverted Pyramid Pattern

📄 File: `InvertedPyramid.java`

## Pattern

```java
****
***
**
*
```

## Logic

Stars decrease after every row.

---

# 3. Inverted Number Pyramid

📄 File: `InvertedNumberPyramid.java`

## Pattern

```java
1234
123
12
1
```

## Logic

- Outer loop → rows
- Inner loop → prints numbers

---

# 4. Floyd’s Triangle

📄 File: `FloydsTriangle.java`

## Pattern

```java
1
2 3
4 5 6
7 8 9 10
```

## Logic

Use a variable that continuously increments.

## Core Logic

```java
int counter = 1;
```

---

# 5. 0-1 Triangle

📄 File: `ZeroOneTriangle.java`

## Pattern

```java
1
01
101
0101
```

## Logic

Based on:

```java
(i + j) % 2
```

- Even → `1`
- Odd → `0`

---

# 6. Butterfly Pattern 🦋

📄 File: `ButterflyPattern.java`

## Pattern

```java
*      *
**    **
***  ***
********
********
***  ***
**    **
*      *
```

## Logic

- stars
- spaces
- mirror structure

This pattern improves nested loop understanding significantly.

---

# 7. Solid Rhombus

📄 File: `SolidRhombus.java`

## Pattern

```java
    *****
   *****
  *****
 *****
*****
```

## Logic

- spaces decrease
- stars remain constant

---

# 8. Hollow Rhombus

📄 File: `HollowRhombus.java`

## Pattern

```java
    *****
   *   *
  *   *
 *   *
*****
```

## Logic

Combination of:
- rhombus spacing
- hollow rectangle logic

---

# 9. Diamond Pattern 💎

📄 File: `DiamondPattern.java`

## Pattern

```java
   *
  ***
 *****
*******
 *****
  ***
   *
```

## Logic

Diamond has:
- upper pyramid
- lower inverted pyramid

---

# Common Pattern Formula Tricks ✨

| Formula | Use |
|---|---|
| `i + j` | parity patterns |
| `rows - i` | spaces |
| `2*i - 1` | odd star count |
| `n - i + 1` | decreasing loops |

---

# Common Beginner Mistakes ⚠️

## Wrong Loop Limits

Small loop mistakes can completely break patterns.

---

## Forgetting Spaces

Patterns depend heavily on spaces.

```java
System.out.print(" ");
```

is equally important as:

```java
System.out.print("*");
```

---

## Confusing Rows and Columns

Always dry run:
- outer loop → rows
- inner loop → columns

---

# Pattern Solving Strategy 🎯

Whenever solving a new pattern:

1. Observe rows
2. Observe columns
3. Count spaces
4. Count stars/numbers
5. Find relation with row number

---



# Quick Summary 🚀

- Pattern printing strengthens logic building
- Nested loops are the core concept
- Spaces are as important as symbols
- Dry run is extremely important
- Pattern questions improve coding confidence