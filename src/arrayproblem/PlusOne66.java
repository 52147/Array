package arrayproblem;

/**
 * = 66. Plus One =
 * 
 * Solution:
 * 
 * Overview:
 * 
 *  - "Plus one" is a subset of the problem set "Add number",
 *    which shares the same solution pattern.
 *    
 * - All these problems could be solved in linear time, and the question here is how to solve it without using the addition operation
 *   or how to solve it in constant space complexity.
 *   
 * - The choice of algorithm should be based on the format of input.
 * - Here we list a few examples:
 * 
 *   - 1. Integers:
 *     - Usually the addition operation is not allowed for such case.
 *     - Use Bit Manipulation Approach.
 *     
 *   - 2. Strings:
 *     - Use bit by bit computation.
 *     - Note, sometimes it might not be feasible to come up a solution with the constant space for languages with immutable strings,
 *       e.g. for Java and Python.
 *       
 *   - 3. Linked Lists
 *     - Sentinel Head + Schoolbook Addition with Carry.
 *     
 *   - 4. Arrays (also the current problem)
 *     - Schoolbook addition with carry.
 *     
 * 
 * - Note that, a straightforward idea to convert everything into integers 
 *   and then apply the addition could be risky,
 *   especially for the implementation in Java,
 *   due to the potential integer overflow issue.
 *   
 * - As one can imagine, once the array gets long, the result of conversion cannot fit into the data type of Integer, or Long, or even BigInteger.
 * 
 * 
 * Approach 1: Schoolbook Addition with Carry
 * 
 * Intuition:
 * 
 * - Let us identify the rightmost digit which is not equal to nine and increase that digit by one.
 * - All the following consecutive digits of nine should be set to zero.
 * 
 * - Here is the simplest use case which works fine.
 *      
 *   1 2 3
 *       ^ rightmost not nine
 *     
 *   
 *   1 2 4
 *     ^ increase this digit by one and set all the following nines to zero
 *     
 *  
 * - Here is a slightly complicated case which still passes
 * 
 *   1 2 9
 *     ^ rightmost not nine
 *     
 *   1 3 0
 *     ^ ^
 *     increase this digit by one and set all the following nines to zero
 *         
 * 
 * - Add here is the case which breaks everything, because all the digits are nines.
 * 
 *       9 9 9
 *       
 *       - In this case, we need to set all nines to zero and append 1 to the left side of the array
 *       
 *        9 9 9
 *      1 0 0 0
 *      Append 1 in front of array
 *      As before, set all nines at the end of array to zero
 *      
 * Algorithm:
 * 
 *  1. 
 *  - Move along the input array starting from the end of array.
 *  
 *  2. 
 *  - Set all the nines at the end of array to zero.
 *  
 *  3. 
 *  - If we meet a not- nine digit, we would increase it by one.
 *  - The job is done - return digits.
 *  
 *  4. 
 *  - We're here because all the digits were equal to nine.
 *  - Now they have all been set to zero.
 *  - We then append the digit 1 in front of the other digits and return the result.
 *  
 *   
 */

public class PlusOne66 {
	
	
	public int[] plusOne(int[] digits) {
		
		int n = digits.length;
		
		
		// Use this for loop to check whether elements are nine. 
		// Move along the input array starting from the end
		for( int idx = n - 1; idx >= 0; --idx) {
			
			// set all the nines at the end of array to zeros
			if(digits[idx] == 9) {
				digits[idx] = 0;
			}else {
				// here we have the rightmost not-nine
				
				// increase this rightmost not-nine by 1
				digits[idx] ++;
				
				// and the job is done
				return digits; // if we not return the digits here means all elements in digits array are nine.
			}
		}
		
		// We're here because all the digits are nines.
		digits = new int [n + 1];
		
		digits[0] = 1;
		
		return digits;
	}

}


/**
 * Complexity analysis:
 * 
 * - Time complexity: O(N) since it's not more than one pass along the input list.
 * 
 * - Space complexity¡GO(N) 
 *   - Although we perform the operation in-place (i.e. on the input itself),
 *     in the worst scenario, we would need to allocate an intermediate space to hold the result,
 *     which contains the N + 1 elements.
 *   - Hence the overall space complexity of the algorithm is O(N).
 * 
 * 
 */
