package sub1;

/*
 * ��¥ : 2020/11/12
 * �̸� : ������
 * ���� : �������̽� �ǽ��ϱ� ���� p228
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
