package p122;

public class ArrEx11 {
	
	private static final int[][][] arrInt = null;

	public static void main(String[] args) {
		int [][][] arrTnt=new int[3][3][3];
		int value=0;
		
		for(int i=0; i<=2; i++) {
			for(int j=0; j<=2; j++) {
				for(int k=0; k<=2; k++) {
					arrInt[i][j][k]=value++;
				}
			}
		}
		
		for(int i=0; i<=2; i++) {
			for(int j=0; j<=2; j++) {
				for(int k=0; k<=2; k++) {
					System.out.println(arrInt[i][j][k]+"\t");
				}
				System.out.println();
			}
		}
		
		
	
	
	}

}
