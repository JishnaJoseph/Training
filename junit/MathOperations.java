package July21;

import java.util.Scanner;

public class MathOperations {
	public static void main(String[] args) {
	int num1, num2;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter numbers");
	num1=sc.nextInt();
	num2=sc.nextInt();
	
	addition(num1, num2);
	System.out.println("sum is "+addition(num1,num2));
	
	subtraction(num1,num2);
	System.out.println("subtraction is "+subtraction(num1,num2));

	multiplication(num1,num2);
	System.out.println("multiplication is "+multiplication(num1,num2));

	division(num1,num2);
	System.out.println("division is "+division(num1,num2));

	remainder(num1,num2);
	System.out.println("remainder is "+remainder(num1,num2));

	}
	public static int addition(int n1, int n2) {
		int sum = n1 + n2;
		return sum;
	}

	public static int subtraction(int n1, int n2) {
		int dif = n1 - n2;
		return dif;
	}

	public static int multiplication(int n1, int n2) {
		int mul = n1 * n2;
		return mul;
	}

	public static int division(int n1, int n2) {
		int div = n1 / n2;
		return div;
	}

	public static int remainder(int n1, int n2) {
		int rem = n1 % n2;
		return rem;
	}

}
