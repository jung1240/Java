package sub4;

public class Clac {
	
	//�̱��� ��ü����
	private static Clac instance = new Clac();
	
	
	public static Clac getInstance() {
		return instance;
	}
	
	//�ܺο��� ��ü������ �Ҽ����� private�����ڸ� ����
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