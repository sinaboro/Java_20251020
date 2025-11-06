package ex01;

public class InheritanceMain {

	public static void main(String[] args) {

		Stduent s1 = new Stduent("홍길동", 15, "천호중학교");
		s1.stduentInfo();
		s1.info();
		
		Teacher t1 = new Teacher("홍수박", 30, "수학");
		t1.info();
		t1.teacherInfo();
		
	}

}
