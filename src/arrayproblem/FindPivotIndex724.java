package arrayproblem;

/**
 * - Given an array of integer nums, calculate the pivot index of this array.
 * - The pivot index is the index where the sum of all the numbers strictly to the left of index is equal to the sum of all the numbers strictly to the index's right.
 * 
 * - If the index is on the left edge of the array,
 *   then the left sum is 0 because there are not elements to the left.
 * - This also applies to the right edge of the array.
 * 
 * - Return the leftmost pivot index.
 * - If no such index exists, return -1.
 * 
 * 
 * Approach #1: Prefix Sum
 * 
 * - We need to quickly compute the sum of the value to the left and the right of every index.
 * 
 * - Let's say we knew S as the sum of the numbers,
 *   and we are at index i.
 *   
 * - If we knew the sum of numbers leftsum that are to the left of index i,
 *   then the other sum to the right of the index would be S - num[i] - leftsum.
 *   
 * - As such, we only need to know about leftsum to check whether an index is a pivot index in constant time.
 * 
 * - Let's do that:
 *   - as we iterate through candidate indexed i,
 *     we will maintain the correct value of leftsum.
 *     
 * 
 * 
 *
 */

public class FindPivotIndex724 {
	
	
	public int pivotIndex(int[] nums) {
		int sum = 0;
		int leftsum = 0;
		
		for(int x: nums) {
			sum += x;
		}
		
		for(int i = 0; i< nums.length; i++) {
			if(leftsum == sum - leftsum - nums[i]) {
				return i;
			}
			leftsum += nums[i];
		}
		return -1;
	}
	
	
	

}

/**
 * Complexity analysis:
 * 
 * - Time complexity: O(N), where N is the length of nums.
 * 
 * - Space complexity: O(1), the space used by leftsum and S.
 */


