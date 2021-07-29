package July21;

import java.util.Scanner;

public class CompoundInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int principle , rate ,time ;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter amount");
		principle=sc.nextInt();
		System.out.println("enter the rate of interest");
		rate=sc.nextInt();
		System.out.println("enter  number of years");
		time=sc.nextInt();
		interest(principle,rate,time);
	}
	
		
		public static int interest(int principle, int rate, int time){
        int CI = (int) (principle * (Math.pow((1 + rate / 100), time)));
          
        System.out.println("Compound Interest is "+ CI);
        return CI;
	}

}
