package sub1;
/*
 * ��¥ : 2020/11/05
 * �̸� : ������
 * ���� : �޼��� ���� Ÿ�� �ǽ��ϱ� ���� p155
 */
public class MethodTypeTest {

	public static void main(String[] args) {
		
		double rs1 = type1(1.01);
		
		System.out.println("rs1:"+rs1);
		
		type2(true);
		type2(false);
		
		boolean rs2=type3();
		
		System.out.println("rs2:"+rs2);
		
		type4();
		
		//��������
		for(int x=2; x<=9; x++) {
			gugudan(x);
		}
		
	}//main ��
	
	// ������ �޼��� ����
	
	public static void gugudan(int num) {
		
		System.out.println(num+"��");
		
		for(int x=2; x<=9; x++) {
			int result = num*x;
			System.out.println(num+"x"+x+"="+result);
		}
	}
	
	
	// type1 : �Ű����� o, ���ϰ� o
	public static double type1(double a) {
		
		double result =a+3.14;
		return result;
			
	}
	// type2 : �Ű����� o, ���ϰ� x
	public static void type2(boolean isOk) {
		
		if(isOk) {
			System.out.println("�� �Դϴ�.");
		}else {
			System.out.println("���� �Դϴ�.");
		}
		
		
		
	}
	// type3 : �Ű����� x, ���ϰ� o
	public static boolean type3() {
		int num1=1;
		int num2=2;
		
		if(num1>num2) {
			return true;
		}else {
			return false;
		}
		
	}
	// type4 : �Ű����� x, ���ϰ� x
	public static void type4() {
				System.out.println("type4 �޼��� ���:"+type1(0.12));
		}
	
	
}
