package week1.day1.assignments;

public class FibonacciSeries {

	public static void main(String[] args) {
		/*
		 * Goal: To find Fibonacci Series for a given range
		 * 
		 * input(range): 8 output: 0, 1, 1, 2, 3, 5, 8, 13
		 * 
		 * Shortcuts: 1) Print : type: syso, followed by: ctrl + space + enter 2) To
		 * create a 'for' loop: type 'for', followed by ctrl + space + down arrow +
		 * enter
		 * 
		 * What are my learnings from this code?
		 *  1) fibonacci series is basically each number is equal to addition of preceding two numbers
		 *   here starts with 0 which is first range ,0+1 gives 1 which is second range, 
		 *   1+1 gives 2 which is third range and goes on.  
		 *  system.out.print give output in same line
		 *  2) initialized 3 variables range=8,firstNum=0, secondNum=1
		 *  3) Iterated from 1 to 8 using for loop , print firstNum
		 *  for syntax :  for(initialization,condition ,increment/decrement) doesn't have ; 
		 *  4) add firstNum and SecondNum then assign to sum , 
		 *  5)assig sum to SecondNum 
		 */
		
		int range=8;
		int firstNum= 0;
		int SecondNum= 1 ;
		
		for (int i=0;i<range;i++) {
			System.out.print(firstNum+" " ); 
			int sum = firstNum + SecondNum ; 
			firstNum=SecondNum; 
			SecondNum=sum; 	
			
		}
		
		
	}}
	


