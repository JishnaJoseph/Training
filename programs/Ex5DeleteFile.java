package day8;


	// Importing the File class  
	import java.io.File;   
	public class Ex5DeleteFile {  
	  public static void main(String[] args) {   
	    File f0 = new File("D:\\file\\Human.doc");   
	    if (f0.delete()) {   
	      System.out.println(f0.getName()+ " file is deleted successfully.");  
	    } else {  
	      System.out.println("Unexpected error found in deletion of the file.");  
	    }   
	  } 

}

