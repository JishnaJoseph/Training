package day6;

class TestThis7 {
	//Real usage of this() constructor call
	 
		int rollno;  
		String name,course;  
		float fee;  
		
		TestThis7(int rollno,String name,String course){  
		this.rollno=rollno;  
		this.name=name;  
		this.course=course;  
		} 
		
		TestThis7(int rollno,String name,String course,float fee){  
		this(rollno,name,course);//reusing constructor  
		this.fee=fee;  
		}  
		void display(){System.out.println(rollno+" "+name+" "+course+" "+fee);}  
		}  
	public	class Q105Student{  
		public static void main(String args[]){  
			TestThis7 s1=new TestThis7(111,"ankit","java");  
			TestThis7 s2=new TestThis7(112,"sumit","java",6000f);  
		s1.display();  
		s2.display();  
		}}  


