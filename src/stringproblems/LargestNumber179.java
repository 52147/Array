package stringproblems;

import java.util.Arrays;
import java.util.Comparator;

// Custom Comparator
public class LargestNumber179 {
	
	private class LargerNumberComparator implements Comparator<String>{
		
		@Override
		public int compare(String a, String b) {
			String order1 = a + b;
			String order2 = b + a;
			return order2.compareTo(order1);
		}
	}
	
	
	public String largestNumber(int[] nums) {
		
		// Get input integers as strings.
		String[] str = new String[nums.length];
		
		for(int i = 0; i < nums.length; i++) {
			
			str[i] = String.valueOf(nums[i]);
			}
			
			// Sort strings according to custom comparator
			Arrays.sort(str, new LargerNumberComparator());
			
			// If, after being sorted, the largest number is '0', the entire number is zero.
			if(str[0].equals("0")) {
				return "0";
			}
			
			// Build largest number from sorted array.
			String largestNumberStr = new String();
			
			for(String numstr : str) {
				largestNumberStr += numstr;
			}
			
			return largestNumberStr;
		}
	}
	
	


