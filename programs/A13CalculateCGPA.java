package day3;

import java.util.Scanner;

public class A13CalculateCGPA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n,num,sum=0, i; 
		 Scanner input =new Scanner(System.in); 
         System.out.print("Enter How Many Subjects : ");
         n =input.nextInt();  
         System.out.print("Enter the  Grade points:"); 
         for(i=1;i<=n; i++) 
         { 
              num=input.nextInt(); 
              sum += num; 
         } 
      double cgpa=(double)sum/n; 
      System.out.println("the CGPA is " + cgpa); 

		
	}

}
