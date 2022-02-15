package twodarrayproblems;

import java.util.ArrayList;
import java.util.Collections;

/**
 * = 498. Diagonal Traverse = 
 * 
 * Approach 1: Diagonal Iteration and Reversal
 * 
 * Intuition:
 * 
 * - A common strategy for solving a lot of programming problem is to first solve a stripped down,
 *   simpler version of them and then think what needs to be changed to achieve the original goal.
 * 
 * - Our first approach to this problem is also based on this very idea.
 * - So, instead of thinking about the zig-zag pattern of printing for the diagonals,
 *   let's say the problem statement simply asked us to print out the contents of the matrix,
 *   one diagonal after the other the other starting from the first element.
 *   
 * - Let's see what this problem would look like.
 *   
 * - The first row and the last column in this problem would serve as the starting point for the corresponding diagonal.
 * - Given an element inside a diagonal, say [i, j],
 *   we can either go up the diagonal by going one row up and one column ahead i.e. [i-1, j + 1] or,
 *   we can go down the diagonal by going one row down and one column to the left i.e. [i+1, j+1].
 * - Note that this applies to diagonals that go from right to left only.
 * - The math would change for the ones that go from left to right.
 * 
 * 
 * - This is a simple problem to solve, right?
 * - The only difference between this one and the original problem is that some of the diagonals are not printed in the right order.
 * - That's all we need to fix to get the right solution.
 * 
 * 
 * - We simply need to reverse the odd numbered diagonals before we add the elements to the final result array.
 * - So, for e.g. the third diagonal starting from the left would be [3, 7, 11]
 * - and before we add these elements to the final result array, we simply reverse them  i.e. [11, 7, 3].
 * 
 * 
 * Algorithm:
 * 
 * - 1.
 *   - Initialize a result array that we will eventually return.
 *   
 * - 2. 
 *   - We would have an outer loop that will go over each of the diagonals by one.
 *   - As mentioned before, the element in the first row and the last column would actually be the heads of their corresponding diagonals.
 *   
 * - 3.
 *   - We then have an inner while loop that iterates over all the elements in the diagonal.
 *   - We can calculate the number of elements in the corresponding diagonal by
 *     we can simply iterate until one of the indices goes out of bounds.
 *     
 * - 4. 
 *   - For each diagonal we will need a new list or dynamic array like data structure since we don't know what size to allocate.
 *   - Again, we can do some math and calculate the size of that particular diagonal and allocate memory;
 *     but it's not necessary for this explanation.
 *     
 * - 5.
 *   - For odd numbered diagonals, we simply need to add the elements in our intermediary array,
 *     in reverse order to the final result array.
 *
 *
 */

public class DiagonalTraverse498 {
	
	
	public int[] findDiagonalOrder(int[][] matrix) {
		
		
		// check for empty matrices
		if(matrix == null || matrix.length == 0) {
			return new int[0];
		}
		
		
		// Variables to track the size of the matrix
		int N = matrix.length;
		int M = matrix[0].length;
		
		// The two arrays as explained in the algorithm
		int[] result = new int[N * M];
		int k = 0;
		ArrayList<Integer> intermediate = new ArrayList<>();
		
		
		// We have to go over all the elements in the first row and the last column to cover all possible diagonals.
		for(int d = 0; d < N + M -1; d++) {
			
			
			// clear the intermediate array every time we start to process another diagonal
			intermediate.clear();
			
			
			// We need to figure out the "head" of this diagonal
			// The elements in the first row and the last column are the respective heads.
			int r = d < M ? 0 : d - M + 1;
			int c = d < M ? d : M - 1;
			
			// Iterate until one of the indices goes out of scope
			// Take note of the index math to go down the diagonal
			while( r < N && c > -1) {
				intermediate.add(matrix[r][c]);
				++r;
				--c;
			}
			
			// Reverse even numbered diagonals.
			// article says we have to reverse odd numbered article but here,
			// the numbering is starting from 0 
			if(d % 2 == 0) {
				Collections.reverse(intermediate);
			}
			
			for(int i = 0; i < intermediate.size(); i++) {
				result[k++] = intermediate.get(i);
			}
			
			
			
			
			
			
		
		}
		
		return result;
	}
	
	

}


/**
 * Complexity analysis:
 * 
 * - Time complexity: O(N * M)
 *   - considering the array has N rows and M column.
 *   - An important thing to remember is that for all the odd numbered diagonal,
 *     we will be processing the elements twice since we have to reverse the elements
 *     before adding to result array.
 *   - Additionally, to save space, we have to clear the intermediate array before we process a new diagnol.
 *   - That operation also takes O(K) where K is the size of that array.
 *   - So, we will be processing all the elements of the array at least twice.
 *   - But, as far as the asymptotic complexity is concerned, it remains the same.
 *   
 * 
 * - Space complexity: O(min(N, M)) 
 *   - since the extra space is occupied by the intermediate arrays
 *     we use for storing diagonal elements and the maximum it can occupy
 *     is the equal to the minimum of N and M.
 *   - Remember, the diagonal can only extend till one of its indices goes out of scope.
 *    
 * 
 */
