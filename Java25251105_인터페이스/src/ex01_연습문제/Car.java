package ex01_연습문제;

/*
 * Car(자식 클래스)
Vehicle을 상속받는다.
추가 필드: type (예: "SUV", "세단" 등)
메서드: showInfo() → 부모의 showInfo() 호출 
후 차량 종류까지 출력

출력예시
브랜드: 현대, 연식: 2025년
차종: SUV
 */
public class Car extends Vehicle{
	
	private String type;
	
	public Car() {}
	public Car(String brand, int year, String type) {
		super(brand, year);
		this.type = type;
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.printf("차종: %s\n", type);
	}
	
}
