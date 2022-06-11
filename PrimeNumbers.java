package week1.day1.assignments;

public class PrimeNumbers {
	/*
	 * Goal: To find whether a number is a Prime number or not
	 * 
	 * input: 13
	 * output: 13 is a Prime Number
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a 'for' loop: type 'for', followed by ctrl + space + down arrow + enter
	 * 3) To create an 'if' condition: type 'if', followed by ctrl + space +down arrow + enter
	 *   
	 * What are my learnings from this code?
	 * 1) prime number is basically a number which can be divisible by itself ,so when prime numbers
	 *  divided by 2 we get remainder not equal to 0 
	 * 2) flag is use to let that certain condition has met ,when break statement is given comes out of the loop
	 * 3) default value of boolean is false ,in print statement for appending purpose we give num+ along with rest of statement  
	 */

	public static void main(String[] args) {
		int num=13;
		boolean flag=false;
			for(int i=2;i<=num/2;i++){      
			    if(num%i==0){      
			     System.out.println(num+" is not prime number");      
			     flag=true;      
			     break;  
			    }
		}
			if(flag==false) 
			{ 
				System.out.println(num+" is prime number");
			}  
	}
	}

	
	

	


