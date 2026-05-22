# Arrays in Java ⭐

Arrays are one of the most important topics in programming and Data Structures.  
They help in storing multiple values of the same datatype inside a single variable using contiguous memory locations.

This topic builds the foundation for:
- Searching Algorithms
- Sorting Algorithms
- Strings
- Matrix Problems
- Dynamic Programming
- Advanced DSA

Arrays are heavily asked in:
- college practicals
- viva exams
- coding interviews
- online assessments
- beginner DSA rounds

---

# Related Files 📂

| Topic | Suggested File Name |
|---|---|
| Array Basics | `ArraysBasic.java` |
| Array Input Output | `ArrayInput.java` |
| Passing Arrays to Function | `PassArray.java` |
| Linear Search | `LinearSearch.java` |
| Largest Number in Array | `LargestNumber.java` |
| Binary Search | `BinarySearch.java` |
| Reverse Array | `ReverseArray.java` |
| Print Pairs in Array | `PairsInArray.java` |
| Print Subarrays | `SubArrays.java` |
| Maximum Subarray Sum | `MaxSubarraySum.java` |

---

# Important Concepts 🧠

Arrays:
- store similar datatype values
- use index-based access
- have fixed size
- are stored in contiguous memory

Example:

```java
int marks[] = {97, 98, 99};
```

Index Mapping:

```java
marks[0] = 97
marks[1] = 98
marks[2] = 99
```

---

# Array Declaration & Creation

📄 File: `ArraysBasic.java`

## Syntax

```java
datatype arrayName[] = new datatype[size];
```

## Example

```java
int marks[] = new int[50];
```

---

# Array Initialization

```java
int numbers[] = {1, 2, 3, 4};

String fruits[] = {"apple", "mango", "orange"};
```

---

# Important Point ⚡

Array size is fixed.

```java
int arr[] = new int[5];
```

You cannot increase or decrease its size during runtime.

---

# Taking Input in Array

📄 File: `ArrayInput.java`

## Example

```java
Scanner sc = new Scanner(System.in);

int marks[] = new int[3];

marks[0] = sc.nextInt();
marks[1] = sc.nextInt();
marks[2] = sc.nextInt();
```

## Output Access

```java
System.out.println(marks[0]);
```

---

# Updating Array Elements

Arrays are mutable.

```java
marks[2] = 100;
```

Old value gets replaced.

---

# Length Property

📄 File: `ArraysBasic.java`

## Syntax

```java
arrayName.length
```

## Example

```java
System.out.println(marks.length);
```

---

# Passing Arrays to Functions

📄 File: `PassArray.java`

## Example

```java
public static void update(int marks[]) {
    for(int i = 0; i < marks.length; i++) {
        marks[i] = marks[i] + 1;
    }
}
```

---

# Important Interview Concept ⚠️

## Arrays are passed by reference behavior in Java

When arrays are passed to functions:
- changes reflect in original array
- actual array memory is affected

Example:

```java
update(marks);
```

After function call:
- original array values change

---

# Linear Search 🔍

📄 File: `LinearSearch.java`

Linear Search checks each element one by one.

---

## Algorithm

1. Start from index 0
2. Compare each element with key
3. If found → return index
4. Else → return `-1`

---

## Code Logic

```java
for(int i = 0; i < numbers.length; i++) {
    if(numbers[i] == key) {
        return i;
    }
}
```

---

# Time Complexity ⏱️

| Case | Complexity |
|---|---|
| Best Case | O(1) |
| Worst Case | O(n) |

---

# Largest Number in Array

📄 File: `LargestNumber.java`

---

## Logic

Use a variable that stores current maximum.

```java
int largest = Integer.MIN_VALUE;
```

---

## Core Logic

```java
if(largest < numbers[i]) {
    largest = numbers[i];
}
```

---

# Interview Insight 💡

Why use:

```java
Integer.MIN_VALUE
```

Because:
- it is the smallest possible integer
- ensures comparison works correctly

---

# Binary Search ⚡

📄 File: `BinarySearch.java`

Binary Search works only on:

✅ Sorted Arrays

---

# Core Idea

Divide the search space into halves.

---

# Algorithm

1. Find middle element
2. Compare with key
3. If key is greater → move right
4. If key is smaller → move left

---

# Core Formula

```java
int mid = (start + end) / 2;
```

Better optimized version:

```java
int mid = start + (end - start) / 2;
```

---

# Important Logic

```java
if(numbers[mid] < key) {
    start = mid + 1;
}
else {
    end = mid - 1;
}
```

---

# Why `mid + 1` and `mid - 1` ? 🧠

Because:
- `mid` is already checked
- searching again would create infinite loop

---

# Time Complexity ⏱️

| Case | Complexity |
|---|---|
| Best / Average / Worst | O(log n) |

Binary Search is much faster than Linear Search for large datasets.

---

# Reverse an Array 🔄

📄 File: `ReverseArray.java`

---

# Logic

Use two pointers:

```java
start = 0
end = n - 1
```

Swap values until:

```java
start < end
```

---

# Core Logic

```java
temp = numbers[start];
numbers[start] = numbers[end];
numbers[end] = temp;
```

---

# Time Complexity

| Operation | Complexity |
|---|---|
| Reverse Array | O(n) |

---

# Pairs in Array 👥

📄 File: `PairsInArray.java`

---

# Example

```java
(2,4)
(2,6)
(2,8)
```

---

# Logic

Use nested loops.

Outer loop selects first element.  
Inner loop creates pairs with remaining elements.

---

# Formula for Total Pairs ✨

```text
n(n - 1) / 2
```

---

# Time Complexity

| Operation | Complexity |
|---|---|
| Pair Printing | O(n²) |

---

# Subarrays 📚

📄 File: `SubArrays.java`

A subarray is a continuous part of an array.

Example:

```java
[2,4,6,8]
```

Subarrays:

```java
[2]
[2,4]
[2,4,6]
[4,6]
```

---

# Total Subarrays Formula ✨

```text
n(n + 1) / 2
```

---

# Logic

Subarray problems mostly use:
- start index
- end index
- nested loops

---

# Maximum Subarray Sum ⭐

📄 File: `MaxSubarraySum.java`

One of the most important interview problems.

---

# Brute Force Approach

Generate all subarrays and calculate sum.

---

# Core Logic

```java
sum += numbers[k];
```

Track maximum sum:

```java
if(sum > maxSum) {
    maxSum = sum;
}
```

---

# Complexity

| Approach | Complexity |
|---|---|
| Brute Force | O(n³) |

---

# Common Interview Questions 🎯

## Q1. Difference between Array and ArrayList?

| Array | ArrayList |
|---|---|
| Fixed Size | Dynamic Size |
| Faster | Flexible |
| Primitive support | Objects only |

---

## Q2. Why Binary Search requires sorted array?

Because Binary Search eliminates half of the search space based on order.

Without sorting:
- left side and right side become unpredictable

---

## Q3. Why arrays start from index 0?

Because index represents:
- offset from base memory address

---

## Q4. What happens if index exceeds size?

```java
ArrayIndexOutOfBoundsException
```

---

# Common Beginner Mistakes ⚠️

---

## Using Wrong Loop Condition

Wrong:

```java
i <= arr.length
```

Correct:

```java
i < arr.length
```

---

## Forgetting Array is Zero Indexed

First element:

```java
arr[0]
```

not:

```java
arr[1]
```

---

## Applying Binary Search on Unsorted Array

Binary Search only works correctly on sorted data.

---

## Infinite Loop in Binary Search

Wrong:

```java
start = mid;
```

Correct:

```java
start = mid + 1;
```

---

# Dry Run Strategy 🧠

Whenever solving array problems:

1. Track indexes carefully
2. Draw array visually
3. Dry run each iteration
4. Check boundary conditions
5. Watch loop limits carefully

---

# Real Interview Insight 🚀

Arrays are not just beginner topics.

Advanced concepts like:
- Sliding Window
- Prefix Sum
- Kadane’s Algorithm
- Two Pointer
- Hashing
- Dynamic Programming

all start from strong array fundamentals.

---

# Quick Summary 🚀

- Arrays store multiple values of same datatype
- Arrays use contiguous memory
- Indexing starts from 0
- Binary Search requires sorted arrays
- Subarray and pair problems improve logic building
- Arrays are the foundation of DSA
- Dry running improves debugging skills significantly