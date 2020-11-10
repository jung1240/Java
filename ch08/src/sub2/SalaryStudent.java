package sub2;

public class SalaryStudent extends Student {
	
	private static int age;
	private String company;
	
	public SalaryStudent(String name, int age, String school, String major, String company) {
		super(name, age, school, major);
		this.company=company;
	}
	public void hello() {
		System.out.println(name+"입니다.");
		System.out.println(age+"입니다.");
		System.out.println(school+"학교");
		System.out.println(major+"입니다.");
		System.out.println(company+"에 근무합니다.");
	}

}
