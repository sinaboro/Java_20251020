package ex02;

public class Teacher extends Person{
	
	private String subject;	
	
	Teacher(String name, int age,  String subject){
		super(name, age);
		this.subject = subject;		
	}
	void info() {
		super.info();
		System.out.printf("수업과목 : %s\n", subject);
	}
	
	void show() {
		System.out.println("Teacher.......");
	}
	
}
