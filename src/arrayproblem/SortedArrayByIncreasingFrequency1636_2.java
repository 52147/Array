package arrayproblem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * 1636. Sorted Array By increasing Frequency
 * 
 * Approach: HashMap and Collections.sort
 * 
 * 
 *
 */

public class SortedArrayByIncreasingFrequency1636_2 {

	public int[] frequencySort(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();

		for (int num : nums) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}

		List<Map.Entry<Integer, Integer>> list = new ArrayList(map.entrySet());

		Collections.sort(list,
				(a, b) -> a.getValue() == b.getValue() ? b.getKey() - a.getKey() : a.getValue() - b.getValue());

		int index = 0;

		int[] res = new int[nums.length];

		for (Map.Entry<Integer, Integer> entry : list) {
			int count = entry.getValue();
			int key = entry.getKey();

			for (int i = 0; i < count; i++) {
				res[index++] = key;
			}

		}
		return res;
	}

}
