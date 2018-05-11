package com.lixu;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Test3 {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		queue.offer("one");
		queue.offer("two");
		queue.offer("three");
		queue.offer("four");
		queue.offer("five");
		queue.offer("six");
		System.out.println("------进队顺序------------");
		System.out.println("one two three four five six");
		System.out.println("------出队顺序------------");
		// ，poll删除并移动指针，peek()查询
		System.out.print("  " + queue.poll());
		System.out.print("  " + queue.poll());
		System.out.print("  " + queue.poll());
		System.out.print("  " + queue.poll());
		System.out.print("  " + queue.poll());
		System.out.print("  " + queue.poll());
		System.out.println();
		// 比较先进后出的Stack
		Stack<String> stack = new Stack<String>();
		// 进栈
		stack.push("one");
		stack.push("two");
		stack.push("three");
		stack.push("four");
		stack.push("five");
		stack.push("six");
		System.out.println("------进栈顺序------------");
		System.out.println("one two three four five six");
		System.out.println("------出栈顺序------------");
		// 出栈pop删除并移动指针，peek()只拿出最后进栈的值
		System.out.print("  " + stack.pop());
		System.out.print("  " + stack.pop());
		System.out.print("  " + stack.pop());
		System.out.print("  " + stack.pop());
		System.out.print("  " + stack.pop());
		System.out.print("  " + stack.pop());

	}

}
