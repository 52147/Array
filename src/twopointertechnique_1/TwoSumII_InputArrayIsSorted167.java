package twopointertechnique_1;
/**
 * 
 * = 167. Two Sum II - Input Array is sorted =
 * 
 * Approach 1: Two pointers
 *
 */

public class TwoSumII_InputArrayIsSorted167 {
	
	public int[] twoSum(int[] numbers, int target) {
		int low = 0;
		int high = numbers.length - 1;
		
		while(low < high) {
			int sum = numbers[low] + numbers[high];
			
			if(sum == target) {
				return new int [] {low + 1, high + 1};
			}else if(sum < target){
				low++;
			}else {
				high--;
			}
		}
		
		return new int[] {-1, -1};
	}

}
