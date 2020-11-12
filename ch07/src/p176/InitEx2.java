package p176;

public class InitEx2 {
	
	static int sVar;
	
	static void sMethod() {
		
	}
	
	int var;
	
	void method() {
		
	}
	
	static {
		sVar=0;
		sMethod();
	}
	
	static void sMethod2() {
		
		this.sVar = 0;
		this.sMethod();
	}

}
