package arrayproblem;
/**
 * 
 * 628. Maximum Product of Three Numbers
 * 
 * Approach 3: Single Scan
 *
 */

public class MaximumProductOfThreeNumbers628_3 {
	
	public int maximumProduct(int[] nums) {
		int min1 = Integer.MAX_VALUE;
		int min2 = Integer.MAX_VALUE;
		
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		int max3 = Integer.MIN_VALUE;
		
		for(int n: nums) {
			
			if(n <= min1) {
				min2 = min1;
				min1 = n;
			}else if(n <= min2) {   // n lies between min1 and min2
				min2 = n;
			}
			
			if(n >= max1) {   // n is greater than max1, max 2 and max3
				max3 = max2;
				max2 = max1;
				max1 = n;
			}else if(n >= max2) {  // n lies between max1 and max2
				max3 = max2;
				max2 = n;
						
			}else if(n >= max3) {  // n lies between max2 and max3
				max3 = n;
			}
			 
		}
		return Math.max(min1 * min2 * max1, max1 * max2 * max3);
		
		
	}

}

/**
 * Complexity analysis:
 * 
 * Time complexity: O(N). Only one iteration over the nums array of length n is required.
 * 
 * Space complexity: O(1). Constant extra space is used.
 * 
 */
