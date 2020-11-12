package p171;

public class Student {
	
	public String name;
	public int grade;
	public String department;
	
	public Student(){
		
	}

	public Student(String n){
		name = n;
	}
	
	public Student(String n, int g){
		name = n;
		grade = g;
	}
	
	public Student(String n, int g, String d){
		name = n;
		grade = g;
		department = d;
		
	}
	
}
