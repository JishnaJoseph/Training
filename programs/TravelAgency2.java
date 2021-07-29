package day6;

import java.util.Scanner;

public class TravelAgency2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name :");
		String name = sc.next();
		System.out.println("Enter the source of travel :");
		String src = sc.next();
		System.out.println("Enter you destination(Delhi,Bangalore,Chennai) :");
		String dest = sc.next();
		
		System.out.println("Enter Mode of travel (Airways, Railways, Bus): ");
		String mode = sc.next();
		System.out.println("Enter the no of passengers : ");
		int nop = sc.nextInt();
		System.out.println("Enter the no of days : ");
		int nod = sc.nextInt();
		
		TravelAgency1 obj1 = new TravelAgency1();
		obj1.travelDetails(name, src, dest, mode, nop, nod);
		obj1.travelExpense(mode, nop, nod);
		obj1.travelslipdisplay();

		
	}

}
