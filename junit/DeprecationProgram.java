package July21;

import java.util.Scanner;

public class DeprecationProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int amount,deppercent,year,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter amount");
		amount=sc.nextInt();
		System.out.println("enter Depreciation percentage");
		deppercent=sc.nextInt();
		System.out.println("enter  number of years");
		year=sc.nextInt();
		dep(amount,year,deppercent);
	}
		
		public static int dep(int amount, int year, int depprecent){
		int temp=amount;
		for(int i=0;i<year;i++)
		{
			temp=((100-depprecent)*temp)/100;
		}
		System.out.println("after depreciation = "+temp);
		return temp;
	}

}
