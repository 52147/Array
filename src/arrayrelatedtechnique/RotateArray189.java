package arrayrelatedtechnique;

/**
 * = Array-related Techniques =
 * 
 * - There are more array-related data structures or techniques you might want to know.
 * 
 * 1. There are some other data structures which are similar to the array but have some different properties:
 * 
 *   - String
 *   - Hash Table
 *   - Linked List
 *   - Queue
 *   - Stack
 *   
 * 2. 
 * - As we mentioned, we can call the build-in function to sort an array.
 * - But it is useful to understand the principle of some widely-used sorting algorithms and their complexity.
 * 
 * 3.
 * - Binary search is also an important technique used to search a specific element in a sorted array.
 * 
 * 4.
 * - We have introduced two-pointer technique in this chapter.
 * - It is not easy to use this technique flexibly.
 * - This technique can also be used to solve:
 * 
 *   - Slow-pointer and fast-pointer problem in Linked List
 *   - Sliding Window Problem
 *   
 * 5. The two-pointer technique sometimes will relate to Greedy Algorithm which helps us design our pointers' movement strategy.
 * 
 *  
 * 
 * 
 *
 */


/**
 * 
 * 189. Rotate Array
 * 
 * Approach 3: Using Cyclic Replacements
 * 
 * ex:
 * 
 * k = 2
 * | 1 | 2 | 3 | 4 | 5 |
 * 
 * 
 * | 4 | 5 | 1 | 2 | 3 |
 * 
 *  => this 3(1, 2, 3) element each need to move k % nums.length = 2 space (not k moves because may be k larger than array length)
 *     => k = 2
 *     => the shifted index = (original index + 2) % length 
 *     => index 1 shifted to new index: (0 + 2) % 5 = 2
 *     => ...
 *     => index 5 shifted to new index: (4 + 2) % 5 = 1
 *    
 *  
 * 
 */

public class RotateArray189 {
	
	public void rotate(int[] nums, int k) {
		
		k = k % nums.length; // how many index need to move
		int count = 0;
		
		for(int start = 0; count < nums.length; start++) {
			
			int current = start;
			int prev = nums[start];
			
			do{
				int next = (current + k) % nums.length; // shifted index = (original index + k) % len
				
				int temp = nums[next]; // save the element in the position where we need to put the index i element
				nums[next] = prev; // shifted the element to the new place
				prev = temp;  // save the old element in the prev because we need to find the shifted index for this element  
				
				current = next; // set the next index in the current 
				                // because next iteration we want to find the new shifted index for the old element in this index
				count++; // plus the count => when the while loop is over -> the for loop ended too
				
			}while(start != current); // if return to the index 0 stop
		}
	}

}
