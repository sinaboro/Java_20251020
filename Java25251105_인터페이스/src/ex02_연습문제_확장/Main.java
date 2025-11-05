package ex02_연습문제_확장;

/*
 *  출력 예시
이름: 초코, 나이: 3살 - showInfo() 메소드는 어디에 배치하면 좋을지 본인이 결정
멍멍!
 */
public class Main {

	public static void main(String[] args) {
		
		Animal dog1 = new Dog("초코", 3);
		dog1.showInfo();
		dog1.makeSound();
		
		System.out.println("--------------");
		
		Animal cat1  = new Cat("나비", 2);
	    cat1.showInfo();
		cat1.makeSound();
		
		
		Animal t = new Dog("로이", 5);
		t.makeSound();
		
		System.out.println("--------------");
		
		/*
		Animal a = new Animal("동물", 10);
		a.showInfo();
		a.makeSound();
		*/

	}

}
