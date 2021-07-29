package July21;
//	Java Program to determine whether a given string is palindrome
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		str = sc.nextLine();
		palin(str);
	}
		
		public static boolean palin(String str)
		{
			String rev ="";
			for (int i = str.length() - 1; i >= 0; i--)
			{
				 rev = rev + str.charAt(i);
			}
			if (str.equals(rev)){
				System.out.println(str + " is a palindrome");
				return true;
			}
			else{
				System.out.println(str + " is not a palindrome");
				return false;
			}
	

}}
