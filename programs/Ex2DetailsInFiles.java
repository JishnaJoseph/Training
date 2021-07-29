package day8;
import java.io.File; 
public class Ex2DetailsInFiles {
		    public static void main(String[] args) {  
		        // Creating file object  
		        File obj2 = new File("D:\\file\\Human.doc");  
		        if (obj2.exists()) {  
		            // Getting file name  
		            System.out.println("The name of the file is: " + obj2.getName());  
		   
		            // Getting path of the file   
		            System.out.println("The absolute path of the file is: " + obj2.getAbsolutePath());     
		   
		            // Checking whether the file is writable or not  
		            System.out.println("Is file writeable?: " + obj2.canWrite());    
		   
		            // Checking whether the file is readable or not  
		            System.out.println("Is file readable " + obj2.canRead());    
		   
		            // Getting the length of the file in bytes  
		            System.out.println("The size of the file in bytes is: " + obj2.length());    
		        } else {  
		            System.out.println("The file does not exist.");  
		        }  
		    }  

	

}
