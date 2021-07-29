package Week2;

import java.util.Scanner;
//Java Program to Find Smallest of Three Numbers Using Ternary Operator

public class NumberProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input =new Scanner(System.in); 
	        System.out.print("Enter the Numbers : ");
	        int num1 =input.nextInt();
	        int num2 =input.nextInt();
	        int num3=input.nextInt();
	
	
	int res=num1<num2?num1:num2;
	int smallest=num3<res?num3:res;
	System.out.println("The Smallest number is " +smallest);
}
}