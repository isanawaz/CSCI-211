# 8 Queens Solver (Brute Force Approach)

## Overview
This program solves the **8 Queens** problem using a **brute-force approach** (without backtracking). It generates all possible queen placements and checks for validity.

## Problem Statement
The **8 Queens problem** requires that:
- No two queens share the same row.
- No two queens share the same column.
- No two queens share the same diagonal.

## How It Works
- The program **generates every possible board state** using **nested loops**.
- Each arrangement is checked using `isValid()`.
- Valid solutions are printed in a chessboard format.

## Assumptions
- The chessboard is always `8×8`.
- The program runs until all valid solutions are found.

## Edge Cases Handled
- Ensures no duplicate placements.
- Detects and ignores invalid solutions.
- Handles brute-force inefficiency for `N=8`.

## How to Run the Program
1. Compile the program using a C++ compiler:
   ```sh
   g++ -o 8queens_dumb 8Queens1DDumb.cpp
   ```
2. Run the executable:
   ```sh
   ./8queens_dumb
   ```
3. The program prints all valid queen placements.

## Example Output
```
Solution #1:
. Q . . . . . .
. . . Q . . . .
Q . . . . . . .
. . . . . . Q .
. . Q . . . . .
. . . . . Q . .
. . . . . . . Q
. . . . Q . . .
```

## Future Improvements
- Implement **backtracking** to reduce unnecessary calculations.
- Extend the solution to **N-Queens** (`N > 8`).
- Improve efficiency for large values of `N`.
