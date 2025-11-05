package ex03;

public class Cat implements Animal {

	private String name;
	private int age;
	
	public Cat(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void func() {
		
	}
	
	@Override
	public void makeSound() {
		System.out.println("야옹!");		
	}
	
	public void showInfo() {
		System.out.printf("이름 : %s, 나이 : %d년\n",name, age);
	}

}
