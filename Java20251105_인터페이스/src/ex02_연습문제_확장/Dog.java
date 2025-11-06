package ex02_연습문제_확장;

/*
 * 자식 클래스 Dog
	Animal을 상속받는다.
	makeSound()를 오버라이딩하여 “멍멍!” 출력
 */
public class Dog extends Animal{

	public Dog(String name, int age) {
		super(name, age);
	}
	@Override
	public void makeSound() {
		System.out.println("멍멍!");
	}
}
