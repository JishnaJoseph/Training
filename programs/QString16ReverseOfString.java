package day4;

public class QString16ReverseOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String string = "Dream big";    
		 System.out.println( "String Length is : " + string.length() ); 
	        String reversedStr = "";    
	        for(int i = string.length()-1; i >= 0; i--){    
	            reversedStr = reversedStr + string.charAt(i);    
	        }    
	        System.out.println("Original string: " + string);    
	          
	        System.out.println("Reverse of given string: " + reversedStr);    
	}

}
