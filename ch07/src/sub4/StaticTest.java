package sub4;
/*
 * ��¥ : 2020/11/10
 * �̸� : ������
 * ���� : ��������(Ŭ���� ����), �����޼���(Ŭ���� �޼���) �ǽ��ϱ�
 */
public class StaticTest {

	public static void main(String[] args) {
		
		Increment inc1 = new Increment();	
		Increment inc2 = new Increment();
		
		/* ��������(Ŭ��������), �����޼���(Ŭ���� �޼���)�� �̹� �����Ҵ� ����(Method Area)
		 * �����Ǿ� �ֱ� ������ ��ü �������� �ٷ� ������ �� �ִ�.
		 */
		Increment.num2 +=3;
		Increment.add();
		
		Increment inc3 = new Increment();
		
		//�̱��� ��ü -���� 185p
		Clac cal = Clac.getInstance();		
		
		
		int r1=cal.plus(1,2);
		int r2=cal.minus(2,5);
		int r3=cal.multi(3,2);
		int r4=cal.div(4,2);
		
		System.out.println("x+y :"+r1);
		System.out.println("x-y : "+r2);
		System.out.println("x * y: "+r3);
		System.out.println("x/y: "+r4);
		
	}
}
