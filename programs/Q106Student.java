package day6;

public class TestThis8 {
	 
		int rollno;  
		String name,course;  
		float fee;  
		TestThis8(int rollno,String name,String course){  
		this.rollno=rollno;  
		this.name=name;  
		this.course=course;  
		}  
		TestThis8(int rollno,String name,String course,float fee){  
		this.fee=fee;  
		this(rollno,name,course);//C.T.Error  
		}  
		void display(){System.out.println(rollno+" "+name+" "+course+" "+fee);}  
		}  
		class Q106Student{  
		public static void main(String args[]){  
			TestThis8 s1=new TestThis8(111,"ankit","java");  
			TestThis8 s2=new TestThis8(112,"sumit","java",6000f);  
		s1.display();  
		s2.display();  
		}}  


