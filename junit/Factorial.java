package July21;
//Factorial Program in Java

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n; 
		 Scanner input =new Scanner(System.in); 
        System.out.print("Enter the Number : ");
        n =input.nextInt();
      
        System.out.print("The Factorial of the Number = : "+fact(n));
	}
 public static int fact(int a){
	  int num =1;
     for(int i=1;i<=a;i++)
     {
     	num=num*i;
     }
     return num;
 }
}
