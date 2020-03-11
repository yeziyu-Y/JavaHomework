package Singleton;

public class TestSingleton {

	public static void main(String[] args) {
		System.out.println(Singleton.getInstance()+"  第一次生成instance!");
		System.out.println(Singleton.getInstance()+"  同一个instance!");
		//Singleton s = new Singleton(); 错误，外界无法生成新的单例模式的实例
	}
}
