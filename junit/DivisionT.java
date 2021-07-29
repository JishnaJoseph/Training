package July21;
import java.util.Scanner;


public class DivisionT {

	public static int division(int a, int b){
	int div = a/b;
	return div;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
			System.out.println("Enter two numbers");
			int num1 =s.nextInt();
			int num2 =s.nextInt();
			int div= division(num1,num2);
			System.out.println(""+div);
	}

}
