import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

//Pattern program by using for loop.
//Program to print the * in 5 rows by decrementing the *

public class ForLoopDemo {
	public static void writeDataIntoFile(String data,String file) throws IOException{
		FileWriter writer=new FileWriter(file);
		BufferedWriter bufferedWriter=new BufferedWriter(writer);
		bufferedWriter.write(data);
		bufferedWriter.close();
	} 

	public void printPatternUsingForLoop() throws IOException{
		int row = 5;
		if (row <= 0) {
			throw new IllegalArgumentException("Row value should be greater than 0");
		}
		String fileName="output.txt";
		String currentRow="";
		for (; row > 0; row--) {
			for (int column = 0; column < row; column++) {
				//System.out.print("*");
				currentRow+="*";
			}
			//System.out.println("\n");
			currentRow +="\n";
		}
		writeDataIntoFile(currentRow,fileName);
	}

	public static void main(String[] args) throws IOException {
		ForLoopDemo f = new ForLoopDemo();
		f.printPatternUsingForLoop();

	}

}
