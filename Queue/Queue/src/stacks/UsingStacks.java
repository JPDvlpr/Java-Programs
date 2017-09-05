package stacks;

import java.util.Stack;

public class UsingStacks
{

	public static void main(String[] args)
	{
		//push add
		//pop remove (display)
		//peek (display)
		//create a general stack
		Stack<String> wordStack = new Stack<>();
		
		//add a few elements
		wordStack.push("incoherent");
		wordStack.push("ameliorate");
		System.out.println(wordStack.peek());
		System.out.println(wordStack.pop());
		wordStack.push("indubitably");
		System.out.println(wordStack.peek());
		wordStack.push("inconcievable");
		System.out.println(wordStack.pop());
		System.out.println(wordStack.pop());
		wordStack.push("Mississippi");
		
		//Output
		//ameliorate
		//ameliorate
		//indubitably
		//inconcievable
		//indubitably
		
		//Stack
		//Mississippi
		//incoherent
		
//		//remove items using pop()
//		while(!wordStack.isEmpty())
//		{
//			System.out.println(wordStack.pop());
//			//wordStack.elementAt(index)
//		}
	}

}
