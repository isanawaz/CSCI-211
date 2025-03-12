# 8 Queens Solver (1D Backtracking Without Goto)

## Overview
This program solves the **8 Queens** problem using **backtracking** and a **1D array representation**, avoiding `goto` statements for better readability and maintainability.

## Problem Statement
The **8 Queens problem** requires that:
- No two queens share the same row.
- No two queens share the same column.
- No two queens share the same diagonal.

## How It Works
- Uses a **1D array** (`board[i]` stores the row position of the queen in column `i`).
- The program places queens column by column using **backtracking**.
- The `isSafe()` function ensures no conflicts before placing a queen.
- When all 8 queens are placed successfully, the solution is printed.

## Assumptions
- The chessboard is always `8×8`.
- The program runs until all valid solutions are found.

## Edge Cases Handled
- Ensures no duplicate placements.
- Handles backtracking efficiently when conflicts arise.
- Avoids infinite loops by properly managing recursion and iteration.

## How to Run the Program
1. Compile the program using a C++ compiler:
   ```sh
   g++ -o 8queens_nogoto 8Queens1DNoGoto.cpp
   ```
2. Run the executable:
   ```sh
   ./8queens_nogoto
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
- Implement an **iterative** approach to reduce recursion depth.
- Improve performance for larger board sizes.

