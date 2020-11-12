package p186;

public class Singleton {
	
	private static Singleton instance = new Singleton();
	
	private Singleton() {
		System.out.println("按眉 积己");
	}
	
	public static Singleton getInstance() {
		System.out.println("按眉 府畔");
		return instance;
	}

}
