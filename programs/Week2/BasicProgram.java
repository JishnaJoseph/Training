package Week2;
//Factorial Program in Java

import java.util.Scanner;

public class BasicProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n,num=1, i; 
		 Scanner input =new Scanner(System.in); 
        System.out.print("Enter the Number : ");
        n =input.nextInt();
        
        for(i=1;i<=n;i++)
        {
        	num=num*i;
        }
        System.out.print("The Factorial of the Number = : "+num);
	}

}
