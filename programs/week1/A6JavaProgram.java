package week1;

public class A6JavaProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Java Program to Convert Character to String 
		 char ch = 'c';
	        String st = Character.toString(ch);
	        System.out.println("The string is: " + st);
	        
	        
	       // Java Program to Convert  String to character
	         
	        	String s="hello";  
	        	char c=s.charAt(0);//returns h  
	        	System.out.println("1st character is: "+c); 
	        
	        //Java Program to convert char type variables to int
	        	char c1='a';  //ASCII Code of a is 97
	        	char c2='1';  //ASCII code of 1 is 49
	        	int a=c1;  
	        	int b=c2;  
	        	System.out.println(a);  
	        	System.out.println(b);  
	        
	        	
	        //Java Program to convert int type variables to char
	        	int d= 97;
	        	char e=(char) d;
	        	System.out.println(e);
	        	
	        	
	        //Java Program to convert long type variables into int
	        	long l=500;  
	        	int i=(int)l;  
	        	System.out.println(i);  
	        	
	       
	        //Java Program to convert int type variables to long
	        	int g= 400;
	        	long h= (long)g;
	        	System.out.println(h);
	        	
	        
	        //Java Program to convert boolean variables into string
	        	boolean b1=true;  
	        	boolean b2=false;  
	        	String s1=String.valueOf(b1);  
	        	String s2=String.valueOf(b2);  
	        	System.out.println(s1);  
	        	System.out.println(s2); 
	        	
	        	
	        //Java Program to convert string type variables into boolean
	        	String s3="true";
	        	String s4="false";
	        	boolean b3=Boolean.parseBoolean(s3);
	        	boolean b4=Boolean.parseBoolean(s4);
	        	System.out.println(b3);  
	        	System.out.println(b4); 
	        	
	        	
	        //Java Program to convert string type variables into int
	        	String s5="500"; 
	        	int j=Integer.parseInt(s5); 
	        	System.out.println(j);
	        	
	        
	        //Java Program to convert int type variables to String
	        	int j1=400;
	        	String s6=String.valueOf(j1);
	        	System.out.println(s6);
	        	
	        	
	        //Java Program to convert int type variables to double
	        	int k=200;  
	        	double d1=k;  
	        	System.out.println(d1);  
	        	
	        	
	        //Java Program to convert double type variables to int
	        	double d2=200.5;
	        	int k2= (int) d2;
	        	System.out.println(k2); 
	        	
	        	
	        //Java Program to convert string variables to double
	        	String s7="23.6";  
	        	double d3=Double.parseDouble(s7);  
	        	System.out.println(d3);  
	        	
	        	
	        //Java Program to convert double type variables to string
	        	double d4=25.5;
	        	String s8=String.valueOf(d4);
	        	System.out.println(s8); 
	        	
	        	
	        //Java Program to convert primitive types to objects 
	        	int m=20;  
	        	Integer i3=Integer.valueOf(m);
	        	System.out.println(i3); 
	        	
	        	
	        //Java Program to convert objects to primitive types 
	        	Integer m1=new Integer(30);
	        	int i4=m1.intValue();
	        	System.out.println(i4); 
	}

}
