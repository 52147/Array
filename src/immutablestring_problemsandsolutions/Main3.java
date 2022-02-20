package immutablestring_problemsandsolutions;
/**
 * = Solutions =
 * 
 * 2. - if you have to concatenate strings often,
 *      it will be better to use some other data structures like StringBuilder.
 *    - The below code runs in O(n) complexity.
 * 
 *
 */
public class Main3 {

	public static void main(String[] args) {
		int n = 10000;
		
		StringBuilder str = new StringBuilder();
		
		for(int i = 0; i < n; i++) {
			str.append("hello");
		}
		
		String s = str.toString();
		
		System.out.println(s);

	}

}
