package sub1;

/*
 * ��¥ : 2020/11/23
 * �̸� : ������
 * ���� : ���ٽ� �ǽ��ϱ� ���� p 420
 * 
 * ��Ʈ��(Stream)
 *  - Java8 ���Ŀ� �÷��ǿ� �߰��� �÷��� API(���)���� I/O(�����) ��Ʈ���� �ٸ���.
 *  - �迭�̳� Collection�� ���Ҹ� ���ٽ��� �̿��ؼ� ó���� �� �ִ� �ݺ���
 *  -Stream�� �̿��ϸ� ����ó���� �����ϱ� ������ ��뷮�� ������ ó���� �� ���� ������ ��´�.
 */
public class LambdaTest {

	public static void main(String[] args) {
		// ���ٽ� : �������̽��� Ȱ���� �ڵ���� ���� �͸��Լ�
		Lambda1 lam1 = ()->{System.out.println("Lambda1 ���ٽ� ����...");};
		lam1.method();

		Lambda2 lam2 = (x)->System.out.println("LAmbda2 ���ٽ� �Ű����� x : "+x);
		
		lam2.method(10);
		
		Lambda3 lam3 = (x, y)->{
			int result = x + y;
			return result;
		};
		int result = lam3.method(2, 3);
		System.out.println("Lambda3 ���ٽ� ��� : "+result);
	}
}
