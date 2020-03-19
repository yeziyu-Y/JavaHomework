package copyFile;

import java.io.*;

public class CopyFile {
	public static void copyFile(String source_folder,String destination_folder,String fileName) {
		File file_source = new File(source_folder+"//"+fileName);
		File file_destination = new File(destination_folder+"//"+fileName);
		try {
			int bytesum = 0;
			int byteread = 0;
			if (file_source.exists()) {
				FileInputStream fis = new FileInputStream(file_source);
				FileOutputStream fos = new FileOutputStream(file_destination);
				int size = fis.available();
				byte [] data = new byte[size];
				while ((byteread = fis.read(data))!=-1) {
					bytesum += byteread;//文件大小
					fos.write(data, 0, bytesum);
				}
				fis.close();
				fos.close();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("复制文件完成！");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String source = "D://java_programs";
		String destination = "D://result";
		String fileName = "了不起的盖茨比英文.txt";
		copyFile(source,destination,fileName);
	}

}
