package day3;

import java.util.Scanner;

public class calculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
	      System.out.print("Input weight in kilogram: ");
	      double weight = sc.nextDouble();
	      System.out.print("\nInput height in meters: ");
	      double height = sc.nextDouble();
	      double BMI = weight / (height * height);
	    
	      System.out.println("\nThe Body Mass Index (BMI) is " + BMI + " kg/m2");
	      if(BMI < 18.5)
	      {
	    	  System.out.println("you are underweight");
	      }
	       else if(BMI < 25)
	       {
		    	  System.out.println("you are normal");
		      }
	       else if(BMI < 30)
	       {
		    	  System.out.println("you are overweight");
		      }
	       else
	       {
		    	  System.out.println("you are Obese");
		      }
	    	 
		
		
	}

}
