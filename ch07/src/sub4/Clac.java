package sub4;

public class Clac {
	
	//싱글톤 객체생성
	private static Clac instance = new Clac();
	
	
	public static Clac getInstance() {
		return instance;
	}
	
	//외부에서 객체생성을 할수없게 private생성자를 선언
	private Clac() {}
	
	
	public int plus(int x,int y) {
		return x+y;
	}
	public int minus(int x,int y) {
		return x-y;
	}
	public int multi(int x,int y) {
		return x*y;
	}
	public int div(int x,int y) {
		return x/y;
	}
	
	

}