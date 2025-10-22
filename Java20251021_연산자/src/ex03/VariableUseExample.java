package ex03;

public class VariableUseExample {

	public static void main(String[] args) {
		
		int hour = 3;
		int minute = 5;
		
		System.out.println(hour +"시간"+ minute);
		
		
		//연산
		// 정수 + 정수 => 정수
		// 실수 + 실수 => 실수
		// 정수 + 실수 => 실수            //강제형변환  
		System.out.println( minute / (double)hour);
		
		// "kor" , "한글" ==> 문자열
		// 정수 + 문자열 => 문자열
		// 실수 + 문자열 => 문자열
		System.out.println(12.6 + "가");
	}

}
