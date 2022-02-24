package twopointertechnique_1;
/**
 * = Two - pointer technique - Scenario I =
 * 
 * - In the previous chapter, we solve some problems by iterating the array.
 * - Typically, we only use one pointer starting from the first element and ending at the last one to do iteration.
 * - However, sometimes, we might need to use two pointers at the same time to do the iteration.
 * 
 * = An example =
 * 
 * - Let's start with a classic problem:
 *  
 *   Reverse the elements in an array.
 *   
 *   - The idea is to swap the first element with the end, advance to the next element and swapping repeatedly until it reached the middle position.
 *   
 *   - We can use two pointers at the same time to do the iteration:
 *     
 *     - one starts from the first element and another from the last element.
 *     - Continue swapping the elements until the two pointers meet each other.
 *     
 * 
 * = Summary =
 * 
 * - To summarize, one of the typical scenarios to use two-pointer technique is that you want to
 *    
 *     Iterate the array from two ends to the middle.
 *     
 *   - So you can us the two-pointer technique:
 *   
 *     One pointer starts from the beginning while the other pointer starts from the end.
 *     
 *   - And it is worth nothing that this technique is often used in a sorted array.  
 *   
 *
 */ 

public class TwoPointerTechniqueScenarioI {
	
	public static void reverse(int[] v, int N) {
		int i = 0;
		int j = N - 1;
		
		while(i < j) {
			swap(v, i, j); // this is a self-defined function
			i++;
			j--;
		}
	}

	private static void swap(int[] v, int i, int j) {
		// TODO Auto-generated method stub
		
	}

}
