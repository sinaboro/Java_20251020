package ex02;

public class Student extends Person{

	private String school;
	
	public Student() {}
	
	public Student(String school) {
		this.school = school;
	}

	public Student(String name, int age, String school) {
		super(name, age); //상위클래스 전달
		this.school = school;
	}
	
	public void study() {
		System.out.println(getName() + "은 공부 중입니다.");
	}
}
