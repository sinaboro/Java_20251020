package ex03;

public class Main {

	public static void main(String[] args) {
		/*
		 * 출력예시
			브랜드: 현대, 연식: 2025년
			차종: SUV
		 */
		
		Vehicle v = new Car("현대", 2025, "SUV");
		v.showInfo();

	}

}
