package ex01;

public class InheritanceMain {

	public static void main(String[] args) {
		
	
		Student s1 = new Student("홍길동", 25, "천호중학교");
		
		Student s2 = new Student();
		
		s1.study();
		s1.eat();
		
		System.out.println(s1);
		
		
		System.out.println("-----------------------");
		
		Teacher t1 = new Teacher("삼장법사", 50, "수학");
		t1.teach();
		t1.eat();

		System.out.println("-----------------------");

		Programmer p1 = new Programmer("손오공", 30, "자바");
		p1.code();
		
		
		
	}

}
