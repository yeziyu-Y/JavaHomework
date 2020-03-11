package Singleton;

public final class Singleton {
	private static Singleton instance = null;
	private Singleton() {
		if (instance != null) {
			throw new IllegalStateException("Already initialized!");
		}
	}
	//只有当getInstance()第一次被调用时，才生成单例模式的实例
	public static synchronized Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}
