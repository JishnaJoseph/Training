package day3;

import java.util.Scanner;

public class A38Star8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
	      System.out.print("Enter the Number: ");
		int n=sc.nextInt();
		
		for(int i=1;i<n;i++)
		{
			System.out.print("*");
		}
		for(int i=1;i<n;i++)
		{
		System.out.print("*");
			for(int j=1;j<n-1;j++)
			{
			System.out.print(" ");	
			}
		if(i>1)
				System.out.print("*");
				System.out.print("\n");	
		}	
		for(int i=1;i<n;i++)
		{
		System.out.print("*");
		}
		for(int i=1;i<n;i++)
		{
			System.out.print("*");
			for(int j=1;j<n-1;j++)
			{
				System.out.print(" ");
			}

		if(i>1)
			System.out.print("*");
			System.out.print("\n");
		}
		for(int i=1;i<=n;i++)
		{
		System.out.print("*");
		}
		}
}
