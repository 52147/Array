package arraylistpractice;

/**
 * = ArrayList =
 * 
 *  - it can change the length while the program is running.
 *   - For example :
 *     the ArrayList can handle the customer extra orders without any problems
 *  
 *  - The 2 drawbacks when using ArrayList :
 *  
 *   - 1. Using an instance of ArrayList is less efficient than using an array.
 *   
 *        - Using ArrayList instead of an array will require more computer time.
 *        
 *   - 2. An instance of ArrayList can store only objects. 
 *   
 *       - it can not contain values of a primitive type, such as int, double, or char.
 *       - this problem can be addressed by storing Integer value in the ArrauList
 *       - Integer values is the wrapper class whose objects simulate int values.
 *       - automatic boxing and unboxing makes using a wrapper class convenient, 
 *         but using one does add to the time overhead of the program.
 *         
 * - Implementation of ArrayList :
 * 
 *  - The implementation of ArrayList uses arrays.
 *  - to expand the capacity of its underlying array, it uses the same technique we used to expand our array "order" before.
 *  
 * - The ADT list :
 * 
 *  - The ArrayList is an implementation of an ADT called a list.
 *  - you can add entries to the list (at the beginning, at the end, or between items), delete entries, look at entries, and count entries.
 * 
 * = creating an instance of ArrayList =
 * 
 *   - ArrayListy is in the package java.util
 *     - import java.util.ArrayList
 *     
 *   - ArrayList <String> list = new ArrayList<String>(); 
 *     - list is the name of an object
 *       that store the instance of class as String
 *       
 *     - The type String is the base type
 *       - An object of ArrayList stores objects of a base type
 *       - just the same as the array , but the difference between array
 *         is the base type of  ArrayList must be the class type
 *         
 *    - initial capacity of ArrayList :
 *      - give ArrayList initial capacity of 20
 *        -> ArrayList <String> list = new ArrayList<String>(20);
 *        - it means that ArrayList has been allocated memory for that many items,
 *          but if it needs to hold more items, the system will automatically allocate more memory.
 *          - if you omit the initial capacity, you will invoke ArrayList's default constructor,
 *            which assumes a capacity of ten.      
 *      
 *     
 *     
 * 
 *
 */


/**
 * Programming example of ArrayList - A To-Do List
 * 
 *  - using ArrayList to maintain a list of everyday tasks.
 *  - The user can enter as many tasks as desired, and then the program will display the list.
 *  
 *  
 *  = equalIgnoreCase() =
 *   - compare this string to another string, ignore case consideration.
 *   - if two strings are of the same length and corresponding characters
 *     -> two strings are considered equal ignoring case.
 *     
 *   - for example : 
 *     Stirng.equalIgnoreCase(another String)
 *     -> return true :
 *        if the argument is not null and it represents an equivalent String ignoring case 
 *       
 */
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		
		// Create an ArrayList object with String base type
		ArrayList<String> toDoList = new ArrayList<String>();
		System.out.println("Enter items for the list, when prompted.");
		
		boolean done = false;
		
		Scanner keyboard = new Scanner(System.in);
		
		while(!done) {
			System.out.println("Type an entry: ");
			String entry = keyboard.nextLine();
			
			toDoList.add(entry);
			
			System.out.println("More items for the list? ");
			String ans = keyboard.nextLine();
			
			if (!ans.equalsIgnoreCase("yes"))
				done = true;
			
		}
		
		
		System.out.println("The list contains:");
		int listSize = toDoList.size();
		for (int position = 0; position < listSize ; position++) {
			System.out.println(toDoList.get(position));
		}
		
		

	}

}
