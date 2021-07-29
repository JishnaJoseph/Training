package Week2;

import java.util.Scanner;

// How to convert Decimal to Binary in Java
public class ConversionProgram {

	public static void main(String[] args) {
		 Scanner input =new Scanner(System.in); 
	     System.out.print("Enter the Number : ");
	     int num=input.nextInt();
		System.out.println("The Binary of the number is : "+Integer.toBinaryString(num));
	}

}
