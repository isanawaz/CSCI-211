# Algorithm Collection Repository

## Overview
This repository contains various algorithmic solutions implemented in **C++**, focusing on **backtracking**, **recursion**, and **combinatorial optimization** problems. Each solution adheres to clean coding practices and **Object-Oriented Programming (OOP)** principles.

## Contents
This repository includes solutions for:

### **N-Queens Problem**
- **[`Nqueens_DynamicMemory.cpp`](./NQueens - Dynamic Memory/Nqueens_DynamicMemory.cpp)** – Dynamic memory allocation for N-Queens.
- **[`8queens_1d.cpp`](./8queens_1d.cpp)** – Standard backtracking implementation for 8 Queens (1D array).
- **[`8queens_1d_NoGoto.cpp`](./8queens_1d_NoGoto.cpp)** – Goto-free backtracking implementation.
- **[`8queens_1d_Dumb.cpp`](./8queens_1d_Dumb.cpp)** – Brute-force (inefficient) solution.
- **[`8queens_2d.cpp`](./8queens_2d.cpp)** – 2D board representation for solving the 8 Queens problem.

### **Stable Marriage Problem**
- **[`StableMarriage.cpp`](./StableMarriage.cpp)** – Finds stable pairings using backtracking.

### **Towers of Hanoi**
- **[`TowersOfHanoi.cpp`](./TowersOfHanoi.cpp)** – Recursive solution for the Towers of Hanoi problem.

### **8 Numbers Cross Puzzle**
- **[`8numbersCross_1d.cpp`](./8numbersCross_1d.cpp)** – Backtracking solution for the number placement puzzle.

## How to Use
### Compilation
Each program can be compiled with a standard **C++ compiler** such as `g++`:
```sh
 g++ -o program_name program_file.cpp
```
Example:
```sh
 g++ -o nqueens Nqueens_DynamicMemory.cpp
```

### Running the Executables
Run the compiled program from the terminal:
```sh
 ./program_name
```
Example:
```sh
 ./nqueens
```

## Future Enhancements
- Improve performance of brute-force solutions.
- Implement graphical visualizations for solutions.
- Extend algorithms to support larger problem sizes efficiently.

