
/**
 * @param {number[]} input
 * @return {number}
 */
var tupleSameProduct = function (input) {
    let tupleCombinationsOfSameProduct = 0;
    const valueToNumberOfPairs = new Map();

    for (let i = 0; i < input.length; ++i) {
        for (let j = i + 1; j < input.length; ++j) {
            const product = input[i] * input[j];
            const numberOfPairs = valueToNumberOfPairs.has(product) ? valueToNumberOfPairs.get(product) : 0;

            tupleCombinationsOfSameProduct += numberOfPairs;
            valueToNumberOfPairs.set(product, numberOfPairs + 1);
        }
    }
    return tupleCombinationsOfSameProduct * 8;
};
