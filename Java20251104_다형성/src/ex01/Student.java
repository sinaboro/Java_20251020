package ex01;

public class Student extends Person {
	private String schoolName;
	
	public void showStudentInfo() {
		super.showInfo(); //상위클래스 메소드 호출
		System.out.printf("학교: %s\n", schoolName );
	}
}
