package ex01;

public class Person {
	private String name;
	private int age;
	
	Person() {}
	
	Person(String name, int age){
		this.age =age;
		this.name = name;
	}
	
	void info() {
		System.out.printf("이름 : %s, 나이 : %d\n",name,age);
	}
}
