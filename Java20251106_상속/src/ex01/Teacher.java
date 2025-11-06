package ex01;

public class Teacher extends Person{
	
	private String subject;	
	
	Teacher(String name, int age,  String subject){
		super(name, age);
		this.subject = subject;		
	}
	void teacherInfo() {
		System.out.printf("수업과목 : %s\n", subject);
	}
	
}
