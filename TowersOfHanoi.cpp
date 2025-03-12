#include <iostream>
#include <vector>

class TowersOfHanoi {
private:
    int numRings; // Number of rings to be moved
    std::vector<int> towers[3]; // Three towers represented as vectors
    int moveCount; // Counter to track the number of moves

    // Function to move a ring from one tower to another
    void move(int from, int to) {
        std::cout << "Move #" << moveCount++ << ": Transfer ring " << towers[from].back()
                  << " from tower " << static_cast<char>('A' + from)
                  << " to tower " << static_cast<char>('A' + to) << "\n";
        towers[to].push_back(towers[from].back()); // Place the ring on the destination tower
        towers[from].pop_back(); // Remove the ring from the source tower
    }

    // Recursive function to solve the Towers of Hanoi problem
    void solve(int n, int from, int to, int aux) {
        if (n > 0) {
            solve(n - 1, from, aux, to); // Move n-1 rings to auxiliary tower
            move(from, to); // Move the nth ring to the destination tower
            solve(n - 1, aux, to, from); // Move n-1 rings from auxiliary tower to destination
        }
    }

public:
    // Constructor initializes the towers and sets up the initial configuration
    explicit TowersOfHanoi(int n) : numRings(n), moveCount(1) {
        for (int i = n; i >= 1; --i) {
            towers[0].push_back(i); // Populate the first tower with rings in descending order
        }
    }

    // Public method to start solving the puzzle
    void solvePuzzle() {
        solve(numRings, 0, 1, 2);
    }
};

int main() {
    int n;
    std::cout << "Please enter a number of rings to move: ";
    std::cin >> n; // Get the number of rings from the user
    TowersOfHanoi game(n); // Create an instance of the game
    game.solvePuzzle(); // Solve the puzzle
    return 0;
}

