package ex02_연습문제;

/*
 * 자식 클래스 Cat
	Animal을 상속받는다.
	makeSound()를 오버라이딩하여 “야옹!” 출력
 */
public class Cat extends Animal{
	
	public Cat(String name, int age) {
		super(name, age);
	}
	
	@Override
	public void makeSound() {
		System.out.println("야옹!");
	}
}
