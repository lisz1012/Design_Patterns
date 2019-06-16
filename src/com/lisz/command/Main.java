package com.lisz.command;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

	public static void main(String[] args) {
		Content content = new Content("Hello!");
		
		/*Command command = new AppendCommand(content);
		System.out.println(content);
		command.exec();
		System.out.println(content);
		command.undo();
		System.out.println(content);
		
		command = new CopyCommand(content);
		System.out.println(content);
		command.exec();
		System.out.println(content);
		command.undo();
		System.out.println(content);
		
		command = new DeleteCommand(content);
		System.out.println(content);
		command.exec();
		System.out.println(content);
		command.undo();
		System.out.println(content);*/
		
		System.out.println(content);
		
		Deque<Command> stack = new ArrayDeque<>();
		Command c1 = new AppendCommand(content);
		c1.exec();
		stack.push(c1);
		System.out.println(content);
		Command c2 = new CopyCommand(content);
		c2.exec();
		stack.push(c2);
		System.out.println(content);
		Command c3 = new DeleteCommand(content);
		c3.exec();
		stack.push(c3);
		System.out.println(content);
		
		while (!stack.isEmpty()) {
			stack.pop().undo();
			System.out.println(content);
		}
		
		/* print:
		    Hello!
			Hello!https://github.com/lisz1012
			Hello!https://github.com/lisz1012Hello!https://github.com/lisz1012
			llo!https://github.com/lisz1012Hello!https://github.com/lisz1012
			Hello!https://github.com/lisz1012Hello!https://github.com/lisz1012
			Hello!https://github.com/lisz1012
			Hello!
		 */
	}

}
