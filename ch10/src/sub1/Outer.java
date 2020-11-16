package sub1;

public class Outer {
	
	private int x;
	
	public void outer(int x) {

		this.x=x;
	}
	
	public void show() {
		System.out.println("Outer x:"+x);

	}
	public class Inner{
		
		
		private int x;
		
		public  Inner(int x) {
			this.x=x;
			
		}
		public void show() {
			
		}
		
		
		
	}
	
	
	

}
