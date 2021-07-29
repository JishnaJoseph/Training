package day5;

public class AlphabetsPattern {

	static int height = 5;
//	static int width = (2 * height) - 1;

	public static void main(String[] args) {
		printJ();
	}

	static void printJ() {
		int i, j;
		for (i = 0; i < height; i++) {
			for (j = 0; j < height; j++) {
				if (i == height - 1 && (j > 0 && j < height - 1))
					System.out.print("*");
				else if ((j == height - 1 && i != height - 1)
						|| (i > (height / 2) - 1 && j == 0 && i != height - 1))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("\n");
		}
	}
}
