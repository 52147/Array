package immutablestring_problemsandsolutions;
/**
 * 
 * = Solutions =
 * 
 * - If you want your string to be mutable, there are some substitutions:
 * 
 * - 1. If you did want your string to be mutable, you can convert it to a char array.
 *
 */

public class Main2 {

	public static void main(String[] args) {
		
		String s = "Hello World";
		
		char[] str = s.toCharArray();
		
		str[5] = ',';
		
		System.out.println(str);

	}

}
