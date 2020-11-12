package p186;

public class Singleton {
	
	private static Singleton instance = new Singleton();
	
	private Singleton() {
		System.out.println("��ü ����");
	}
	
	public static Singleton getInstance() {
		System.out.println("��ü ����");
		return instance;
	}

}
