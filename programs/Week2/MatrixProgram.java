package Week2;
//Java Program to determine whether a given matrix is an identity matrix
import java.util.Scanner;

public class MatrixProgram {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int rows = sc.nextInt();
		System.out.print("Enter the number of columns: ");
		int cols = sc.nextInt();
		int array[][] = new int[rows][cols];
		System.out.println("Enter the elements of the array: ");
		for (int i = 0; i < rows; i++)
			for (int j = 0; j < cols; j++)
				array[i][j] = sc.nextInt();

		boolean flag = true;

		if (rows != cols) {
			System.out.println("Matrix should be a square matrix");
		} 
		else {
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < cols; j++) {
					if (i == j && array[i][j] != 1) {
						flag = false;
						break;
					}
					if (i != j && array[i][j] != 0) {
						flag = false;
						break;
					}
				}
			}

			if (flag)
				System.out.println("Given matrix is an identity matrix");
			else
				System.out.println("Given matrix is not an identity matrix");
		}
	}

}
