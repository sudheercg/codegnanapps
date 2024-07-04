package arraylistexamples;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {

		Stack<String> stack = new Stack<>();
		
		//push the elements to Stack using push()
		stack.push("Apple"); // bottom
		stack.push("Banana");
		stack.push("Cherry");// top 
		
		System.out.println(stack);
		
		//peek at top element
		System.out.println("Peeking the stack: "+stack.peek());
		
		//pop element from the stack
		String poppedElement= stack.pop();
		System.out.println("Popped element: "+ poppedElement);
		
		//To check if stack is empty
		System.out.println("Is Empty ? : "+ stack.empty());
		
		System.out.println("Current stack: "+stack);
		
		//search for an element 
		int position = stack.search("Banana");
		System.out.println("Position of Banana: "+ position);
		
		
		
		
		
	}

}
