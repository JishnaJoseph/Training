package day3;

import java.util.Scanner;

public class A40HollowRightTriangleStarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	      System.out.print("Enter the Number: ");
		int number=sc.nextInt();
		for(int i=0;i<number;i++)
		{
			System.out.print("*");
			for(int j=0;j<i;j++)
			{
				if(i==number-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			if(i>0)
				System.out.print("*");
			System.out.print("\n");
		}
	}
}
