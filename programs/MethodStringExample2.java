package day5;

public class MethodStringExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1="Hello";
		String str2="Jishna";
		
		String result=concatnate(str1,str2);
		System.out.println("Concatnated String is "+result);
		
		int len=length(str1);
		System.out.println("Length of String is "+len);
		
		len=length(str2);
		System.out.println("Length of String is "+len);
		
		String com=compare(str1,str2);
		System.out.println("Strings are  "+com);
		
		String upper=toupper(str1);
		System.out.println("String in uppercase is  "+upper);
		
		upper=toupper(str2);
		System.out.println("String in uppercase is  "+upper);
	}
	
	
	public static String concatnate(String str1, String str2)
	{
		String result=str1+str2;
		return result;
	}
	public static int length(String str1)
	{
		int result=str1.length();
		return result;
	}
	
	public static String compare(String str1,String str2)
	{
		String result=str1==str2 ? "equal":"not equal";
		return result;
	}
	public static String toupper(String str1)
	{
		String result=str1.toUpperCase();
		return result;
	}
}
