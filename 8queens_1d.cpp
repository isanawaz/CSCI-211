#include <iostream>
#include <vector>
#include <cmath>

class EightQueens {
private:
    std::vector<int> board; // Stores the row positions of queens for each column
    int solutionCount; // Counter to track the number of valid solutions

    // Function to check if placing a queen in the current column is safe
    bool isSafe(int col) {
        for (int i = 0; i < col; i++) {
            // Check if the queen is in the same row or diagonal as any previous queen
            if (board[i] == board[col] || std::abs(board[col] - board[i]) == col - i) {
                return false; // Conflict detected
            }
        }
        return true; // No conflicts, placement is safe
    }

    // Recursive function to place queens column by column
    void solve(int col) {
        if (col == 8) { // Base case: all 8 queens have been placed successfully
            printSolution(); // Print the valid solution
            return;
        }
        for (int row = 0; row < 8; row++) { // Iterate through all possible row placements
            board[col] = row; // Place a queen in the current row
            if (isSafe(col)) { // Check if the placement is valid
                solve(col + 1); // Recurse to the next column
            }
        }
    }

    // Function to print a valid solution
    void printSolution() {
        std::cout << "Solution #" << ++solutionCount << ": ";
        for (int i = 0; i < 8; i++) {
            std::cout << board[i] << " "; // Print queen row positions
        }
        std::cout << "\n";
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                // Print '1' where a queen is placed, otherwise print '0'
                std::cout << (board[j] == i ? "1 " : "0 ");
            }
            std::cout << "\n";
        }
        std::cout << "\n";
    }

public:
    // Constructor initializes the board with 8 columns and solution counter to 0
    EightQueens() : board(8, 0), solutionCount(0) {}

    // Public method to start solving the puzzle
    void solvePuzzle() {
        solve(0);
    }
};

int main() {
    EightQueens puzzle; // Create an instance of the EightQueens class
    puzzle.solvePuzzle(); // Solve the puzzle and print all valid solutions
    return 0;
}

