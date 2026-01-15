package ex4;

//정수를 전달하면 짝수 인지 홀수인지 판별하는 람다식 구현

interface DiscernClass{
	boolean discern(int num);
}

public class L5_Rambda4 {

	public static void main(String[] args) {		
		/*
		DiscernClass flag = new DiscernClass() {
			
			@Override
			public boolean discern(int num) {
				
				return num % 2 == 0 ? true : false;
			}
		};
		*/
		DiscernClass flag = num -> num % 2 == 0 ? true : false; 
		
		boolean f = flag.discern(5);
		
		if( f == true )
			System.out.printf("양수"); 
		else 
			System.out.printf("홀수"); 
		
		
	}

}
