package week1;

public class A7Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		final float pi = 3.14f;
		//Area Of Circle Java Program
		int r=4;
		double a1=(pi*r*r);
		System.out.println("area of circle: " +a1);
		
		
		//Area Of Triangle
		int b=3;
		int h=4;
		double a2=(((double)1/2)*b*h);
		System.out.println("area of Triangle: " +a2);
		
		
		//Area Of Rectangle Program
		int b1=3;
		int l1=4;
		double a3=l1*b1;
		System.out.println("area of Rectangle: " +a3);
		
		
		//Area Of Isosceles Triangle
		int b4=3;
		int h4=4;
		double a4=(((double)1/2)*b4*h4);
		System.out.println("area of Isoceles Triangle: " +a4);
		
		
		//Area Of Parallelogram
		int b5=3;
		int h5=4;
		double a5=h5*b5;
		System.out.println("area of Parallelogram: " +a5);
		
		
		//Area Of Rhombus
		int p6=3;
		int q6=4;
		double a6=(q6*p6)/2;
		System.out.println("area of Rhombus: " +a6);
		
		
		 //Area Of Equilateral Triangle
		int l7=3;
		double a7= (Math.sqrt(3.0/4.0))*l7*l7;
		System.out.println("area of Equilateral Triangle: " +a7);
		
	
		//Curved Surface Area Of Cube
		int s8=4;
		int a8=6*s8*s8;
		System.out.println("Curved Surface Area Of Cube: " +a8);
		
		
		//Total Surface Area Of Cylinder
		int r9= 3;
		int h9= 4;
		double a9=2*pi*r9*(r9+h9);
		System.out.println("Total Surface Area Of Cylinder: " +a9);
		
	
	}

}
