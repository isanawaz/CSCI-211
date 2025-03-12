# 8 Numbers Cross Solver

## Overview
This program solves the **8 Numbers Cross** puzzle using **backtracking** and an **OOP approach**. The goal is to place numbers in a cross-shaped grid following adjacency constraints.

## Problem Statement
The puzzle consists of 8 positions arranged as follows:
```
  X X  
X X X X
  X X  
```
Each `X` represents a number (1 to 8), and they must be placed following these rules:
- No two adjacent numbers can differ by 1.
- Each number appears only once in the grid.

## How It Works
- The program initializes an `EightNumbersCross` class.
- It uses **backtracking** to try placing numbers sequentially.
- The `isSafe()` function ensures that placement follows adjacency rules.
- Valid solutions are printed in a formatted grid.

## Assumptions
- The numbers range from `1` to `8`.
- The adjacency matrix defines which positions are adjacent.

## Edge Cases Handled
- Ensures all numbers are unique.
- Ensures adjacent numbers do not differ by `1`.

## How to Run the Program
1. Compile the program using a C++ compiler:
   ```sh
   g++ -o 8numberscross 8NumbersCross.cpp
   ```
2. Run the executable:
   ```sh
   ./8numberscross
   ```
3. The program will print all valid solutions.

## Example Output
```
Solution #1:
  3  8  
5  1  6  2  
  7  4  
```

## Future Improvements
- Optimize the backtracking approach for faster computation.
- Implement a graphical representation of the grid.




