package Week2;

import java.util.Scanner;

//Right Arrow Star Pattern
public class PatternProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	      System.out.print("Enter the Number: ");
		int num=sc.nextInt();
		for(int i=0;i<num;i++)
		{
			for(int k=0;k<i;k++)
			{
				System.out.print("  ");
			}
			
			for(int j=i;j<num;j++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
			for(int i=1;i<num;i++)
			{
				for(int k=i;k<num-1;k++)
				{
					System.out.print("  ");
				}
				for(int j=0;j<=i;j++)
				{
					System.out.print("*");
				}
				
				System.out.print("\n");
			}
	}

}
