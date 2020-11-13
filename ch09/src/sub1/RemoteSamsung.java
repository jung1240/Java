package sub1;

public class RemoteSamsung implements RemoteControl{

	@Override
	public void powerOn() {
		System.out.println("Samsung powoerOn...");
	}

	@Override
	public void powerOff() {
		System.out.println("Samsung powoerOff...");		
	}

	@Override
	public void chUp() {
		System.out.println("Samsung chUp...");		
	}

	@Override
	public void chDown() {
		System.out.println("Samsung chDown...");	
	}

}
