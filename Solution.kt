
class Solution {

    fun tupleSameProduct(input: IntArray): Int {
        var tupleCombinationsOfSameProduct = 0
        val valueToNumberOfPairs = HashMap<Int, Int>()

        for (i in input.indices) {
            for (j in i + 1..<input.size) {
                val product = input[i] * input[j]
                val numberOfPairs = valueToNumberOfPairs.getOrDefault(product, 0)

                tupleCombinationsOfSameProduct += numberOfPairs
                valueToNumberOfPairs[product] = numberOfPairs + 1
            }
        }
        return tupleCombinationsOfSameProduct * 8
    }
}
