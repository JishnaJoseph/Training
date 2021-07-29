package day8;
//If the superclass method does not declare an exception
import java.io.*;  
class Parent{  
  void msg(){System.out.println("parent");}  
}  
  
public class TestExceptionChild extends Parent{  
	  void msg()throws IOException{  
		    System.out.println("TestExceptionChild");  
		  }  
		  public static void main(String args[]){  
		   Parent p=new TestExceptionChild();  
		   p.msg();  
		  }  

}
