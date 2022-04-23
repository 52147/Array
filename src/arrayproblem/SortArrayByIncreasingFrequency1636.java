package arrayproblem;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
/**
 * 
 * 1636. Sort Array by increasing Frequency
 * 
 * - sort the array in increasing order based on the frequency of the values.
 * - If the multiple values have the same frequency,
 *   sort them in decreasing order.
 *   
 * Approach: custom sort
 * 
 * 
 * 
 *
 */
public class SortArrayByIncreasingFrequency1636 {

	public int[] frequencySort(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		
		// stream() Returns a sequential IntStream
		// forEach() Performs an action for each element of this stream. 
		Arrays.stream(nums).forEach(n -> map.put(n, map.getOrDefault(n, 0) + 1));
		
		// boxed() converts each int to Integer object, this is because .sorted() can only operate on objects
        // .mapToInt(n -> n) converts Integer to int
		return Arrays.stream(nums).boxed().sorted((a, b) -> map.get(a) != map.get(b) ? map.get(a) - map.get(b) : b - a).mapToInt(n -> n).toArray();
				
		
	}

}
