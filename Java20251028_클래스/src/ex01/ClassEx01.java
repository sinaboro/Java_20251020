package ex01;

public class ClassEx01 {

	public static void main(String[] args) {

		Student s1 = new Student();
		s1.name = "안창현";
//		s1.age = 290;
		s1.address = "강동구 천호동";
		
		s1.setAge(190);
		
		System.out.println(s1.name);
//		System.out.println(s1.age);
		System.out.println(s1.address);
		s1.study();
		
		System.out.println("---------------------");
		
		Student s2 = new Student();
		s2.name = "선아영";
//		s2.age = 280;
		s2.address = "강동구 암사동";
		
		System.out.println(s2.name);
//		System.out.println(s2.age);
		System.out.println(s2.address);
		s2.study();
	}

}

/*
 * 클래스 - 멤버변수(속성), 멤버 메소드(함수)
 * 멤버변수 - 정적(상태), 멤버메소드-동적(행동)
 */
class Student{
	
	String name;
	private int age;
	String address;
	
	public void study() {
		System.out.println(name + " Java 공부 중 입니다.");
	}
	
	public void eat() {
		System.out.println(name + " 아침은 먹는다!");
	}
	
	public void setAge(int a) {
		if(a > 0 && a<=150)
			age = a;
		else
			System.out.println("나이는 1~150 사이만 입력가능합니다.");
	}
}








