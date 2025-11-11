package ex02;

public class Person {

	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public Person() {}  //추가
	public String getInfo() {
		return name;
	}
}
