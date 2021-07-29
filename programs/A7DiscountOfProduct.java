package day3;

import java.util.Scanner;

public class A7DiscountOfProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double  dis,amount,markedprice,s;
		Scanner markedprice1 =new Scanner(System.in); 
        System.out.print("Enter the marked Price : ");
		markedprice=markedprice1.nextInt();
	 
	        		
	
		System.out.println("markedprice= "+markedprice);
		 System.out.print("Enter the discount : ");
		 dis=markedprice1.nextInt();
		System.out.println("discount rate="+dis);
	         
	        s=100-dis;
	 
		amount= s*markedprice/100;
	 
		System.out.println("amount after discount="+amount);
	 
	}

}
