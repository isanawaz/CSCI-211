# Algorithm Collection Repository

## Overview

This repository contains various algorithmic solutions implemented in **C++**, focusing on **backtracking**, **recursion**, and **combinatorial optimization** problems. Each solution adheres to clean coding practices and **Object-Oriented Programming (OOP)** principles.

## Contents

This repository includes solutions for:

### **N-Queens Problem**

- **[`NQueens - Dynamic Memory/Nqueens_DynamicMemory.cpp`](./NQueens%20-%20Dynamic%20Memory/Nqueens_DynamicMemory.cpp)** – Dynamic memory allocation for N-Queens.
- **[`8 Queens 1D/8queens_1d.cpp`](./8%20Queens%201D/8queens_1d.cpp)** – Standard backtracking implementation for 8 Queens (1D array).
- **[`8 Queens 1D - No Goto/8queens_1d_NoGoto.cpp`](./8%20Queens%201D%20-%20No%20Goto/8queens_1d_NoGoto.cpp)** – Goto-free backtracking implementation.
- **[`8 Queens 1D - Dumb/8queens_1d_Dumb.cpp`](./8%20Queens%201D%20-%20Dumb/8queens_1d_Dumb.cpp)** – Brute-force (inefficient) solution.
- **[`8 Queens 2D/8queens_2d.cpp`](./8%20Queens%202D/8queens_2d.cpp)** – 2D board representation for solving the 8 Queens problem.

### **Stable Marriage Problem**

- **[`Stable Marriage/StableMarriage.cpp`](./Stable%20Marriage/StableMarriage.cpp)** – Finds stable pairings using backtracking.

### **Towers of Hanoi**

- **[`Towers Of Hanoi/TowersOfHanoi.cpp`](./Towers%20Of%20Hanoi/TowersOfHanoi.cpp)** – Recursive solution for the Towers of Hanoi problem.

### **8 Numbers Cross Puzzle**

- **[`8 Numbers Cross 1D/8numbersCross_1d.cpp`](./8%20Numbers%20Cross%201D/8numbersCross_1d.cpp)** – Backtracking solution for the number placement puzzle.

## How to Use

### Compilation

Each program can be compiled with a standard **C++ compiler** such as `g++`:

```sh
 g++ -o program_name "program_file.cpp"
```

Example:

```sh
 g++ -o nqueens "NQueens - Dynamic Memory/Nqueens_DynamicMemory.cpp"
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
