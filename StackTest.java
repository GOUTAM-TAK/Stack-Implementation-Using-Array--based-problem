package tester;

import java.util.Scanner;

import core.Stack;

public class StackTest {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
		boolean exit=false;
		System.out.println("enter number of elements to store in stack : ");
		int size = sc.nextInt();
		
		Double[] arr = new Double[size]; 
		Stack<Double>stack = new Stack<Double>(size,arr);
		while(!exit) {
			System.out.println("Select option : \n"
					+ "1) Display the stack\r\n"
					+ "2) Push the data on the stack\r\n"
					+ "3) Pop the data from the stack\r\n"
					+ "4) Check how many elements are there on the stack.\r\n"
					+ "5) Check to see if the stack is full?\r\n"
					+ "6) Check to see if stack is empty\n"
					+ "0)Exit");
			try {
				switch(sc.nextInt()) {
				case 1:stack.displayStack();
					break;
				case 2:System.out.println("enter element to push into stack");
					stack.push(sc.nextDouble());
					break;
				case 3:System.out.println("pop element is : "+stack.pop());
					break;
				case 4:System.out.println("total elements in stack : "+stack.totalElementInStack());
					break;
				case 5:System.out.println("Is stack full : "+stack.isFull());
					break;
				case 6:System.out.println("Is stack empty : "+stack.isEmpty());
					break;
				case 0:
					break;
				}
				
			}catch(Exception e) {
				e.printStackTrace();
				sc.nextLine();
			}
		}
		}

	}

}
