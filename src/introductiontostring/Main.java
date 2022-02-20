package introductiontostring;

/**
 * = Introduction to String =
 * 
 * - A string is actually an array of unicode characters.
 * - You can perform almost all the operations we used in an array.
 * - You can try it out by yourself.
 * 
 * - However, there are some difference.
 * - In this article, we will go through some of them which you should be aware of when dealinh with a string.
 * - These features might vary a lot from one language to another.
 * 
 * 
 * = Compare Function =
 * 
 * - String has its own compare function
 *   ( we will show you the usage of compare function in the code below.)
 *   
 * - However, there is a problem:
 *   - Can we use "==" to compare two strings?
 *   
 * - It depends on the answer to the question:
 *   - Does the language support operator overloading?
 *   
 *     - 1. if the answer is yes (like C++), we may use "==" to compare two strings.
 *     - 2. if the answer is not (like Java), we may not use "==" to compare two strings.
 *          When we use "==", it actually compares whether these two objects are the same object.
 * 
 *
 */

public class Main {
    // "static void main" must be defined in a public class.
	public static void main(String[] args) {
		
		// Initialize
		String s1 = "Hello World";
		System.out.println("s1 is \"" + s1 + "\"");
		
		String s2 = s1;
		System.out.println("s2 is another reference to s1.");
		
		String s3 = new String(s1);
		System.out.println("s3 is a copy of s1.");
		
		// compare using '=='
		System.out.println("Compared by '=='");
		
		// true since string is immutable and s1 is binded to "Hello World"
		System.out.println("s1 and \"Hello World\":" + (s1 == "Hello World"));
		
		// true since s1 and s2 is the reference of the same object
		System.out.println("s1 and s2: " + (s1 == s2));
		
		// false since s3 is refered to another new object
		System.out.println("s1 and s3: " + (s1 == s3));
		
		// compare using 'equals'
		System.out.println("Compared by 'equals':");
		System.out.println("s1 and \"Hello World\":" + s1.equals("Hello World"));
		
		System.out.println("s1 and s2: " + s1.equals(s2));
		System.out.println("s1 and s3: " + s1.equals(s3));
		
		// compare using 'compareTo'
		System.out.println("Compared by 'compareTo'");
		
		System.out.println("s1 and \"Hello World\": " + (s1.compareTo("Hello World") == 0));
		System.out.println("s1 and s2: " + (s1.compareTo(s2) == 0));
		System.out.println("s1 and s3: " + (s1.compareTo(s3) == 0));
		
		
		
		
		
		

	}

}
