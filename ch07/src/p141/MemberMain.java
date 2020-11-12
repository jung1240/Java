package p141;

public class MemberMain {
	
	public static void main(String[] args) {
		MemberMain m= new MemberMain();
		MemberMain m2= new MemberMain();
		
		if(m==m2) {
			System.out.println("m개체와 m2개체는 같다.");
		}else {
			System.out.println("m개체와 m개체는 같지않다.");
		}
	}

}
