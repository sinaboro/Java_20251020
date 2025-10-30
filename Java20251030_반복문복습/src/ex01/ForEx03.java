package ex01;

public class ForEx03 {

	public static void main(String[] args) {
		
		int sum=0;
		int i=0;
				
		for( i=1; i<=100; i++) {
			
			sum += i;
			
			if(sum>=3000)
				break;
		}
		
		System.out.println("sum = " + sum + ", i : " + i);
	
		System.out.printf("sum = %d, i : %d\n", sum, i );
		System.out.println("------------------------------");
		
		System.out.printf("sum = %-5d, i : %5d\n", 10, 1000 );
		System.out.printf("sum = %-5d, i : %5d\n", 1, 100 );
		System.out.printf("sum = %-5d, i : %5d\n", 1234, 1587 );
		
		

	}

}
