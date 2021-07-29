package day4;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter an String : ");
		String str = scanner.next();
		int c=0,k=0;
		char vowels[] = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			char character = str.charAt(i);
			if (character == 'a' || character == 'A' || character == 'e'
					|| character == 'E' || character == 'i' || character == 'I'
					|| character == 'o' || character == 'O' || character == 'u'
					|| character == 'U') {
				vowels[i] = character;
				c++;
			} else {
				vowels[i] = '_';
				k++;
			}
		}

		System.out.println("Vowels are:");
		for (int i = 0; i < vowels.length; i++) {
			if (vowels[i] != '_') {
				System.out.println(vowels[i]);
			}
			
		}
		System.out.println("count of vowels "+c);
		System.out.println("count of nonvowels "+k);
	}

}
