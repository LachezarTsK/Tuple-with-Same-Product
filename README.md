# Tuple-with-Same-Product
Challenge at LeetCode.com. Tags: Hash Table, Math.

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
In order to avoid an additional loop over map 'valueToNumberOfPairs', in which to calculate the number of combinations for a given multiplication product,<br/>
the following formula is applied to calculate the results, while the map is still being updated:  (numberOfPairs - 1) * 8
 
Explanation for formula (numberOfPairs - 1) * 8 applied to update 'tupleCombinationsOfSameProduct'  

- previousNumberOfCombinations:   (numberOfPairs - 1) * (numberOfPairs - 2) * 4<br/>
- currentNumberOfCombinations:    numberOfPairs * (numberOfPairs - 1) * 4<br/>
- updatedNumberOfCombinations:    currentNumberOfCombinations - previousNumberOfCombinations<br/>
&emsp; numberOfPairs * (numberOfPairs - 1) * 4 - (numberOfPairs - 1) * (numberOfPairs - 2) * 4<br/>
                                (numberOfPairs - 1) * 4 * (numberOfPairs - (numberOfPairs - 2))<br/>
                                (numberOfPairs - 1) * 4 * (numberOfPairs - numberOfPairs + 2)<br/>
                                (numberOfPairs - 1) * 8<br/> 
