package containerAndIO;

import java.io.*;

public class FrequencyTest {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		try {
			//FileInputStream
			Frequency f1 = new FrequencyOfWords1();
			String s1 = f1.read("D://�˲���ĸǴı�Ӣ��.txt");
			byte[] b1 = f1.count(s1);
			f1.resultout("D://output1.txt", b1);
			//FileReader
			Frequency f2 = new FrequencyOfWords1();
			String s2 = f2.read("D://�˲���ĸǴı�Ӣ��.txt");
			byte[] b2 = f1.count(s2);
			f1.resultout("D://output2.txt", b2);
		}
		catch (FileNotFoundException e) {
			System.out.println("�ļ������ڣ�");
		}
		catch (UnsupportedEncodingException e) {
			System.out.println("�ļ��������");
		}
		catch (IOException e) {
			System.out.println("û��Ȩ�޷����ļ���");
		}
		System.out.println("��Ƶͳ���ļ�˳�����ɣ�");
	}

}
