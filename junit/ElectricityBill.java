package July21;

import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	      System.out.print("Enter the units: ");
		
		int units=  sc.nextInt(); ;
		 bill(units);
	}
	
		public static int bill(int units){
		int billpay=0;
	 
	        	if(units<100)
		 {
		      billpay=units*2;
		  }
		else if(units<300)
		 {
		   billpay=100*2+(units-100)*2;
		 }
		else if(units>300)
		{
		    billpay=100*2+200*2+(units-300)*3;
		}
	       
		System.out.println("Bill to pay : " + billpay); 
		return billpay;
	}

}
