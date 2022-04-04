////Pattern program by using for loop.
//Program to print the * in 5 rows by decrementing the *

public class whileLoopDemo {
	private static void patternUsingWhile() {
		// TODO Auto-generated method stub
		int row = 5;
		while (row > 0) {
			int column = 0;
			while (column < row) {
				System.out.print("*");
				column++;
			}
			row--;
			System.out.println("\n");
		}

	}

	public static void main(String[] args) {
		ForLoopDemo f = new ForLoopDemo();
		// f.printRow(5);
		patternUsingWhile();
	}

}
