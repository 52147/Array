package immutablestring_problemsandsolutions;
/**
 * = Immutable String - Problems & Solutions =
 * 
 * - If the string is immutable, it will bring some problems.
 * - Hopefully, we will also provide the solution at the end.
 * 
 * = Modification Operation =
 * 
 * - Obviously, an immutable string cannot be modified.
 * - If you want to modify just one of the characters,
 *   you have to create a new string.
 *   
 * = Beware of String concatenation in Java =
 * 
 * - You should be very careful with string concatenation.
 * - Let's look at an example when we do string concatenation repeatedly in a for loop:
 *
 * - Notice how slow string concatenation is for Java?
 * - On the other hand, there is no noticeable performance impact in C++.
 * 
 * - In Java, since the string is immutable, concatenation works by first allocating enough space for the the new string,
 *   copy the contents from the old string and append to the new string.
 *   
 *   - Therefore, the time complexity in total will be:
 *   
 *   5 + 5 x 2 + 5 x 3 + ... + 5 x n
 *   = 5 x (1 + 2 + 3 +...+ n)
 *   = 5 x n x (n + 1)/2
 *   
 *   which us O(n^2)
 *   
 * 
 *
 */

public class Main {

	public static void main(String[] args) {
		String s = "";
		
		int n = 10000;
		for(int i = 0; i < n; i++) {
			s += "hello";
		}

	}

}
