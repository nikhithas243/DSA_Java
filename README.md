 # Java Basics

A collection of beginner-friendly Java programs and practice exercises. Each file focuses on a core programming concept, using console input where appropriate.

## Prerequisites

- Java Development Kit (JDK) 8 or later
- A terminal or Java IDE

## Run a program

Compile and run a source file from the `Basics` directory:

```bash
javac JavaBasics.java
java JavaBasics
```

For a program that accepts input, follow the prompts in the terminal. Compile and run one program at a time because the examples use separate public classes.

## Project structure

```text
JAVA/
└── Basics/
    ├── JavaBasics.java
    ├── inputsc.java
    ├── rev.java
    ├── variablepqs.java
    ├── Conditionalstmt.java
    ├── Conditionalstmtqs.java
    ├── largestof3.java
    ├── whileEx.java
    ├── revisionloops.java
    ├── patterns.java
    ├── advpatterns.java
    └── functions.java
```

## Files and descriptions

| File | Topics covered | Description |
| --- | --- | --- |
| `JavaBasics.java` | Java program structure, output | A first Java program that prints **Hello World** and a simple star pattern. |
| `inputsc.java` | `Scanner`, arithmetic, type casting | Reads two numbers and a circle radius; prints their sum, product, and circle area. |
| `rev.java` | `Scanner`, arithmetic, `float` | Practices input by calculating the sum and product of two numbers and the area of a circle. |
| `variablepqs.java` | Variables, arithmetic, user input | Practice questions for the average of three values, square area, and a stationery bill with GST. |
| `Conditionalstmt.java` | `if`/`else`, nested conditions, `switch` | Contains practice tasks for comparisons, odd/even checks, tax calculation, pass/fail logic, and a working calculator using `switch`. |
| `Conditionalstmtqs.java` | Conditional practice | Includes exercises for sign checking, fever detection, weekday selection, and a working leap-year checker. |
| `largestof3.java` | Nested `if`/`else` | Reads three integers and prints the largest value. |
| `whileEx.java` | `while` loops | Prints repeated messages and number ranges, then calculates the sum of the first `n` natural numbers. |
| `revisionloops.java` | `while`, `for`, `do-while`, `break`, `continue` | A revision workbook with loop exercises; the active example checks whether a number is prime using a square-root optimization. |
| `patterns.java` | Nested loops, character patterns | Includes star, inverted-star, number, and character-triangle patterns; the character triangle is active. |
| `advpatterns.java` | Advanced patterns | Placeholder for future advanced pattern exercises. |
| `functions.java` | Methods, overloading, factorials, number conversion | Defines reusable methods for arithmetic, factorials, binomial coefficients, prime checks, binary/decimal conversion, palindrome checks, and digit sums. |

## Notes

- Several files keep earlier exercises commented out so you can enable and experiment with them one at a time.
- `functions.java` currently has `main()` rather than the standard `main(String[] args)` entry point. Update its signature before running it directly.
- Generated Java bytecode (`*.class`) is not source code and should be excluded from the repository. Add this to `.gitignore`:

```gitignore
*.class
```

## Learning path

1. Start with `JavaBasics.java`.
2. Practice input and variables with `inputsc.java`, `rev.java`, and `variablepqs.java`.
3. Move to decisions with the conditional-statement examples.
4. Build confidence with loops and patterns.
5. Finish with `functions.java` to learn reusable methods and basic problem solving.
