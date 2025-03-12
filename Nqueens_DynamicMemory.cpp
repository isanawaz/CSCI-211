#include <iostream>
#include <vector>
#include <cmath>

class NQueensDynamic {
private:
    int size; // Size of the chessboard (N x N)
    std::vector<int> board; // Stores the row positions of queens for each column
    int solutionCount; // Counter for the number of valid solutions found

    // Function to check if placing a queen in the given column is safe
    bool isSafe(int col) {
        for (int i = 0; i < col; i++) {
            // Check if the queen is in the same row or on the same diagonal
            if (board[i] == board[col] || std::abs(board[col] - board[i]) == col - i) {
                return false; // Conflict detected, placement is not safe
            }
        }
        return true; // No conflicts, safe to place queen
    }

    // Recursive function to attempt placing queens in all columns
    void solve(int col) {
        if (col == size) { // Base case: all queens are successfully placed
            solutionCount++; // Increment solution count
            return;
        }
        for (int row = 0; row < size; row++) { // Try placing a queen in each row of the current column
            board[col] = row; // Place queen in the current row
            if (isSafe(col)) { // Check if it's a valid placement
                solve(col + 1); // Recurse to place the next queen
            }
        }
    }

public:
    // Constructor initializes board size and sets initial values
    explicit NQueensDynamic(int n) : size(n), board(n, 0), solutionCount(0) {}

    // Public method to start solving the puzzle and return the number of solutions
    int countSolutions() {
        solve(0); // Start backtracking algorithm from the first column
        return solutionCount;
    }
};

int main() {
    int n;
    std::cout << "Enter the value of N: ";
    std::cin >> n;
    
    // Iterate through board sizes from 1 to N and compute the number of solutions
    for (int i = 1; i <= n; i++) {
        NQueensDynamic puzzle(i); // Create an instance for the current board size
        std::cout << "There are " << puzzle.countSolutions() << " solutions to the " << i << "-Queens problem.\n";
    }
    return 0;
}

