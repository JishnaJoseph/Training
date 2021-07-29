package day5;

public class SampleClass {

	public static void main(String[] args) {
		MathOperations obj = new MathOperations();
		
		System.out.println("Instance variable in class MathOperation " + obj.a);
		System.out.println("Instance variable in class MathOperation " + obj.b);
		
		int addition = obj.addition(10, 20);
		System.out.println("Sum of two numbers : " + addition);
		
		int subtraction = obj.subtraction(20, 10);
		System.out.println("Difference of two numbers : " + subtraction);
		
		int multiplication = obj.multiplication(10, 20);
		System.out.println("Multiplication of two numbers : " + multiplication);
		
		int division = obj.division(20, 10);
		System.out.println("Division of two numbers : " + division);
		
		int remainder = obj.remainder(18, 10);
		System.out.println("Remainder of two numbers : " + remainder);
	}

}

class MathOperations {
	int a = 10, b = 20;

	public int addition(int n1, int n2) {
		int sum = n1 + n2;
		return sum;
	}

	public int subtraction(int n1, int n2) {
		int dif = n1 - n2;
		return dif;
	}

	public int multiplication(int n1, int n2) {
		int mul = n1 * n2;
		return mul;
	}

	public int division(int n1, int n2) {
		int div = n1 / n2;
		return div;
	}

	public int remainder(int n1, int n2) {
		int rem = n1 % n2;
		return rem;
	}

}
