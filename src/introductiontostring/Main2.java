package introductiontostring;

/**
 * 
 * = Immutable or Mutable =
 * 
 * - Immutable means that you can't change the content of the string once it's initialized.
 * 
 * - 1.
 *   - In some languages (like C++), the string is mutable.
 *   - That is to say, you can modify the string just like what you did in an array.
 *   
 * - 2. 
 *   - In some other languages (like Java), the string is immutable.
 *   - This feature will bring several problems.
 * 
 * 
 * - You can determine whether the string in your favorite language is immutable or mutable 
 *   by testing the modification operation.
 * - Here is an example:
 * 
 *
 */

public class Main2 {

	public static void main(String[] args) {
		
		String s1 = "Hello World";
		s1[5] = ',';
		System.out.println(s1);

	}

}
