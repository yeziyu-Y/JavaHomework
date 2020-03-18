package containerAndIO;

import java.io.*;
public class FrequencyOfWords1 extends Frequency{
	public String read(String inputFile) throws Exception{
		// π”√FileInputStream
		File file = new File(inputFile);
		FileInputStream ins = new FileInputStream(file);
		int size = ins.available();
		byte[] buffer = new byte[size];
		ins.read(buffer);
		ins.close();
		String str = new String(buffer);
		return str;
	}
	public void resultout(String outputFile,byte[] dataout) throws Exception{
		File output = new File(outputFile);
		FileOutputStream ous = new FileOutputStream(output);
		ous.write(dataout);
		ous.close();
	}
}
