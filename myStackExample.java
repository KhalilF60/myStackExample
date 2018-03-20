
/**
 * @author khalilfrazier
 *March 20,2018
 *CSC 235
 *This program is an Example of how to implement a Stack in Java
 */
import java.util.Stack; //import the Stack Class
public class myStackExample { //class name

	public static void main(String[]args) { //main method
		
		Stack names = new Stack<String>(); //Create a new Stack called "names"
		
		names.push("Sam"); // add the first name to the top of the Stack
		names.push("Jim"); // add the second name to the top of the Stack
		names.push("Jill"); // add the third name to the top of the Stack
		names.push("Mary"); // add the fourth name to the top of the Stack
	
		System.out.println(names.peek()); //This will print what is currently on the top of the stack
		System.out.println(names); //Print the stack
		
		names.pop(); //remove the last item from the stack
		
		System.out.println(names); //Print the stack
		
		names.search(Sam); //search for Sam in the Stack
	}
}
