package sub1;
/*
 * ��¥ : 2020/11/10
 * �̸� : ������
 * ���� : Ŭ���� ��� �ǽ��ϱ� ���� p
 */
public class InheritanceTest {

	public static void main(String[] args) {
		StockAccount kb= new StockAccount("kb����", "123-1-1234", "������", 1000000, "�Ｚ����", 10, 53000);
		
		kb.sell(5, 51000);
		kb.sbuy(10, 50100);
		
		kb.show();
		
	}
}
