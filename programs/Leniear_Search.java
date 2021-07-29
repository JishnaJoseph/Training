package july29;

import java.util.Scanner;

public class Leniear_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = {1, 2, 5, 8, 4, 3, 6, 7, 10, 12, 9};  
		    int item,flag=0;   
		    Scanner sc = new Scanner(System.in);  
		    System.out.println("Enter Item :");  
		    item = sc.nextInt();  
		    for(int i = 0; i<10; i++)  
		    {  
		        if(arr[i]==item)  
		        {  
		            flag = i+1;  
		            break;  
		        }  
		        else   
		            flag = 0;   
		    }  
		    if(flag != 0)  
		    {  
		        System.out.println("Item found at locationv " + flag);  
		    }  
		    else   
		        System.out.println("Item not found");  
		      
		}  
	

}
