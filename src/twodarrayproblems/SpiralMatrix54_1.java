package twodarrayproblems;

import java.util.ArrayList;
import java.util.List;

/**
 * = 54. Spiral Matrix =
 * 
 * Solution:
 * 
 * Overview:
 * 
 * - The problem statement asks us to return all elements of the matrix in spiral order.
 * - , which means we still start from the top left corner and move towards right, then down, then left, and then up.
 * - Let's break this into further details:
 * 
 * - 1. 
 *   - We can achieve moving in different directions by modifying row and column indices.
 *   - Specifically, we have:
 *     
 *     Given that we are at (row, col), where row is the row index, and col is the column index.
 *     
 *     - move right: 
 *     - move downwards:
 *     - move left:
 *     - move upwards:
 *     
 * 
 * - 2.
 *   - When shall we change our direction?
 *   - We need to turn when we either reach the matrix boundaries,
 *     or we reach the cells in the array that we have visited before.
 *   
 *   - Matrix boundaries are fixed and provided already, 
 *     but how could we know if we have visited a particular cell or not?
 *   - In fact, we have 2 different strategies and they will be introduced in the following approaches.
 *   - Generally speaking, they are as follows:
 *   
 *     - Approach 1:
 *       - We can move the boundaries towards the center of the matrix after we have traversed a row or a column.
 *       - Then when we meet a boundary, we know it's time to change the direction and update the boundary.
 *     
 *     - Approach 2:
 *       - While traversing the matrix, we can record each location that we have visited.
 *       - Then when we meet a matrix boundary or a previously visited cell,
 *         we know it's time to change the direction.
 * 
 *   
 * Approach 1: Set up boundaries
 * 
 * Intuition:
 * 
 * - Our goal is to update boundaries as follow:
 *   - When we finish traversing a row or column, we want to set up a boundary on it so that next time we get there,
 *     we know we need to change the direction.
 *   - Here is a demo for the first round of updating the top, right, bottom, and left boundaries.
 * 
 * Algorithm:
 * 
 * - 1. Initialize the top, right, bottom, and left boundaries as up, down, and left.
 * - 2. Initialize the output array result
 * - 3. Traverse the elements in spiral and add each element to result:
 *      - Traverse from left boundary to right boundary.
 *      - Traverse from up boundary to down.
 *      
 *      - Before we traverse from right to left, 
 *        we need to make sure that we are not on a row that has already been traversed.
 *        - If we are not, then we can traverse from right to left.
 *     
 *      - Similarly, before we traverse from top to bottom, we need to make sure that we are not on a column that has already been traversed.
 *        - Then we can traverse from down to top.
 *        
 *      - Remember to move the boundaries by updating left, right, up and down accordingly.
 *  
 * - 4. Return result.     
 *      
 *   
 *
 */

public class SpiralMatrix54_1 {
	
	public List<Integer> spiralOrder(int[][] matrix){
		
		List<Integer> result = new ArrayList<>();
		int rows = matrix.length;
		int columns = matrix[0].length;
		
		int up = 0;
		int left = 0;
		int right = columns - 1;
		int down = rows - 1;
		
		while(result.size() < rows * columns) {
			
			// Traverse from left to right
			for(int col = left; col <= right ; col ++) {
				result.add(matrix[up][col]);
			}
			
			// Traverse downwards
			for(int row = up + 1; row <= down; row++) {
				result.add(matrix[row][right]);
			}
			
			// Make sure we are now on a different row.
			if(up != down) {
				
				// Traverse from right to left
				for(int col = right - 1; col >= left; col--) {
					result.add(matrix[down][col]);
				}
			}
			
			// Make sure we are now on a different column.
			if(left != right) {
				
				// Traverse upwards
				for(int row = down - 1; row >  up; row--) {
					result.add(matrix[row][left]);
				}
				
				left++;
				right--;
				up++;
				down--;
			}
			
			
			

			
		}
		
		return result;
		
	}

}


/**
 * Complexity Analysis:
 * 
 * - Let M be the number of rows an N be the number of columns.
 * 
 *   - Time complexity: O(M * N).
 *     - This is because we visited each element once.
 *   
 *   - Space complexity: O(1).
 *     - This is because we don't use other data structure.
 *     - Remember that we don't include the output array in the space complexity.
 *     
 *     
 * 
 * 
 */
