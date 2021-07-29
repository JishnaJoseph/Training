package day4;

public class QString11LowerCaseToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Jishna Joseph";
		StringBuffer newStr = new StringBuffer(str1);
	
		System.out.println( "String Length is : " + str1 );
		
//		
		System.out.println("String after case conversion : " + str1.toUpperCase());
		System.out.println("String after case conversion : " + str1.toLowerCase());


		
		for (int i = 0; i < str1.length(); i++) {
		if (Character.isLowerCase(str1.charAt(i))) 
		{		
			newStr.setCharAt(i, Character.toUpperCase(str1.charAt(i)));
		}

			else if (Character.isUpperCase(str1.charAt(i))) {
		newStr.setCharAt(i, Character.toLowerCase(str1.charAt(i)));
			}
		}
		System.out.println("String after case conversion : " +newStr);

	}}
