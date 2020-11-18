package sub6;

import java.util.Calendar;

/*
 * 날짜 : 2020/11/18
 * 이름 : 정유락
 * 내용 : Calendar 클래스 실습하기 교제 p323
 */
public class CalendarTest {

	public static void main(String[] args) {
		
		// 싱글톤 객체(ch07-sub4)
		Calendar cal = Calendar.getInstance();
		
		int year = cal.get(cal.YEAR);
		int month = cal.get(cal.MONTH)+1;
		int date = cal.get(cal.DATE);
		int hour = cal.get(cal.HOUR);
		int min = cal.get(cal.MINUTE);
		int sec = cal.get(cal.SECOND);
		
		System.out.printf("%d-%d-%d\n", year, month, date);
		System.out.printf("%d-%d-%d\n", hour, min, sec);
		
	}
}
