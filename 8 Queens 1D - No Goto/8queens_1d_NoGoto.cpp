#include <iostream>
#include <vector>
#include <cmath>

class EightQueens {
private:
    std::vector<int> board; // Stores the row position of queens in each column
    int solutionCount; // Counter for valid solutions found

    // Function to check if placing a queen in the given column is safe
    bool isSafe(int col) {
        for (int i = 0; i < col; i++) {
            // Check if another queen is in the same row or diagonal
            if (board[col] == board[i] || std::abs(board[col] - board[i]) == col - i) {
                return false; // Conflict found, not a safe placement
            }
        }
        return true; // No conflicts, placement is safe
    }

    // Recursive function to attempt placing queens in all columns
    void solve(int col) {
        if (col == 8) { // Base case: all 8 queens are placed
            printSolution(); // Print the valid solution
            return;
        }
        for (int row = 0; row < 8; row++) { // Try placing queen in each row
            board[col] = row; // Place queen in the current row
            if (isSafe(col)) { // Check if it's a valid placement
                solve(col + 1); // Recur to place the next queen
            }
        }
    }

    // Function to print a valid solution
    void printSolution() {
        std::cout << "Solution #" << ++solutionCount << ": ";
        for (int i = 0; i < 8; i++) {
            std::cout << board[i]; // Print queen row positions for reference
        }
        std::cout << "\n";
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                // Print '1' for queen placement and '0' for empty squares
                std::cout << (board[j] == i ? "1" : "0");
            }
            std::cout << "\n";
        }
        std::cout << "\n";
    }

public:
    // Constructor initializes the board and solution count
    EightQueens() : board(8, 0), solutionCount(0) {}

    // Public method to start solving the puzzle
    void solvePuzzle() {
        solve(0);
    }
};

int main() {
    EightQueens puzzle; // Create an instance of EightQueens
    puzzle.solvePuzzle(); // Solve the puzzle and print solutions
    return 0;
}

