package ex01;

public class Person {
	
	private String name;
	private int age;
	
	public void showInfo() {
		System.out.printf("이름: %s, 나이: %d\n", name, age);
		/*
		 * %s : 문자열
		 * %d : 정수
		 * %f : 실수
		 * %.2f : 소수점 두자리까지 출력
		 */
	}
}
