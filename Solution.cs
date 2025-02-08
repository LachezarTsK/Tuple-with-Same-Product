
public class Solution
{
    public int TupleSameProduct(int[] input)
    {
        int tupleCombinationsOfSameProduct = 0;
        Dictionary<int, int> valueToNumberOfPairs = new Dictionary<int, int>();

        for (int i = 0; i < input.Length; ++i)
        {
            for (int j = i + 1; j < input.Length; ++j)
            {
                int product = input[i] * input[j];
                int numberOfPairs = valueToNumberOfPairs.GetValueOrDefault(product);

                tupleCombinationsOfSameProduct += numberOfPairs;
                valueToNumberOfPairs[product] = numberOfPairs + 1;
            }
        }
        return tupleCombinationsOfSameProduct * 8;
    }
}
