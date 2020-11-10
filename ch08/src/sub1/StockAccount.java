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

	
	//멤버메서드
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
		System.out.println("은행명:"+bank);
		System.out.println("계좌번호:"+id);
		System.out.println("입금주:"+name);
		System.out.println("현재잔액:"+money);
		System.out.println("주식정보:"+stock);
		System.out.println("주식수량:"+amount);
		System.out.println("주식가격:"+price);

		
	

	}
	
}
