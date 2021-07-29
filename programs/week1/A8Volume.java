package week1;

public class A8Volume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final float pi = 3.14f;
		//Volume Of Cone 
		int r1=3;
		int h1=4;
		double a1=(((double)1/3)*pi*r1*r1*h1);
		System.out.println("Volume of cone: " +a1);
		
		
		//Volume Of Prism
		int l2=2;
		int b2=3;
		int h2=4;
		double a2=(((double)1/2)*l2*b2*h2);
		System.out.println("Volume of prism: " +a2);
		
		
		//Volume Of Cylinder
		int r3=3;
		int h3=4;
		double a3=pi*r3*r3*h3;
		System.out.println("Volume of Cylinder: " +a3);
		
		//Volume Of Sphere
		int r4=4;
		double a4=(((double)4/3)*pi*r4*r4*r4);
		System.out.println("Volume of Sphere: " +a4);
	}

}
