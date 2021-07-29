package day3;

import java.util.Scanner;

public class A48MirroredRightTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
	      System.out.print("Enter the Number: ");
		int n=sc.nextInt();
	
		for(int i=1;i<=n;i++)
        {
			for(int j=0;j<n-i;j++)
                {
                        System.out.print(" ");
                }

        for(int j=0;j<i;j++)
                {
                        System.out.print("*");
                }
              System.out.println();
			}  
	}}


