# Stable Marriage Problem Solver

## Overview
This program solves the **Stable Marriage Problem** using **backtracking**. The goal is to find a stable set of pairings between men and women based on preference rankings.

## Problem Statement
- Each man and woman ranks all members of the opposite group by preference.
- A pairing is considered **stable** if no two individuals would prefer each other over their current matches.
- The program finds all possible **stable pairings** using a **backtracking algorithm**.

## How It Works
- The `StableMarriage` class manages the solution process.
- Each man proposes to women in order of preference.
- The `isStable()` function ensures that new pairings do not create conflicts.
- Once all men are paired, a valid solution is printed.

## Assumptions
- There are `N = 3` men and `N = 3` women.
- The preference lists are predefined.
- The program finds **all** stable solutions.

## Edge Cases Handled
- Ensures no duplicate pairings.
- Detects and avoids unstable matchings.
- Handles cases where multiple valid solutions exist.

## How to Run the Program
1. Compile the program using a C++ compiler:
   ```sh
   g++ -o stable_marriage StableMarriage.cpp
   ```
2. Run the executable:
   ```sh
   ./stable_marriage
   ```
3. The program prints all possible **stable matchings**.

## Example Output
```
Solution #1:
Man   Woman
0     2
1     0
2     1

Solution #2:
Man   Woman
0     1
1     2
2     0
```

## Future Improvements
- Extend the solution to handle **larger values of N**.
- Implement an **iterative version** for efficiency.
- Allow **customizable input** for preference lists.


