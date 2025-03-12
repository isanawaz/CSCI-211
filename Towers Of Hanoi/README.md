# Towers of Hanoi Solver

## Overview
This program implements a recursive solution to the **Towers of Hanoi** problem using an **Object-Oriented Programming (OOP)** approach. The game involves moving `N` rings from one tower to another while following specific rules.

## Problem Statement
The **Towers of Hanoi** puzzle consists of three pegs and `N` rings of different sizes arranged in descending order on the first peg. The goal is to move all the rings to another peg while adhering to the following rules:
- Only one ring can be moved at a time.
- A ring can only be placed on an empty peg or on a larger ring.
- No ring may be placed on top of a smaller ring.

## How It Works
- The program asks the user to enter the number of rings.
- It initializes the towers and populates the first tower with `N` rings.
- The **recursive function** `solve()` follows the standard Towers of Hanoi algorithm:
  - Move `N-1` rings to an auxiliary peg.
  - Move the largest ring to the destination peg.
  - Move the `N-1` rings from the auxiliary peg to the destination peg.
- Each move is printed to the console.

## Assumptions
- The user enters a valid integer (`N > 0`).
- The number of rings is within a computationally feasible range.

## Edge Cases Handled
- **`N = 1`**: The program directly moves the single ring.
- **Large `N` values**: The recursion depth increases with `N`, but the program handles reasonable values efficiently.

## How to Run the Program
1. Compile the program using a C++ compiler:
   ```sh
   g++ -o towers_of_hanoi TowersOfHanoi.cpp
   ```
2. Run the executable:
   ```sh
   ./towers_of_hanoi
   ```
3. Enter the number of rings when prompted:
   ```sh
   Please enter a number of rings to move: 3
   ```
4. The program prints step-by-step moves to solve the puzzle.

## Example Run
### Input:
```
Please enter a number of rings to move: 3
```
### Output:
```
Move #1: Transfer ring 1 from tower A to tower C
Move #2: Transfer ring 2 from tower A to tower B
Move #3: Transfer ring 1 from tower C to tower B
Move #4: Transfer ring 3 from tower A to tower C
Move #5: Transfer ring 1 from tower B to tower A
Move #6: Transfer ring 2 from tower B to tower C
Move #7: Transfer ring 1 from tower A to tower C
```

## Future Improvements
- Add graphical visualization of the towers.
- Implement an iterative solution to avoid recursion depth issues.
- Optimize for very large values of `N`.

