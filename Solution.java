
import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int tupleSameProduct(int[] input) {
        int tupleCombinationsOfSameProduct = 0;
        Map<Integer, Integer> valueToNumberOfPairs = new HashMap<>();

        for (int i = 0; i < input.length; ++i) {
            for (int j = i + 1; j < input.length; ++j) {
                int product = input[i] * input[j];
                int numberOfPairs = valueToNumberOfPairs.getOrDefault(product, 0);

                tupleCombinationsOfSameProduct += numberOfPairs;
                valueToNumberOfPairs.put(product, numberOfPairs + 1);
            }
        }
        return tupleCombinationsOfSameProduct * 8;
    }
}
