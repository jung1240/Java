package sub2;

public class SalaryStudent extends Student {
	
	private static int age;
	private String company;
	
	public SalaryStudent(String name, int age, String school, String major, String company) {
		super(name, age, school, major);
		this.company=company;
	}
	public void hello() {
		System.out.println(name+"�Դϴ�.");
		System.out.println(age+"�Դϴ�.");
		System.out.println(school+"�б�");
		System.out.println(major+"�Դϴ�.");
		System.out.println(company+"�� �ٹ��մϴ�.");
	}

}
