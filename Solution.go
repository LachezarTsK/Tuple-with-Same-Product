
package main

func tupleSameProduct(input []int) int {
    tupleCombinationsOfSameProduct := 0
    valueToNumberOfPairs := map[int]int{}

    for i := range input {
        for j := i + 1; j < len(input); j++ {
            product := input[i] * input[j]
            numberOfPairs := valueToNumberOfPairs[product]

            tupleCombinationsOfSameProduct += numberOfPairs
            valueToNumberOfPairs[product]++
        }
    }
    return tupleCombinationsOfSameProduct * 8
}
