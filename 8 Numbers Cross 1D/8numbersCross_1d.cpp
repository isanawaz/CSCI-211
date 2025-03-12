#include <iostream>
#include <vector>
#include <cmath>

class EightNumbersCross {
private:
    std::vector<int> board; // Stores the positions of numbers on the board
    
    // Adjacency matrix defining which positions are adjacent
    static constexpr int adjacency[8][5] = {
        {-1}, {0, -1}, {0, 1, -1}, {0, 2, -1},
        {1, 2, -1}, {1, 2, 3, 4, -1}, {2, 3, 5, -1}, {4, 5, 6, -1}
    };
    
    int solutionCount; // Counter for valid solutions

    // Checks if the current placement is safe
    bool isSafe(int col) {
        // Ensure adjacent numbers are not consecutive
        for (int i = 0; adjacency[col][i] != -1; i++) {
            if (std::abs(board[col] - board[adjacency[col][i]]) == 1) {
                return false; // Conflict found
            }
        }
        // Ensure no duplicate numbers exist in previous columns
        for (int i = 0; i < col; i++) {
            if (board[i] == board[col]) {
                return false; // Duplicate number found
            }
        }
        return true; // Valid placement
    }

    // Recursive backtracking function to place numbers
    void solve(int col) {
        if (col == 8) { // Base case: all numbers placed
            printSolution();
            return;
        }
        for (int num = 1; num <= 8; num++) { // Try numbers 1 through 8
            board[col] = num; // Place a number in the current column
            if (isSafe(col)) { // Check if placement is valid
                solve(col + 1); // Recurse to the next column
            }
        }
    }

    // Prints a valid solution in a formatted structure
    void printSolution() {
        std::cout << "Solution #" << ++solutionCount << ":\n";
        std::cout << "  " << board[1] << " " << board[4] << "\n";
        std::cout << board[0] << " " << board[2] << " " << board[5] << " " << board[7] << "\n";
        std::cout << "  " << board[3] << " " << board[6] << "\n\n";
    }

public:
    // Constructor initializes board and solution counter
    EightNumbersCross() : board(8, 0), solutionCount(0) {}

    // Public function to start solving the puzzle
    void solvePuzzle() {
        solve(0);
    }
};

int main() {
    EightNumbersCross puzzle; // Create puzzle instance
    puzzle.solvePuzzle(); // Solve the puzzle
    return 0;
}

