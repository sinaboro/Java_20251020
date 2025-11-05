package ex02_연습문제_확장;

/*
 * 부모 클래스 Animal
	필드: name, age
	메서드: makeSound() — “동물이 소리를 냅니다.” 출력
 */
public abstract class Animal {
	
	private String name;
	private int age;
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public abstract void makeSound();
	
	public void showInfo() {
		System.out.printf("이름: %s, 나이: %d살\n",
				name, age);
	}
}
