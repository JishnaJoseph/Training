package day8;


	// Importing the File class  
	import java.io.File;   
	// Importing FileNotFoundException class for handling errors  
	import java.io.FileNotFoundException;   
	// Importing the Scanner class for reading text files  
	import java.util.Scanner;   
	   
	public class Ex4ReadFromFile {
	    public static void main(String[] args) {  
	        try {  
	            // Create f1 object of the file to read data  
	            File obj4 = new File("D:\\file\\Human.doc");    
	            Scanner dataReader = new Scanner(obj4);  
	            while (dataReader.hasNextLine()) {  
	                String fileData = dataReader.nextLine();  
	                System.out.println(fileData);  
	            }  
	            dataReader.close();  
	        } catch (FileNotFoundException exception) {  
	            System.out.println("Unexpected error occurred!");  
	            exception.printStackTrace();  
	        }  
	    }  

}

