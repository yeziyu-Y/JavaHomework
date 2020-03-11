package Singleton;

public final class Singleton {
	private static Singleton instance = null;
	private Singleton() {
		if (instance != null) {
			throw new IllegalStateException("Already initialized!");
		}
	}
	//ֻ�е�getInstance()��һ�α�����ʱ�������ɵ���ģʽ��ʵ��
	public static synchronized Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}
