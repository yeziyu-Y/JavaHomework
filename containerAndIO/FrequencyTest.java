package containerAndIO;

import java.io.*;

public class FrequencyTest {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		try {
			//FileInputStream
			Frequency f1 = new FrequencyOfWords1();
			String s1 = f1.read("D://了不起的盖茨比英文.txt");
			byte[] b1 = f1.count(s1);
			f1.resultout("D://output1.txt", b1);
			//FileReader
			Frequency f2 = new FrequencyOfWords1();
			String s2 = f2.read("D://了不起的盖茨比英文.txt");
			byte[] b2 = f1.count(s2);
			f1.resultout("D://output2.txt", b2);
		}
		catch (FileNotFoundException e) {
			System.out.println("文件不存在！");
		}
		catch (UnsupportedEncodingException e) {
			System.out.println("文件编码错误！");
		}
		catch (IOException e) {
			System.out.println("没有权限访问文件！");
		}
		System.out.println("词频统计文件顺利生成！");
	}

}
