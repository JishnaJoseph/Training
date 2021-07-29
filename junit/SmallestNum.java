package July21;

import java.util.Scanner;
//Java Program to Find Smallest of Three Numbers Using Ternary Operator

public class SmallestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input =new Scanner(System.in); 
	        System.out.print("Enter the Numbers : ");
	        int num1 =input.nextInt();
	        int num2 =input.nextInt();
	        int num3=input.nextInt();
	        smallest(num1,num2,num3);
	
	}
	public static int smallest(int num1, int num2, int num3)
	{
	int res=num1<num2?num1:num2;
	int smallest=num3<res?num3:res;
	System.out.println("The Smallest number is " +smallest);

	return smallest;
	}
}