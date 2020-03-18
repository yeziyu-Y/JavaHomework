package containerAndIO;

import java.io.*;

public class FrequencyOfWords2 extends Frequency{
	public  String read(String inputFile) throws Exception {
		// π”√FileReader
		File file = new File(inputFile);
		FileReader fr = new FileReader(file);
		int ch = 0;
		String s = "";
		while ((ch = fr.read()) != -1) {
			s += (char)ch;
		}
		fr.close();
		return s;
	}
	public void resultout(String outputFile,byte[] dataout) throws Exception {
		File output = new File(outputFile);
		PrintStream psold = new PrintStream(output);
		System.out.print(dataout);
		System.setOut(psold);
	}
}
