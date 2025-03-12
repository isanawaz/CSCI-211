# 8 Queens Solver (2D Representation)

## Overview
This program solves the **8 Queens** problem using **backtracking** and a **2D array representation**. It finds all valid ways to place 8 queens on an 8×8 chessboard without them attacking each other.

## Problem Statement
The **8 Queens problem** requires that:
- No two queens share the same row.
- No two queens share the same column.
- No two queens share the same diagonal.

## How It Works
- Uses a **2D board representation** (`board[row][col]` stores the queen placement).
- Places queens column by column using **backtracking**.
- The `isSafe()` function ensures no conflicts before placing a queen.
- When all 8 queens are placed successfully, the solution is printed in a chessboard format.

## Assumptions
- The chessboard is always `8×8`.
- The program runs until all valid solutions are found.

## Edge Cases Handled
- Ensures no duplicate placements.
- Handles backtracking efficiently when conflicts arise.

## How to Run the Program
1. Compile the program using a C++ compiler:
   ```sh
   g++ -o 8queens2d 8Queens2D.cpp
   ```
2. Run the executable:
   ```sh
   ./8queens2d
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
- Extend the solution to `N-Queens` (`N > 8`).
- Implement a graphical visualization.

---
This README provides details on how the program works, its purpose, and how to run it. Let me know if you need modifications!

