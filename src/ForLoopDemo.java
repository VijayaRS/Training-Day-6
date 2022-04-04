//Pattern program by using for loop.
//Program to print the * in 5 rows by decrementing the *

public class ForLoopDemo {

	public void printPatternUsingForLoop() {
		int row = 5;
		if (row <= 0) {
			throw new IllegalArgumentException("Row value should be greater than 0");
		}
		for (; row > 0; row--) {
			for (int column = 0; column < row; column++) {
				System.out.print("*");
			}
			System.out.println("\n");
		}
	}

	public static void main(String[] args) {
		ForLoopDemo f = new ForLoopDemo();
		f.printPatternUsingForLoop();

	}

}
