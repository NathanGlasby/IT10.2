# Term 2 IT Practice Test

Java: For Loops, Strings, Characters, and Nested Loops

Time: 60 minutes  
Total: 50 marks

Instructions:
- Answer all questions.
- Write Java code where requested.
- Use `for` loops where a loop is required.
- Do not use arrays.
- Show the exact output when asked to trace code.

---

## Question 1: Loop Output Tracing [10]

Write the exact output produced by each loop.

### 1.1 [2]

```java
for (int i = 4; i <= 12; i += 2) {
    System.out.print(i + " ");
}
```

### 1.2 [2]

```java
for (int i = 25; i >= 5; i -= 5) {
    System.out.print(i + " ");
}
```

### 1.3 [2]

```java
for (int i = 1; i <= 6; i++) {
    System.out.print(i * i + " ");
}
```

### 1.4 [2]

```java
int total = 0;
for (int i = 1; i <= 5; i++) {
    total += i;
    System.out.print(total + " ");
}
```

### 1.5 [2]

```java
for (char ch = 'B'; ch <= 'J'; ch += 2) {
    System.out.print(ch + " ");
}
```

---

## Question 2: Write The Loops [12]

Write one `for` loop for each required output.

### 2.1 [2]

Output:

```text
7 14 21 28 35 42 49
```

### 2.2 [2]

Output:

```text
100 90 80 70 60 50
```

### 2.3 [2]

Output:

```text
1 8 27 64 125 216
```

### 2.4 [2]

Output:

```text
Z X V T R P N
```

### 2.5 [2]

Output:

```text
a d g j m p s v y
```

### 2.6 [2]

Output:

```text
1 2 4 8 16 32 64 128
```

---

## Question 3: Strings [10]

Use this string for all parts of Question 3:

```java
String word = "Pretoria";
```

### 3.1 [2]

Write code to print the word in uppercase.

### 3.2 [2]

Write a loop that prints each character on its own line.

### 3.3 [2]

Write a loop that prints the word backwards on one line.

Expected output:

```text
airoterP
```

### 3.4 [2]

Write a loop that prints every second character, starting at index `0`.

Expected output:

```text
Peoi
```

### 3.5 [2]

Write code to print:

```text
"Pretoria" contains 8 characters.
```

---

## Question 4: Debugging [8]

Each code sample has an error or logic problem. Rewrite the corrected code.

### 4.1 [2]

This loop should print:

```text
2 4 6 8 10
```

Broken code:

```java
for (int i = 2; i <= 10; i++) {
    System.out.print(i + " ");
}
```

### 4.2 [2]

This loop should print:

```text
81 64 49 36 25 16 9 4 1
```

Broken code:

```java
for (int i = 9; i > 0; i++) {
    System.out.print(i * i + " ");
}
```

### 4.3 [2]

This code should print the last character of the word.

Broken code:

```java
String word = "Java";
System.out.println(word.charAt(word.length()));
```

### 4.4 [2]

This code should print powers of 2:

```text
1 2 4 8 16 32
```

Broken code:

```java
int num = 1;
for (int i = 0; i < 6; i++) {
    System.out.print(num + " ");
    num = num + 1;
}
```

---

## Question 5: Rectangle Pattern [10]

Write a Java program that:

1. Asks the user for a rectangle height using `JOptionPane`.
2. Asks the user for a rectangle width using `JOptionPane`.
3. Asks the user for a pattern using `JOptionPane`.
4. Prints the pattern as a rectangle in the terminal.

Example:

```text
height = 4
width = 6
pattern = #
```

Expected output:

```text
# # # # # #
# # # # # #
# # # # # #
# # # # # #
```

Your program must use:
- `JOptionPane.showInputDialog`
- `Integer.parseInt`
- a nested `for` loop

---

# Memorandum

## Question 1

### 1.1

```text
4 6 8 10 12
```

### 1.2

```text
25 20 15 10 5
```

### 1.3

```text
1 4 9 16 25 36
```

### 1.4

```text
1 3 6 10 15
```

### 1.5

```text
B D F H J
```

## Question 2

### 2.1

```java
for (int i = 7; i <= 49; i += 7) {
    System.out.print(i + " ");
}
```

### 2.2

```java
for (int i = 100; i >= 50; i -= 10) {
    System.out.print(i + " ");
}
```

### 2.3

```java
for (int i = 1; i <= 6; i++) {
    System.out.print(i * i * i + " ");
}
```

### 2.4

```java
for (char ch = 'Z'; ch >= 'N'; ch -= 2) {
    System.out.print(ch + " ");
}
```

### 2.5

```java
for (char ch = 'a'; ch <= 'y'; ch += 3) {
    System.out.print(ch + " ");
}
```

### 2.6

```java
int num = 1;
for (int i = 0; i < 8; i++) {
    System.out.print(num + " ");
    num *= 2;
}
```

## Question 3

### 3.1

```java
System.out.println(word.toUpperCase());
```

### 3.2

```java
for (int i = 0; i < word.length(); i++) {
    System.out.println(word.charAt(i));
}
```

### 3.3

```java
for (int i = word.length() - 1; i >= 0; i--) {
    System.out.print(word.charAt(i));
}
```

### 3.4

```java
for (int i = 0; i < word.length(); i += 2) {
    System.out.print(word.charAt(i));
}
```

### 3.5

```java
System.out.println("\"" + word + "\" contains " + word.length() + " characters.");
```

## Question 4

### 4.1

```java
for (int i = 2; i <= 10; i += 2) {
    System.out.print(i + " ");
}
```

### 4.2

```java
for (int i = 9; i > 0; i--) {
    System.out.print(i * i + " ");
}
```

### 4.3

```java
String word = "Java";
System.out.println(word.charAt(word.length() - 1));
```

### 4.4

```java
int num = 1;
for (int i = 0; i < 6; i++) {
    System.out.print(num + " ");
    num *= 2;
}
```

## Question 5

```java
import javax.swing.JOptionPane;

public class PracticeRectangle {
    public static void main(String[] args) {
        int height = Integer.parseInt(JOptionPane.showInputDialog("Enter height"));
        int width = Integer.parseInt(JOptionPane.showInputDialog("Enter width"));
        String pattern = JOptionPane.showInputDialog("Enter pattern");

        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                System.out.print(pattern + " ");
            }
            System.out.println();
        }
    }
}
```
