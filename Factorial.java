package week1.day1.assignments;

public class Factorial {
	
	/*
	 * Goal: Find the Factorial of a given number
	 * 
	 * input: 5
	 * output: 5*4*3*2*1 = 120
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a 'for' loop: type 'for', followed by ctrl + space + down arrow + enter
	 *   
	 * What are my learnings from this code?
	 * 1) factorial of 5 is 5*4*3*2*1=120
	 * 2) declared the num as 5 and fact as 1   
	 * 3) Iterated from 1 to 5 using for loop 
	 * 4) multiplied the fact with iterator variable and loop continues until i value is 5 then comes out of the loop
	 * 5) print the fact 
	 */	

	public static void main(String[] args) {
		int fact=1;
		int num=5;
		for (int i=1;i<=num;i++)
		{
			fact = fact*i;
		}
		System.out.println("factorial of 5 is "+fact);
	}

}
