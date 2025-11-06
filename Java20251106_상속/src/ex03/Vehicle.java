package ex03;

/*
 * Vehicle(부모 클래스)
필드: brand, year
메서드: showInfo() → “브랜드: OOO, 연식: OOO년” 출력
 */
public class Vehicle {
	
	private String brand; 
	private int year;
	
	public Vehicle() {}
	public Vehicle(String brand, int year) {
		this.brand = brand;
		this.year = year;
	}
	
	public void showInfo() {
		System.out.printf("브랜드: %s, 연식: %d년\n",brand, year);
	}
}
