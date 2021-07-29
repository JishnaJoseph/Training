package day3;

import java.util.Scanner;

public class A5ElectricityBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	      System.out.print("Enter the units: ");
		
		int units=  sc.nextInt(); ;
		 
		double billpay=0;
	 
	        	if(units<100)
		 {
		      billpay=units*1.20;
		  }
		else if(units<300)
		 {
		   billpay=100*1.20+(units-100)*2;
		 }
		else if(units>300)
		{
		    billpay=100*1.20+200*2+(units-300)*3;
		}
	       
		System.out.println("Bill to pay : " + billpay); 
	}

}
