package Week2;
//Java Program to Print Odd and Even Numbers from an array
import java.util.Scanner;

public class ArrayProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input =new Scanner(System.in); 
	        System.out.print("Enter the Number of Elements in Array : ");
	        int n =input.nextInt();
	        int[] array = new int[n];  
	        System.out.println("Enter the elements of the array: ");  
	        for(int i=0; i<n; i++)  
	        {  
	        array[i]=input.nextInt();  
	        }  
	        System.out.println("Even Numbers are : ");
	        for(int i=0;i<array.length;i++)
	        {
	        	if(array[i]%2==0)
	        	{
	        		
	        		System.out.println(array[i]);

	        	}
	        }
	        System.out.println("Odd Numbers are : ");
	        for(int i=0;i<array.length;i++)
	        {
	        	if(array[i]%2!=0)
	        	{	
	        		System.out.println(array[i]);

	        	}
	        }
	        
	}

}
