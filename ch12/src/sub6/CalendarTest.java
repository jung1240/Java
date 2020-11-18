package sub6;

import java.util.Calendar;

/*
 * ��¥ : 2020/11/18
 * �̸� : ������
 * ���� : Calendar Ŭ���� �ǽ��ϱ� ���� p323
 */
public class CalendarTest {

	public static void main(String[] args) {
		
		// �̱��� ��ü(ch07-sub4)
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
