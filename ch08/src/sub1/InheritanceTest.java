package sub1;
/*
 * 날짜 : 2020/11/10
 * 이름 : 정유락
 * 내용 : 클래스 상속 실습하기 교제 p
 */
public class InheritanceTest {

	public static void main(String[] args) {
		StockAccount kb= new StockAccount("kb증권", "123-1-1234", "김유신", 1000000, "삼성전자", 10, 53000);
		
		kb.sell(5, 51000);
		kb.sbuy(10, 50100);
		
		kb.show();
		
	}
}
