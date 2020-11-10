package p128;

public class ArrEx17 {
	
	public static void main(String[] args) {
		String[]names= {"È«±æµ¿", "ÀÌ¼ø½Å", "±èÀ¯½Å"};
		int[] scores= {90, 80, 100};
		
		int i=0;
		
		for(String name : names) {
			System.out.println(name+":"+scores[i]);
			i++;
		}
	}

}
