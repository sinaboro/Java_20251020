package ex01;

public class ForEx02 {

	public static void main(String[] args) {
		
		/*
		 * 2~5단까지 구구단 출력
		 * 2x1 = 2
		 * 2x2 = 4
		 * ..
		 * 2x9 = 18
		 * 
		 * 3x1 = 3
		 * ..
		 * 3x9 = 27
		 * 
		 * 4x1 = 4
		 * .
		 * 4x9 = 36
		 * 
		 * 5x1 = 5
		 * .
		 * 5x9 = 45
		 */
		
		for(int i=2; i<=5; i++) {
			for(int j=1; j<=9; j++) {
				System.out.println(i + " X " + j + " = " + i*j);
			}
			System.out.println("----------------");
		}
		
		

	}

}
