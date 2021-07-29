package day8;
import java.io.IOException;
public class javaTestthrows1 {
	void m()throws IOException{  
	    throw new IOException("device error");//checked exception  
	  }  
	  void n()throws IOException{  
	    m();  
	  }  
	  void p(){  
	   try{  
	    n();  
	   }catch(Exception e){System.out.println("exception handled");}  
	  }  
	  public static void main(String args[]){  
		  javaTestthrows1 obj=new javaTestthrows1();  
	   obj.p();  
	   System.out.println("normal flow...");  
	  }  
}
