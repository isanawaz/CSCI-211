#include <iostream>
#include <vector>

class EightQueens2D {
private:
    std::vector<std::vector<int>> board; // 2D board representation of the chessboard
    int solutionCount; // Counter to track the number of valid solutions

    // Function to check if placing a queen at (row, col) is safe
    bool isSafe(int row, int col) {
        // Check for other queens in the same row
        for (int i = 0; i < col; i++) {
            if (board[row][i] == 1) return false;
        }
        // Check upper diagonal on the left
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) return false;
        }
        // Check lower diagonal on the left
        for (int i = row, j = col; i < 8 && j >= 0; i++, j--) {
            if (board[i][j] == 1) return false;
        }
        return true; // No conflicts, safe placement
    }

    // Recursive function to solve the problem column by column
    void solve(int col) {
        if (col == 8) { // Base case: all queens are successfully placed
            printSolution(); // Print the valid solution
            return;
        }
        for (int row = 0; row < 8; row++) { // Iterate through all possible rows
            if (isSafe(row, col)) { // Check if placing a queen here is valid
                board[row][col] = 1; // Place the queen
                solve(col + 1); // Recur to place the next queen
                board[row][col] = 0; // Backtrack by removing the queen
            }
        }
    }

    // Function to print the board configuration for a valid solution
    void printSolution() {
        std::cout << "Solution #" << ++solutionCount << ":\n";
        for (const auto& row : board) {
            for (int cell : row) {
                // Print 'Q' where a queen is placed, otherwise print '.'
                std::cout << (cell == 1 ? "Q " : ". ");
            }
            std::cout << "\n";
        }
        std::cout << "\n";
    }

public:
    // Constructor initializes an empty 8x8 board and solution counter
    EightQueens2D() : board(8, std::vector<int>(8, 0)), solutionCount(0) {}

    // Public method to start solving the puzzle
    void solvePuzzle() {
        solve(0);
    }
};

int main() {
    EightQueens2D puzzle; // Create an instance of the EightQueens2D class
    puzzle.solvePuzzle(); // Solve the puzzle and print all valid solutions
    return 0;
}

