package sub1;

/*
 * 날짜 : 2020/11/23
 * 이름 : 정유락
 * 내용 : 람다식 실습하기 교제 p 420
 * 
 * 스트림(Stream)
 *  - Java8 이후에 컬렉션에 추가된 컬렉션 API(기능)으로 I/O(입출력) 스트림과 다르다.
 *  - 배열이나 Collection의 원소를 람다식을 이용해서 처리할 수 있는 반복자
 *  -Stream을 이용하면 병렬처리가 가능하기 때문에 대용량의 데이터 처리에 더 나은 성능을 얻는다.
 */
public class LambdaTest {

	public static void main(String[] args) {
		// 람다식 : 인터페이스를 활용한 코드블럭을 갖는 익명함수
		Lambda1 lam1 = ()->{System.out.println("Lambda1 람다식 실행...");};
		lam1.method();

		Lambda2 lam2 = (x)->System.out.println("LAmbda2 람다식 매개변수 x : "+x);
		
		lam2.method(10);
		
		Lambda3 lam3 = (x, y)->{
			int result = x + y;
			return result;
		};
		int result = lam3.method(2, 3);
		System.out.println("Lambda3 람다식 결과 : "+result);
	}
}
