/*
 * Write a program to perform the following operations using Java.
1. Read the count of elements from user to create the stack using array.
2. Create the class and functions for the following and call them using a menu based program.
a. Display the stack
b. Push the data on the stack
c. Pop the data from the stack
d. Check how many elements are there on the stack.
e. Check to see if the stack is full?
f. Check to see if stack is empty.
 */

package core;

import java.util.EmptyStackException;

public class Stack<T> {
	private T[] arr;
	private int top;
	private int size;
	
	public Stack(int size,T[] arr) {
		this.arr = arr;
		this.top=-1;
		this.size=size;
	}
	public boolean isEmpty() {
		return top==-1;
	}
	public boolean isFull() {
		return top==size-1;
	}
	public void push(T ele) {
		if(isFull()) {
			throw new RuntimeException("Stack overflow!!!");
		}
		arr[++top]=ele;
	}
	public T pop() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		return arr[top--];
	}
	public T peek() {
		return arr[top];
	}

    public int totalElementInStack() {
    	if(isEmpty()) {
    		return 0;
    	}
    	return top;
    }
    public void displayStack() {
    	if(isEmpty()) {
    		throw new EmptyStackException();
    	}
    	for(int i=0;i<=top;i++) {
    		System.out.print(arr[i]+" ");
    	}
    	System.out.println();
    }
}
