package arraypractice;

/**
 * = Array =
 * 
 *  - certain size :
 *   - Once you create the length of the array, you can not change the size of array.
 *   
 *  - For example :
 *  
 *   - you write a program to store the customer orders
 *   - and you store all the items ordered by a customer in an array "order" of objects of a class called "OrderItem".
 *   - and store the number of items in the "numberOfItems"   
 *   
 *     -> OrderItem[] order = new OrderItem[numberOfItems];
 *   
 *   - But if customer what to enter items that is exceed the numberOfItems.
 *   - There is no way to actually increase the size of the array.
 *   - However, we can simulate increasing the size of the array.
 *   
 *   -> - we can create a new and larger array, 
 *      - then copy the elements from the original array to the new array.
 *      - and then rename the new array as order(old array's name).
 *      
 *      -> code below :
 */

public class ArrayDemo {
	
	
	OrderItem[] order = new OrderItem [numberOfItems];
	
	/**
	 * Doubling the size of an array.
	 */
	OrderItem[] largerArray = new OrderItem[2*numberOfItems];
	
	for (int index = 0 ; index < numberOfItems ; index++) {
		largerArray [index] = order [index];		
	}
	order = largerArray;

}
