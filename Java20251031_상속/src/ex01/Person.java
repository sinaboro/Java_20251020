package ex01;

import java.util.Objects;

public class Person {
	private String name;
	private int age;
	
	public Person() {
	}

	public Person(String name, int age){
		super();
		this.name = name; 
		this.age = age;
		System.out.println("Person class");
	}
	
	public void eat() {
		System.out.println(name+"은 점심을 먹는다.");
	}
		
	@Override //안정장치, 검증장치, 상위클래스가 가지고있는 메소드를 재정의
	public String toString() {
		return "이름 : " + name + ", 나이 : " + age;
	}
	
}
