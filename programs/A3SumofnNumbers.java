package day3;

import java.util.Scanner;

public class A3SumofnNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	      System.out.print("Enter the Number: ");
			
			int num = sc.nextInt(); 
			int sum = 0;  
			for(int i = 1; i <= num; ++i) 
			{
				sum = sum + i;
			}
			System.out.println(" " +sum);
	}

}
