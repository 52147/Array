package twodimensionalarray;
/**
 * = multidimensional arrays = 
 * 
 * - Sometimes arrays need to be accessed by more than one index.
 * - A common example of this is a matrix.
 * 
 * - A multidimensional array is an array that is accessed by more than one index.
 * - Its is allocated by specifying the size of its indices,
 *   and each element is accessed by placing each index in its own pair of brackets.
 *   
 *   - As an example, the declaration
 *   
 *       int [][] x = new int [2][3]; // the first index must be invoked
 *   
 *     - defines the two-dimensional array x, with the first index (representing the number of rows) ranging from 0 to 1
 *       and the second index(the number of columns) ranging from 0 to 2 (for a total of six ints).
 *     - Six memory locations are set aside for these ints.
 *     
 *      
 *  - In the example above, the two-dimensional array is actually an array of arrays.
 *  
 *  - As such the number of rows is x.length, which is 2.
 *  - The number of column is x[0].length or x[1].length, both of which are 3.
 *        
 *  - This program illustrates how to print the contents of a two-dimensional array.
 *  - The code works not only for rectangular two-dimensional arrays,
 *  - but also for ragged two-dimensional arrays,
 *  - in which the number of columns varies from row to row.
 *  
 *  - This is easily handled by using m[i].length to represent the number of columns in row i.
 *  - We also handled the possibility that a row might be null(which is different than length 0),
 *  - The main routine illustrates the declaration of two-dimensional arrays for the case
 *    where initial values are known.
 *  - Array a is a straightforward rectangular matrix, array b has a null row, and array c is ragged.
 * 
 * 
 *
 */

// Printing a two-dimensional array
public class MatrixDemo {
	
	public static void printMatrix(int [][] m) {
		for(int i = 0 ; i < m.length; i++) {  // m.length => the number of the rows(number of the arrays in the 2-dimensional array)
			if(m[i] == null) // if value of row be null
				System.out.println("(null)");
			else {
				for(int j = 0; j < m[i].length; j ++) { // m[i].length => the number of the columns in i row
					System.out.print(m[i][j] + " ");
				}
				System.out.println(); // change to the next line to print the next row
			}
				
		}
	}

	public static void main(String[] args) {
		
		int [][] a = {{1, 2}, {3, 4}, {5, 6}};
		int [][] b = {{1, 2}, null, {5, 6}};  // the second row is null
		int [][] c = {{1, 2}, {3, 4, 5}, {6}}; // the second row has 3 columns
		
		

		
		System.out.println("a: "); printMatrix(a);
		System.out.println("b: "); printMatrix(b);
		System.out.println("c: "); printMatrix(c);
		
		
		

	}

}
