package sub1;

public class StockAccount extends Account {

	private String stock;
	private int price;
	private int amount;
	public StockAccount(String bank, String id, String name, int money, String stock, int amount, int price) {
		super(bank, id, name, money);
		// TODO Auto-generated constructor stub
		this.stock=stock;
		this.amount=amount;
		this.price=price;
				
	}

	
	//����޼���
	public void sell( int amount, int price){
		this.amount -=amount;
		int total =amount*price;
		money +=total;
		
	}
	public void sbuy( int amount, int price){
		this.amount +=amount;
		int total=amount*price;
		money -=total;
		
	}
	
	private void sysout() {
		System.out.println("=============");
		System.out.println("�����:"+bank);
		System.out.println("���¹�ȣ:"+id);
		System.out.println("�Ա���:"+name);
		System.out.println("�����ܾ�:"+money);
		System.out.println("�ֽ�����:"+stock);
		System.out.println("�ֽļ���:"+amount);
		System.out.println("�ֽİ���:"+price);

		
	

	}
	
}
