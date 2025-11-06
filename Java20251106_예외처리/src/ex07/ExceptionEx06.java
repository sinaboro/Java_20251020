package ex07;

public class ExceptionEx06 {

	public static void main(String[] args) throws  ArithmeticException{

		System.out.println("프로그램 시작...");
		
		
		func1(5, 0);
		
		
		System.out.println("프로그램 종료...");
	}

	private static void func1(int i, int j) throws ArithmeticException{
		
		func2(i,j);
		
	}

	private static void func2(int i, int j) throws ArithmeticException{
		
		int result = i/j;
		System.out.println(result);
		
	}

}
