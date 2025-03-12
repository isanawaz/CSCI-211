#include <iostream>
#include <vector>

class StableMarriage {
private:
    // Preference lists for men and women
    static constexpr int mp[3][3] = {{0, 2, 1}, {0, 2, 1}, {1, 2, 0}}; // Men's preferences
    static constexpr int wp[3][3] = {{2, 1, 0}, {0, 1, 2}, {2, 0, 1}}; // Women's preferences
    
    std::vector<int> match; // Stores the woman's index each man is paired with
    int solutionCount; // Counter for the number of stable matchings found

    // Function to check if the current pairing is stable
    bool isStable(int man) {
        for (int i = 0; i < man; i++) { // Compare with all previously matched men
            // Check if the current man prefers another woman over his match
            // AND that woman also prefers this man over her current match
            if (mp[i][match[man]] < mp[i][match[i]] && wp[match[man]][i] < wp[match[man]][man]) {
                return false; // Instability detected
            }
            // Check if the current match prefers another man over her current partner
            if (mp[man][match[i]] < mp[man][match[man]] && wp[match[i]][man] < wp[match[i]][i]) {
                return false; // Instability detected
            }
            // Ensure no duplicate pairings (each man should be paired uniquely)
            if (match[i] == match[man]) {
                return false; // Conflict detected
            }
        }
        return true; // No conflicts, stable pairing
    }

    // Recursive function to assign women to men
    void solve(int man) {
        if (man == 3) { // Base case: All men are assigned a partner
            printSolution(); // Print the stable pairing
            return;
        }
        for (int woman = 0; woman < 3; woman++) { // Try each woman as a match
            match[man] = woman; // Assign the woman to the current man
            if (isStable(man)) { // Check if this pairing is stable
                solve(man + 1); // Recur to match the next man
            }
        }
    }

    // Prints a valid stable marriage solution
    void printSolution() {
        std::cout << "Solution #" << ++solutionCount << "\nMan\tWoman\n";
        for (int i = 0; i < 3; i++) {
            std::cout << i << "\t" << match[i] << "\n"; // Print the match pair
        }
        std::cout << "\n";
    }

public:
    // Constructor initializes match vector and solution counter
    StableMarriage() : match(3, -1), solutionCount(0) {}

    // Public function to initiate the stable marriage problem solution
    void findStableMarriages() {
        solve(0);
    }
};

int main() {
    StableMarriage sm; // Create an instance of StableMarriage
    sm.findStableMarriages(); // Solve and print all stable matchings
    return 0;
}

