# General Algorithm and Appliance Management Repository

## Overview

This repository contains various algorithmic solutions implemented in **C++**, focusing on **backtracking**, **recursion**, and **combinatorial optimization** problems. Additionally, it includes a **Java-based Appliance Management System** that allows users to manage and display appliances through a graphical user interface (GUI).

## Contents

### **Algorithmic Solutions**

#### **N-Queens Problem**

- [**Nqueens\_DynamicMemory.cpp**](./NQueens%20-%20Dynamic%20Memory/Nqueens_DynamicMemory.cpp) – Dynamic memory allocation for N-Queens.
- [**8queens\_1d.cpp**](./8%20Queens%201D/8queens_1d.cpp) – Standard backtracking implementation for 8 Queens (1D array).
- [**8queens\_1d\_NoGoto.cpp**](./8%20Queens%201D%20-%20No%20Goto/8queens_1d_NoGoto.cpp) – Goto-free backtracking implementation.
- [**8queens\_1d\_Dumb.cpp**](./8%20Queens%201D%20-%20Dumb/8queens_1d_Dumb.cpp) – Brute-force (inefficient) solution.
- [**8queens\_2d.cpp**](./8%20Queens%202D/8queens_2d.cpp) – 2D board representation for solving the 8 Queens problem.

#### **Stable Marriage Problem**

- [**StableMarriage.cpp**](./Stable%20Marriage/StableMarriage.cpp) – Finds stable pairings using backtracking.

#### **Towers of Hanoi**

- [**TowersOfHanoi.cpp**](./Towers%20Of%20Hanoi/TowersOfHanoi.cpp) – Recursive solution for the Towers of Hanoi problem.

#### **8 Numbers Cross Puzzle**

- [**8numbersCross\_1d.cpp**](./8%20Numbers%20Cross%201D/8numbersCross_1d.cpp) – Backtracking solution for the number placement puzzle.

### **Appliance Management System**

All Java files are located in the [`CSCI-211/`](./CSCI-211/) directory:

This Java-based system provides a GUI for managing appliances, including refrigerators, dishwashers, and microwaves. It supports:

- **File handling** for loading appliance data.
- **Search functionality** for filtering appliances by type and price.
- **Exception handling** for invalid appliance data.

## Installation and Usage

### Compilation

#### **For C++ Programs**

Compile using a **C++ compiler** such as `g++`:

```sh
g++ file_name.cpp -o file_name
```

Example:

```sh
g++ Nqueens_DynamicMemory.cpp -o nqueens
```

### Running the Executables

Run the compiled program from the terminal:

```sh
 ./file_name
```

Example:

```sh
 ./nqueens
```



#### **For Java Appliance Management System**

Compile using a **Java compiler** such as `javac`:

```sh
javac file_name.java
```

Example:

```sh
javac ApplianceGUI.java
```

### Running the Executables

Run the compiled Java program from the terminal:

```sh
java file_name
```

Example:

```sh
java ApplianceGUI
```

## File Input Format (Appliance Management System)

Appliance data should be stored in a text file as:

```
<serialNumber>, <price>, <additionalData>
```

- `serialNumber`: Starts with 'R' (Refrigerator), 'D' (Dishwasher), or 'M' (Microwave) followed by 11 alphanumeric characters.
- `price`: Integer representing the cost in dollars.
- `additionalData`:
  - **Refrigerators**: cubic feet capacity.
  - **Microwaves**: wattage.
  - **Dishwashers**: 'Y' for under-counter installation, 'N' otherwise.

**Example:**

```
R12345678901, 800, 20
M98765432101, 150, 1000
D54321678901, 500, Y
```

## Future Enhancements

- Improve performance of brute-force solutions.
- Implement graphical visualizations.
- Extend algorithms for larger problem sizes efficiently.
- Expand appliance management features with more types and sorting options.

