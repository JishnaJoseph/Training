package week1;

public class A5RootsofQuadraticEqu {
	
		   public static void main(String args[]){
		      double secondRoot = 0, firstRoot = 0;
		      double a = 15;
		      double b = 68;
		      double c = 3;
		      double determinant = (b*b)-(4*a*c);
		      double sqrt = Math.sqrt(determinant);
		      if(determinant>0)
		      {
		         firstRoot = (-b + sqrt)/(2*a);
		         secondRoot = (-b - sqrt)/(2*a);
		         System.out.println("Roots are :: "+ firstRoot +" and "+secondRoot);
		      }
		      else if(determinant == 0)
		      {
		         System.out.println("Root is :: "+(-b + sqrt)/(2*a));
		      }
		   }
		
}
