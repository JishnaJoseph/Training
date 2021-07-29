package day5;

import java.util.Scanner;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input =new Scanner(System.in); 
		 System.out.print("Enter numbers : ");
		int a = input.nextInt(); 
		int b = input.nextInt(); 
		int c= input.nextInt();
		int sum = addition(a, b);
		System.out.println("sum of two numbers is " + sum);
		sum = addition(a,b,c);
		System.out.println("sum of three numbers is " + sum);
		double add =addition(10.0,20.0);
		System.out.println("sum of two numbers is " + add);
	}

	/** returns the minimum of two numbers */
	public static int addition(int n1, int n2) {
		int sum = n1 + n2;
		return sum;
	}
	public static int addition(int n1, int n2,int n3) {
		int sum = n1 + n2+ n3;
		return sum;
	}
	public static double addition(double n1, double n2) {
		double sum = n1 + n2;
		return sum;
	}
	

}
