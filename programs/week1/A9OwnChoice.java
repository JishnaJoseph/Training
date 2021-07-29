package week1;

public class A9OwnChoice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Fahrenheit to Celsius
		double f1=50.0;
		double c1=(f1-32)/1.8;
		System.out.println("50.0 Fahrenheit =  " +c1 +" Celsius");
		
		
		
		//Display Day Name
		int number=5;
		 switch(number)
		 {  
		 case 1:
			 System.out.println("Today is Sunday");  
			 break; 
		
		 case 2:
			 System.out.println("Today is Monday");  
			 break;
		
		 case 3:
			 System.out.println("Today is Tuesday");  
			 break;
			 
		 case 4:
			 System.out.println("Today is Wednesday");  
			 break;	 
			 
		 case 5:
			 System.out.println("Today is Thursday");  
			 break;	 
			 
		
		 case 6:
			 System.out.println("Today is Friday");  
			 break;
			 
		 case 7:
			 System.out.println("Today is Saturday");  
			 break;
			 
		 default:
			 System.out.println("Not a Valid Day");  
		 }
		
		 
		 
		//Arthemetic Progression sum of first n terms
		 int a3=1;
		 int d3=3;
		 int n3=5;
		 double sum=((double)n3/2)*((2*a3)+(n3-1)*d3);
		 System.out.println("Sum of first 5 terms = " +sum);  
		 
		 
		 //Smallest number in three numbers
		 int a4=12 ,b4=10,c4=15;
			if(a4<b4 && a4<c4)
			{
					System.out.println("a4 is Smallest");
				
			}
			else if(b4<c4)
			{
				System.out.println("b4 is Smallest");
			}
			else 
			{
				System.out.println("c4 is Smallest");
			}
				
				
			
			//smallest number using ternary
				int a5=12 ,b5=10,c5=15;
				int d5=a5<b5?a5:b5;
				int smallest=c5<d5?c5:d5;
				System.out.println("smallest number is " +smallest);
				
				
	
	}
}
