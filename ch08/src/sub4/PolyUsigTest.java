package sub4;

public class PolyUsigTest {
    
	public static void main(String[] args) {
		
		Tiger Tiger =new Tiger();
		Eagle Eagle = new Eagle();
		Shark Shark = new Shark();
		Animal animal[]= {Tiger, Eagle, Shark};
	

	    animal[0].move();
		animal[0].hunt();
		
		animal[1].move();
		animal[1].hunt();
		
		animal[2].move();
		animal[2].hunt();
	}
}
