
#include <vector>
#include <unordered_map>
using namespace std;

class Solution {

public:
    int tupleSameProduct(const vector<int>& input) const {
        int tupleCombinationsOfSameProduct = 0;
        unordered_map<int, int> valueToNumberOfPairs;

        for (int i = 0; i < input.size(); ++i) {
            for (int j = i + 1; j < input.size(); ++j) {
                int product = input[i] * input[j];
                int numberOfPairs = valueToNumberOfPairs[product];

                ++valueToNumberOfPairs[product];
                tupleCombinationsOfSameProduct += numberOfPairs;
            }
        }
        return tupleCombinationsOfSameProduct * 8;
    }
};
