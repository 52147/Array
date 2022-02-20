package introductiontostring;

/**
 * = Extra Operations =
 * 
 * - You should be aware of the time complexity of these built-in operations.
 *   - For instance, if the length of the string is N,
 *     the time complexity of both finding operation and substring operation is O(N).
 * 
 * - Also, in languages which the string is immutable, you should be careful with the concatenation operation.
 * 
 * - Never forget to take the time complexity of built-in operations into consideration
 *   when you compute the time complexity for your solution.
 * 
 * - Compare to an array, there are some extra operations we can perform on a string.
 * - Here are some examples: 
 * 
 *
 */

public class Main3 {

	public static void main(String[] args) {
		 
		String s1 = "Hello World";
		
		// 1. concatenate
		s1 += "!";
		System.out.println(s1);
		
		// 2. find
		System.out.println("The position of first 'o' is: " + s1.indexOf('o'));
		
		System.out.println("The positsion of last 'o' is: " + s1.lastIndexOf('o'));
		
		
		// 3. get substring
		System.out.println(s1.substring(6, 11));
		

	}

}
