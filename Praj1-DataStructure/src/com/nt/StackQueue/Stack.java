package com.nt.StackQueue;

public class Stack {
	int size;
	int arr[];
	int top;

	public Stack(int size) {
		this.size = size;
		this.arr = new int[size];
		this.top = -1;
	}

	public void push(int element) {
		if (this.isFull()) {
			System.out.println("Stack is full !");
		} else {
			top++;
			arr[top] = element;
			System.out.println("Pushed element:" + element);

		}
	}

	public int pop() {
		if (this.isEmpty()) {
			System.out.println("Stack is empty !");
			return -1;
		} else {
			int returnedTop = top;
			top--;
			System.out.println("Popped element :" + arr[returnedTop]);
			return arr[returnedTop];
		}
	}

	public int peek() {
		if (this.isEmpty()) {
			System.out.println("Stack is Empty");
			return -1;
		} else {
			return arr[top];
		}
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean isFull() {
		return (size - 1 == top);
	}

	public static void main(String[] args) {
		Stack s = new Stack(10);
		s.pop();
		System.out.println("=================");

		for (int i = 1; i <= 10; i++) {
			s.push(i);
		}
		System.out.println("=================");
		s.pop();
		s.pop();
		s.pop();
		System.out.println("=================");
		System.out.println("Top Element: " + s.peek());
	}
}