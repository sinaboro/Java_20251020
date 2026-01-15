package ex4;

import java.util.function.Predicate;

//정수를 전달하면 짝수 인지 홀수인지 판별하는 람다식 구현


public class L5_Rambda6 {

	public static void main(String[] args) {		
		
		Predicate<Integer> p2 = t-> t % 2 == 0 ? true : false;
			
		Predicate<Integer> p1 = num -> num % 2 == 0 ? true : false; 
		
		boolean f = p2.test(12);
		
		if( f == true )
			System.out.printf("양수"); 
		else 
			System.out.printf("홀수"); 
		
		
	}

}
