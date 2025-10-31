package ex01;

public class Person {
	private String name;
	private int age;
	
	public Person() {} //디폴트 생성자
	public Person(String name, int age){
		this.name = name; 
		this.age = age;
	}
	
	public void eat() {
		System.out.println(name+"은 점심을 먹는다.");
	}
}
