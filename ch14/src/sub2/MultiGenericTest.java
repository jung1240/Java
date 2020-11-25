package sub2;

/*
 * 날짜 : 2020/11/18
 * 이름 : 정유락
 * 내용 : Generic class 실습하기 교제 p386
 */
public class MultiGenericTest {

	public static void main(String[] args) {
		
		Tv tv = new Tv("LG 올레드");
		SmartPhone iphone = new SmartPhone("아이폰 12");
		
		Product<Tv, Integer> p1 = new Product<>(tv, 1000000);
		Product<SmartPhone, String> p2 = new Product<>(iphone, "iphone 12s");
		
		p1.show();
		p2.show();
		
	}
}
