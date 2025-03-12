#include <iostream>
#include <vector>
#include <cmath>

class DumbEightQueens {
private:
    int solutionCount; // Counter for valid solutions found

    // Function to check if the current arrangement of queens is valid
    bool isValid(const std::vector<int>& board) {
        for (int col = 0; col < 8; col++) {
            for (int c = 0; c < col; c++) {
                // Check if two queens are in the same row or on the same diagonal
                if (board[col] == board[c] || std::abs(board[col] - board[c]) == std::abs(col - c)) {
                    return false; // Conflict detected, not a valid solution
                }
            }
        }
        return true; // No conflicts, valid placement
    }

    // Generates all possible queen placements and checks for valid solutions
    void generateAndCheck() {
        std::vector<int> board(8); // Stores queen positions for each column
        for (int i0 = 0; i0 < 8; i0++) {
            for (int i1 = 0; i1 < 8; i1++) {
                for (int i2 = 0; i2 < 8; i2++) {
                    for (int i3 = 0; i3 < 8; i3++) {
                        for (int i4 = 0; i4 < 8; i4++) {
                            for (int i5 = 0; i5 < 8; i5++) {
                                for (int i6 = 0; i6 < 8; i6++) {
                                    for (int i7 = 0; i7 < 8; i7++) {
                                        board = {i0, i1, i2, i3, i4, i5, i6, i7}; // Assign values to board
                                        if (isValid(board)) { // Check if arrangement is valid
                                            printSolution(board);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    // Prints a valid solution to the console
    void printSolution(const std::vector<int>& board) {
        std::cout << "Solution #" << ++solutionCount << ": ";
        for (int col : board) {
            std::cout << col << " "; // Print queen row positions
        }
        std::cout << "\n";
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                // Print '1' for queen placement and '0' for empty squares
                std::cout << (board[col] == row ? "1 " : "0 ");
            }
            std::cout << "\n";
        }
        std::cout << "\n";
    }

public:
    // Constructor initializes solution counter
    DumbEightQueens() : solutionCount(0) {}

    // Public function to generate and check solutions
    void solvePuzzle() {
        generateAndCheck();
    }
};

int main() {
    DumbEightQueens puzzle; // Create an instance of DumbEightQueens
    puzzle.solvePuzzle(); // Solve the puzzle using brute force
    return 0;
}

