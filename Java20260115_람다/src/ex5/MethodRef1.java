package ex5;

import java.util.function.Function;

public class MethodRef1 {

	public static void main(String[] args) {
		
		Function<String, Integer> stringToInt = s -> Integer.parseInt(s);		
		
		int num  = stringToInt.apply("10");
		
		System.out.println(num);
		
		
		Function<String, Integer> stringToInt2 = Integer::parseInt;	
		
		int num2  = stringToInt.apply("100");
		
		System.out.println(num2);
	}

}
