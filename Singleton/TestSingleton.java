package Singleton;

public class TestSingleton {

	public static void main(String[] args) {
		System.out.println(Singleton.getInstance()+"  ��һ������instance!");
		System.out.println(Singleton.getInstance()+"  ͬһ��instance!");
		//Singleton s = new Singleton(); ��������޷������µĵ���ģʽ��ʵ��
	}
}
