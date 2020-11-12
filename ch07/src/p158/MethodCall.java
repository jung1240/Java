package p158;


public class MethodCall {

	public static void main(String[] args) {
		
		Method.printName();
		
		Method m=new Method();
		m.printEmail();
	}
}
class Method{
	static void printName() {
		System.out.println("printName() 실행");
	}
	void printEmail() {
		System.out.println("printEmail() 실행");
		
		printId();
	}
	void printId() {
		System.out.println("printId() 실행");
	}
}