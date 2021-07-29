package day3;

import java.util.Scanner;

public class A4Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
	      System.out.print("Enter the Number: ");
		int i,fact=1;
		int number = sc.nextInt(); 
		   
		  for(i=1;i<=number;i++){    
		      fact=fact*i;    
		  }    
		  System.out.println("Factorial of "+number+" is: "+fact);    
		   
	}

}
