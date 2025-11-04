package ex01;

/*
 * 문제1.
	1. Person 클래스를 만들고 private접근 범위 name, age 필드를 가진다.
	2. showInfo() 메서드에서 이름과 나이를 출력한다.
	3. Student 클래스를 Person을 상속받아 schoolName 필드를 추가하고,
	4. showStudentInfo() 메서드에서 학교 이름까지 출력한다.
	
	출력예시
	이름: 홍길동, 나이: 20
	학교: 천호중학교
 */


public class 문제 {

	public static void main(String[] args) {
		
		Student s = new Student("홍길동", 20, "천호중학교");
		s.showStudentInfo();

	}

}
