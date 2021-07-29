package day8;



// Importing the FileWriter class  
import java.io.FileWriter;   
   
// Importing the IOException class for handling errors  
import java.io.IOException;   

public class Ex3WriteToFile {
    public static void main(String[] args) {  
      
    try {  
        FileWriter obj3 = new FileWriter("D:\\file\\Human.doc");  
        // writing the content into the FileOperationExample.txt file  
       obj3.write("You never fail until you stop trying");   
   
        // Closing the stream  
        obj3.close();   
        System.out.println("Content is successfully wrote to the file.");  
    } catch (IOException e) {  
        System.out.println("Unexpected error occurred");  
        e.printStackTrace();  
        }  
    }  

}


