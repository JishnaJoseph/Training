package day3;

import java.util.Scanner;

public class A14CompoundInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double principle , rate ,time ;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter amount");
		principle=sc.nextDouble();
		System.out.println("enter the rate of interest");
		rate=sc.nextDouble();
		System.out.println("enter  number of years");
		time=sc.nextDouble();
        // Calculate compound interest 
        double CI = principle *
                    (Math.pow((1 + rate / 100), time));
          
        System.out.println("Compound Interest is "+ CI);
	}

}
