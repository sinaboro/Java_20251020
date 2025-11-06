package ex03;

/*
 * Car(자식 클래스)
Vehicle을 상속받는다.
추가 필드: type (예: "SUV", "세단" 등)
메서드: showInfo()
 */
public class Car extends Vehicle{

	private String type;
	
	public Car() {}
	public Car(String brand, int year, String type) {
		super(brand, year);
		this.type = type;		
	}
	
	public void showInfo(){
		super.showInfo();
		System.out.println("차종 : " + type);
	}
}
