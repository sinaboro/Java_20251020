package ex01;

public class ForEx06 {

	public static void main(String[] args) {
		
		/*
		 * 2~5단까지 구구단 출력
		 * 2x1 = 2
		 * 2x2 = 4
		
		 * 
		 * 3x1 = 3
		 * 3x2 = 6
		 * 3x9 = 9
		 * 
		 * 4x1 = 4
		 * 4x2 = 8
		 * 4x3 = 12
		 * 4x4 = 16
		 * 
		 * 5x1 = 5
		 * .
		 * 5x5 = 25
		 */
		
		for(int i=2; i<=5; i++) {
			for(int j=1; j<=9; j++) {
				
				System.out.println(i + " X " + j + " = " + i*j);
				
				if(i == j) break;
			}
			System.out.println("----------------");
		}
		
		

	}

}
