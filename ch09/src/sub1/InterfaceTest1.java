package sub1;

/*
 * 날짜 : 2020/11/12
 * 이름 : 정유락
 * 내용 : 인터페이스 실습하기 교제 p228
 */
public class InterfaceTest1 {

	public static void main(String[] args) {
		
		RemoteControl lg = new RemoteLg();
			lg.powerOn();
			lg.chUp();
			lg.powerOff();
		
			
			RemoteControl samsung = new RemoteSamsung();
				samsung.powerOn();
				samsung.chUp();
				samsung.powerOff();
		
			
	}
}
