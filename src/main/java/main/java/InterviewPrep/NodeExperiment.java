package main.java.InterviewPrep;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class NodeExperiment {

	public static void main(String[] args) {
		        
		        // Create a Queue of Integers using LinkedList
		Queue<Integer> queue = new LinkedList<>();
		        
		        // Displaying the Queue
		System.out.println("Queue elements: " + queue);
		queue.add(1990);
		queue.add(1997);
		queue.add(1985);
		queue.add(1995);
		queue.add(1996);
		queue.add(2002);
		queue.add(1991);
		queue.add(1995);
		queue.add(1990);
		queue.add(1992);
		System.out.println("Queue elements: " + queue);
		
		Integer r = queue.remove();

		System.out.println("Got: " + r + ", Remaining: " + queue);

		r = queue.remove();
		System.out.println("Got: " + r + ", Remaining: " + queue);
		
		r = queue.remove();
		System.out.println("Got: " + r + ", Remaining: " + queue);
		r = queue.remove();
		System.out.println("Got: " + r + ", Remaining: " + queue);
		r = queue.remove();
		System.out.println("Got: " + r + ", Remaining: " + queue);
		
		Stack<String> stack = new Stack<>();
		
		System.out.println("Stack elements: " + stack);
		stack.push("1990");
		stack.push("1997");
		stack.push("1985");
		stack.push("1995");
		stack.push("1996");
		stack.push("2002");
		stack.push("1991");
		stack.push("1995");
		stack.push("1990");
		stack.push("1992");
		System.out.println("Stack elements: " + stack);
		
		String s = stack.pop();
		System.out.println("Got: " + s + ", Remaining: " + stack);
		s = stack.pop();
		System.out.println("Got: " + s + ", Remaining: " + stack);
		s = stack.pop();
		System.out.println("Got: " + s + ", Remaining: " + stack);
		s = stack.pop();
		System.out.println("Got: " + s + ", Remaining: " + stack);
		s = stack.pop();
		System.out.println("Got: " + s + ", Remaining: " + stack);
		s = stack.pop();
		System.out.println("Got: " + s + ", Remaining: " + stack);
		s = stack.pop();
		System.out.println("Got: " + s + ", Remaining: " + stack);
	}

}
