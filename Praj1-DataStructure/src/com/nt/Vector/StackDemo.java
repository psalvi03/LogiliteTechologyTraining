package com.nt.Vector;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<Object> s=new Stack<Object>();
		s.push("deepak");
		s.push(100);
		s.push("sanjeev");
		System.out.println(s);
		System.out.println(s.peek());
		s.pop();
		System.out.println(s.capacity());
		System.out.println(s.pop());
		for(int i=100;i<=110;i++) {
			s.push(i);
		}
		System.out.println("===========================");
		s.forEach(System.out::println);
	}
}
