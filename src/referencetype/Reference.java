package referencetype;
/**
 * = reference types =
 * 
 * - All types that are not one of the eight primitive types are reference types,
 *   including entities such as string, arrays, and file stream.
 *   
 * 2.1 what is a reference?
 * 
 * - A reference variable in Java is a variable that somehow stores the memory address where an object resides.
 * 
 * - As an example, in figure 2.1 are two objects of type Point.
 * - It happens, by chance, that these objects are stored in memory locations 1000 and 1024, respectively.
 * 
 * - For these two objects, there are three references: point1, point2, and point3.
 * 
 * - point1 and point3 both reference the object stored at memory loacation 1000;
 *   point2 references the object stored at memory location 1024.
 * - Both point1 and point3 store the value 1000,
 *   while point2 stores the value 1024.
 *   
 * - Note that the actual locations, such as 1000 and 1024, are assigned by the runtime system as its discretion
 *   (when it finds available memory).
 * - Thus these values are not useful externally as numbers.
 * - However, the fact that point1 and point3 store identical values is useful:
 *   It means they are referencing the same object.
 * 
 * - A reference will always store the memory address where some object is residing,
 *   unless it is not currently referencing any object.
 * - In this case, it will store the null reference, null.
 * - Java does not allow references to primitive variables.
 * 
 * - There are 2 broad categories of operations that can be applied to reference variables.
 * 
 *   - 1. One allows us to examine or manipulate the reference value.
 *     
 *      - For instance, if we change the stored value of point1(which is 1000),
 *        we can have it reference another object.
 *      - We can also compare point1 and point3 and determine if they are referencing the same object.
 *   
 *   - 2. The other category of operation applies to the object being referenced;
 *        perhaps we could examine or change the internal state of one of the Point objects.
 *        
 *        -For instance, we could examine some of Point's x and y coordinates.
 *      
 * - Before we describe what can be done with references,
 *   let us see what is not allowed.
 *   - Consider the expression point1*point2.
 *   - Since the stored values of point1 and point2 are 1000 and 1024, respectively,
 *     their product would be 1024000.
 * 
 * - However, this is a meaning less calculation that could not have any possible use.
 * - Reference variables store address, and there is no logical meaning that can be associated with multiplying two address.
 * 
 * 1000  (0, 0)
 * 1024  (5, 12)
 * 3200  point2 = 1024
 * 3600  point1 = 1000
 * 5124  point3 = 1000
 * 
 * point1 ->  (0, 0) at 1000
 * point3 ->
 * 
 * point2 ->  (5, 12) at 1024
 * 
 * figure 2.1
 * - An illustration of a reference.
 * - The Point object stored at memory location 1000
 *   is referenced by both point1 and point3.
 * - The Point object stored at memory location 1024 is referenced by point2.
 * - The memory locations where the variables are stored are arbitrary.
 *
 * - Similarly, point1++ has no Java meaning; it suggests that point1 1000 should be increased to 1001,
 *   but in that case it might not be referencing a valid Point object.
 *   
 * - Many languages (e.g., C++) define the pointer, which behaves like a reference variable.
 * - However, pointers in C++ are much more dangerous because arithmetic on stored address is allowed.
 * - Thus, in C++, point1++ has a meaning.
 * - Because C++ allows pointers to primitive types, one must be careful to distinguish between arithmetic on address and arithmetic on the objects being referenced.
 * - This is done by explicitly dereferencing the pointer.
 * - In practice, C++'s unsafe pointers tend to cause numerous programming errors.
 *
 * - Some operations are performed on references themselves,
 *   while other operations are performed on the objects being referenced.
 *   - In Java, the only operators that are allowed for reference types
 *     (which one exception made for Strings) 
 *     are assignment via = and equality comparison via == or !=.
 * 
 * - Figure 2.2 illustrates the assignment operator for reference variables.
 * - By assigning point3 was referencing.
 * - Now, point2 == point3 is true because point2 and point3 both store 1024
 *   and thus reference the same object.
 * - point1!=point2 is also true because point1 and point2 reference different objects.
 * 
 * - The other category of operations deals with the object that is being referenced.
 * - There are only three basic actions that can be done:
 *   - 1. Apply a type conversion
 *   - 2. Access an internal field or call a method via the dot operator(.)
 *   - 3. Use the instanceof operator to verify that the stored object is of a certain type.
 * 
 * 2.2 basics of objects and references
 * 
 * - In Java, an object is an instance of any of the nonprimitive types.
 * - Objects are treated differently from primitive types.
 * - Primitive types, are handled by value, meaning that the values assumed by the primitive variables
 *   are stored in those variables and copied from primitive variable to primitive variable during assignments.
 * 
 * - reference variables store reference to objects.
 * - The actual object is stored somewhere in memory,
 *   and the reference variable stores the object's memory address.
 * - Thus a reference variable simply represents a name for that part of memory.
 * - This means that primitive variables and reference variables behave differently.
 * - This section examines these differences in more detail and illustrates the operations 
 *   that are allowed for reference variables.  
 *   
 *   
 *  
 *
 *   
 *   
 * figure 2.2
 * - The result of point3 = point2
 * - point3 now references the same object as point2
 * 
 * 1000  (0, 0)
 * 1024  (5, 12)
 * 3200  point2 = 1024
 * 3600  point1 = 1000
 * 5124  point3 = 1024
 * 
 * point1 ->  (0, 0) at 1000
 * 
 * 
 * point2 ->  (5, 12) at 1024
 * point3 ->
 * 
 * 
 * 
 * = Strings =
 *  
 *  - Strings in Java are handled with the String reference type.
 *  - The language does make it appear that the String type is a primitive type 
 *    because it provides the + and += operators for concatenation.
 *    
 *  - However, this is the only reference type for which any operator overloading is allowed.
 *  - Otherwise, the String behaves like any other reference type.
 *  
 *  
 * = Arrays =
 * 
 *  - An aggregate is a collection of entities stored in one unit.
 *  - An array is the basic mechanism for storing a collection of identically typed entities.
 *  - In Java the array is not a primitive type.
 *  - Instead, it behaves very much like an object.
 *  - Thus many of the rules for objects also apply to arrays.
 *  
 *  - Each entity in the array can be accessed via the array indexing operator[].
 *  - We say that the [] operator indexes the array, 
 *    meaning that it specifies which object is to be accessed.
 *  - Unlike C and C++, bounds- checking is performed automatically.
 *  
 *  
 *  - In Java, arrays are always indexed starting at zero.
 *  - Thus an array a of three items store a[0], a[1], a[2].
 *  - The number of items that can be stored in an array a can always be obtained by a.length.
 *  - Note that there are no parentheses.
 *  - A typical array loop would use
 *  
 *     for(int i = 0; i<a.length ;i++)
 * 
 *  
 */

public class Reference {

}
