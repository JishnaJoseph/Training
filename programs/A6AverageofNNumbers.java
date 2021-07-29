package day3;

import java.util.Scanner;

public class A6AverageofNNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   int n,num,sum=0, i; 
	        
	         Scanner input =new Scanner(System.in); 
	         System.out.print("Enter How Many Numbers : "); 
	         n =input.nextInt(); 
	         System.out.print("Enter the Numbers :"); 
	         for(i=1;i<=n; i++) 
	             { 
	                  num=input.nextInt();  
	                  sum += num; 
	             } 
	          double average=(double)sum/n; 
	          System.out.println("Average of " + n + " Numbers = " + average); 
	}

}
